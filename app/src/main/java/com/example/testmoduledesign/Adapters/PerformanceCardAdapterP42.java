package com.example.testmoduledesign.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmoduledesign.AvailbleCard1P13;
import com.example.testmoduledesign.MainActivityP43;
import com.example.testmoduledesign.MainActivityP9;
import com.example.testmoduledesign.PerformaceCardP42;
import com.example.testmoduledesign.R;

import java.util.ArrayList;

public class PerformanceCardAdapterP42 extends RecyclerView.Adapter<PerformanceCardAdapterP42.CardViewHolder> {
    ArrayList<PerformaceCardP42> card1Hori1P1;
    Context context;
    public PerformanceCardAdapterP42(ArrayList<PerformaceCardP42> card1Hori1P1, Context context)
    {
        this.card1Hori1P1=card1Hori1P1;
        this.context=context;
    }
    @NonNull
    @Override
    public PerformanceCardAdapterP42.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.performance_cardp42,parent,false);
        PerformanceCardAdapterP42.CardViewHolder cvh=new PerformanceCardAdapterP42.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull PerformanceCardAdapterP42.CardViewHolder holder, int position) {
        PerformaceCardP42 currentCards = this.card1Hori1P1.get(position);
        holder.subjText.setText(currentCards.getSubjText());
        holder.marks.setText(currentCards.getMarks());
        holder.infoText.setText(currentCards.getInfotext());
        holder.image.setImageResource(currentCards.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context, MainActivityP43.class);
                context.startActivity(i);
            }
        });




    }

    @Override
    public int getItemCount() {
        return card1Hori1P1.size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder
    {
        TextView subjText,marks,infoText;
        ImageView  image;
        public CardViewHolder(@NonNull View itemView)
        {
            super(itemView);
            subjText=itemView.findViewById(R.id.subjTextp42);
            marks=itemView.findViewById(R.id.marksTextp42);
            infoText=itemView.findViewById(R.id.infoTextp42);
            image=itemView.findViewById(R.id.imagep42);

        }
    }
}


