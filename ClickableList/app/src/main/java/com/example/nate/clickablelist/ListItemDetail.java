package com.example.nate.clickablelist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by nate on 3/7/17.
 */
public class ListItemDetail extends Activity implements AdapterView.OnItemClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listitem);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        // Here we turn your string.xml in an array
        String[] myKeys = getResources().getStringArray(R.array.sections);

        TextView myTextView = (TextView) findViewById(R.id.my_textview);
        myTextView.setText(myKeys[position]);

        ListView listview = (ListView) findViewById(R.id.listView2);
        listview.setOnItemClickListener(this);

    }

    public void onItemClick(AdapterView<?> l, View v, int position, long id) {
        Log.i("HelloListView", "You clicked Item: " + id + " at position:" + position);
        // Then you start a new Activity via Intent
    }
}