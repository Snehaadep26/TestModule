package com.example.testmoduledesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestAdapterUpCoLive extends RecyclerView.Adapter<TestAdapterUpCoLive.CardViewHolder> {
    ArrayList<TestUpCoLive> card1Hori1P1;
    Context context;
    public TestAdapterUpCoLive(ArrayList<TestUpCoLive> card1Hori1P1, Context context)
    {
        this.card1Hori1P1=card1Hori1P1;
        this.context=context;
    }
    @NonNull
    @Override
    public TestAdapterUpCoLive.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.upcoming_livecard,parent,false);
        TestAdapterUpCoLive.CardViewHolder cvh=new TestAdapterUpCoLive.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull TestAdapterUpCoLive.CardViewHolder holder, int position) {
        TestUpCoLive currentCards = this.card1Hori1P1.get(position);
        holder.javaText.setText(currentCards.getJavaText());
        holder.mathsText.setText(currentCards.getMathsText());
        holder.dateText.setText(currentCards.getDateText());
        holder.timeText.setText(currentCards.getTimeText());
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
        TextView javaText,mathsText,dateText,timeText,qsns,min,marks;
        public CardViewHolder(@NonNull View itemView)
        {
            super(itemView);
            javaText=itemView.findViewById(R.id.jeeMockTestUL);
            mathsText=itemView.findViewById(R.id.mathsTextUL);
            dateText=itemView.findViewById(R.id.dateTextUL);
            timeText=itemView.findViewById(R.id.timeTextUL);
            qsns=itemView.findViewById(R.id.forfiveTextUL);
            min=itemView.findViewById(R.id.sevminTextUL);
            marks=itemView.findViewById(R.id.marksTextUL);
        }
    }
}



