package ca.mypulse.superlegit;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import ca.mypulse.superlegit.Discover.Discover;
import ca.mypulse.superlegit.ForYou.ForYou;
import ca.mypulse.superlegit.Friends.Friends;
import ca.mypulse.superlegit.MyPulse.MyPulse;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx)findViewById(R.id.bottom_navigation);


            bottomNavigationViewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.foryou:
                            selectedFragment = ForYou.newInstance(); //Fragment 0
                            break;

                        case R.id.discovery:
                            selectedFragment = Discover.newInstance(); //Fragment 0
                            break;

                        case R.id.mypulse:
                            selectedFragment = MyPulse.newInstance(); //Fragment 0
                            break;

                        case R.id.network:
                            selectedFragment = Friends.newInstance(); //Fragment 0
                            break;
                    }
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout, selectedFragment);
                    transaction.commit();
                    return true;
                }
            });

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout, ForYou.newInstance());
            transaction.commit();

    }
}
