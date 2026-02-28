package com.mirea.borodkinmakardmitrievich.controlpractice1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
         */

        /*
        TextView myTextView = (TextView) findViewById(R.id.titleText);
        myTextView.setText("This is a new text");

        Button button = (Button) findViewById(R.id.yesButton);
        button.setText("MireaButton");

        CheckBox checkBox = (CheckBox) findViewById(R.id.yesCheckBox);
        checkBox.setChecked(true);
         */
    }
}