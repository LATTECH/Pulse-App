package ca.mypulse.superlegit.Friends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import ca.mypulse.superlegit.R;
import ca.mypulse.superlegit.Utils.BottomNavigationViewHelper;

public class Friends extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
        setUpBottomNavigationvVIew();
    }

    private void setUpBottomNavigationvVIew(){
        BottomNavigationViewEx bottomNavigationView = (BottomNavigationViewEx) findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.enableNavigation(Friends.this, this, bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);
    }
}
