package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Capacitor extends AppCompatActivity {

    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capacitor);
        l = findViewById(R.id.list);
        String[] capacitors_;

        capacitors_ = getResources().getStringArray(R.array.Capacitor_names);
        ArrayAdapter<String> arr;

        arr= new ArrayAdapter<String>(this,R.layout.row, R.id.row_txt,capacitors_);
        l.setAdapter(arr);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(Capacitor.this,Web.class);
                intent.putExtra("capacitor_key",position);
                startActivity(intent);
            }
        });
    }
}