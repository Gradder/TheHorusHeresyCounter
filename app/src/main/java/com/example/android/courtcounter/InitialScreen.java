package com.example.android.courtcounter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * Created by Роман on 03.02.2018.
 */

public class InitialScreen extends Activity {
    int selectedMission = 1;
    String[] missionNames = {"MISSION 1 - BLOOD FEUD", "MISSION 2 - ONSLAUGHT", "MISSION 3 - SHATTER STRIKE", "MISSION 4 - DOMINION",
            "MISSION 5 - TIDE OF CARNAGE", "MISSION 6 - WAR OF LIES"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_screen);

        String fontHeader = "fonts/header_font.ttf";

        TextView h1 = (TextView) findViewById(R.id.h1);
        TextView h2 = (TextView) findViewById(R.id.h2);
        TextView h3 = (TextView) findViewById(R.id.h3);
        TextView h4 = (TextView) findViewById(R.id.h4);
        TextView h5 = (TextView) findViewById(R.id.h5);
        TextView h6 = (TextView) findViewById(R.id.h6);
        TextView h7 = (TextView) findViewById(R.id.h7);
        Button h8 = (Button) findViewById(R.id.start_button);

        Typeface typefaceH = Typeface.createFromAsset(getAssets(), fontHeader);

        h1.setTypeface(typefaceH);
        h2.setTypeface(typefaceH);
        h3.setTypeface(typefaceH);
        h4.setTypeface(typefaceH);
        h5.setTypeface(typefaceH);
        h6.setTypeface(typefaceH);
        h7.setTypeface(typefaceH);
        h8.setTypeface(typefaceH);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

     // Setup adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.row, R.id.weekofday, missionNames);

        // Call adapter
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                                       View itemSelected, int selectedItemPosition, long selectedId) {
                selectedMission = selectedItemPosition + 1;
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

    public void start(View view) {


        Intent mainIntent = new Intent(InitialScreen.this, MainActivity.class);
        mainIntent.putExtra("mission", selectedMission);
        InitialScreen.this.startActivity(mainIntent);
        InitialScreen.this.finish();
    }
}
