package com.example.asus.fragmentsadvanced;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/**
 * Created by Asus on 12-09-2016.
 */

public class ReportFragment extends Fragment{
    private static final String TAG = "REPORT_FRAGMENT";
    private CheckBox mCheckBox;
    OnCheckboxSelectedListener mCallback;

    public interface OnCheckboxSelectedListener{
        void onCheckboxSelected();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_report,container,false);
        mCheckBox = (CheckBox) v.findViewById(R.id.report_checked);
        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d(TAG, "Checkbox selected");
                mCallback.onCheckboxSelected();
            }
        });
        return v;
    }

    public void calledFromActivity(){
        Log.d(TAG,"Called from activity");
    }

    @Override
    public void onAttach(Context activity){
        super.onAttach(activity);
        try{
            mCallback = (OnCheckboxSelectedListener) activity;
        } catch (ClassCastException e){
            throw new ClassCastException(activity.toString() + "should implement OnCheckboxSelected");
        }
    }
}
