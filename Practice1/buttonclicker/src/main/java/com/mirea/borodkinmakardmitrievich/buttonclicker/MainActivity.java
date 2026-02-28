package com.mirea.borodkinmakardmitrievich.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Initialization();

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Мой номер по списку - это 4");
                checkBox.setChecked(true);
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }

    public void onMyButtonClick(View view) {
        tvOut.setText("Это не я сделал");
        checkBox.setChecked(false);
    }

    private void Initialization(){
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnWhoAmI = (Button) findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = (Button) findViewById(R.id.btnItIsNotMe);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
    }
}