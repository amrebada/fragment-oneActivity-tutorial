package com.roic.amr_ebada.fragmenttutorial;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by amr-ebada on 12/11/2014.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class fragmentdetails extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details,container,false);

        return view;
    }
    public void setInformation(String name,String details){
        TextView nameView = (TextView) getView().findViewById(R.id.nameItem);
        TextView detailsView = (TextView) getView().findViewById(R.id.detailsItem);
        nameView.setText(name);
        detailsView.setText(details);
    }
}
