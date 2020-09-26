package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.anisafallah.tugasnisa1.R;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtJenisKelamin, edtNoTelp, edtAgama, edtHobby;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(
                R.id.txtBiodata);

        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtJenisKelamin = (EditText) findViewById(R.id.edtJenisKelamin);
        edtNoTelp = (EditText) findViewById(R.id.edtNoTelp);
        edtAgama = (EditText) findViewById(R.id.edtAgama);
        edtHobby = (EditText) findViewById(R.id.edtHobby);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strJenisKelamin = edtJenisKelamin.getText().toString();
                String strNoTelp = edtNoTelp.getText().toString();
                String strAgama = edtAgama.getText().toString();
                String strHobby = edtHobby.getText().toString();

                txtTampil.setText(strNpm +"/n"+strNama+"/n"+strJenisKelamin+"/n"+strNoTelp+"/n"+strAgama+"/n"+strHobby);
            }
        });
    }
}