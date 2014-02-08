package com.example.projetoes;

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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jogo);
		
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
                            bar.incrementProgressBy(1);;
                        }
                    });
                }
         
            }
        }).start();
		
		final Button buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent myIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            }           
        });
        
        
        final Button buttonValue = (Button) findViewById(R.id.buttonValue1);
        buttonValue.setOnClickListener(new View.OnClickListener() {					
			public void onClick(View v) {
				EditText campo1 = (EditText) findViewById(R.id.editText1);
				campo1.setText(buttonValue.getText());
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
