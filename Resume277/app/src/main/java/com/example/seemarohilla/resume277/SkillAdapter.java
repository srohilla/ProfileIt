package com.example.seemarohilla.resume277;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import android.widget.BaseAdapter;
/**
 * Created by seemarohilla on 3/9/17.
 */

public class SkillAdapter extends BaseAdapter {

    private final Context mContext;
    private final Skill[] skills;

    public SkillAdapter(Context context, Skill[] skills) {
        this.mContext = context;
        this.skills = skills;
    }

    @Override
    public int getCount() {
        return skills.length;
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
        final Skill skill = skills[position];

        // standard implementation (should start with this)
//    if (convertView == null) {
//      final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
//      convertView = layoutInflater.inflate(R.layout.linearlayout_book, null);
//    }
//
//    final ImageView imageView = (ImageView)convertView.findViewById(R.id.imageview_cover_art);
//    final TextView nameTextView = (TextView)convertView.findViewById(R.id.textview_book_name);
//    final TextView authorTextView = (TextView)convertView.findViewById(R.id.textview_book_author);
//    final ImageView imageViewFavorite = (ImageView)convertView.findViewById(R.id.imageview_favorite);
//
//    imageView.setImageResource(book.getImageResource());
//    nameTextView.setText(mContext.getString(book.getName()));
//    authorTextView.setText(mContext.getString(book.getAuthor()));
//    imageViewFavorite.setImageResource(book.getIsFavorite() ? R.drawable.star_enabled : R.drawable.star_disabled);

        // view holder pattern
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_skill, null);

            final ImageView skillimage = (ImageView)convertView.findViewById(R.id.skillimage);
            final TextView skillname = (TextView)convertView.findViewById(R.id.skillname);
            final TextView skilllevel = (TextView)convertView.findViewById(R.id.skilllevel);


            final ViewHolder viewHolder = new ViewHolder(skillname, skilllevel, skillimage);
            convertView.setTag(viewHolder);
        }

        final ViewHolder viewHolder = (ViewHolder)convertView.getTag();
       viewHolder.skillimage.setImageResource(skill.getImageResource());
        viewHolder.skill_name.setText(skill.getName());
        viewHolder.skilllevel.setText(skill.getLevel());



        return convertView;
    }

    private class ViewHolder {
        private final TextView skill_name;
        private final TextView skilllevel;
        private final ImageView skillimage;


        public ViewHolder(TextView skill_name, TextView skilllevel, ImageView skillimage) {
            this.skill_name = skill_name;
            this.skilllevel = skilllevel;
            this.skillimage = skillimage;

        }
    }

}
