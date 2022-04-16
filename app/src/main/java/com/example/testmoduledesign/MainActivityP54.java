package com.example.testmoduledesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testmoduledesign.Fragments.FragmentBottomSheetDialogP18;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivityP54 extends AppCompatActivity {

    View view;
    TextView textView,textView2,textView3,textView4,textView5,nextText;
    ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageViewarrow;
    ConstraintLayout constraintLayout,constraintLayout1;
    BottomSheetDialog bottomSheetDialog1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p54);
        textView=findViewById(R.id.textView121p54);
        textView2=findViewById(R.id.textViewp49);
        textView3=findViewById(R.id.textView123p54);
        textView4=findViewById(R.id.unattemptTextp54);
        textView5=findViewById(R.id.unseenTextp54);

        nextText=findViewById(R.id.textView102p54);
        imageViewarrow=findViewById(R.id.downArrowp15p54);

        imageView3=findViewById(R.id.imageView114p54);
        imageView=findViewById(R.id.image2p54);
        imageView4=findViewById(R.id.img1p54);
        imageView5=findViewById(R.id.nextImgP54);
        imageView6=findViewById(R.id.imageViewp54);
        imageView7=findViewById(R.id.unseenimageViewp54);
        imageView2=findViewById(R.id.imageView12p54);
        nextText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivityP59.class);
                startActivity(intent);
            }
        });
//        imageView=findViewById(R.id.nextImgP54);
//        textView=findViewById(R.id.textViewp49p54);
//        imageView2.findViewById(R.id.imageView14p54);
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textView.setVisibility(View.VISIBLE);
//                imageView2.setVisibility(View.VISIBLE);
//            }
//        });
        imageViewarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentBottomSheetDialogP18 fragmentBottomSheet= new FragmentBottomSheetDialogP18();
                fragmentBottomSheet.show(getSupportFragmentManager(),fragmentBottomSheet.getTag());
            }
        });


//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getApplicationContext(), MainActivityP53.class);
//                startActivity(intent);
//            }
//        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView.setVisibility(View.GONE);
                textView2.setVisibility(View.GONE);
                imageView3.setVisibility(View.GONE);

                textView3.setVisibility(View.GONE);
                imageView4.setVisibility(View.GONE);
                imageView.setVisibility(View.GONE);
                imageView2.setVisibility(View.GONE);

            }
        });
    }
}