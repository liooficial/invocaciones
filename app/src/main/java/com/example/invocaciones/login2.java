package com.example.invocaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login2 extends AppCompatActivity {
    Button b1,b2;
    TextView txtin,txtou;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        b1 = (Button) findViewById(R.id.bt1);
        b2 = (Button) findViewById(R.id.bt2);
        txtin = (TextView) findViewById(R.id.txtin);
        txtou = (TextView) findViewById(R.id.txtin23);

        txtin.setText(getIntent().getExtras().getString("usuario"));
        txtou.setText(getIntent().getExtras().getString("invoco"));

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario1=txtin.getText().toString(),invoco="login2";
                Intent i =new Intent(login2.this,MainActivity.class);
                i.putExtra("usuario", txtin.getText());
                i.putExtra("invoco", "pantalla 2");
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario1=txtin.getText().toString(),invoco="login2";
                Intent i =new Intent(login2.this,login3.class);
                i.putExtra("usuario",  txtin.getText());
                i.putExtra("invoco", "pantalla 2");
                startActivity(i);
            }
        });
    }

}