package com.android.schoolshowtest.firststrat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.schoolshowtest.R;


/**
 * Created by Administrator on 2017/2/21.
 */

public class View1 extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.view_1,container,false);
    }
}
