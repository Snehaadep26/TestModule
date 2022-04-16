package com.example.testmoduledesign.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testmoduledesign.AvailableCard;
import com.example.testmoduledesign.MainActivityP9;
import com.example.testmoduledesign.R;

import java.util.ArrayList;

public class AvailableCardAdapter extends RecyclerView.Adapter<AvailableCardAdapter.CardViewHolder> {
    ArrayList<AvailableCard> card1Hori1P1;
    Context context;
    public AvailableCardAdapter(ArrayList<AvailableCard> card1Hori1P1, Context context)
    {
        this.card1Hori1P1=card1Hori1P1;
        this.context=context;
    }
    @NonNull
    @Override
    public AvailableCardAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.available_card,parent,false);
        AvailableCardAdapter.CardViewHolder cvh=new AvailableCardAdapter.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull AvailableCardAdapter.CardViewHolder holder, int position) {
        AvailableCard currentCards = this.card1Hori1P1.get(position);
        holder.javaText.setText(currentCards.getJavaText());
        holder.mathsText.setText(currentCards.getMathsText());
        holder.phyTest.setText(currentCards.getPhyTest());
        holder.chemTest.setText(currentCards.getChemTest());
        holder.qsns.setText(currentCards.getQsns());
        holder.min.setText(currentCards.getMin());
        holder.marks.setText(currentCards.getMarks());
        holder.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, MainActivityP9.class);
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
        TextView javaText,mathsText,phyTest,chemTest,qsns,min,marks;
        Button button1;
        public CardViewHolder(@NonNull View itemView)
        {
            super(itemView);
            javaText=itemView.findViewById(R.id.jeeMockTestAV);
            mathsText=itemView.findViewById(R.id.mathsTextAV);
            phyTest=itemView.findViewById(R.id.phyTextAV);
            chemTest=itemView.findViewById(R.id.chemTextAV);
            qsns=itemView.findViewById(R.id.forfiveTextAV);
            min=itemView.findViewById(R.id.sevminTextAV);
            marks=itemView.findViewById(R.id.marksTextAV);
            button1=itemView.findViewById(R.id.backButtonAV);
        }
    }
}

