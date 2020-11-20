package com.example.latihan.band;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnime;
    private ArrayList<Anime> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnime = findViewById(R.id.rvAnime);
        rvAnime.setHasFixedSize(true);

        list.addAll(AnimeData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvAnime.setLayoutManager(new LinearLayoutManager(this));
        CardviewAnimeAdapter cardViewAdapter = new CardviewAnimeAdapter(list);
        rvAnime.setAdapter(cardViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }


    public void MoveAbout(MenuItem item){
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }
}