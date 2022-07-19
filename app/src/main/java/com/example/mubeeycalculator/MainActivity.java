package com.example.mubeeycalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity  extends AppCompatActivity {
    private TextView textView1, textView2;
    private double first;
    private double second;
    private double result;
    private String operation;
    private String answer;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonDot;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        textView1 = findViewById(R.id.textview1);
        textView2 = findViewById(R.id.textview2);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        Button buttonDelete = findViewById(R.id.buttonDelete);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        buttonDot = findViewById(R.id.buttonDot);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonEqual = findViewById(R.id.buttonEqual);

        buttonDelete.setOnClickListener(view -> {
            textView1.setText(null);
            textView2.setText(null);
        });

        button0.setOnClickListener(view -> {
            String text;
            text = textView2.getText().toString() + button0.getText().toString();
            textView2.setText(text);

        });

        button1.setOnClickListener(view -> {
            String text;
            text = textView2.getText().toString() + button1.getText().toString();
            textView2.setText(text);

        });

        button2.setOnClickListener(view -> {
            String text;
            text = textView2.getText().toString() + button2.getText().toString();
            textView2.setText(text);

        });

        button3.setOnClickListener(view -> {
            String text;
            text = textView2.getText().toString() + button3.getText().toString();
            textView2.setText(text);

        });

        button4.setOnClickListener(view -> {
            String text;
            text = textView2.getText().toString() + button4.getText().toString();
            textView2.setText(text);

        });

        button5.setOnClickListener(view -> {
            String text;
            text = textView2.getText().toString() + button5.getText().toString();
            textView2.setText(text);

        });

        button6.setOnClickListener(view -> {
            String text;
            text = textView2.getText().toString() + button6.getText().toString();
            textView2.setText(text);

        });

        button7.setOnClickListener(view -> {
            String text;
            text = textView2.getText().toString() + button7.getText().toString();
            textView2.setText(text);

        });

        button8.setOnClickListener(view -> {
            String text;
            text = textView2.getText().toString() + button8.getText().toString();
            textView2.setText(text);

        });

        button9.setOnClickListener(view -> {
            String text;
            text = textView2.getText().toString() + button9.getText().toString();
            textView2.setText(text);

        });

        buttonDot.setOnClickListener(view -> {
            String text;
            text = textView2.getText().toString() + buttonDot.getText().toString();
            textView2.setText(text);
        });


        //code for operators



        buttonDivide.setOnClickListener(view -> {
            String primary;
            first = Double.parseDouble((String) textView2.getText());
            primary = String.format("%.2f", first);
            textView1.setText(primary);
            textView2.setText("");
            operation = "/";
        });

        buttonPlus.setOnClickListener(view -> {
            String primary;
            first = Double.parseDouble((String) textView2.getText());
            primary = String.format("%.2f", first);
            textView1.setText(primary);
            textView2.setText("");
            operation = "+";
        });

        buttonMinus.setOnClickListener(view -> {
            String primary;
            first = Double.parseDouble((String) textView2.getText());
            primary = String.format("%.2f", first);
            textView1.setText(primary);
            textView2.setText("");
            operation = "-";
        });

        buttonMultiply.setOnClickListener(view -> {
            String primary;
            first = Double.parseDouble((String) textView2.getText());
            primary = String.format("%.2f", first);
            textView1.setText(primary);
            textView2.setText("");
            operation = "*";
        });

        ///equal operation

        buttonEqual.setOnClickListener(view -> {
            second= Double.parseDouble((String) textView2.getText());
            if (operation.equals("+")){
                result = first+second;
                answer = String.format("%.2f", result);
                textView2.setText(answer);
                textView1.setText(null);
            }

            if (operation.equals("/")){
                result = first/second;
                answer = String.format("%.2f", result);
                textView2.setText(answer);
                textView1.setText(null);
            }
            if (operation.equals("*")){
                result = first*second;
                answer = String.format("%.2f", result);
                textView2.setText(answer);
                textView1.setText(null);
            }
            if (operation.equals("-")){
                result = first-second;
                answer = String.format("%.2f", result);
                textView2.setText(answer);
                textView1.setText(null);
            }
        });
    }
}
