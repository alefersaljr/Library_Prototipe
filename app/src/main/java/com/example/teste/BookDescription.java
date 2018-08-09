package com.example.teste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.teste.Helper.BitmapHelper;

public class BookDescription extends Activity {

    public TextView titulo;
    public TextView autor;
    public TextView sinopse;
    public ImageView imagem;
    Button prev;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_description);

        titulo = (TextView) findViewById(R.id.titulo);
        autor = (TextView) findViewById(R.id.autor);
        sinopse = (TextView) findViewById(R.id.book_description);
        imagem = (ImageView) findViewById(R.id.capa);

        titulo.setText(getIntent().getStringExtra("LIVRO"));
        autor.setText(getIntent().getStringExtra("AUTOR"));
        sinopse.setText(getIntent().getStringExtra("SINOPSE"));
        imagem.setImageBitmap(BitmapHelper.getInstance().getBitmap());

        buttonPrev();
        buttonNext();
    }

    protected void buttonPrev() {
        prev = (Button) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itt = new Intent(BookDescription.this, BookList.class);
                startActivity(itt);
            }
        });
    }

    protected void buttonNext (){
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(BookDescription.this, BookList.class);
                startActivity(it);
            }
        });
    }
}