package com.android.schoolshowtest.firststrat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;

import com.android.schoolshowtest.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2017/2/21.
 */

public class ViewActivity extends FragmentActivity {
    private ViewPager viewPager;
    private FragmentPagerAdapter adapter;
    private List<Fragment> fragments = new ArrayList<Fragment>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);   //取消标题
        setContentView(R.layout.view);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        Fragment vivw1 = new View1();
        Fragment vivw2 = new Vivw2();
        Fragment vivw3 = new Vivw3();
        fragments.add(vivw1);    //将一个Fragment的实例加到activity的container
        fragments.add(vivw2);
        fragments.add(vivw3);
        adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

        };
        //设置动画效果
        viewPager.setPageTransformer(true, new DepthPageTransformer());
        viewPager.setAdapter(adapter);



    }
}
