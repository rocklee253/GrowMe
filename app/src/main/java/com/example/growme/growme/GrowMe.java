package com.example.growme.growme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GrowMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grow_me);

        Button signinBtn = (Button) findViewById(R.id.signInBtn);
        signinBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                EditText username = (EditText) findViewById(R.id.usernameEditText);
                EditText password = (EditText) findViewById(R.id.passwordEditText);



                // check database if user exists if not then error message account does not exsist if user  say account details are invalid

                Intent menuIntent = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(menuIntent);
            }
        });


    }
}
