package com.example.projetoes;
import classes.Operator;
import classes.Ranking;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class JogoActivity extends Activity implements Runnable, OnClickListener {
	
	final Context context = this;
	private  String jogador;
	private boolean hide = false;

	final private Handler baseTime = new Handler();// Cria um objeto do tipo
													// Handler
													// para base de tempo
	private ProgressBar pbBarra;
	int progressCount;
	
	private int score = 0;

	final private int difficulty = 10;
	private int[] buttonsValues = new int[6];

	Ranking rank = Ranking.getInstance();
	
	/*
	 * este metodo gera os valores para aparecer nos botoes de acordo com a
	 * dificuldade setada acima
	 */
	private void completeButtonsValues() {
		int cont = 0;

		while (cont < buttonsValues.length) {
			int value = 1 + (int) (Math.random() * difficulty);
			boolean temp = true;

			for (int i = 0; i < buttonsValues.length; i++) {
				if (buttonsValues[i] > 0 && buttonsValues[i] == value) {
					temp = false;
					break;
				}
			}

			if (temp) {
				buttonsValues[cont] = value;
				cont++;
			}
		}
	}

	/*
	 * este método escolhe o dois números da lista e cria uma operação esta
	 * operação será usada para a pontuação
	 */
	private int completeValue() {
		int value1 = (int) (Math.random() * 6);
		int value2 = (int) (Math.random() * 6);

		while (value1 == value2) {
			value2 = (int) (Math.random() * 6);
		}

		Operator op = new Operator(buttonsValues[value1],
				buttonsValues[value2], (int) (Math.random() * 4));
		return op.getResult();
	}

	/* run do progess bar */
	@Override
	public void run() {
		if (hide) {
			if (progressCount <= 100) {
				pbBarra.setProgress(progressCount);
				progressCount++;
			} else {
				progressCount = 0;
				hide = false;
				rank.CheckRanking(jogador, score);
				Intent myIntent = new Intent(JogoActivity.this, RankingActivity.class);
				myIntent.putExtra("GamersList", rank.toString());
				startActivity(myIntent);
				this.finish();
			}
			baseTime.postDelayed(this, 250);
		}
	}

	public void onClick(View v) {
		run();
	}

	/* este método coloca as imagens nos botões */
	private void setImageButton(final Button bt, int value) {

		if (value == 1) {
			bt.setBackgroundResource(R.drawable.num1);
		} else if (value == 2) {
			bt.setBackgroundResource(R.drawable.num2);
		} else if (value == 3) {
			bt.setBackgroundResource(R.drawable.num3);
		} else if (value == 4) {
			bt.setBackgroundResource(R.drawable.num4);
		} else if (value == 5) {
			bt.setBackgroundResource(R.drawable.num5);
		} else if (value == 6) {
			bt.setBackgroundResource(R.drawable.num6);
		} else if (value == 7) {
			bt.setBackgroundResource(R.drawable.num7);
		} else if (value == 8) {
			bt.setBackgroundResource(R.drawable.num8);
		} else if (value == 9) {
			bt.setBackgroundResource(R.drawable.num9);
		} else if (value == 10) {
			bt.setBackgroundResource(R.drawable.num10);
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jogo);

		pbBarra = (ProgressBar) findViewById(R.id.pbBarra);
		baseTime.post(this);
		progressCount = 0;
		
        
		Bundle bunble=getIntent().getExtras();	
        if(bunble!=null){
            //Getting the value stored in the name "NAME"
            jogador = bunble.getString("NameUser");
        }

		
		final Button buttonHide = (Button) findViewById(R.id.Hidebutton);
		buttonHide.setBackgroundResource(R.drawable.hide_numbers);
		final Button buttonBack = (Button) findViewById(R.id.buttonBack);
		buttonBack.setBackgroundResource(R.drawable.seta_back);
		final Button buttonValue0 = (Button) findViewById(R.id.buttonValue0);
		final Button buttonValue1 = (Button) findViewById(R.id.buttonValue1);
		final Button buttonValue2 = (Button) findViewById(R.id.buttonValue2);
		final Button buttonValue3 = (Button) findViewById(R.id.buttonValue3);
		final Button buttonValue4 = (Button) findViewById(R.id.buttonValue4);
		final Button buttonValue5 = (Button) findViewById(R.id.buttonValue5);

		final Button buttonSum = (Button) findViewById(R.id.buttonSum);
		buttonSum.setBackgroundResource(R.drawable.sum);

		final Button buttonSubt = (Button) findViewById(R.id.buttonSubt);
		buttonSubt.setBackgroundResource(R.drawable.subt);

		final Button buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
		buttonMultiplication.setBackgroundResource(R.drawable.mult);

		final Button buttonDivision = (Button) findViewById(R.id.buttonDivision);
		buttonDivision.setBackgroundResource(R.drawable.div);

		final Button buttonOK = (Button) findViewById(R.id.buttonOK);
		buttonOK.setBackgroundResource(R.drawable.button_go);

		this.completeButtonsValues();

		final TextView result = (TextView) findViewById(R.id.textViewResult);

		buttonBack.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

		buttonHide.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (!hide) {
					hide = true;
					run();
					result.setText("" + completeValue());
					buttonValue0.setBackgroundResource(R.drawable.defaultop);
					buttonValue1.setBackgroundResource(R.drawable.defaultop);
					buttonValue2.setBackgroundResource(R.drawable.defaultop);
					buttonValue3.setBackgroundResource(R.drawable.defaultop);
					buttonValue4.setBackgroundResource(R.drawable.defaultop);
					buttonValue5.setBackgroundResource(R.drawable.defaultop);
				}

			}
		});

		buttonOK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				try {
					final TextView value1 = (TextView) findViewById(R.id.textViewOperador1);
					final TextView value2 = (TextView) findViewById(R.id.textViewOperador2);
					final TextView operator = (TextView) findViewById(R.id.textViewOperando);
					final TextView resultado = (TextView) findViewById(R.id.textViewResult);

					if (operator.getText().equals(""))
						throw new Exception();

					String a = (String) value1.getText();
					String b = (String) value2.getText();
					String c = (String) resultado.getText();
					if (operator.getText().equals("+")) {
						if (Integer.parseInt(a) + Integer.parseInt(b) == Integer
								.parseInt(c)) {
							score++;
						}
					}
					if (operator.getText().equals("-")) {
						if (Integer.parseInt(a) - Integer.parseInt(b) == Integer
								.parseInt(c)) {
							score++;
						}
					}
					if (operator.getText().equals("x")) {
						if (Integer.parseInt(a) * Integer.parseInt(b) == Integer
								.parseInt(c)) {
							score++;
						}
					}
					if (operator.getText().equals("�")) {
						if (Integer.parseInt(a) / Integer.parseInt(b) == Integer
								.parseInt(c)) {
							score++;
						}
					}

					final TextView pontuacao = (TextView) findViewById(R.id.textViewPontuacao);
					pontuacao.setText(Integer.toString(score));
					buttonsValues = new int[6];
					completeButtonsValues();
					value1.setText("");
					value2.setText("");
					operator.setText("");
					resultado.setText("");

					setImageButton(buttonValue0, buttonsValues[0]);
					setImageButton(buttonValue1, buttonsValues[1]);
					setImageButton(buttonValue2, buttonsValues[2]);
					setImageButton(buttonValue3, buttonsValues[3]);
					setImageButton(buttonValue4, buttonsValues[4]);
					setImageButton(buttonValue5, buttonsValues[5]);

					hide = false;
					pontuacao.setText(" Points: " + score);
				} catch (Exception e) {
				}
			}
		});

		setImageButton(buttonValue0, buttonsValues[0]);
		buttonValue0.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textViewOperador1);
				TextView campo2 = (TextView) findViewById(R.id.textViewOperador2);

				if (hide) {
					if(!campo1.getText().toString().equals("") && !campo2.getText().toString().equals("")) return;
					if (campo1.getText().toString().equals("")) {
						campo1.setText("" + buttonsValues[0]);
					} else {
						if (Integer.parseInt((String) campo1.getText()) != buttonsValues[0]) {
							if (campo2.getText().toString().equals("")) {
								campo2.setText("" + buttonsValues[0]);
							}
						}

					}
				}
				setImageButton(buttonValue0, buttonsValues[0]);
			}
		});

		setImageButton(buttonValue1, buttonsValues[1]);
		buttonValue1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textViewOperador1);
				TextView campo2 = (TextView) findViewById(R.id.textViewOperador2);
				if(!campo1.getText().toString().equals("") && !campo2.getText().toString().equals("")) return;
				if (hide) {
					if (campo1.getText().toString().equals("") && hide) {
						campo1.setText("" + buttonsValues[1]);
					} else {
						if (Integer.parseInt((String) campo1.getText()) != buttonsValues[1]) {
							if (campo2.getText().toString().equals("") && hide) {
								campo2.setText("" + buttonsValues[1]);
							}
						}

					}
				}
				setImageButton(buttonValue1, buttonsValues[1]);
			}
		});

		setImageButton(buttonValue2, buttonsValues[2]);
		buttonValue2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textViewOperador1);
				TextView campo2 = (TextView) findViewById(R.id.textViewOperador2);
				if(!campo1.getText().toString().equals("") && !campo2.getText().toString().equals("")) return;
				if (hide) {
					if (campo1.getText().toString().equals("") && hide) {
						campo1.setText("" + buttonsValues[2]);
					} else {
						if (Integer.parseInt((String) campo1.getText()) != buttonsValues[2]) {
							if (campo2.getText().toString().equals("") && hide) {
								campo2.setText("" + buttonsValues[2]);
							}
						}
					}
				}
				setImageButton(buttonValue2, buttonsValues[2]);
			}
		});

		setImageButton(buttonValue3, buttonsValues[3]);
		buttonValue3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textViewOperador1);
				TextView campo2 = (TextView) findViewById(R.id.textViewOperador2);
				if(!campo1.getText().toString().equals("") && !campo2.getText().toString().equals("")) return;
				if (hide) {
					if (campo1.getText().toString().equals("") && hide) {
						campo1.setText("" + buttonsValues[3]);
					} else {
						if (Integer.parseInt((String) campo1.getText()) != buttonsValues[3]) {
							if (campo2.getText().toString().equals("") && hide) {
								campo2.setText("" + buttonsValues[3]);
							}
						}
					}
				}
				setImageButton(buttonValue3, buttonsValues[3]);
			}
		});

		setImageButton(buttonValue4, buttonsValues[4]);
		buttonValue4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textViewOperador1);
				TextView campo2 = (TextView) findViewById(R.id.textViewOperador2);
				if(!campo1.getText().toString().equals("") && !campo2.getText().toString().equals("")) return;
				if (hide) {
					if (campo1.getText().toString().equals("") && hide) {
						campo1.setText("" + buttonsValues[4]);
					} else {
						if (Integer.parseInt((String) campo1.getText()) != buttonsValues[4]) {
							if (campo2.getText().toString().equals("") && hide) {
								campo2.setText("" + buttonsValues[4]);
							}
						}
					}
				}
				setImageButton(buttonValue4, buttonsValues[4]);
			}
		});

		setImageButton(buttonValue5, buttonsValues[5]);
		buttonValue5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textViewOperador1);
				TextView campo2 = (TextView) findViewById(R.id.textViewOperador2);
				if(!campo1.getText().toString().equals("") && !campo2.getText().toString().equals("")) return;
				if (hide) {
					if (campo1.getText().toString().equals("") && hide) {
						campo1.setText("" + buttonsValues[5]);
					} else {
						if (Integer.parseInt((String) campo1.getText()) != buttonsValues[5]) {
							if (campo2.getText().toString().equals("") && hide) {
								campo2.setText("" + buttonsValues[5]);
							}
						}
					}
				}
				setImageButton(buttonValue5, buttonsValues[5]);
			}
		});

		buttonSum.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo = (TextView) findViewById(R.id.textViewOperando);
				if (hide) {
					campo.setText("+");
				}
			}
		});

		buttonSubt.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo = (TextView) findViewById(R.id.textViewOperando);
				if (hide) {
					campo.setText("-");
				}
			}
		});

		buttonMultiplication.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo = (TextView) findViewById(R.id.textViewOperando);
				if (hide) {
					campo.setText("x");
				}
			}
		});

		buttonDivision.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo = (TextView) findViewById(R.id.textViewOperando);
				if (hide) {
					campo.setText("�");
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
