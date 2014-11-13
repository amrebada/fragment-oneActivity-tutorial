package com.roic.amr_ebada.fragmenttutorial;


import android.annotation.TargetApi;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MyActivity extends Activity  implements fragmentList.onItemClickedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void updateDetails(String name, String details) {
        fragmentdetails fragmentD = (fragmentdetails) getFragmentManager().findFragmentById(R.id.fragment);
        fragmentD.setInformation(name,details);
    }
}
