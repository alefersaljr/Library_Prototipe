package com.example.teste;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
//import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;

import java.util.ArrayList;
//import java.util.List;

public class BookInformation extends Activity {

    private static final String TAG = "BookInformation";

    //vars
    private  ArrayList<String> mName = new ArrayList<>();
    private  ArrayList<String> mImageUrls = new ArrayList<>();
    private  ArrayList<String> mAutor = new ArrayList<>();
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_information);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("http://bestfantasybooks.com/blog/wp-content/uploads/2013/02/lotr.png");
        mName.add("The Lord Of The Rings");
        mAutor.add("J.R.R. Tolkien");

        mImageUrls.add("http://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781608873869/the-hobbit-9781608873869_hr.jpg");
        mName.add("The Hobbit");
        mAutor.add("J.R.R. Tolkien");

        mImageUrls.add("https://vignette.wikia.nocookie.net/harrypotter/images/c/c6/Harry_potter_HBP_Scholastic_edition.jpg/revision/latest?cb=20051228060531");
        mName.add("Harry Potter, The Half-Blood Prince");
        mAutor.add("J.K. Rowling");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/pt/thumb/7/7e/O_Ladr%C3%A3o_de_Raios.jpg/230px-O_Ladr%C3%A3o_de_Raios.jpg");
        mName.add("Percy Jackson, The Lightning Thief");
        mAutor.add("Rick Riordan");

        mImageUrls.add("http://2.bp.blogspot.com/-gtj1F8eOYBg/UaVrCENvhMI/AAAAAAAAAHs/8vKhr8uDKrw/s1600/Cover+heroes+of+olympus+%231+-+The+lost+hero+.jpg");
        mName.add("The Lost Hero");
        mAutor.add("Rick Riordan");

        mImageUrls.add("http://d28hgpri8am2if.cloudfront.net/book_images/onix/cvr9781781084557/sherlock-holmes-and-the-servants-of-hell-9781781084557_hr.jpg");
        mName.add("Sherlock Holmes, The Servants Of Hell");
        mAutor.add("Paul Kane");

        mImageUrls.add("https://http2.mlstatic.com/audio-livro-dom-casmurro-machado-de-assis-D_NQ_NP_680256-MLB27189786642_042018-F.jpg");
        mName.add("Dom Casmurro");
        mAutor.add("Machado De Assis");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/pt/thumb/8/8d/The_Wolf_of_Wall_Street.jpg/250px-The_Wolf_of_Wall_Street.jpg");
        mName.add("The Wolf Of The Wall Street");
        mAutor.add("Jordan Belfort");

        mImageUrls.add("https://www.portaldoslivreiros.com.br/imagens/34555/PL34555.jpg");
        mName.add("The Alchemist");
        mAutor.add("Paulo Coelho");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/en/0/05/Littleprince.JPG");
        mName.add("The Little Prince");
        mAutor.add("Antoine De Saint-Exupéry");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler);
        LivroAdapter adapter = new LivroAdapter(this, mName, mImageUrls, mAutor);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
//
//        List<Livro> livros = new ArrayList<Livro>();
//
//        /* ACRESCENTA LIVROS NA LISTA */
//        Livro livrinho = new Livro("O Jardim das Aflições","Carvalho, Olavo de", "Ótimo Livro", 40.00);
//        livros.add(livrinho);
//
//        livrinho = new Livro("1984","Orwell, George", "Ótimo Livro", 28.90);
//        livros.add(livrinho);
//
//        livrinho = new Livro("Admirável Mundo Novo","Orwell, George", "Ótimo Livro", 19.90);
//        livros.add(livrinho);
//
//        livrinho = new Livro("O Sol É Para Todos","Lee, Harper", "Ótimo Livro", 19.90);
//        livros.add(livrinho);
//
//        livrinho = new Livro("Como Ler Livros","Huxley, Aldous", "Ótimo Livro", 50.00);
//        livros.add(livrinho);
//
//        livrinho = new Livro("A Revolução Dos Bichos","Orwell, George", "Ótimo Livro", 19.90);
//        livros.add(livrinho);
//
//        /* ACRESCENTA LIVROS NA LISTA */
//
//        recyclerView.setAdapter(new LivroAdapter(livros, this));
//
//        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
//                LinearLayoutManager.VERTICAL, false);
//
//        recyclerView.setLayoutManager(layout);
//    }
}
