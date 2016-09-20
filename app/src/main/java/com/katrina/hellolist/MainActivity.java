package com.katrina.hellolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a reference to the ListView
        ListView listView = (ListView) findViewById(R.id.listview_arraylist);

        //Create an Array List and add some example data
        ArrayList<String> androidVersions = new ArrayList<String>();
        androidVersions.add("Jellybean");
        androidVersions.add("Kitkat");
        androidVersions.add("Lollypop");

        //Some data for the list
        //String[] androidVersions = {"Ice Cream Sandwich", "Jellybean", "Kitkat", "Lollypop"};

        //Create an ArrayAdapter. Note generic types used
        //Arguments are Context, a TExtView's resource ID, an array of the generic type
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, R.layout.list_view_item, R.id.android_version_name, androidVersions);

        //and set this ArrayAdapter to be the ListView's adapter
        listView.setAdapter(arrayAdapter);

        //Add data to the ArrayList
        androidVersions.add("Marshmallow");
        androidVersions.add(0, "Ice Cream Sandwich");
        //and tell the array adapter to notify the Listview that the data has changed
        arrayAdapter.notifyDataSetChanged();
    }
}
