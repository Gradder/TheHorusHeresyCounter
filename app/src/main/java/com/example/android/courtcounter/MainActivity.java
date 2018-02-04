package com.example.android.courtcounter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    int parsedColor = Color.parseColor("#652E2E");

    private LinearLayout editorLayout;
    private LinearLayout editorLayout2;

    TextView p1name, p2name, dt, dt2, bf1, bf2, bf12, bf22, stw, lms, stw2, lms2, tpof, tpof2, changep1, changep2, minus, minus2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        int im, defaultValue = 0;
        Intent intent = getIntent();
        im = intent.getIntExtra("mission", defaultValue);

        switch (im) {
            case 1:
                setContentView(R.layout.activity_main);
                break;
            case 2:
                setContentView(R.layout.activity_mission2);
                break;
            case 3:
                setContentView(R.layout.activity_mission3);
                im--;
                break;
            case 4:
                setContentView(R.layout.activity_mission4);
                break;
            case 5:
                setContentView(R.layout.activity_mission5);
                im = 1;
                break;
            case 6:
                setContentView(R.layout.activity_mission6);
                break;
            default:
        }

        editorLayout = (LinearLayout) findViewById(R.id.invisibleEditor);
        editorLayout2 = (LinearLayout) findViewById(R.id.invisibleEditor2);

        String fontHeader = "fonts/header_font.ttf";
        Typeface typefaceH = Typeface.createFromAsset(getAssets(), fontHeader);

        switch (im) {
            case 1:
                p1name = (TextView) findViewById(R.id.p1name);
                p2name = (TextView) findViewById(R.id.p2name);
                dt = (TextView) findViewById(R.id.dt);
                dt2 = (TextView) findViewById(R.id.dt2);
                bf1 = (TextView) findViewById(R.id.bf1);
                bf2 = (TextView) findViewById(R.id.bf2);
                bf12 = (TextView) findViewById(R.id.bf12);
                bf22 = (TextView) findViewById(R.id.bf22);
                stw = (TextView) findViewById(R.id.stw);
                lms = (TextView) findViewById(R.id.lms);
                tpof = (TextView) findViewById(R.id.tpof);
                stw2 = (TextView) findViewById(R.id.stw2);
                lms2 = (TextView) findViewById(R.id.lms2);
                tpof2 = (TextView) findViewById(R.id.tpof2);
                changep1 = (TextView) findViewById(R.id.changep1);
                changep2 = (TextView) findViewById(R.id.changep2);

                p1name.setTypeface(typefaceH);
                p2name.setTypeface(typefaceH);
                dt.setTypeface(typefaceH);
                bf1.setTypeface(typefaceH);
                bf2.setTypeface(typefaceH);
                bf12.setTypeface(typefaceH);
                bf22.setTypeface(typefaceH);
                dt2.setTypeface(typefaceH);
                stw.setTypeface(typefaceH);
                lms.setTypeface(typefaceH);
                tpof.setTypeface(typefaceH);
                stw2.setTypeface(typefaceH);
                lms2.setTypeface(typefaceH);
                tpof2.setTypeface(typefaceH);
                changep1.setTypeface(typefaceH);
                changep2.setTypeface(typefaceH);
                break;
            case 2:
                p1name = (TextView) findViewById(R.id.p1name);
                p2name = (TextView) findViewById(R.id.p2name);
                dt = (TextView) findViewById(R.id.dt);
                dt2 = (TextView) findViewById(R.id.dt2);
                bf1 = (TextView) findViewById(R.id.bf1);
                bf12 = (TextView) findViewById(R.id.bf12);
                stw = (TextView) findViewById(R.id.stw);
                lms = (TextView) findViewById(R.id.lms);
                tpof = (TextView) findViewById(R.id.tpof);
                stw2 = (TextView) findViewById(R.id.stw2);
                lms2 = (TextView) findViewById(R.id.lms2);
                tpof2 = (TextView) findViewById(R.id.tpof2);
                changep1 = (TextView) findViewById(R.id.changep1);
                changep2 = (TextView) findViewById(R.id.changep2);

                p1name.setTypeface(typefaceH);
                p2name.setTypeface(typefaceH);
                dt.setTypeface(typefaceH);
                bf1.setTypeface(typefaceH);
                bf12.setTypeface(typefaceH);
                dt2.setTypeface(typefaceH);
                stw.setTypeface(typefaceH);
                lms.setTypeface(typefaceH);
                tpof.setTypeface(typefaceH);
                stw2.setTypeface(typefaceH);
                lms2.setTypeface(typefaceH);
                tpof2.setTypeface(typefaceH);
                changep1.setTypeface(typefaceH);
                changep2.setTypeface(typefaceH);

                break;

            case 4:
                p1name = (TextView) findViewById(R.id.p1name);
                p2name = (TextView) findViewById(R.id.p2name);
                dt = (TextView) findViewById(R.id.dt);
                dt2 = (TextView) findViewById(R.id.dt2);
                stw = (TextView) findViewById(R.id.stw);
                lms = (TextView) findViewById(R.id.lms);
                tpof = (TextView) findViewById(R.id.tpof);
                stw2 = (TextView) findViewById(R.id.stw2);
                lms2 = (TextView) findViewById(R.id.lms2);
                tpof2 = (TextView) findViewById(R.id.tpof2);
                changep1 = (TextView) findViewById(R.id.changep1);
                changep2 = (TextView) findViewById(R.id.changep2);

                p1name.setTypeface(typefaceH);
                p2name.setTypeface(typefaceH);
                dt.setTypeface(typefaceH);
                dt2.setTypeface(typefaceH);
                stw.setTypeface(typefaceH);
                lms.setTypeface(typefaceH);
                tpof.setTypeface(typefaceH);
                stw2.setTypeface(typefaceH);
                lms2.setTypeface(typefaceH);
                tpof2.setTypeface(typefaceH);
                changep1.setTypeface(typefaceH);
                changep2.setTypeface(typefaceH);
                break;
            case 6:
                p1name = (TextView) findViewById(R.id.p1name);
                p2name = (TextView) findViewById(R.id.p2name);
                dt = (TextView) findViewById(R.id.dt);
                dt2 = (TextView) findViewById(R.id.dt2);
                bf1 = (TextView) findViewById(R.id.bf1);
                bf2 = (TextView) findViewById(R.id.bf2);
                bf12 = (TextView) findViewById(R.id.bf12);
                bf22 = (TextView) findViewById(R.id.bf22);
                stw = (TextView) findViewById(R.id.stw);
                lms = (TextView) findViewById(R.id.lms);
                tpof = (TextView) findViewById(R.id.tpof);
                stw2 = (TextView) findViewById(R.id.stw2);
                lms2 = (TextView) findViewById(R.id.lms2);
                tpof2 = (TextView) findViewById(R.id.tpof2);
                changep1 = (TextView) findViewById(R.id.changep1);
                changep2 = (TextView) findViewById(R.id.changep2);
                minus = (TextView) findViewById(R.id.minus);
                minus2 = (TextView) findViewById(R.id.minus2);

                p1name.setTypeface(typefaceH);
                p2name.setTypeface(typefaceH);
                dt.setTypeface(typefaceH);
                bf1.setTypeface(typefaceH);
                bf2.setTypeface(typefaceH);
                bf12.setTypeface(typefaceH);
                bf22.setTypeface(typefaceH);
                dt2.setTypeface(typefaceH);
                stw.setTypeface(typefaceH);
                lms.setTypeface(typefaceH);
                tpof.setTypeface(typefaceH);
                stw2.setTypeface(typefaceH);
                lms2.setTypeface(typefaceH);
                tpof2.setTypeface(typefaceH);
                changep1.setTypeface(typefaceH);
                changep2.setTypeface(typefaceH);
                minus.setTypeface(typefaceH);
                minus2.setTypeface(typefaceH);
                break;
            default:
        }

    }

    public void addOneForPlayer1(View v) {
        scorePlayer1++;
        displayForPlayer1(scorePlayer1);
    }

    public void addOneForPlayer2(View v) {
        scorePlayer2++;
        displayForPlayer2(scorePlayer2);
    }

    public void addTwoForPlayer1(View v) {
        scorePlayer1 += 2;
        displayForPlayer1(scorePlayer1);
    }

    public void addTwoForPlayer2(View v) {
        scorePlayer2 += 2;
        displayForPlayer2(scorePlayer2);
    }

    public void addThreeForPlayer1(View v) {
        scorePlayer1 += 3;
        displayForPlayer1(scorePlayer1);
    }

    public void addThreeForPlayer2(View v) {
        scorePlayer2 += 3;
        displayForPlayer2(scorePlayer2);
    }

    public void addFiveForPlayer1(View v) {
        scorePlayer1 += 5;
        displayForPlayer1(scorePlayer1);
    }

    public void addFiveForPlayer2(View v) {
        scorePlayer2 += 5;
        displayForPlayer2(scorePlayer2);
    }

    public void addSevenForPlayer1(View v) {
        scorePlayer1 += 7;
        displayForPlayer1(scorePlayer1);
    }

    public void addSevenForPlayer2(View v) {
        scorePlayer2 += 7;
        displayForPlayer2(scorePlayer2);
    }

    public void minusOneForPlayer1(View v) {
        scorePlayer1--;
        displayForPlayer1(scorePlayer1);
    }

    public void minusOneForPlayer2(View v) {
        scorePlayer2--;
        displayForPlayer2(scorePlayer2);
    }

    public void addOnlyOneForPlayer1(View v) {
        scorePlayer1++;
        v.setBackgroundColor(parsedColor);
        v.setEnabled(false);
        displayForPlayer1(scorePlayer1);
    }

    public void addOnlyOneForPlayer2(View v) {
        scorePlayer2++;
        v.setBackgroundColor(parsedColor);
        v.setEnabled(false);
        displayForPlayer2(scorePlayer2);
    }

    public void addOnlyFiveForPlayer1(View v) {
        scorePlayer1 += 5;
        v.setBackgroundColor(parsedColor);
        v.setEnabled(false);
        displayForPlayer1(scorePlayer1);
    }

    public void addOnlyFiveForPlayer2(View v) {
        scorePlayer2 += 5;
        v.setBackgroundColor(parsedColor);
        v.setEnabled(false);
        displayForPlayer2(scorePlayer2);
    }

    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void changeP1name(View view) {
        editorLayout.setVisibility(View.VISIBLE);
    }

    public void changeP2name(View view) {
        editorLayout2.setVisibility(View.VISIBLE);
    }

    public void exchangeNameP1(View view) {
        exchangeName(true);
    }

    public void exchangeNameP2(View view) {
        exchangeName(false);
    }

    public void exchangeName(boolean firstPlayer) {
        EditText editor = (EditText) findViewById(R.id.editPText);
        EditText editor2 = (EditText) findViewById(R.id.editPText2);
        if (firstPlayer) {
            TextView p1name = (TextView) findViewById(R.id.p1name);
            p1name.setText(editor.getText());
            editor.setText("");
            editorLayout.setVisibility(View.INVISIBLE);
        } else {
            TextView p2name = (TextView) findViewById(R.id.p2name);
            p2name.setText(editor2.getText());
            editor2.setText("");
            editorLayout2.setVisibility(View.INVISIBLE);
        }
    }
}
