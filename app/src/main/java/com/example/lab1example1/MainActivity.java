package com.example.lab1example1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView greetingTextView;
    private boolean isHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingTextView = (TextView) findViewById(R.id.textView);
        initializeGreeting();

        Button exclaimBtn = (Button) findViewById(R.id.button);
        exclaimBtn.setOnClickListener(toggleGreeting);
    }

    private final View.OnClickListener toggleGreeting = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (isHello) {
                isHello = false;
                greetingTextView.setText(R.string.goodbye);
            } else {
                isHello = true;
                greetingTextView.setText(R.string.hello);
            }
        }
    };

    private void initializeGreeting()
    {
        isHello = true;
    }
}