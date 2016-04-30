package com.pranav.happybirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button next = (Button) findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText toText = (EditText) findViewById(R.id.editText);
                EditText fromText = (EditText) findViewById(R.id.editText2);
                final String toName = toText.getText().toString();
                final String fromName = fromText.getText().toString();
                Intent myIntent = new Intent(view.getContext(), CardActivity.class).putExtra("toName", toName).putExtra("fromName", fromName);
                startActivityForResult(myIntent, 0);
            }

        });
    }


}
