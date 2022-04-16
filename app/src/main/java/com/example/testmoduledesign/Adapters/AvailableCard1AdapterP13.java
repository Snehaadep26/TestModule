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

import com.example.testmoduledesign.AvailbleCard1P13;
import com.example.testmoduledesign.MainActivityP9;
import com.example.testmoduledesign.R;

import java.util.ArrayList;

public class AvailableCard1AdapterP13 extends RecyclerView.Adapter<AvailableCard1AdapterP13.CardViewHolder> {
    ArrayList<AvailbleCard1P13> card1Hori1P1;
    Context context;
    public AvailableCard1AdapterP13(ArrayList<AvailbleCard1P13> card1Hori1P1, Context context)
    {
        this.card1Hori1P1=card1Hori1P1;
        this.context=context;
    }
    @NonNull
    @Override
    public AvailableCard1AdapterP13.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.available_card1p13,parent,false);
        AvailableCard1AdapterP13.CardViewHolder cvh=new AvailableCard1AdapterP13.CardViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull AvailableCard1AdapterP13.CardViewHolder holder, int position) {
        AvailbleCard1P13 currentCards = this.card1Hori1P1.get(position);
        holder.javaText.setText(currentCards.getJavaText());
        holder.mathsText.setText(currentCards.getMathsText());
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
        TextView javaText,mathsText,qsns,min,marks;
        Button button1;
        public CardViewHolder(@NonNull View itemView)
        {
            super(itemView);
            javaText=itemView.findViewById(R.id.jeeMockTestAVp13);
            mathsText=itemView.findViewById(R.id.mathsTextAVp13);
            qsns=itemView.findViewById(R.id.forfiveTextAVp13);
            min=itemView.findViewById(R.id.sevminTextAVp13);
            marks=itemView.findViewById(R.id.marksTextAVp13);
            button1=itemView.findViewById(R.id.backButtonAVp13);
        }
    }
}


