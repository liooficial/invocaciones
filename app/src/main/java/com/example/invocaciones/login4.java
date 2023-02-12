package com.example.invocaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login4 extends AppCompatActivity {
    Button b1,b2;
    EditText txtin;
    TextView inbco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login4);
        b1 = (Button) findViewById(R.id.bt1);
        b2 = (Button) findViewById(R.id.bt2);
        txtin = (EditText) findViewById(R.id.txtin);
        inbco = (TextView) findViewById(R.id.inbco);
        txtin.setText(getIntent().getExtras().getString("usuario"));
        inbco.setText(getIntent().getExtras().getString("invoco"));
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario1=txtin.getText().toString(),invoco="pantalla4";
                Intent i =new Intent(login4.this,login3.class);
                i.putExtra("usuario", usuario1);
                i.putExtra("invoco", "pantalla4");
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario1=txtin.getText().toString(),invoco="pantalla4";
                Intent i =new Intent(login4.this,login2.class);
                i.putExtra("usuario", usuario1);
                i.putExtra("invoco", "pantalla4");
                startActivity(i);
            }
        });
    }
}