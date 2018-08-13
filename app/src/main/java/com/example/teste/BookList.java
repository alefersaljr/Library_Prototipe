package com.example.teste;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.teste.Adapters.LivroAdapter;
import com.example.teste.Model.FakeDb;
import com.example.teste.Model.VO.Book;

import java.util.ArrayList;

public class BookList extends Activity {

    //vars
    private  ArrayList<String> mName = new ArrayList<>();
    private  ArrayList<String> mImageUrls = new ArrayList<>();
    private  ArrayList<String> mAutor = new ArrayList<>();
    private  ArrayList<String> mSinopse = new ArrayList<>();
    private  ArrayList<Integer> mId = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        initImageBitmaps();
    }

    private void initImageBitmaps() {

        for (Book bookTemp : FakeDb.list) {
            mAutor.add(bookTemp.getAutor());
            mSinopse.add(bookTemp.getDescricao());
            mImageUrls.add(bookTemp.getUrl());
            mName.add(bookTemp.getName());
            mId.add(bookTemp.getId());
        }
        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler);
        LivroAdapter adapter = new LivroAdapter(this, mName, mImageUrls, mAutor, mSinopse, mId);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
