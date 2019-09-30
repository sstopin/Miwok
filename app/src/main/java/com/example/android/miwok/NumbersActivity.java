package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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

        Log.v("NumbersActivity", "Word at index 0: " + numbers.get(0));
        Log.v("NumbersActivity", "Word at index 1: " + numbers.get(1));
        Log.v("NumbersActivity", "Word at index 2: " + numbers.get(2));
        Log.v("NumbersActivity", "Word at index 3: " + numbers.get(3));
        Log.v("NumbersActivity", "Word at index 4: " + numbers.get(4));
        Log.v("NumbersActivity", "Word at index 5: " + numbers.get(5));
        Log.v("NumbersActivity", "Word at index 6: " + numbers.get(6));
        Log.v("NumbersActivity", "Word at index 7: " + numbers.get(7));
        Log.v("NumbersActivity", "Word at index 8: " + numbers.get(8));
        Log.v("NumbersActivity", "Word at index 9: " + numbers.get(9));
    }
}
