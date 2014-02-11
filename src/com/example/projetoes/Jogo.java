package com.example.projetoes;

import Classes.Operator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Jogo extends Activity implements Runnable, OnClickListener {

	private Handler baseTime = new Handler();// Cria um objeto do tipo Handler
												// para base de tempo
	private ProgressBar pbBarra;
	int progressCount;

	private int score = 0;

	final private int difficulty = 10;
	private int[] buttonsValues = new int[6];

	private void completeButtonsValues() {
		int cont = 0;

		// int[] a = new int[10];
		// for (int i = 0; i < 10; i++) {
		// a[i] = i + 1;
		// }

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

	@Override
	public void run() {

		if (progressCount <= 100) {
			pbBarra.setProgress(progressCount);

		} else {
			progressCount = 0;
			this.finish();
		}

		baseTime.postDelayed(this, 100);
		progressCount++;

	}// Fim de run()

	public void onClick(View v) {
		run();
	}

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
		setContentView(R.layout.jogo);

		pbBarra = (ProgressBar) findViewById(R.id.pbBarra);
		baseTime.post(this);
		progressCount = 0;

		final Button buttonBack = (Button) findViewById(R.id.buttonBack);
		final Button buttonValue1 = (Button) findViewById(R.id.buttonValue1);
		final Button buttonValue2 = (Button) findViewById(R.id.buttonValue2);
		final Button buttonValue3 = (Button) findViewById(R.id.buttonValue3);
		final Button buttonValue4 = (Button) findViewById(R.id.buttonValue4);
		final Button buttonValue5 = (Button) findViewById(R.id.buttonValue5);
		final Button buttonValue6 = (Button) findViewById(R.id.buttonValue6);

		final Button buttonSum = (Button) findViewById(R.id.buttonSum);
		final Button buttonLess = (Button) findViewById(R.id.buttonLess);
		final Button buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
		final Button buttonDivision = (Button) findViewById(R.id.buttonDivision);

		final Button buttonOK = (Button) findViewById(R.id.buttonOK);

		this.completeButtonsValues();

		final TextView campo5 = (TextView) findViewById(R.id.textView5);
		campo5.setText("" + this.completeValue());

		buttonBack.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent myIntent = new Intent(v.getContext(), MainActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});

		buttonOK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				try {
					final TextView value1 = (TextView) findViewById(R.id.textView1);
					final TextView value2 = (TextView) findViewById(R.id.textView3);
					final TextView operator = (TextView) findViewById(R.id.textView2);
					final TextView result = (TextView) findViewById(R.id.textView5);

					if (operator.getText().equals(""))
						throw new Exception();

					String a = (String) value1.getText();
					String b = (String) value2.getText();
					String c = (String) result.getText();
					if (operator.getText().equals("+")) {
						if (Integer.parseInt(a) + Integer.parseInt(b) == Integer
								.parseInt(c)) {
							score++;
						}
					} else if (operator.getText().equals("-")) {
						if (Integer.parseInt(a) - Integer.parseInt(b) == Integer
								.parseInt(c)) {
							score++;
						}
					} else if (operator.getText().equals("*")) {
						if (Integer.parseInt(a) * Integer.parseInt(b) == Integer
								.parseInt(c)) {
							score++;
						}
					} else {
						if (Integer.parseInt(a) / Integer.parseInt(b) == Integer
								.parseInt(c)) {
							score++;
						}
					}

					final TextView pontuacao = (TextView) findViewById(R.id.textViewPontuacao);
					pontuacao.setText("" + score);
					buttonsValues = new int[6];
					completeButtonsValues();
					TextView campo1 = (TextView) findViewById(R.id.textView1);
					TextView campo2 = (TextView) findViewById(R.id.textView2);
					TextView campo3 = (TextView) findViewById(R.id.textView3);
					campo1.setText("");
					campo2.setText("");
					campo3.setText("");

					// buttonValue1.setText("" + buttonsValues[0]);
					// buttonValue2.setText("" + buttonsValues[1]);
					// buttonValue3.setText("" + buttonsValues[2]);
					// buttonValue4.setText("" + buttonsValues[3]);
					// buttonValue5.setText("" + buttonsValues[4]);
					// buttonValue6.setText("" + buttonsValues[5]);
					setImageButton(buttonValue1, buttonsValues[0]);
					setImageButton(buttonValue2, buttonsValues[1]);
					setImageButton(buttonValue3, buttonsValues[2]);
					setImageButton(buttonValue4, buttonsValues[3]);
					setImageButton(buttonValue5, buttonsValues[4]);
					setImageButton(buttonValue6, buttonsValues[5]);

					campo5.setText("" + completeValue());
				} catch (Exception e) {
				}

			}
		});

		// buttonValue1.setText("" + buttonsValues[0]);
		setImageButton(buttonValue1, buttonsValues[0]);
		buttonValue1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textView1);
				TextView campo2 = (TextView) findViewById(R.id.textView3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText("" + buttonsValues[0]);
					buttonValue1.setBackgroundResource(R.drawable.defaultop);
					// buttonValue1.setText("");
					// buttonValue1.setBackgroundColor(getTitleColor());
				} else if (campo2.getText().toString().equals("")) {
					campo2.setText("" + buttonsValues[0]);
					buttonValue1.setBackgroundResource(R.drawable.defaultop);
					// buttonValue1.setText("");
					// buttonValue1.setBackgroundColor(getTitleColor());
				} 
			}
		});

		// buttonValue2.setText("" + buttonsValues[1]);
		setImageButton(buttonValue2, buttonsValues[1]);
		buttonValue2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textView1);
				TextView campo2 = (TextView) findViewById(R.id.textView3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText("" + buttonsValues[1]);
					buttonValue2.setBackgroundResource(R.drawable.defaultop);
					// buttonValue2.setText("");
					// buttonValue2.setBackgroundColor(getTitleColor());
				} else if (campo2.getText().toString().equals("")) {
					campo2.setText("" + buttonsValues[1]);
					buttonValue2.setBackgroundResource(R.drawable.defaultop);
					// buttonValue2.setText("");
					// buttonValue2.setBackgroundColor(getTitleColor());
				}
			}
		});

		// buttonValue3.setText("" + buttonsValues[2]);
		setImageButton(buttonValue3, buttonsValues[2]);
		buttonValue3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textView1);
				TextView campo2 = (TextView) findViewById(R.id.textView3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText("" + buttonsValues[2]);
					buttonValue3.setBackgroundResource(R.drawable.defaultop);
					// buttonValue3.setText("");
					// buttonValue3.setBackgroundColor(getTitleColor());
				} else if (campo2.getText().toString().equals("")) {
					campo2.setText("" + buttonsValues[2]);
					buttonValue3.setBackgroundResource(R.drawable.defaultop);
					// buttonValue3.setText("");
					// buttonValue3.setBackgroundColor(getTitleColor());
				}
			}
		});

		// buttonValue4.setText("" + buttonsValues[3]);
		setImageButton(buttonValue4, buttonsValues[3]);
		buttonValue4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textView1);
				TextView campo2 = (TextView) findViewById(R.id.textView3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText("" + buttonsValues[3]);
					buttonValue4.setBackgroundResource(R.drawable.defaultop);
					// buttonValue4.setText("");
					// buttonValue4.setBackgroundColor(getTitleColor());
				} else if (campo2.getText().toString().equals("")) {
					campo2.setText("" + buttonsValues[3]);
					buttonValue4.setBackgroundResource(R.drawable.defaultop);
					// buttonValue4.setText("");
					// buttonValue4.setBackgroundColor(getTitleColor());
				}
			}
		});

		// buttonValue5.setText("" + buttonsValues[4]);
		setImageButton(buttonValue5, buttonsValues[4]);
		buttonValue5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textView1);
				TextView campo2 = (TextView) findViewById(R.id.textView3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText("" + buttonsValues[4]);
					buttonValue5.setBackgroundResource(R.drawable.defaultop);
					// buttonValue5.setText("");
					// buttonValue5.setBackgroundColor(getTitleColor());
				} else if (campo2.getText().toString().equals("")) {
					campo2.setText("" + buttonsValues[4]);
					buttonValue5.setBackgroundResource(R.drawable.defaultop);
					// buttonValue5.setText("");
					// buttonValue5.setBackgroundColor(getTitleColor());
				}
			}
		});

		// buttonValue6.setText("" + buttonsValues[5]);
		setImageButton(buttonValue6, buttonsValues[5]);
		buttonValue6.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo1 = (TextView) findViewById(R.id.textView1);
				TextView campo2 = (TextView) findViewById(R.id.textView3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText("" + buttonsValues[5]);
					buttonValue6.setBackgroundResource(R.drawable.defaultop);
					// buttonValue6.setText("");
					// buttonValue6.setBackgroundColor(getTitleColor());
				} else if (campo2.getText().toString().equals("")) {
					campo2.setText("" + buttonsValues[5]);
					buttonValue6.setBackgroundResource(R.drawable.defaultop);
					// buttonValue6.setText("");
					// buttonValue6.setBackgroundColor(getTitleColor());
				}
			}
		});

		buttonSum.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo = (TextView) findViewById(R.id.textView2);
				campo.setText(buttonSum.getText());
			}
		});

		buttonLess.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo = (TextView) findViewById(R.id.textView2);
				campo.setText(buttonLess.getText());
			}
		});

		buttonMultiplication.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo = (TextView) findViewById(R.id.textView2);
				campo.setText(buttonMultiplication.getText());
			}
		});

		buttonDivision.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				TextView campo = (TextView) findViewById(R.id.textView2);
				campo.setText(buttonDivision.getText());
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
