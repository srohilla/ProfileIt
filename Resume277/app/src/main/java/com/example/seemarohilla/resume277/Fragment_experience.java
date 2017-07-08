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
 * Created by seemarohilla on 3/9/17.
 */

public class Fragment_experience extends Fragment{
    private View myFragmentView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        myFragmentView = inflater.inflate(R.layout.experience_layout, container, false);
        Typeface TypeFace1 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/JosefinSans-Bold.ttf");

        Typeface TypeFace2 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/JosefinSans-SemiBoldItalic.ttf");

        Typeface TypeFace3 = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/Quicksand-Bold.otf");
        TextView textView = (TextView) myFragmentView.findViewById(R.id.designation);
        textView.setTypeface(TypeFace3);
        TextView textView1 = (TextView) myFragmentView.findViewById(R.id.duration);
        textView1.setTypeface(TypeFace1);
        TextView textView2 = (TextView) myFragmentView.findViewById(R.id.projectName);
        textView2.setTypeface(TypeFace3);
        TextView textView3 = (TextView) myFragmentView.findViewById(R.id.projectDesc);
        textView3.setText("•\tPart of API Team, a core technical team of Sopra Banking Software.\n" +
                "•\tWorked in isolating technical and functional framework by building API’s specific to project.\n" +
                "•\tInvolved in designing and reviewing of software design descriptions. Performed testing and fixed bugs. \n" +
                "•\tDeveloped parsing tools used for analysis purpose.\n");
        textView3.setTypeface(TypeFace2);


        return myFragmentView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Professional Experience");
    }

}
