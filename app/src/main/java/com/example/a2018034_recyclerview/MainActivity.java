package com.example.a2018034_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.a2018034_recyclerview.adapter.RecyclerviewAdapter;
import com.example.a2018034_recyclerview.data.ChampData;
import com.example.a2018034_recyclerview.model.Champ;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvChamp;
    public List<Champ> champList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Food Legit");

        rvChamp = findViewById(R.id.rv_champ);
        champList = ChampData.getDataChamp();

        RecyclerviewAdapter champAdapter = new RecyclerviewAdapter(champList);
        rvChamp.setAdapter(champAdapter);
        rvChamp.setLayoutManager(new LinearLayoutManager(this));

        rvChamp.addItemDecoration(new DividerItemDecoration
                (this, DividerItemDecoration.VERTICAL));

        champAdapter.setOnItemClickCallback(new RecyclerviewAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Champ data) {
                Intent moveIntent = new Intent(MainActivity.this, ChampDetail.class);
                moveIntent.putExtra(ChampDetail.ITEM_EXTRA, data);
                startActivity(moveIntent);
            }
        });
    }

    private void showSelectedFood(Champ data) {
        Toast.makeText(this, "Kamu memilih " + data.getName(), Toast.LENGTH_SHORT).show();
    }
}