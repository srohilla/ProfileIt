package com.example.seemarohilla.resume277;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by seemarohilla on 3/9/17.
 */

public class Fragment_project extends Fragment {
    private View myFragmentView;


    private ListView mListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        myFragmentView = inflater.inflate(R.layout.project_layout, container, false);


        final Context context = getActivity();

        // Get data to display
        final ArrayList<Project> projectList = Project.getProjectFromFile("details.json", getActivity());

        // Create adapter
        ProjectAdapter adapter = new ProjectAdapter(getActivity(), projectList);

        // Create list view
        mListView = (ListView) myFragmentView.findViewById(R.id.project_list_view);
        mListView.setAdapter(adapter);

        // Set what happens when a list view item is clicked
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Project selectedProject = projectList.get(position);
                Intent detailIntent = new Intent(context, ProjectDetailActivity.class);
                detailIntent.putExtra("title", selectedProject.title);
                detailIntent.putExtra("url", selectedProject.githubUrl);
                detailIntent.putExtra("image", selectedProject.image);
                detailIntent.putExtra("description", selectedProject.description);
                detailIntent.putExtra("technology", selectedProject.technology);
                detailIntent.putExtra("id", selectedProject.id);

                startActivity(detailIntent);
            }

        });

        return myFragmentView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Academic Projects");
    }

}
