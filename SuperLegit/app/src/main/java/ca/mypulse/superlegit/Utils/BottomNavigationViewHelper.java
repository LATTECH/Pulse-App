package ca.mypulse.superlegit.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import ca.mypulse.superlegit.Discover.Discover;
import ca.mypulse.superlegit.ForYou.ForYou;
import ca.mypulse.superlegit.Friends.Friends;
import ca.mypulse.superlegit.MyPulse.MyPulse;
import ca.mypulse.superlegit.R;

public class BottomNavigationViewHelper {

    public static void enableNavigation(final Context context, final Activity callingActivity, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.foryou:
                                Intent intent = new Intent (context, ForYou.class); //Activity 0
                                context.startActivity(intent);
                                callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                                break;

                            case R.id.discovery:
                                Intent intent2 = new Intent (context, Discover.class); //Activity 1
                                context.startActivity(intent2);
                                callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                                break;

                            case R.id.mypulse:
                                Intent intent3 = new Intent (context, MyPulse.class);  //Activity 2
                                context.startActivity(intent3);
                                callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                                break;

                            case R.id.network:
                                Intent intent4 = new Intent (context, Friends.class);  //Activity 3
                                context.startActivity(intent4);
                                callingActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                                break;
                        }
                        return true;
                    }
                });



    }
}
