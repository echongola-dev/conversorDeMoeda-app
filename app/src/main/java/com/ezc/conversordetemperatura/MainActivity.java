package com.ezc.conversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText et_tempoC;
    Button bt_converter;
    TextView tv_tempof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_tempoC = findViewById(R.id.et_tempoC);
        bt_converter = findViewById(R.id.bt_converter);
        tv_tempof = findViewById(R.id.et_resultado);

        bt_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double tempoC = Double.parseDouble(et_tempoC.getText().toString());

                DecimalFormat arredondar = new DecimalFormat("#.##");
               double tempof = Double.parseDouble(arredondar.format(tempoC * 1.8 + 32));

               tv_tempof.setText(String.valueOf(tempof )+"°F");
            }
        });

    }
}