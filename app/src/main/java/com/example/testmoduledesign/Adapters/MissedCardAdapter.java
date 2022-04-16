package com.example.testmoduledesign.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmoduledesign.MissedCard;
import com.example.testmoduledesign.R;

import java.util.ArrayList;

public class MissedCardAdapter extends RecyclerView.Adapter<MissedCardAdapter.CardViewHolder> {
    ArrayList<MissedCard> card1Hori1P1;
    Context context;
    public MissedCardAdapter(ArrayList<MissedCard> card1Hori1P1, Context context)
    {
        this.card1Hori1P1=card1Hori1P1;
        this.context=context;
    }
    @NonNull
    @Override
    public MissedCardAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.missed_card,parent,false);
        MissedCardAdapter.CardViewHolder cvh=new MissedCardAdapter.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MissedCardAdapter.CardViewHolder holder, int position) {
        MissedCard currentCards = this.card1Hori1P1.get(position);
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
            javaText=itemView.findViewById(R.id.jeeMockTestMiC);
            mathsText=itemView.findViewById(R.id.mathsTextMiC);
            phyTest=itemView.findViewById(R.id.phyTextMiC);
            chemTest=itemView.findViewById(R.id.chemTextMiC);
            qsns=itemView.findViewById(R.id.forfiveTextMiC);
            min=itemView.findViewById(R.id.sevminTextMiC);
            marks=itemView.findViewById(R.id.marksTextMiC);
            recentText=itemView.findViewById(R.id.recentPublishTextMiC);
        }
    }
}




