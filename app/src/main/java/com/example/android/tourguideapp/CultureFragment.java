package com.example.android.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of {@link Attraction}s.
 */
public class CultureFragment extends Fragment {

    public CultureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);


        // Create a list of Attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.culture_name_1, R.string.culture_address_1, R.string.culture_short_info_1, R.string.culture_long_info_1, R.drawable.culture1));
        attractions.add(new Attraction(R.string.culture_name_2, R.string.culture_address_2, R.string.culture_short_info_2, R.string.culture_long_info_2, R.drawable.culture2));
        attractions.add(new Attraction(R.string.culture_name_1, R.string.culture_address_1, R.string.culture_short_info_1, R.string.culture_long_info_1, R.drawable.culture1));
        attractions.add(new Attraction(R.string.culture_name_2, R.string.culture_address_2, R.string.culture_short_info_2, R.string.culture_long_info_2, R.drawable.culture2));
        attractions.add(new Attraction(R.string.culture_name_1, R.string.culture_address_1, R.string.culture_short_info_1, R.string.culture_long_info_1, R.drawable.culture1));
        attractions.add(new Attraction(R.string.culture_name_2, R.string.culture_address_2, R.string.culture_short_info_2, R.string.culture_long_info_2, R.drawable.culture2));
        attractions.add(new Attraction(R.string.culture_name_1, R.string.culture_address_1, R.string.culture_short_info_1, R.string.culture_long_info_1, R.drawable.culture1));
        attractions.add(new Attraction(R.string.culture_name_2, R.string.culture_address_2, R.string.culture_short_info_2, R.string.culture_long_info_2, R.drawable.culture2));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to open a detail activity for clicked position
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Attraction} object at the given position the user clicked on
                Attraction attraction = attractions.get(position);
                Intent goDetail = new Intent(getActivity(), DetailActivity.class);
                goDetail.putExtra("name", attraction.getmNameId());
                goDetail.putExtra("address", attraction.getmAddressId());
                goDetail.putExtra("long", attraction.getmLongInfoId());
                goDetail.putExtra("image", attraction.getmImageId());
                startActivity(goDetail);
            }
        });

        return rootView;
    }
}