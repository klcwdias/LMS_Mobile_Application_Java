package com.example.lms_mobile_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DrawerListAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mMenuTitles;
    private int[] mMenuIcons;

    public DrawerListAdapter(Context context, String[] menuTitles, int[] menuIcons) {
        mContext = context;
        mMenuTitles = menuTitles;
        mMenuIcons = menuIcons;
    }

    @Override
    public int getCount() {
        return mMenuTitles.length;
    }

    @Override
    public Object getItem(int position) {
        return mMenuTitles[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.drawer_list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.menuIcon = convertView.findViewById(R.id.menu_icon);
            viewHolder.menuTitle = convertView.findViewById(R.id.menu_title);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.menuIcon.setImageResource(mMenuIcons[position]);
        viewHolder.menuTitle.setText(mMenuTitles[position]);

        return convertView;
    }

    static class ViewHolder {
        ImageView menuIcon;
        TextView menuTitle;
    }
}
