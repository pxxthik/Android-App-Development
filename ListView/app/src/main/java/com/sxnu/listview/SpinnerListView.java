package com.sxnu.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class SpinnerListView extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    ArrayList<String> arrNames = new ArrayList<>();
    AutoCompleteTextView actxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_list_view);


        listView = findViewById(R.id.listViewSpinner);
        spinner = findViewById(R.id.spinner);
        actxtView = findViewById(R.id.actxtView);

        arrNames.add("India");
        arrNames.add("USA");
        arrNames.add("UK");
        arrNames.add("Canada");
        arrNames.add("Mexico");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrNames);
        listView.setAdapter(adapter);

        ArrayAdapter<String> acadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrNames);
        actxtView.setAdapter(acadapter);
        actxtView.setThreshold(1);

    }
}