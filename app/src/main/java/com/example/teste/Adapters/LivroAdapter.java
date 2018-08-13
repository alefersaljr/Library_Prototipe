package com.example.teste.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.teste.BookDescription;
import com.example.teste.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class LivroAdapter extends RecyclerView.Adapter<LivroAdapter.ViewHolder> {

    private ArrayList<String> mImageName = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mAutor = new ArrayList<>();
    private ArrayList<String> mSinopse = new ArrayList<>();
    private ArrayList<Integer> mId = new ArrayList<>();
    private Context mContext;

    public LivroAdapter(Context mContext, ArrayList<String> mImageName, ArrayList<String> mImages, ArrayList<String> mAutor, ArrayList<String> mSinopse, ArrayList<Integer> mId) {
        this.mImageName = mImageName;
        this.mImages = mImages;
        this.mContext = mContext;
        this.mAutor = mAutor;
        this.mSinopse = mSinopse;
        this.mId = mId;
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

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);

        holder.imageName.setText(mImageName.get(position));
        holder.autorName.setText(mAutor.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {

                Intent it = new Intent(mContext, BookDescription.class);
                it.putExtra("ID", mId.get(position).toString());

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
        TextView id;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.name);
            autorName = itemView.findViewById(R.id.autor);
            id = itemView.findViewById(R.id.id);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
