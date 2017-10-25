package com.example.temirlan.animation;

import android.animation.AnimatorSet;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    ImageView image2,image3,image4;
    Animation animFadein,rr1,rr2,rr3;
    RelativeLayout btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        image2 = (ImageView) findViewById(R.id.imageView);
        image3 = (ImageView) findViewById(R.id.imageView4);
        image4 = (ImageView) findViewById(R.id.imageView5);

        animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);
        rr1=AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        rr2=AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move);
        rr3=AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.mov1);
        btn = (RelativeLayout) findViewById(R.id.activity_main);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.activity_main2);
            }

        });

        onRel();

    }

    public void onRel(){
        image4.setVisibility(ImageView.VISIBLE);
        image2.setVisibility(ImageView.VISIBLE);
        image3.setVisibility(ImageView.VISIBLE);
        image4.startAnimation(rr1);
        image2.startAnimation(rr2);
        image3.startAnimation(rr3);

    }
}



