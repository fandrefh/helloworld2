package br.com.deltalabs.helloworld2;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText nomeEditText;
	private TextView olaTextView;
	private String msg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.nomeEditText = (EditText) findViewById(R.id.nomeEditText);
		this.olaTextView = (TextView) findViewById(R.id.olaTextView);
		this.msg = getResources().getString(R.string.ola);
	}
	
	public void surpreenderUsuario(View v) {
		Editable texto = this.nomeEditText.getText();
		String saudacao = msg + " " + texto.toString();
		this.olaTextView.setText(saudacao);
	}
}
