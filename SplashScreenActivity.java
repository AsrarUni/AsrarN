package com.example.mersad.asrar.Utils;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.mersad.asrar.MainActivity;
import com.example.mersad.asrar.R;

//import wiadevelopers.com.divar.Constant.Constant;
//import wiadevelopers.com.library.DivarUtils;

public class SplashScreenActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

//        DivarUtils.statusBarColor(getWindow(), R.color.mainColor);
//        String phone = DivarUtils.readDataFromStorage(Constant.USER_PHONE, null);
//
//        if (phone == null)
//        {
//            new Handler().postDelayed(new Runnable()
//            {
//                @Override
//                public void run()
//                {
//                    Intent intent = new Intent(SplashScreenActivity.this, RegisterActivity.class);
//                    startActivity(intent);
//                    finish();
//                }
//            }, 5000);
//        }
//        else
//        {
            startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
            finish();
//        }
    }
}
