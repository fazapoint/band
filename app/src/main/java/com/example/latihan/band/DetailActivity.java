package com.example.latihan.band;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    ImageView ImgPhoto;
    TextView Title, Detail;
    String gTitle, gDetail;
    int gImgPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        gTitle = bundle.getString("NamaAnime");
        gDetail = bundle.getString("DetailAnime");
        gImgPhoto = bundle.getInt("ImageAnime");

        Title = (TextView) findViewById(R.id.tvTitleAnime);
        Detail = (TextView) findViewById(R.id.tvDetailAnime);
        ImgPhoto = (ImageView) findViewById(R.id.img_photo_anime);

        Title.setText(" "+gTitle);
        Detail.setText("    "+gDetail);

        Glide.with(DetailActivity.this)
                .load(gImgPhoto)
                .apply(new RequestOptions().override(380,380))
                .into(ImgPhoto);
    }
}
