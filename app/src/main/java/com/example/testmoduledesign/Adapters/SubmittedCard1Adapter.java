package com.example.testmoduledesign.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmoduledesign.R;
import com.example.testmoduledesign.SubmittedCard1;

import java.util.ArrayList;

public class SubmittedCard1Adapter extends RecyclerView.Adapter<SubmittedCard1Adapter.CardViewHolder> {
        ArrayList<SubmittedCard1> card1Hori1P1;
        Context context;
    public SubmittedCard1Adapter(ArrayList<SubmittedCard1> card1Hori1P1, Context context)
        {
            this.card1Hori1P1=card1Hori1P1;
            this.context=context;
        }
        @NonNull
        @Override
        public SubmittedCard1Adapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.submitted_card1,parent,false);
            SubmittedCard1Adapter.CardViewHolder cvh=new SubmittedCard1Adapter.CardViewHolder(view);
            return cvh;
        }

        @Override
        public void onBindViewHolder(@NonNull SubmittedCard1Adapter.CardViewHolder holder, int position) {
            SubmittedCard1 currentCards = this.card1Hori1P1.get(position);
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
                javaText=itemView.findViewById(R.id.jeeMockTestSC);
                mathsText=itemView.findViewById(R.id.mathsTextSC);
                phyTest=itemView.findViewById(R.id.phyTextSC);
                chemTest=itemView.findViewById(R.id.chemTextSC);
                qsns=itemView.findViewById(R.id.forfiveTextSC);
                min=itemView.findViewById(R.id.sevminTextSC);
                marks=itemView.findViewById(R.id.marksTextSC);
                recentText=itemView.findViewById(R.id.recentPublishTextSC);
            }
        }
    }




