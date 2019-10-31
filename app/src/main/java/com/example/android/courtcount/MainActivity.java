package com.example.android.courtcount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * This method displays the given quantity value on the screen.
*/
    private void displayForTeamA(int number) {

        TextView quantityTextView = (TextView) findViewById(
                R.id.viewFor3Points);
        quantityTextView.setText("" + number);
    }

}
