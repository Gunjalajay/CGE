package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IC extends AppCompatActivity {

    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_c);
        l = findViewById(R.id.list_c);


        String[] ics_;

        ics_ = getResources().getStringArray(R.array.IC_names);
        ArrayAdapter<String> arr;

        arr= new ArrayAdapter<String>(this,R.layout.row3, R.id.row_txt3,ics_);
        l.setAdapter(arr);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(IC.this,Web3.class);
                intent.putExtra("ic_key",position);
                startActivity(intent);
            }
        });
    }
}