package com.cartridryan14.kumpulanhadist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {
    TextView doaTitle, doaSubtitle, doaSurah;
    ImageView imgTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgTitle = (ImageView)findViewById(R.id.img_doa);
        doaTitle = (TextView)findViewById(R.id.doa_title);
        doaSubtitle = (TextView)findViewById(R.id.doa_subtitle);
        doaSurah = (TextView)findViewById(R.id.doa_Surah);

    }
}
