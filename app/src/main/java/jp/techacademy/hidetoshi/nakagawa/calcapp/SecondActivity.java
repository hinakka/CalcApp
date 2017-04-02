package jp.techacademy.hidetoshi.nakagawa.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int enzan = intent.getIntExtra("enzan",0);
        Double value1 = intent.getDoubleExtra("value1", 0);
        Double value2 = intent.getDoubleExtra("value2", 0);

        TextView textView = (TextView) findViewById(R.id.textView1);
        if (enzan == 1) {
            textView.setText(String.valueOf(value1 + value2));
        } else if (enzan == 2) {
            textView.setText(String.valueOf(value1 - value2));
        } else if (enzan == 3) {
            textView.setText(String.valueOf(value1 * value2));
        } else if (enzan == 4) {
            textView.setText(String.valueOf(value1 / value2));
        }
    }
}