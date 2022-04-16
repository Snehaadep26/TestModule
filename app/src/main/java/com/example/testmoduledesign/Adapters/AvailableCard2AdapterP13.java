package com.example.testmoduledesign.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmoduledesign.AvailableCard2P13;
import com.example.testmoduledesign.R;

import java.util.ArrayList;

public class AvailableCard2AdapterP13 extends RecyclerView.Adapter<AvailableCard2AdapterP13.CardViewHolder> {
    ArrayList<AvailableCard2P13> card1Hori1P1;
    Context context;
    public AvailableCard2AdapterP13(ArrayList<AvailableCard2P13> card1Hori1P1, Context context)
    {
        this.card1Hori1P1=card1Hori1P1;
        this.context=context;
    }
    @NonNull
    @Override
    public AvailableCard2AdapterP13.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.available_card2p13,parent,false);
        AvailableCard2AdapterP13.CardViewHolder cvh=new AvailableCard2AdapterP13.CardViewHolder(view);
        return cvh;
    }
    @Override
    public void onBindViewHolder(@NonNull AvailableCard2AdapterP13.CardViewHolder holder, int position) {
        AvailableCard2P13 currentCards = this.card1Hori1P1.get(position);
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
            javaText=itemView.findViewById(R.id.jeeMockTestAVp13);
            mathsText=itemView.findViewById(R.id.mathsTextAVp13);
            dateText=itemView.findViewById(R.id.dateTextAVp13);
            timeText=itemView.findViewById(R.id.timeTextAVp13);
            qsns=itemView.findViewById(R.id.forfiveTextAVp13);
            min=itemView.findViewById(R.id.sevminTextAVp13);
            marks=itemView.findViewById(R.id.marksTextAVp13);
        }
    }
}



