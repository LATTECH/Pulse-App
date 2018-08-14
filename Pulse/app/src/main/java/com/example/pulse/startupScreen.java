package com.example.pulse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class startupScreen extends AppCompatActivity {

    private Button SignUp;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        Login = (Button)findViewById(R.id.loginButton);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

        SignUp = (Button)findViewById(R.id.signUpButton);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });

    }

    private void login(){
        Intent intent = new Intent(startupScreen.this, login.class);
        startActivity(intent);
    }

    private void signUp(){
        Intent intent = new Intent(startupScreen.this, signUp.class);
        startActivity(intent);
    }

}
