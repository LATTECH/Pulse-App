package ca.mypulse.superlegit.MyPulse;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ca.mypulse.superlegit.R;

public class MyPulse extends Fragment {

    public static MyPulse newInstance(){
        MyPulse fragment = new MyPulse();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_mypulse, container, false);
    }
}
