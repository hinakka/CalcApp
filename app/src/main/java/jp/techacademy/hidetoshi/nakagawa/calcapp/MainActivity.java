package jp.techacademy.hidetoshi.nakagawa.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1,mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);

            if (v.getId() == R.id.button1) {
                intent.putExtra("enzan", 1); //tasu
            } else if (v.getId() == R.id.button2) {
                intent.putExtra("enzan", 2); //hiku
            } else if (v.getId() == R.id.button3) {
                intent.putExtra("enzan", 3); //kakeru
            } else if (v.getId() == R.id.button4) {
                intent.putExtra("enzan", 4); //waru
            }

        Editable getText1 = mEditText1.getText();
        double put_value1 = Double.parseDouble(getText1.toString());
        Editable getText2 = mEditText2.getText();
        double put_value2 = Double.parseDouble(getText2.toString());

        intent.putExtra("value1", put_value1);
        intent.putExtra("value2", put_value2);
        startActivity(intent);
    }
}
