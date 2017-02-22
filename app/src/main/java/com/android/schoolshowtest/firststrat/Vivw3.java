package com.android.schoolshowtest.firststrat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.schoolshowtest.MainActivity;
import com.android.schoolshowtest.R;


/**
 * Created by Administrator on 2017/2/21.
 */

public class Vivw3 extends Fragment {
    private Button button;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.view_3,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button=(Button) view.findViewById(R.id.start_app);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                SharedPreferences sharedPreferences = getActivity().getSharedPreferences("is_first_in_data", 0 * 0000);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putBoolean("idFirstIn",false);
                editor.apply();
                getActivity().finish();

            }
            });
    }
}

