package com.example.seemarohilla.resume277;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.HashMap;

/**
 * Created by seemarohilla on 3/9/17.
 */

public class DetailActivity extends AppCompatActivity {
    private View view;
    String schoolName;
    String specialisation;
    String location;
    String degree;
    String duration;
    String description;
    String gpa;

    HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
    int image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);
        Bundle b = getIntent().getExtras();
        int value = -1; // or other values
        if(b != null)
            value = b.getInt("key");

        hm.put(1,R.drawable.sjsu1);
        hm.put(2,R.drawable.nieccampus);
        hm.put(3,R.drawable.qms);


         getDetails(value);
        Typeface TypeFace1 = Typeface.createFromAsset(this
                .getAssets(),
                "fonts/JosefinSans-Bold.ttf");

        Typeface TypeFace2 = Typeface.createFromAsset(this.getAssets(),
                "fonts/JosefinSans-SemiBoldItalic.ttf");

        Typeface TypeFace3 = Typeface.createFromAsset(this.getAssets(),
                "fonts/Quicksand-Bold.otf");
        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.schoolName);
        textView.setText(schoolName);
        textView.setTypeface(TypeFace3);
        TextView textView1 = (TextView) findViewById(R.id.specialization);
        textView1.setText(specialisation);
        textView1.setTypeface(TypeFace2);
        TextView textView2 = (TextView) findViewById(R.id.location);
        textView2.setText(location);
        textView2.setTypeface(TypeFace2);
        TextView textView3 = (TextView) findViewById(R.id.degree);
        textView3.setText(degree);
        textView3.setTypeface(TypeFace3);
        TextView textView4 = (TextView) findViewById(R.id.graduation_year);
        textView4.setText(duration);
        textView4.setTypeface(TypeFace2);
        TextView textView5 = (TextView) findViewById(R.id.school_gpa);
        textView5.setText(gpa);
        textView5.setTypeface(TypeFace2);
        TextView textView6 = (TextView) findViewById(R.id.course_desc);
        textView6.setText(description);
        textView6.setTypeface(TypeFace2);


        ImageView imageView=(ImageView) findViewById(R.id.school_image);
        imageView.setBackgroundResource(image);

    }

    private void getDetails(int id){

    try {
        // Load data
        String jsonString = loadJsonFromAsset("details.json", this);
        JSONObject json = new JSONObject(jsonString);
        JSONArray details = json.getJSONArray("education");
        String value= String.valueOf(id);


        // Get Recipe objects from data
        for(int i = 0; i < details.length(); i++){
            if(value == details.getJSONObject(i).getString("id")){
            schoolName=details.getJSONObject(i).getString("schoolName");
                specialisation=details.getJSONObject(i).getString("specialization");
                location=details.getJSONObject(i).getString("location");
                gpa=details.getJSONObject(i).getString("gpa");
                degree=details.getJSONObject(i).getString("degree");
                description=details.getJSONObject(i).getString("description");
                duration=details.getJSONObject(i).getString("graduationyear");
                image=hm.get(id);
            }
        }
    } catch (JSONException e) {
        e.printStackTrace();
    }


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
