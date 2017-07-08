package com.example.seemarohilla.resume277;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by seemarohilla on 3/10/17.
 */

public class Project {


    public static final String TAG = Project.class.getSimpleName();

    public String title;
    public String description;
    public String githubUrl;
    public String id;
    public String technology;
    public String image;

    public static ArrayList<Project> getProjectFromFile(String filename, Context context){
        final ArrayList<Project> projectList = new ArrayList<>();

        try {
            // Load data
            String jsonString = loadJsonFromAsset("details.json", context);
            JSONObject json = new JSONObject(jsonString);
            JSONArray projects = json.getJSONArray("projects");

            // Get Recipe objects from data
            for(int i = 0; i < projects.length(); i++){
                Project project = new Project();

                project.title = projects.getJSONObject(i).getString("title");
                project.description = projects.getJSONObject(i).getString("description");
                project.githubUrl = projects.getJSONObject(i).getString("url");
                project.id = projects.getJSONObject(i).getString("id");
                project.technology = projects.getJSONObject(i).getString("technology");
                project.image= projects.getJSONObject(i).getString("image");

                projectList.add(project);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return projectList;
    }

    private static String loadJsonFromAsset(String filename, Context context) {
        String json = null;

        try {
            InputStream is = context.getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        }
        catch (java.io.IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return json;
    }

}
