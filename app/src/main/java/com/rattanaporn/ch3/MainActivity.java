package com.rattanaporn.ch3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtCel;
    private EditText edtFah;
    private EditText edtMess;
    private Button btnCtoF;
    private Button btnFtoC;
    private EditText edtMes;
    private TextView txtMes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtCel = (EditText)findViewById(R.id.edtCel);
        btnCtoF = (Button)findViewById(R.id.btnCtoF);
        edtFah = (EditText)findViewById(R.id.edtFah);
        btnFtoC = (Button)findViewById(R.id.btnFtoC);
        txtMes = (TextView)findViewById(R.id.txtMes);
        btnCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtCel.getText().toString().equals(""))
                    txtMes.setText("Please Enter your Celcein Degree!");
                else {
                    Double cel = Double.parseDouble(edtCel.getText().toString());
                    Double far = (cel * 1.8) + 32;
                    edtFah.setText("" + far);
                    txtMes.setText("");
                }
            }
        });
        btnFtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtFah.getText().toString().equals(""))
                    txtMes.setText("Please Enter your Fahrenheit Degree!");
                else {
                    Double far = Double.parseDouble(edtFah.getText().toString());
                    Double cel = (far -32) / 1.8;
                    edtCel.setText("" + cel);
                    txtMes.setText("");
                }
            }
        });
    }
}
