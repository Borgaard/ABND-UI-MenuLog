package com.example.android.menulog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView firstItemView = (TextView) findViewById(R.id.menu_item_1);
        String firstItemString = firstItemView.getText().toString();
        Log.i("MainActivity.java", firstItemString);
        // Find second menu item TextView and print the text to the logs
        TextView secondItemView = (TextView) findViewById(R.id.menu_item_2);
        String secondItemString = secondItemView.getText().toString();
        Log.v("MainActivity.java", secondItemString);
        // Find third menu item TextView and print the text to the logs
        TextView thirdItemView = (TextView) findViewById(R.id.menu_item_3);
        String thirdItemString = thirdItemView.getText().toString();
        Log.e("MainActivity.java", thirdItemString);
    }
}