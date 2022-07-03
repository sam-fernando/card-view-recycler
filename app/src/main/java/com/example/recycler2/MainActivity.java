package com.example.recycler2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    //array list
    ArrayList <AminoAcidModel> aminoAcidModels = new ArrayList<>();


    int[] aminoAcidImages = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,

            R.drawable.e, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k,} ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setUpAminoAcidModels ();

        AA_RecyclerViewAdapter adapter = new AA_RecyclerViewAdapter(this,aminoAcidModels);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager( new LinearLayoutManager(this));

    }


    private  void setUpAminoAcidModels ()  {

        String[]  aminoAcidNames = getResources().getStringArray(R.array.amino_acids_full_txt);
        String[]  aminoAcidAbbriviation = getResources().getStringArray(R.array.amino_acids_three_letter_txt);
        String[]  aminoAcidAbbriviationSmall = getResources().getStringArray(R.array.amino_acids_one_letter_txt);

        for (int i = 0; i<aminoAcidNames.length; i++)  {

            aminoAcidModels.add(new AminoAcidModel(aminoAcidNames[i],aminoAcidAbbriviation[i],
                    aminoAcidAbbriviationSmall[i], aminoAcidImages [i] ));

        }

    }


}