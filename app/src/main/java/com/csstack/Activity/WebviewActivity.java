package com.csstack.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.csstack.R;

/**
 * Created by nandhu on 26/1/17.
 * This class loads URl on a Web view as provided by the Intent
 *
 */

public class WebviewActivity extends AppCompatActivity {




    private static String URL_STRING = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view_layout);


        //Get the URL From Intent
        if (getIntent() != null){
            URL_STRING  = getIntent().getStringExtra("URL_STRING");
        }
        else{
            throw new NullPointerException("URL Cannot Be null");
        }

        //Load the URl into WEbview








    }

    @Override
    public void onBackPressed() {

    }
}
