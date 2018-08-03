package com.example.teste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    public TextView tx ;
    Button status;
    Button proximaTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStatus();
        buttonProximaTela();
    }

    protected void buttonStatus (){
        tx = (TextView) findViewById(R.id.textView);

        status = (Button) findViewById(R.id.status);
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Surprise MDF", Toast.LENGTH_SHORT).show();
                tx.setText("Em Desenvolvimento, Aguarde");
            }
        });
    }

    protected void buttonProximaTela (){
        proximaTela = (Button) findViewById(R.id.proximaTela);
        proximaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent (MainActivity.this, BookList.class);
                startActivity (it);
            }
        });

    }
}
