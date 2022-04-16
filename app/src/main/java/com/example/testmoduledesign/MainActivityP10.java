package com.example.testmoduledesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.android.material.button.MaterialButton;

public class MainActivityP10 extends AppCompatActivity {
    Button button1;
    CheckBox checkBox1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p10);
        button1=findViewById(R.id.buttonStartTest);

        checkBox1= ( CheckBox ) findViewById( R.id.checkBox1);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if ( isChecked )
                {
                    button1.setEnabled(true);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent=new Intent(getApplicationContext(),MainActivityP17.class);
                            startActivity(intent);
                        }
                    });

                }else{
                    button1.setEnabled(false);
                }

            }
        });


    }
}