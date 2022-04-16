package com.example.testmoduledesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class TestAdapterOT extends RecyclerView.Adapter<TestAdapterOT.CardViewHolder> {
    ArrayList<TestOT> card1Hori1P1;
    Context context;
    public TestAdapterOT(ArrayList<TestOT> card1Hori1P1, Context context)
    {
        this.card1Hori1P1=card1Hori1P1;
        this.context=context;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ongoing_testcardp1,parent,false);
        CardViewHolder cvh=new CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        TestOT currentCards = this.card1Hori1P1.get(position);
        holder.javaText.setText(currentCards.getJavaText());
        holder.mathsText.setText(currentCards.getMathsText());
        holder.phyTest.setText(currentCards.getPhyTest());
        holder.chemTest.setText(currentCards.getChemTest());
        holder.qsns.setText(currentCards.getQsns());
        holder.min.setText(currentCards.getMin());
        holder.marks.setText(currentCards.getMarks());



    }

    @Override
    public int getItemCount() {
        return card1Hori1P1.size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder
    {
        TextView javaText,mathsText,phyTest,chemTest,qsns,min,marks;
        public CardViewHolder(@NonNull View itemView)
        {
            super(itemView);
            javaText=itemView.findViewById(R.id.jeeMockTestOT);
            mathsText=itemView.findViewById(R.id.mathsTextOT);
            phyTest=itemView.findViewById(R.id.phyTextOT);
            chemTest=itemView.findViewById(R.id.chemTextOT);
            qsns=itemView.findViewById(R.id.forfiveTextOT);
            min=itemView.findViewById(R.id.sevminTextOT);
            marks=itemView.findViewById(R.id.marksTextOT);
        }
    }
}


