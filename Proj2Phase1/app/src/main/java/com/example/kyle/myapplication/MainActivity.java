package com.example.kyle.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView t;

    String showResult;
    double tempStore = 0;
    int getAction = 0;
    boolean hasTyped = false;
    String CalcSequence = "";
    Integer conversion;
    double tempNumOne;
    double tempNumTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (TextView) findViewById(R.id.textView2);
        HandleClick buttonHandle = new HandleClick();
        findViewById(R.id.button).setOnClickListener(buttonHandle);
        findViewById(R.id.button2).setOnClickListener(buttonHandle);
        findViewById(R.id.button3).setOnClickListener(buttonHandle);
        findViewById(R.id.button4).setOnClickListener(buttonHandle);
        findViewById(R.id.button5).setOnClickListener(buttonHandle);
        findViewById(R.id.button6).setOnClickListener(buttonHandle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class HandleClick implements View.OnClickListener {
        public void onClick(View V) {
            // do something when the button is clicked
            switch (V.getId()) {
                case R.id.button:
                    CalcSequence = CalcSequence.concat("1");
                    t.setText(CalcSequence);
                    break;
                case R.id.button2:
                    CalcSequence = CalcSequence.concat("2");
                    t.setText(CalcSequence);
                    break;
                case R.id.button3:
                    CalcSequence = CalcSequence.concat("6");
                    t.setText(CalcSequence);
                    break;
                case R.id.button4:

                    setContentView(R.layout.activity_settings); //Settings
                    t.setText(CalcSequence);
                    break;
                case R.id.button5:
                    setContentView(R.layout.activity_about); //About
                    t.setText(CalcSequence);
                    break;
                case R.id.button6:
                    setContentView(R.layout.activity_game); //Begin Game
                    break;
                }
            }
        }
    }

