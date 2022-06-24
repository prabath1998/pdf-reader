package com.example.pdf_reader;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    public TextView txtNAme;
    public CardView cardView;


    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        txtNAme = itemView.findViewById(R.id.pdf_txtName);
        cardView = itemView.findViewById(R.id.pdf_cardView);
    }
}
