package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link AttractionAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Attraction} objects.
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {

    /**
     * Create a new {@link AttractionAdapter} object.
     *
     * @param context     is the current context (i.e. Activity) that the adapter is being created in.
     * @param attractions is the list of {@link Attraction}s to be displayed.
     */

    public AttractionAdapter(Context context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextViews in the list_item.xml layout
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        TextView infoTextView = listItemView.findViewById(R.id.info_text_view);
        ImageView imageView = listItemView.findViewById(R.id.image);

        // Get the name from the currentAttraction object and set this text on item
        nameTextView.setText(currentAttraction.getmNameId());
        infoTextView.setText(currentAttraction.getmShortInfoId());


        // Check if an image is provided for this attraction
        if (currentAttraction.hasImage()) {
            // If an image is available, display the provided image
            imageView.setImageResource(currentAttraction.getmImageId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in ListView
        return listItemView;
    }
}