	package com.example.projetoes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RankingActivity extends Activity {

	private String Rank;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ranking);
		
		final TextView rankList = (TextView) findViewById(R.id.editTextRank);
		Bundle bunble=getIntent().getExtras();
		

        if(bunble!=null){

            //appending the value to the contents of textView1.
            rankList.setText(bunble.getString("GamersList"));
        }
		
		
		//Este botao troca a tela e inicia a tela de jogo.
		final Button buttonBackMain = (Button) findViewById(R.id.buttonBackMain);
		buttonBackMain.setBackgroundResource(R.drawable.seta_back);
        buttonBackMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent myIntent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
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
