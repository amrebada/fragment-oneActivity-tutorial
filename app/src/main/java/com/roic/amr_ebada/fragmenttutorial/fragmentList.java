package com.roic.amr_ebada.fragmenttutorial;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



/**
 * Created by amr-ebada on 12/11/2014.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class fragmentList extends Fragment implements AdapterView.OnItemClickListener {
    public onItemClickedListener listener;
    public String[] Items = {"Amr", "Mohamed", "Ali", "Omar", "Osama", "Abdullah", "Larry"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        ListView list = (ListView) view.findViewById(R.id.listItems);
        ArrayAdapter<String> arrayList = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Items);

        list.setAdapter(arrayList);
        list.setOnItemClickListener(this);


        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, final View v, int i, long l) {

        switch (i) {
            case 0:
                listener.updateDetails(Items[0], "No Details about him till this moment" +
                        "No Details about him till this moment" +
                        "No Details about him till this moment");
                break;
            case 1:
                listener.updateDetails(Items[1], "No Details about him till this moment" +
                        "No Details about him till this moment" +
                        "No Details about him till this moment");
                break;
            case 2:
                listener.updateDetails(Items[2], "No Details about him till this moment" +
                        "No Details about him till this moment" +
                        "No Details about him till this moment");
                break;
            case 3:
                listener.updateDetails(Items[3], "No Details about him till this moment" +
                        "No Details about him till this moment" +
                        "No Details about him till this moment");
                break;
            case 4:
                listener.updateDetails(Items[4], "No Details about him till this moment" +
                        "No Details about him till this moment" +
                        "No Details about him till this moment");
                break;
            case 5:
                listener.updateDetails(Items[5], "No Details about him till this moment" +
                        "No Details about him till this moment" +
                        "No Details about him till this moment");
                break;
            case 6:
                listener.updateDetails(Items[6], "No Details about him till this moment" +
                        "No Details about him till this moment" +
                        "No Details about him till this moment");
                break;
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof onItemClickedListener) {
            listener = (onItemClickedListener) activity;
        } else {
            throw new ClassCastException(activity.toString()
                    + " must implemenet MyListFragment.OnItemSelectedListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public interface onItemClickedListener {
        public void updateDetails(String name, String details);

    }
}
