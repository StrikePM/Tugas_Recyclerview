package com.example.a2018034_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.a2018034_recyclerview.model.Champ;

public class ChampDetail extends AppCompatActivity {
    ImageView champImg;
    TextView champName, champRole, champDiff, champStory;
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ_detail);

        champImg =findViewById(R.id.img_champ);
        champName =findViewById(R.id.txtChampName);
        champRole =findViewById(R.id.txtChampRole);
        champDiff =findViewById(R.id.txtChampDiff);
        champStory =findViewById(R.id.txtChampStory);

        Champ champ = getIntent().getParcelableExtra(ITEM_EXTRA);

        if(champ != null) {
            Glide.with(this)
                    .load(champ.getLogo())
                    .into(champImg);
            champName.setText(champ.getName());
            champRole.setText(champ.getRole());
            champDiff.setText(champ.getDiff());
            champStory.setText(champ.getStory());
        }

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Champion Detail");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}