package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        // find views
        TextView nameTV = findViewById(R.id.name_text_view);
        TextView addressTV = findViewById(R.id.address_text_view);
        TextView longTV = findViewById(R.id.long_text_view);
        ImageView imageIV = findViewById(R.id.image);


        //get info of opened location
        Bundle extras = getIntent().getExtras();
        nameTV.setText(extras.getInt("name"));
        addressTV.setText(extras.getInt("address"));
        longTV.setText(extras.getInt("long"));
        imageIV.setImageResource(extras.getInt("image"));


    }
}
