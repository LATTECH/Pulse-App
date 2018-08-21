package ca.mypulse.superlegit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.facebook.login.LoginManager;

import java.util.Arrays;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

    public void click(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile"));
        startActivity(intent);
    }
}
