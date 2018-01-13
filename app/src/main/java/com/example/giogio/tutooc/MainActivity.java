package com.example.giogio.tutooc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mGreetingText;

    private EditText mNameInput;

    private Button mPlayButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGreetingText = (TextView) findViewById(R.id.activity_main_greeting_txt);
        mNameInput = (EditText) findViewById(R.id.activity_main_name_input);
        mPlayButton = (Button) findViewById(R.id.activity_main_play_btn);
        mPlayButton.setEnabled(false);
        mNameInput.addTextChangedListener(new TextWatcher() {

            @Override

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }



            @Override

            public void onTextChanged(CharSequence s, int start, int before, int count) {

                // This is where we'll check the user input

            }


            @Override

            public void afterTextChanged(Editable s) {


            }

        });
        mPlayButton.setEnabled(s.toString().length() != 0);
        mPlayButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                // The user just clicked

            }

        });

    }
}

