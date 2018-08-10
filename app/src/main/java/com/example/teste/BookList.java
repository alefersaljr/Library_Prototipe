package com.example.teste;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.teste.Model.FakeDb;
import com.example.teste.Model.VO.Book;

import java.util.ArrayList;
//import java.util.List;

public class BookList extends Activity {

    private static final String TAG = "BookList";

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
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        for (Book bookTemp : FakeDb.list) {
            mAutor.add(bookTemp.getAutor());
            mSinopse.add(bookTemp.getDescricao());
            mImageUrls.add(bookTemp.getUrl());
            mName.add(bookTemp.getName());
            mId.add(bookTemp.getId());
        }

//        mId.add(1);
//        mImageUrls.add("http://bestfantasybooks.com/blog/wp-content/uploads/2013/02/lotr.png");
//        mName.add("The Lord Of The Rings");
//        mAutor.add("J.R.R. Tolkien");
//        mSinopse.add("Este é um teste de preenchimento do campo da breve sinopse do livro que foi escolhido. Nesta tela é possível verificar maiores informações deste livro, abaixo pode-se verificar algumas paginas do livro.");
//
//        mId.add(2);
//        mImageUrls.add("http://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781608873869/the-hobbit-9781608873869_hr.jpg");
//        mName.add("The Hobbit");
//        mAutor.add("J.R.R. Tolkien");
//        mSinopse.add("TESTE");
//
//        mId.add(3);
//        mImageUrls.add("https://vignette.wikia.nocookie.net/harrypotter/images/c/c6/Harry_potter_HBP_Scholastic_edition.jpg/revision/latest?cb=20051228060531");
//        mName.add("Harry Potter, The Half-Blood Prince");
//        mAutor.add("J.K. Rowling");
//        mSinopse.add("TESTE");
//
//        mId.add(4);
//        mImageUrls.add("https://upload.wikimedia.org/wikipedia/pt/thumb/7/7e/O_Ladr%C3%A3o_de_Raios.jpg/230px-O_Ladr%C3%A3o_de_Raios.jpg");
//        mName.add("Percy Jackson, The Lightning Thief");
//        mAutor.add("Rick Riordan");
//        mSinopse.add("TESTE");
//
//        mId.add(5);
//        mImageUrls.add("http://2.bp.blogspot.com/-gtj1F8eOYBg/UaVrCENvhMI/AAAAAAAAAHs/8vKhr8uDKrw/s1600/Cover+heroes+of+olympus+%231+-+The+lost+hero+.jpg");
//        mName.add("The Lost Hero");
//        mAutor.add("Rick Riordan");
//        mSinopse.add("TESTE");
//
//        mId.add(6);
//        mImageUrls.add("http://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781781084557/sherlock-holmes-and-the-servants-of-hell-9781781084557_hr.jpg");
//        mName.add("Sherlock Holmes, The Servants Of Hell");
//        mAutor.add("Paul Kane");
//        mSinopse.add("TESTE");
//
//        mId.add(7);
//        mImageUrls.add("https://http2.mlstatic.com/audio-livro-dom-casmurro-machado-de-assis-D_NQ_NP_680256-MLB27189786642_042018-F.jpg");
//        mName.add("Dom Casmurro");
//        mAutor.add("Machado De Assis");
//        mSinopse.add("TESTE");
//
//        mId.add(8);
//        mImageUrls.add("https://upload.wikimedia.org/wikipedia/pt/thumb/8/8d/The_Wolf_of_Wall_Street.jpg/250px-The_Wolf_of_Wall_Street.jpg");
//        mName.add("The Wolf Of The Wall Street");
//        mAutor.add("Jordan Belfort");
//        mSinopse.add("TESTE");
//
//        mId.add(9);
//        mImageUrls.add("https://www.portaldoslivreiros.com.br/imagens/34555/PL34555.jpg");
//        mName.add("The Alchemist");
//        mAutor.add("Paulo Coelho");
//        mSinopse.add("TESTE");
//
//        mId.add(10);
//        mImageUrls.add("https://upload.wikimedia.org/wikipedia/en/0/05/Littleprince.JPG");
//        mName.add("The Little Prince");
//        mAutor.add("Antoine De Saint-Exupéry");
//        mSinopse.add("TESTE");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler);
        LivroAdapter adapter = new LivroAdapter(this, mName, mImageUrls, mAutor, mSinopse, mId);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
