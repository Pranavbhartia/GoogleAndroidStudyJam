package com.pranav.happybirthday;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_card);
        setNames();
    }

    public void setNames(){
        TextView toNameText = (TextView) findViewById(R.id.happyBirthdayText);
        toNameText.setText("Happy Birthday, " + getIntent().getStringExtra("toName"));
        TextView fromNameText = (TextView) findViewById(R.id.fromText);
        fromNameText.setText("From, " + getIntent().getStringExtra("fromName"));

    }
}
