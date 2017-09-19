package com.example.a300891338.resturantapptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import static android.R.attr.checked;

public class MainActivity extends AppCompatActivity {

    Button button;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        radioButton = (RadioButton) findViewById(R.id.);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key", radioButton.CHECKED_VALUE);
                startActivity(intent);

                // Intent intent = getIntent();
                // vakue = intent.getExtra("key");


            }
        });
    }


    public void onRadioButtonClicked(View view) {

        String str = "hello"; // store the text corresponding to  the RadioButton which is clicked

        switch (view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    str = "American";
                break;
            case R.id.radioButton2:
                if (checked) str = "button2Text";
                break;
            case R.id.radioButton3:
                if (checked) str = "button3Text";
                break;
        }

        Intent intent = new Intent(this, WinderDTActivity.class);
        intent.putExtra("radioChosen", str); // pass "str" to the next Activity
    }
}//class Mainactivity
