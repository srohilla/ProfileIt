package com.example.seemarohilla.resume277;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment_about extends Fragment {


    private View myFragmentView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        myFragmentView = inflater.inflate(R.layout.about, container, false);
        Typeface TypeFace1 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/JosefinSans-Bold.ttf");

        Typeface TypeFace2 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/JosefinSans-SemiBoldItalic.ttf");

        Typeface TypeFace3 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/Quicksand-Bold.otf");
        TextView textView = (TextView) myFragmentView.findViewById(R.id.name);
        textView.setText("Seema Rohilla");
        textView.setTypeface(TypeFace2);
        TextView textView1 = (TextView) myFragmentView.findViewById(R.id.tagline);
        textView1.setText("#Engineer By Choice#");
        textView1.setTypeface(TypeFace2);
        TextView textView2 = (TextView) myFragmentView.findViewById(R.id.detail_about);
        textView2.setText("Graduate student pursuing master's in software engineering at San Jose state university with specialization in Enterprise Software Technologies.  Software Engineer with 2 years of hands-on experience developing quality software.  T-shape personality with an appetite for problem-solving. A team player and passionate about working with great minds.");
        textView2.setTypeface(TypeFace2);
        return myFragmentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("All About Me");
    }

}
