package com.example.testmoduledesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestAdapterRecentPub extends RecyclerView.Adapter<TestAdapterRecentPub.CardViewHolder> {
    ArrayList<TestRecentPub> card1Hori1P1;
    Context context;
    public TestAdapterRecentPub(ArrayList<TestRecentPub> card1Hori1P1, Context context)
    {
        this.card1Hori1P1=card1Hori1P1;
        this.context=context;
    }
    @NonNull
    @Override
    public TestAdapterRecentPub.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recent_publishcard,parent,false);
        TestAdapterRecentPub.CardViewHolder cvh=new TestAdapterRecentPub.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull TestAdapterRecentPub.CardViewHolder holder, int position) {
        TestRecentPub currentCards = this.card1Hori1P1.get(position);
        holder.javaText.setText(currentCards.getJavaText());
        holder.mathsText.setText(currentCards.getMathsText());
        holder.phyTest.setText(currentCards.getPhyTest());
        holder.chemTest.setText(currentCards.getChemTest());
        holder.qsns.setText(currentCards.getQsns());
        holder.min.setText(currentCards.getMin());
        holder.marks.setText(currentCards.getMarks());
        holder.recentText.setText(currentCards.getRecentText());


    }

    @Override
    public int getItemCount() {
        return card1Hori1P1.size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder
    {
        TextView javaText,mathsText,phyTest,chemTest,qsns,min,marks,recentText;
        public CardViewHolder(@NonNull View itemView)
        {
            super(itemView);
            javaText=itemView.findViewById(R.id.jeeMockTestRP);
            mathsText=itemView.findViewById(R.id.mathsTextRP);
            phyTest=itemView.findViewById(R.id.phyTextRP);
            chemTest=itemView.findViewById(R.id.chemTextRP);
            qsns=itemView.findViewById(R.id.forfiveTextRP);
            min=itemView.findViewById(R.id.sevminTextRP);
            marks=itemView.findViewById(R.id.marksTextRP);
            recentText=itemView.findViewById(R.id.recentPublishText);
        }
    }
}



