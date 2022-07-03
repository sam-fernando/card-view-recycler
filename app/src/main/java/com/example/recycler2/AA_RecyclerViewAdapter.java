package com.example.recycler2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AA_RecyclerViewAdapter extends RecyclerView.Adapter <AA_RecyclerViewAdapter.MyViewHolder> {



   //two variables
    //context for inflating layout
    //array list to hold the model
    Context context;
    ArrayList<AminoAcidModel> aminoAcidModels;

    //constructor to above variables to get values from them
    public AA_RecyclerViewAdapter(Context context, ArrayList<AminoAcidModel>aminoAcidModels){

        this.context = context;
        this.aminoAcidModels = aminoAcidModels;
    }





    //inflating the layout  (giving a look to our row)
    @NonNull
    @Override
    public AA_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row,parent,false);

        return new AA_RecyclerViewAdapter.MyViewHolder(view);
    }





    //assign, reassign values to each model block, even though it is passed from the position
    @Override
    public void onBindViewHolder(@NonNull AA_RecyclerViewAdapter.MyViewHolder holder, int position) {

    holder.tvName.setText(aminoAcidModels.get(position).getAminiAcidName());
    holder.tv3Letter.setText(aminoAcidModels.get(position).getAminoAcidAbreviation());
    holder.tv1Letter.setText(aminoAcidModels.get(position).getAminiAcidAbreviationSmall());
    holder.imageView.setImageResource(aminoAcidModels.get(position).getImage());



    }





    // how many items are there as total
    @Override
    public int getItemCount() {
        return aminoAcidModels.size();
    }






    //grabbing views from the model and assign them the variables
    public static class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView imageView;
        TextView tvName, tv3Letter, tv1Letter;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);




            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textView);
            tv3Letter = itemView.findViewById(R.id.textView2);
            tv1Letter = itemView.findViewById(R.id.textView3);



        }
    }


}
