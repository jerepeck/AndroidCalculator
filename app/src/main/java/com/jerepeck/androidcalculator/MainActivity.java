package com.jerepeck.androidcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

// Additional imports
import android.view.View;   // Needed whenever you need to use widgets
import android.widget.Button;   // Using buttons
import android.widget.TextView;   // Using number output

public class MainActivity extends AppCompatActivity {

    public String sign = "";
    public String total = "";
    public Double tempDouble, tempDouble2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        // Buttons 0-9
        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);

        // Buttons Clear and Equals
        Button buttonC = (Button)findViewById(R.id.buttonC);
        Button buttonE = (Button)findViewById(R.id.buttonE);

        // Buttons Add, Subtract, Multiply, Divide
        Button buttonA = (Button)findViewById(R.id.buttonA);
        Button buttonS = (Button)findViewById(R.id.buttonS);
        Button buttonM = (Button)findViewById(R.id.buttonM);
        Button buttonD = (Button)findViewById(R.id.buttonD);

        // Button 0 Event Handler
        button0.setOnClickListener(
                // Button 0 Interface
                new Button.OnClickListener()
                {
                    // Button 0 Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("0");
                    }
                }
        );

        button1.setOnClickListener(
                // Button 1 Interface
                new Button.OnClickListener()
                {
                    // Button 1 Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("1");
                    }
                }
        );

        button2.setOnClickListener(
                // Button 2 Interface
                new Button.OnClickListener()
                {
                    // Button 2 Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("2");
                    }
                }
        );

        button3.setOnClickListener(
                // Button 3 Interface
                new Button.OnClickListener()
                {
                    // Button 3 Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("3");
                    }
                }
        );


        button4.setOnClickListener(
                // Button 4 Interface
                new Button.OnClickListener()
                {
                    // Button 4 Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("4");
                    }
                }
        );

        button5.setOnClickListener(
                // Button 5 Interface
                new Button.OnClickListener()
                {
                    // Button 5 Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("5");
                    }
                }
        );

        button6.setOnClickListener(
                // Button 6 Interface
                new Button.OnClickListener()
                {
                    // Button 6 Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("6");
                    }
                }
        );

        button7.setOnClickListener(
                // Button 7 Interface
                new Button.OnClickListener()
                {
                    // Button 7 Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("7");
                    }
                }
        );

        button8.setOnClickListener(
                // Button 8 Interface
                new Button.OnClickListener()
                {
                    // Button 8 Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("8");
                    }
                }
        );

        button9.setOnClickListener(
                // Button 9 Interface
                new Button.OnClickListener()
                {
                    // Button 9 Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("9");
                    }
                }
        );

        buttonC.setOnClickListener(
                // Button C Interface
                new Button.OnClickListener()
                {
                    // Button C Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.setText("");
                    }
                }
        );

        buttonA.setOnClickListener(
                // Button A Interface
                new Button.OnClickListener()
                {
                    // Button A Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "+";
                    }
                }
        );

        buttonS.setOnClickListener(
                // Button S Interface
                new Button.OnClickListener()
                {
                    // Button S Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "-";
                    }
                }
        );

        buttonM.setOnClickListener(
                // Button M Interface
                new Button.OnClickListener()
                {
                    // Button M Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "*";
                    }
                }
        );

        buttonD.setOnClickListener(
                // Button D Interface
                new Button.OnClickListener()
                {
                    // Button D Callback Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "/";
                    }
                }
        );

        // Button Equals
        buttonE.setOnClickListener(
                // Button E Interface
                new Button.OnClickListener()
                {
                    // Button E Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        tempDouble2 = Double.parseDouble(output.getText().toString());

                        if (sign == "+") {
                            output.setText(Double.toString(tempDouble + tempDouble2));
                        } else if (sign == "-") {
                            output.setText(Double.toString(tempDouble - tempDouble2));
                        } else if (sign == "*") {
                            output.setText(Double.toString(tempDouble * tempDouble2));
                        } else if (sign == "/") {
                            if (tempDouble2 == 0) {
                                output.setText("Error");
                            } else {
                                output.setText(Double.toString(tempDouble / tempDouble2));
                            }
                        }

                        // Reset the Sign variable
                        sign = "";
                    }
                }
        );





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


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
}
