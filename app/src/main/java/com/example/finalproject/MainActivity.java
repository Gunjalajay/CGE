package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CardView resistor;
    private CardView capacitor;
    private CardView diode;
    private CardView ic;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capacitor=findViewById(R.id.capacitor);
        capacitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Capacitors opening...", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Capacitor.class);
                startActivity(intent);
            }
        });

        diode=findViewById(R.id.diode);
        diode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Toast.makeText(MainActivity.this, "Diodes opening...", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Diode.class);
                startActivity(intent);
            }
        });

        resistor=findViewById(R.id.resistor);
        resistor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Toast.makeText(MainActivity.this, "Resistors opening...", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Resistor.class);
                startActivity(intent);
            }
        });

        ic=findViewById(R.id.ic);
        ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                Toast.makeText(MainActivity.this, "IC's opening...", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,IC.class);
                startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.contact);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                Intent intent=new Intent(MainActivity.this,mail.class);
                startActivity(intent);
            }
        });
    }
}