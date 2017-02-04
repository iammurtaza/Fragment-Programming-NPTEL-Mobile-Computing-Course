package com.example.asus.fragmentsadvanced;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;

public class MainActivity extends FragmentActivity implements ReportFragment.OnCheckboxSelectedListener {
    private static final String TAG = "MAIN_ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
        fragment = new ReportFragment();
        fragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit();
        }
    }

    public void onCheckboxSelected(){
        Log.d(TAG, "CALLBACK was called");

        ReportFragment mReportFragment = (ReportFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        if(mReportFragment != null){
            mReportFragment.calledFromActivity();
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        //Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

        Fragment fragment = new DetailFragment();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
