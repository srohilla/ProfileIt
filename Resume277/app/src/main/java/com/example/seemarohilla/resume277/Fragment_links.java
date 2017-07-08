package com.example.seemarohilla.resume277;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by seemarohilla on 3/10/17.
 */

public class Fragment_links extends Fragment{
    private View myFragmentView;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        myFragmentView = inflater.inflate(R.layout.links_layout, container, false);

        GridView gridView = (GridView)myFragmentView.findViewById(R.id.gridview);
        final LinkAdapter linkAdapter = new LinkAdapter(getActivity(), links);
        gridView.setAdapter(linkAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "You Clicked at " +links[position].getName(), Toast.LENGTH_SHORT).show();

                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(links[position].getUrl()));
                startActivity(browserIntent);

            }
        });

        return myFragmentView;

    }

    private Link[] links = {
            new Link("LinkedIn", "Professional", R.drawable.linkdin,"https://www.linkedin.com/in/seemarohilla/"),
            new Link("Github", "Professional", R.drawable.github,"https://github.com/srohilla"),
            new Link("Hackerrank", "Educational", R.drawable.hackerrank,"https://www.hackerrank.com/seema_rohilla"),
            new Link("DockerHub", "Educational", R.drawable.dockerhub,"https://hub.docker.com/u/seemarohilla/"),
            new Link("Facebook", "Personal", R.drawable.fb_logo,"https://www.facebook.com/seema.rohilla16"),



    };

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Social Profile");
    }




}
