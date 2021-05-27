package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Diode extends AppCompatActivity {

    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diode);
        l = findViewById(R.id.list_a);


        String[] capacitors_;

        capacitors_ = getResources().getStringArray(R.array.Diode_names);
        ArrayAdapter<String> arr;

        arr= new ArrayAdapter<String>(this,R.layout.row1, R.id.row_txt_,capacitors_);
        l.setAdapter(arr);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(Diode.this,Web1.class);
                intent.putExtra("diode_key",position);
                startActivity(intent);
            }
        });
    }
}