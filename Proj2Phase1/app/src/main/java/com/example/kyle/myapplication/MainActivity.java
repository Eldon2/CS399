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
        findViewById(R.id.button7).setOnClickListener(buttonHandle);
        findViewById(R.id.button8).setOnClickListener(buttonHandle);
        findViewById(R.id.button9).setOnClickListener(buttonHandle);
        findViewById(R.id.button10).setOnClickListener(buttonHandle);
        findViewById(R.id.button11).setOnClickListener(buttonHandle);
        findViewById(R.id.button12).setOnClickListener(buttonHandle);
        findViewById(R.id.button13).setOnClickListener(buttonHandle);
        findViewById(R.id.button14).setOnClickListener(buttonHandle);
        findViewById(R.id.button15).setOnClickListener(buttonHandle);
        findViewById(R.id.button16).setOnClickListener(buttonHandle);
        findViewById(R.id.button17).setOnClickListener(buttonHandle);
        findViewById(R.id.button18).setOnClickListener(buttonHandle);
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
                    CalcSequence = CalcSequence.concat("3");
                    t.setText(CalcSequence);
                    break;
                case R.id.button4:
                    CalcSequence = CalcSequence.concat("4");
                    t.setText(CalcSequence);
                    break;
                case R.id.button5:
                    CalcSequence = CalcSequence.concat("5");
                    t.setText(CalcSequence);
                    break;
                case R.id.button6:
                    CalcSequence = CalcSequence.concat("6");
                    t.setText(CalcSequence);
                    break;
                case R.id.button7:
                    CalcSequence = CalcSequence.concat("7");
                    t.setText(CalcSequence);
                    break;
                case R.id.button8:
                    CalcSequence = CalcSequence.concat("8");
                    t.setText(CalcSequence);
                    break;
                case R.id.button9:
                    CalcSequence = CalcSequence.concat("9");
                    t.setText(CalcSequence);
                    break;
                case R.id.button10:
                    CalcSequence = CalcSequence.concat("0");
                    t.setText(CalcSequence);
                    break;
                case R.id.button11: //Decimal point
                    CalcSequence = CalcSequence.concat(".");
                    break;
                case R.id.button12: //Clear all fields
                    tempStore = 0;
                    CalcSequence = "";
                    getAction = 0;
                    hasTyped = false;
                    t.setText("0");
                    break;
                case R.id.button13: //Add
                    if (hasTyped == false) {
                        tempStore = Double.parseDouble(CalcSequence);
                        hasTyped = true;
                    }
                    else {
                        if (getAction == 1){
                            tempStore = tempStore + Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 2){
                            tempStore = tempStore - Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 3){
                            tempStore = tempStore * Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 4){
                            tempStore = tempStore / Double.parseDouble(CalcSequence);
                        }
                    }
                    t.setText(CalcSequence);
                    getAction = 1;
                    CalcSequence = "";
                    break;
                case R.id.button14: //Subtract
                    if (hasTyped == false) {
                        tempStore = Double.parseDouble(CalcSequence);
                        hasTyped = true;
                    }
                    else {
                        if (getAction == 1){
                            tempStore = tempStore + Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 2){
                            tempStore = tempStore - Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 3){
                            tempStore = tempStore * Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 4){
                            tempStore = tempStore / Double.parseDouble(CalcSequence);
                        }
                    }
                    t.setText(CalcSequence);
                    getAction = 2;
                    CalcSequence = "";
                    break;
                case R.id.button15: //Multiply
                    if (hasTyped == false) {
                        tempStore = Double.parseDouble(CalcSequence);
                        hasTyped = true;
                    }
                    else {
                        if (getAction == 1){
                            tempStore = tempStore + Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 2){
                            tempStore = tempStore - Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 3){
                            tempStore = tempStore * Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 4){
                            tempStore = tempStore / Double.parseDouble(CalcSequence);
                        }
                    }
                    t.setText(CalcSequence);
                    getAction = 3;
                    CalcSequence = "";
                    break;
                case R.id.button16: //Divide
                    if (hasTyped == false) {
                        tempStore = Double.parseDouble(CalcSequence);
                        hasTyped = true;
                    }
                    else {
                        if (getAction == 1){
                            tempStore = tempStore + Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 2){
                            tempStore = tempStore - Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 3){
                            tempStore = tempStore * Double.parseDouble(CalcSequence);
                        }
                        else if (getAction == 4){
                            tempStore = tempStore / Double.parseDouble(CalcSequence);
                        }
                    }
                    t.setText(CalcSequence);
                    getAction = 4;
                    CalcSequence = "";
                    break;
                case R.id.button17: //equals
                    if (getAction == 1){
                        tempStore = tempStore + Double.parseDouble(CalcSequence);
                    }
                    else if (getAction == 2){
                        tempStore = tempStore - Double.parseDouble(CalcSequence);
                    }
                    else if (getAction == 3){
                        tempStore = tempStore * Double.parseDouble(CalcSequence);
                    }
                    else if (getAction == 4){
                        tempStore = tempStore / Double.parseDouble(CalcSequence);
                    }
                    showResult = Double.toString(tempStore); //Display the entered result
                    t.setText(showResult);
                    showResult = "";
                    getAction = 0;
                    break;
                case R.id.button18: //Plus/minus
                    String saveOldSeq = CalcSequence;
                    char checkSign = CalcSequence.charAt(0);
                    if (checkSign != '-' & checkSign != '+') {
                        CalcSequence = "-" + saveOldSeq;
                    } else if (checkSign != '-') {
                        CalcSequence = "-" + saveOldSeq.substring(1);
                    } else {
                        CalcSequence = "" + saveOldSeq.substring(1);
                    }
                    t.setText(CalcSequence);
                    break;
                }
            }
        }
    }

