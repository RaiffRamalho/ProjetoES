package com.example.projetoes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import classes.Ranking;

public class MainActivity extends Activity {
	
	private Ranking ranking = new Ranking();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Este botao troca a tela e inicia a tela de jogo.
		final Button buttonStart = (Button) findViewById(R.id.buttonStart);
		buttonStart.setBackgroundResource(R.drawable.menu_start_button);
		buttonStart.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent myIntent = new Intent(v.getContext(), InsertUserActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});

		final Button buttonRanking = (Button) findViewById(R.id.buttonRanking);
		buttonRanking.setBackgroundResource(R.drawable.menu_records_button);
		buttonRanking.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Ranking rank = Ranking.getInstance();
				
				Intent myIntent = new Intent(v.getContext(),RankingActivity.class);
				myIntent.putExtra("GamersList", rank.toString());
				startActivityForResult(myIntent, 0);
			}
		});

		final Button buttonCredits = (Button) findViewById(R.id.buttonCredits);
		buttonCredits.setBackgroundResource(R.drawable.menu_credits_button);
		buttonCredits.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent myIntent = new Intent(v.getContext(),
						CreditsActivity.class);
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
