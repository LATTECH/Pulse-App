package ca.mypulse.superlegit.ForYou;

import android.content.Intent;
import android.media.Image;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.facebook.login.LoginManager;

import java.util.Arrays;

import ca.mypulse.superlegit.ExtraPages.EventPage2;
import ca.mypulse.superlegit.Main2Activity;
import ca.mypulse.superlegit.R;
import ca.mypulse.superlegit.Utils.ViewPagerAdapter;

public class ForYou extends Fragment {

    private ImageView Event1;

    public static ForYou newInstance(){
        ForYou fragment = new ForYou();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_foryou, container, false);

        Event1 = (ImageButton) view.findViewById(R.id.imgEvent1);

        Event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EventPage2.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
