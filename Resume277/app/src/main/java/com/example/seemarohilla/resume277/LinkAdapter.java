package com.example.seemarohilla.resume277;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by seemarohilla on 3/10/17.
 */

public class LinkAdapter extends BaseAdapter {

    private final Context mContext;
    private final Link[] links;

    public LinkAdapter(Context context, Link[] links) {
        this.mContext = context;
        this.links = links;
    }

    @Override
    public int getCount() {
        return links.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Link link = links[position];


        // view holder pattern
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_links, null);

            final ImageView linkImage = (ImageView)convertView.findViewById(R.id.linkImage);
            final TextView linkName = (TextView)convertView.findViewById(R.id.linkName);
            final TextView linkType = (TextView)convertView.findViewById(R.id.linkType);

            final LinkAdapter.ViewHolder viewHolder = new LinkAdapter.ViewHolder(linkName, linkType, linkImage);
            convertView.setTag(viewHolder);
        }


        final LinkAdapter.ViewHolder viewHolder = (LinkAdapter.ViewHolder)convertView.getTag();
        viewHolder.linkimage.setImageResource(link.getImageResource());
        viewHolder.link_name.setText(link.getName());
        viewHolder.linklevel.setText(link.getLevel());



        return convertView;
    }

    private class ViewHolder {
        private final TextView link_name;
        private final TextView linklevel;
        private final ImageView linkimage;


        public ViewHolder(TextView link_name, TextView linklevel, ImageView linkimage) {
            this.link_name = link_name;
            this.linklevel = linklevel;
            this.linkimage = linkimage;

        }
    }
}
