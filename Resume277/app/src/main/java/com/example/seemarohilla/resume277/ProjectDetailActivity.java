package com.example.seemarohilla.resume277;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
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

public class ProjectDetailActivity extends AppCompatActivity {
    private View view;
    String schoolName;
    String specialisation;
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    int image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_detail_layout);


        hm.put(1, R.drawable.project1_desc);
        hm.put(2, R.drawable.project2);
        hm.put(3, R.drawable.project3_desc);


        String title = this.getIntent().getExtras().getString("title");
        String url = this.getIntent().getExtras().getString("url");
        // String image = this.getIntent().getExtras().getString("image");
        String technology = this.getIntent().getExtras().getString("technology");
        String description = this.getIntent().getExtras().getString("description");
        String id = this.getIntent().getExtras().getString("id");
        image = hm.get(Integer.valueOf(id));
        // Set title on action bar of this activity
        setTitle(title);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.projectTittle);
        textView.setText(title);
        TextView textView1 = (TextView) findViewById(R.id.description);
        textView1.setText(description);
        TextView textView2 = (TextView) findViewById(R.id.githubUrl);
        textView2.setText(url);
        TextView textView3 = (TextView) findViewById(R.id.technology);
        textView3.setText(technology);
        ImageView imageView = (ImageView) findViewById(R.id.projectimage);
        imageView.setBackgroundResource(image);




        Typeface TypeFace1 = Typeface.createFromAsset(this.getAssets(),
                "fonts/JosefinSans-Bold.ttf");

        Typeface TypeFace2 = Typeface.createFromAsset(this.getAssets(),
                "fonts/JosefinSans-SemiBoldItalic.ttf");

        Typeface TypeFace3 = Typeface.createFromAsset(this.getAssets(),
                "fonts/Quicksand-Bold.otf");
        textView2.setTypeface(TypeFace1);
        textView3.setTypeface(TypeFace1);
        textView.setTypeface(TypeFace3);
        textView1.setTypeface(TypeFace2);

    }

}
