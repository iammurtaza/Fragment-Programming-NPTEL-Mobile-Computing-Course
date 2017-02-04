package com.example.asus.fragmentsadvanced;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Asus on 12-09-2016.
 */

public class DetailFragment extends Fragment {
    private static final String TAG = "DETAIL_FRAGMENT";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_detail,container,false);
        return v;
    }


}
