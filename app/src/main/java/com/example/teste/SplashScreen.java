package com.example.teste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.teste.Model.FakeDb;

public class SplashScreen extends Activity {

    //inicia o FakeDb
    public FakeDb fakeDb = new FakeDb();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMainActivity();
            }
        }, 2500);
    }

    private void mostrarMainActivity() {
        Intent intent = new Intent(
                SplashScreen.this,MainActivity.class
        );
        startActivity(intent);
        finish();
    }

}
