package com.android.schoolshowtest.firststrat;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.android.schoolshowtest.MainActivity;
import com.android.schoolshowtest.R;

/**
 * Created by Administrator on 2017/2/22.
 */


//判断程序是否第一次运行，如果是则跳转到Viewactivity，不是则跳转到mainactivity

public class transtionActivity extends Activity {
    boolean isFirstIn=false;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.start);

        final SharedPreferences sharedPreferences=getSharedPreferences("is_first_in_data",MODE_PRIVATE);
        isFirstIn=sharedPreferences.getBoolean("isFirstIn",true);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isFirstIn){
                    intent =new Intent(transtionActivity.this, ViewActivity.class);
                    transtionActivity.this.startActivity(intent);
                    transtionActivity.this.finish();


                } else {
                    intent =new Intent(transtionActivity.this,MainActivity.class);
                    transtionActivity.this.startActivity(intent);
                    transtionActivity.this.finish();

                }
            }
        },2000);
    }
}
