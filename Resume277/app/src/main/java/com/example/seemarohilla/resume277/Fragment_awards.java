package com.example.seemarohilla.resume277;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by seemarohilla on 3/11/17.
 */

public class Fragment_awards extends Fragment{


    private View myFragmentView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        myFragmentView = inflater.inflate(R.layout.awards_layout, container, false);
        Typeface TypeFace1 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/JosefinSans-Bold.ttf");

        Typeface TypeFace2 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/JosefinSans-SemiBoldItalic.ttf");

        Typeface TypeFace3 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/Quicksand-Bold.otf");
        TextView textView = (TextView) myFragmentView.findViewById(R.id.award1);
        textView.setTypeface(TypeFace3);

        return myFragmentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Awards");
    }
}