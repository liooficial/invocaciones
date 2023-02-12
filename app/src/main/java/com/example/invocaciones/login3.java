package com.example.invocaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login3 extends AppCompatActivity {
    Button b1,b2;
    TextView txtin,txtou;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);
        b1 = (Button) findViewById(R.id.bt1);
        b2 = (Button) findViewById(R.id.bt2);
        txtin = (TextView) findViewById(R.id.txtin);
        txtou = (TextView) findViewById(R.id.txtin3);

        txtin.setText(getIntent().getExtras().getString("usuario"));
        txtou.setText(getIntent().getExtras().getString("invoco"));


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario1=txtin.getText().toString();
                Intent i =new Intent(login3.this,login2.class);
                i.putExtra("usuario", usuario1);
                i.putExtra("invoco", "pantalla3");
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario1=txtin.getText().toString();
                Intent i =new Intent(login3.this,login4.class);
                i.putExtra("usuario", usuario1);
                i.putExtra("invoco", "pantalla3");
                startActivity(i);
            }
        });
    }
}