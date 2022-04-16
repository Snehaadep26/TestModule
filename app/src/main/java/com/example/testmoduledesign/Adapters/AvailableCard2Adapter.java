package com.example.testmoduledesign.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmoduledesign.AvailableCard2;
import com.example.testmoduledesign.R;

import java.util.ArrayList;

public class AvailableCard2Adapter extends RecyclerView.Adapter<AvailableCard2Adapter.CardViewHolder> {
    ArrayList<AvailableCard2> card1Hori1P1;
    Context context;
    public AvailableCard2Adapter(ArrayList<AvailableCard2> card1Hori1P1, Context context)
    {
        this.card1Hori1P1=card1Hori1P1;
        this.context=context;
    }
    @NonNull
    @Override
    public AvailableCard2Adapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.available_card2,parent,false);
        AvailableCard2Adapter.CardViewHolder cvh=new AvailableCard2Adapter.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull AvailableCard2Adapter.CardViewHolder holder, int position) {
        AvailableCard2 currentCards = this.card1Hori1P1.get(position);
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
            javaText=itemView.findViewById(R.id.jeeMockTestAV);
            mathsText=itemView.findViewById(R.id.mathsTextAV);
            dateText=itemView.findViewById(R.id.dateTextAV);
            timeText=itemView.findViewById(R.id.timeTextAV);
            qsns=itemView.findViewById(R.id.forfiveTextAV);
            min=itemView.findViewById(R.id.sevminTextAV);
            marks=itemView.findViewById(R.id.marksTextAV);
        }
    }
}



