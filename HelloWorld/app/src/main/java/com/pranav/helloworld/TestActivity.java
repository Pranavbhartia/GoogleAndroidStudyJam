package com.pranav.helloworld;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Button loginButton = (Button) findViewById(R.id.button);
//        loginButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Uri uri = Uri.parse("http://www.google.com");
//                Intent browse = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(browse);
//            }
//        });
        loginButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button :
                Uri uri = Uri.parse("http://newfi.com");

                EditText text1 = (EditText) findViewById(R.id.editText3);
                EditText text2 = (EditText) findViewById(R.id.editText2);
                String userName = text1.getText().toString();
                String password = text2.getText().toString();
                TextView label1 = (TextView) findViewById(R.id.textView2);

                if(userName != null && !userName.matches("") && password != null && !password.matches("")){
                    label1.setText(userName);
                    label1.setTextColor(Color.parseColor("#000000"));
                    Intent browse = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(browse);
                }else{
                    label1.setText("USerName - password combination not correct. Please try again");
                    label1.setTextColor(Color.parseColor("#FF0000"));
                }



                break;
        }
    }
}
