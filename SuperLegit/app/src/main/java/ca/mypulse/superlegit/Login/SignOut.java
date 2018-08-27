package ca.mypulse.superlegit.Login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ca.mypulse.superlegit.R;


public class SignOut extends Fragment {
    private final String TAG = "SignOutFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view  = inflater.inflate(R.layout.fragment_sign_out, container, false);

        return view;
    }
}
