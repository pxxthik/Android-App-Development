package com.sxnu.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button spinnerListViewBtn;
    ArrayList<String> arrNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerListViewBtn = findViewById(R.id.spinnerListViewBtn);
        listView = findViewById(R.id.listView);

        Intent spinnerListView;
        spinnerListView = new Intent(MainActivity.this, SpinnerListView.class);

        arrNames.add("Hello world 1");
        arrNames.add("Hello world 2");
        arrNames.add("Hello world 3");
        arrNames.add("Hello world 4");
        arrNames.add("Hello world 5");
        arrNames.add("Hello world 6");
        arrNames.add("Hello world 7");
        arrNames.add("Hello world 8");
        arrNames.add("Hello world 9");
        arrNames.add("Hello world 10");
        arrNames.add("Hello world 11");
        arrNames.add("Hello world 12");
        arrNames.add("Hello world 13");
        arrNames.add("Hello world 14");
        arrNames.add("Hello world 15");
        arrNames.add("Hello world 16");
        arrNames.add("Hello world 17");
        arrNames.add("Hello world 18");
        arrNames.add("Hello world 19");
        arrNames.add("Hello world 20");
        arrNames.add("Hello world 21");
        arrNames.add("Hello world 22");
        arrNames.add("Hello world 23");
        arrNames.add("Hello world 24");
        arrNames.add("Hello world 25");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(MainActivity.this, "CLicked on "+ arrNames.get(i), Toast.LENGTH_SHORT).show();
            }
        });

        spinnerListViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(spinnerListView);
            }
        });

    }
}