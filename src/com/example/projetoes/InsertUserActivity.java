package com.example.projetoes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InsertUserActivity extends Activity {

	EditText name;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_insert_user);
		
		//Este botao troca a tela e inicia a tela de jogo.
		final Button buttonOk = (Button) findViewById(R.id.buttonConfirmUser);
		name = (EditText) findViewById(R.id.userName);
		buttonOk.setBackgroundResource(R.drawable.ok);

		buttonOk.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent myIntent = new Intent(InsertUserActivity.this, JogoActivity.class);

				myIntent.putExtra("NameUser", name.getText().toString());
				startActivity(myIntent);
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
