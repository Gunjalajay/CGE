package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class Resistor extends AppCompatActivity {

    ListView l;
    SearchView s;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistor);
        l = findViewById(R.id.list_b);
        s=findViewById(R.id.searchView1);

        String[] resistors_;

        resistors_ = getResources().getStringArray(R.array.Resistor_names);
        ArrayAdapter<String> arr;

        arr= new ArrayAdapter<String>(this,R.layout.row2, R.id.row_txt2,resistors_);
        l.setAdapter(arr);



        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(Resistor.this,Web2.class);
                intent.putExtra("resistor_key",position);
                startActivity(intent);
            }
        });

        s.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String text) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public boolean onQueryTextChange(String text) {

                arr.getFilter().filter(text);

                return false;
            }
        });
    }



}


