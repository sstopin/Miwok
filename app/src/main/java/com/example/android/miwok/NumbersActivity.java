package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");
        numbers.add("seven");
        numbers.add("eight");
        numbers.add("nine");
        numbers.add("ten");

        LinearLayout numbersLayout = (LinearLayout) findViewById(R.id.rootView);
        TextView numbersTextView = new TextView(this);
        numbersTextView.setText(numbers.get(0));
        numbersLayout.addView(numbersTextView);

        TextView numbersTextView1 = new TextView(this);
        numbersTextView1.setText(numbers.get(1));
        numbersLayout.addView(numbersTextView1);

        TextView numbersTextView2 = new TextView(this);
        numbersTextView2.setText(numbers.get(2));
        numbersLayout.addView(numbersTextView2);


    }
}
