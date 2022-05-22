package ru.mirea.lomako.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewChange;
    private Button buttonChange;
    private  CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewChange = (TextView) findViewById(R.id.textViewChange);
        textViewChange.setText("New text in MIREA");
        buttonChange = findViewById(R.id.buttonChange);
        buttonChange.setText("MireaButton");
        checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);
    }
}