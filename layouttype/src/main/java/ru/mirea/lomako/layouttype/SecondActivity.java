package ru.mirea.lomako.layouttype;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    private TextView textViewChange;
    private Button buttonChange;
    private  CheckBox checkBox;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            TextView textViewChange = (TextView) findViewById(R.id.textView);
            textViewChange.setText("New text in MIREA");
            Button buttonChange = findViewById(R.id.button);
            buttonChange.setText("MireaButton");
            CheckBox checkBox = findViewById(R.id.checkBox);
            checkBox.setChecked(true);
        }
    }
