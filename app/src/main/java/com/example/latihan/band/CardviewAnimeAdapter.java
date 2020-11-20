package com.example.latihan.band;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardviewAnimeAdapter extends RecyclerView.Adapter<CardviewAnimeAdapter.CardViewHolder> {

    private ArrayList<Anime> listAnime;
    private Context context;

    public CardviewAnimeAdapter(ArrayList<Anime> list){

        this.listAnime = list;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_anime, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
        final Anime anime = listAnime.get(position);
        Glide.with(holder.itemView.getContext())
                .load(anime.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgAnime);
        holder.tvTitleAnime.setText(anime.getName());
        holder.tvDetailAnime.setText(anime.getDetail());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                Bundle bundle = new Bundle();

                bundle.putString("NamaAnime", anime.getName());
                bundle.putString("DetailAnime", anime.getDetail());
                bundle.putInt("ImageAnime", anime.getPhoto());
                intent.putExtras(bundle);

                context.startActivity(intent);
            }
        });


        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Share " +
                        listAnime.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listAnime.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAnime;
        TextView tvTitleAnime, tvDetailAnime;
        Button btnShare;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgAnime = itemView.findViewById(R.id.img_photo);
            tvTitleAnime = itemView.findViewById(R.id.tvTitle);
            tvDetailAnime = itemView.findViewById(R.id.tvDetail);
            btnShare = itemView.findViewById(R.id.btnShare);
        }
    }
}
