package com.example.seemarohilla.resume277;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by seemarohilla on 3/9/17.
 */

public class Fragment_skill extends Fragment{
    private View myFragmentView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        myFragmentView = inflater.inflate(R.layout.skill_layout, container, false);

        GridView gridView = (GridView)myFragmentView.findViewById(R.id.gridview);
        final SkillAdapter skillAdapter = new SkillAdapter(getActivity(), skills);
        gridView.setAdapter(skillAdapter);

        return myFragmentView;



    }

    private Skill[] skills = {
            new Skill("Python", "Advanced", R.drawable.python_icon),
            new Skill("Java", "Advanced", R.drawable.java_icon),
            new Skill("MySql", "Advanced", R.drawable.mysql_icon),
            new Skill("Docker", "Advanced", R.drawable.docker_icon),
            new Skill("NodeJs", "Advanced", R.drawable.nodejs_logo),
            new Skill("Angular", "Advanced", R.drawable.angularjs_logo),



    };

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Skill Spectrum");
    }


}
