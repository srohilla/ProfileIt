package com.example.seemarohilla.resume277;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by seemarohilla on 3/10/17.
 */

public class ProjectAdapter extends  BaseAdapter{



    HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();

    public static final String TAG = ProjectAdapter.class.getSimpleName();

    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Project> mDataSource;


    public ProjectAdapter(Context context, ArrayList<Project> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {
        return mDataSource.size();
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId(int position) {
        return position;
    }


    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        hm.put(1,R.drawable.project1);
        hm.put(2,R.drawable.project2);
        hm.put(3,R.drawable.project3);

        // check if the view already exists if so, no need to inflate and findViewById again!
        if (convertView == null) {

            // Inflate the custom row layout from your XML.
            convertView = mInflater.inflate(R.layout.list_item_project, parent, false);

            // create a new "Holder" with subviews
            holder = new ViewHolder();
            holder.thumbnailImageView = (ImageView) convertView.findViewById(R.id.recipe_list_thumbnail);
            holder.titleTextView = (TextView) convertView.findViewById(R.id.recipe_list_title);
            holder.subtitleTextView = (TextView) convertView.findViewById(R.id.recipe_list_subtitle);
            holder.detailTextView = (TextView) convertView.findViewById(R.id.recipe_list_detail);

            // hang onto this holder for future recyclage
            convertView.setTag(holder);
        }
        else {

            // skip all the expensive inflation/findViewById and just get the holder you already made
            holder = (ViewHolder) convertView.getTag();
        }

        // Get relevant subviews of row view
        TextView titleTextView = holder.titleTextView;
        TextView subtitleTextView = holder.subtitleTextView;
        TextView detailTextView = holder.detailTextView;
        ImageView thumbnailImageView = holder.thumbnailImageView;

        //Get corresponding recipe for row
        Project project = (Project) getItem(position);

        // Update row view's textviews to display recipe information
        titleTextView.setText(project.title);
        subtitleTextView.setText(project.description);
        detailTextView.setText(project.technology);
        thumbnailImageView.setBackgroundResource(hm.get(Integer.valueOf(project.id)));


        // Style text views
        Typeface titleTypeFace = Typeface.createFromAsset(mContext.getAssets(),
                "fonts/JosefinSans-Bold.ttf");
        titleTextView.setTypeface(titleTypeFace);
        Typeface subtitleTypeFace = Typeface.createFromAsset(mContext.getAssets(),
                "fonts/JosefinSans-SemiBoldItalic.ttf");
        subtitleTextView.setTypeface(subtitleTypeFace);
        Typeface detailTypeFace = Typeface.createFromAsset(mContext.getAssets(),
                "fonts/Quicksand-Bold.otf");
        detailTextView.setTypeface(detailTypeFace);
    //    detailTextView.setTextColor(android.support.v4.content.ContextCompat.getColor(mContext, LABEL_COLORS
     //           .get(recipe.label)));

        return convertView;
    }

    private static class ViewHolder {
        public TextView titleTextView;
        public TextView subtitleTextView;
        public TextView detailTextView;
        public ImageView thumbnailImageView;
    }
}
