package com.example.initiallistviewshabalkova;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ListView listView = findViewById(R.id.listView);
//        List<Map<String, String>> content = new ArrayList<>();
//        Map<String,String> firstRowMap = new HashMap<>();
//        firstRowMap.put("header", "abstract header");
//        firstRowMap.put("text", "new abstract text, new some text, new general text");
//        content.add(firstRowMap);
//
//        Map<String,String> secondRowMap = new HashMap<>();
//        secondRowMap.put("header", "abstract header 2");
//        secondRowMap.put("text", "new abstract text 2, new some text 2, new general text 2");
//        content.add(secondRowMap);
//
//        String[] from = new String[]{"header", "text"};
//        int[] to = new int[]{R.id.textViewHeader, R.id.textViewText};
//        SimpleAdapter adapter = new SimpleAdapter(this,content, R.layout.list_item, from, to);
//
//        listView.setAdapter(adapter);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        ListView list = findViewById(R.id.listView);

        List<Map<String, String>> values = prepareContent();
        String[] from = new String[]{"header", "count"};
        int[] to = new int[]{R.id.textViewHeader, R.id.textViewText};

        SimpleAdapter adapter = new SimpleAdapter(this,values, R.layout.list_item, from, to);
        //BaseAdapter listContentAdapter = createAdapter(values);

        list.setAdapter(adapter);
    }


//    @NonNull
//    private BaseAdapter createAdapter(String[] values) {
//        return new SimpleAdapter(MainActivity.this, R.layout.list_item, values.key );
//    }

    @NonNull
    private List<Map<String, String>> prepareContent() {
       String[] largeText = getString(R.string.large_text).split("\n\n");
       List<Map<String, String>> content = new ArrayList<>();


       for (int i=0; i < largeText.length; i++){
           Map<String,String> firstRowMap = new HashMap<>();
           firstRowMap.put("header",largeText[i]);
           firstRowMap.put("count", String.valueOf(largeText[i].length()));
           content.add(firstRowMap);
       }



//        firstRowMap.put("text", "new abstract text, new some text, new general text");
//        content.add(firstRowMap);
//
//        Map<String,String> secondRowMap = new HashMap<>();
//        secondRowMap.put("header", "abstract header 2");
//        secondRowMap.put("text", "new abstract text 2, new some text 2, new general text 2");
//        content.add(secondRowMap);

        return  content;
    }
}