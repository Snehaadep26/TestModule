package com.example.testmoduledesign.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmoduledesign.MainActivityP13;
import com.example.testmoduledesign.MainActivityP6;
import com.example.testmoduledesign.R;
import com.example.testmoduledesign.SubjectsTest;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class SubjectsTestAdapter extends RecyclerView.Adapter<SubjectsTestAdapter.CardViewHolder> {
    ArrayList<SubjectsTest> card1Hori1P1;
    Context context;
    BottomSheetDialog bottomSheetDialog;
    public SubjectsTestAdapter(ArrayList<SubjectsTest> card1Hori1P1, Context context)
    {
        this.card1Hori1P1=card1Hori1P1;
        this.context=context;
    }
    @NonNull
    @Override
    public SubjectsTestAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subjects_card,parent,false);
        SubjectsTestAdapter.CardViewHolder cvh=new SubjectsTestAdapter.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectsTestAdapter.CardViewHolder holder, int position) {
        SubjectsTest currentCards = this.card1Hori1P1.get(position);
        holder.subjImg.setImageResource(currentCards.getImageSubj());
        holder.subjText.setText(currentCards.getSubjTest());
        holder.noOfTest.setText(currentCards.getNoOfTest());
        holder.subjImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, MainActivityP6.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, MainActivityP13.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return card1Hori1P1.size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder
    {
        TextView subjText,noOfTest,alltimetext;
        ImageView subjImg;
        public CardViewHolder(@NonNull View itemView)
        {
            super(itemView);
            subjImg=itemView.findViewById(R.id.subjImg);
            subjText=itemView.findViewById(R.id.subjTest);
            noOfTest=itemView.findViewById(R.id.noOfTest);
            alltimetext=itemView.findViewById(R.id.textView14);
        }
    }
}




