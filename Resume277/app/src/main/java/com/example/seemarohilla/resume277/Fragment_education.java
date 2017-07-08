package com.example.seemarohilla.resume277;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by seemarohilla on 3/8/17.
 */

public class Fragment_education extends Fragment{
    private View myFragmentView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        myFragmentView = inflater.inflate(R.layout.education, container, false);
        CardView card1 = (CardView)myFragmentView.findViewById(R.id.card_view1);
        CardView card2 = (CardView)myFragmentView.findViewById(R.id.card_view2);
        CardView card3 = (CardView)myFragmentView.findViewById(R.id.card_view3);
        card1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                Bundle b = new Bundle();
                b.putInt("key", 1); //Your id
                intent.putExtras(b); //Put your id to your next Intent

                Fragment_education.this.startActivity(intent);

            }
        });
        card2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                Bundle b = new Bundle();
                b.putInt("key", 2); //Your id
                intent.putExtras(b); //Put your id to your next Intent
                Fragment_education.this.startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                Bundle b = new Bundle();
                b.putInt("key", 3); //Your id
                intent.putExtras(b); //Put your id to your next Intent
                Fragment_education.this.startActivity(intent);
            }
        });
        Typeface TypeFace1 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/JosefinSans-Bold.ttf");

        Typeface TypeFace2 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/JosefinSans-SemiBoldItalic.ttf");

        Typeface TypeFace3 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/Quicksand-Bold.otf");
        TextView textView = (TextView) myFragmentView.findViewById(R.id.school1);
        textView.setText("San Jose State University");
        textView.setTypeface(TypeFace1);
        TextView textView1 = (TextView) myFragmentView.findViewById(R.id.description1);
        textView1.setText("Masters of Science");
        textView1.setTypeface(TypeFace2);
        TextView textView2 = (TextView) myFragmentView.findViewById(R.id.school2);
        textView2.setText("Northern India Engineering College");
        textView2.setTypeface(TypeFace1);
        TextView textView3 = (TextView) myFragmentView.findViewById(R.id.description2);
        textView3.setText("Bachelor of Technology");
        textView3.setTypeface(TypeFace2);
        TextView textView4 = (TextView) myFragmentView.findViewById(R.id.school3);
        textView4.setText("Queen Mary's School");
        textView4.setTypeface(TypeFace1);
        TextView textView5 = (TextView) myFragmentView.findViewById(R.id.description3);
        textView5.setText("High School");
        textView5.setTypeface(TypeFace2);

        return myFragmentView;





}
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Education");
    }


}
