package com.example.projetoes;

import java.util.HashSet;
import java.util.Set;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class Jogo extends Activity {

	private static final int PROGRESS = 0x1;

	private int mProgressStatus = 0;

	private Handler mHandler = new Handler();

	final private int difficulty = 20;
	private int[] buttonsValues = new int[6];

	private void completeButtonsValues() {
		int cont = 0;
		while (cont < buttonsValues.length) {
			int value = 1 + (int) (Math.random() * difficulty);
			boolean temp = true;
			
			for (int i = 0; i < buttonsValues.length; i++) {
				if(buttonsValues[i] > 0 && buttonsValues[i] == value){
					temp = false;
					break;
				}
			}
			
			if(temp){
				buttonsValues[cont] = value;
				cont++;
			}
		}		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jogo);

		final Button buttonBack = (Button) findViewById(R.id.buttonBack);
		final Button buttonValue1 = (Button) findViewById(R.id.buttonValue1);
		final Button buttonValue2 = (Button) findViewById(R.id.buttonValue2);
		final Button buttonValue3 = (Button) findViewById(R.id.buttonValue3);
		final Button buttonValue4 = (Button) findViewById(R.id.buttonValue4);
		final Button buttonValue5 = (Button) findViewById(R.id.buttonValue5);
		final Button buttonValue6 = (Button) findViewById(R.id.buttonValue6);
		this.completeButtonsValues();

		final ProgressBar bar = (ProgressBar) findViewById(R.id.progressBar);

		new Thread(new Runnable() {
			public void run() {
				while (mProgressStatus < 3600) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					mHandler.post(new Runnable() {
						public void run() {
							bar.incrementProgressBy(1);
							;
						}
					});
				}

			}
		}).start();

		buttonBack.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent myIntent = new Intent(v.getContext(), MainActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});

		buttonValue1.setText("" + buttonsValues[0]);
		buttonValue1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText campo1 = (EditText) findViewById(R.id.editText1);
				EditText campo2 = (EditText) findViewById(R.id.editText3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText(buttonValue1.getText());
				} else if(campo2.getText().toString().equals("")) {
					campo2.setText(buttonValue1.getText());
				}
			}
		});

		buttonValue2.setText("" + buttonsValues[1]);
		buttonValue2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText campo1 = (EditText) findViewById(R.id.editText1);
				EditText campo2 = (EditText) findViewById(R.id.editText3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText(buttonValue2.getText());
				} else if(campo2.getText().toString().equals("")) {
					campo2.setText(buttonValue2.getText());
				}
			}
		});

		buttonValue3.setText("" + buttonsValues[2]);
		buttonValue3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText campo1 = (EditText) findViewById(R.id.editText1);
				EditText campo2 = (EditText) findViewById(R.id.editText3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText(buttonValue3.getText());
				} else if(campo2.getText().toString().equals("")) {
					campo2.setText(buttonValue3.getText());
				}
			}
		});

		buttonValue4.setText("" + buttonsValues[3]);
		buttonValue4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText campo1 = (EditText) findViewById(R.id.editText1);
				EditText campo2 = (EditText) findViewById(R.id.editText3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText(buttonValue4.getText());
				} else if(campo2.getText().toString().equals("")) {
					campo2.setText(buttonValue4.getText());
				}
			}
		});

		buttonValue5.setText("" + buttonsValues[4]);
		buttonValue5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText campo1 = (EditText) findViewById(R.id.editText1);
				EditText campo2 = (EditText) findViewById(R.id.editText3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText(buttonValue5.getText());
				} else if(campo2.getText().toString().equals("")) {
					campo2.setText(buttonValue5.getText());
				}
			}
		});

		buttonValue6.setText("" + buttonsValues[5]);
		buttonValue6.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText campo1 = (EditText) findViewById(R.id.editText1);
				EditText campo2 = (EditText) findViewById(R.id.editText3);

				if (campo1.getText().toString().equals("")) {
					campo1.setText(buttonValue6.getText());
				} else if(campo2.getText().toString().equals("")) {
					campo2.setText(buttonValue6.getText());
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
