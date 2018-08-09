package com.example.teste;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.teste.Helper.BitmapHelper;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class LivroAdapter extends RecyclerView.Adapter<LivroAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageName = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mAutor = new ArrayList<>();
    private ArrayList<String> mSinopse = new ArrayList<>();
    private Context mContext;

    Bitmap bitmap;

    public LivroAdapter(Context mContext, ArrayList<String> mImageName, ArrayList<String> mImages, ArrayList<String> mAutor, ArrayList<String> mSinopse) {
        this.mImageName = mImageName;
        this.mImages = mImages;
        this.mContext = mContext;
        this.mAutor = mAutor;
        this.mSinopse = mSinopse;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);

        holder.imageName.setText(mImageName.get(position));
        holder.autorName.setText(mAutor.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageName.get(position));

                Intent it = new Intent(mContext, BookDescription.class);
                it.putExtra("LIVRO", mImageName.get(position).toString());
                it.putExtra("AUTOR", mAutor.get(position).toString());
                it.putExtra("IMAGEM", mImages.get(position).toString());
                it.putExtra("SINOPSE", mSinopse.get(position).toString());
                bitmap = loadBitmapFromUrl (mImages.get(position));
                BitmapHelper.getInstance().setBitmap(bitmap);
                mContext.startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image ;
        TextView imageName;
        TextView autorName;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.name);
            autorName = itemView.findViewById(R.id.autor);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }

    private Bitmap loadBitmapFromUrl(String imagem) {
        try{
            URL url = new URL(imagem);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();

            InputStream inputStream = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(inputStream);
            return myBitmap;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public LivroAdapter(List<Livro> livros, Context context) {
//        this.livros = livros;
//        this.context = context;
//    }
//
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context)
//                .inflate(R.layout.item_book_list, parent, false);
//        LivroViewHolder holder = new LivroViewHolder(view);
//
//        return holder;
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        holder.setItem(mDataset[position]);
//    }
//
//    @Override
//    public int getItemCount() {
//        return mDataset.length;
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,int position) {
//        LivroViewHolder holder = (LivroViewHolder) viewHolder;
//        Livro livro  = livros.get(position) ;
//        holder.nome.setText(livro.getNomeLivro());
//        holder.autor.setText(livro.getNomeAutor());
//        holder.descricao.setText(livro.getDescricao());
//        holder.preco.setText(Double.toString(livro.getPreco()));
//    }
//
//    @Override
//    public int getItemCount() {
//        return livros.size();
//    }
}
