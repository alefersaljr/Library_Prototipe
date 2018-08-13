package com.example.teste;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.teste.Adapters.ViewPagerAdapter;
import com.example.teste.Model.FakeDb;
import com.example.teste.Model.VO.Book;


public class BookDescription extends Activity {

    public TextView titulo;
    public TextView autor;
    public TextView sinopse;
    public ImageView capa;
    public ImageView imagePass;
    public Integer mId;
    private String mURL;

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_description);

        titulo = (TextView) findViewById(R.id.titulo);
        autor = (TextView) findViewById(R.id.autor);
        sinopse = (TextView) findViewById(R.id.book_description);
        capa = (ImageView) findViewById(R.id.capa);
        imagePass = (ImageView) findViewById(R.id.imagePass);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        //identifica o id do item selecionado
        mId = Integer.parseInt(getIntent().getStringExtra("ID"));


        //localiza o item selecionado, no FakeDb, e resgata a URL da imagem da capa do livro
        for (Book bookTemp : FakeDb.list) {
            if (bookTemp.getId() == mId){
                mURL = bookTemp.getUrl();
                titulo.setText(bookTemp.getName());
                autor.setText(bookTemp.getAutor());
                sinopse.setText(bookTemp.getDescricao());
            }
        }

        //carrega a imagem através da URL, no campo capa
        Glide.with(this.getApplicationContext())
                .load(mURL)
                .into(capa);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

    }
}