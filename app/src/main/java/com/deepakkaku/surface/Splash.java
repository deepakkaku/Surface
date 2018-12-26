package com.deepakkaku.surface;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView splash_logo = (ImageView) findViewById(R.id.splah_logo);
        final Animation logoAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.logo_translate_alpha);

        splash_logo.startAnimation(logoAnimation );
        logoAnimation .setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                        Handler postHandler = new Handler();
                        postHandler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                finish();
                                Intent startInt = new Intent(Splash.this, SurfaceHomeActivity.class);
                                startActivity(startInt);
                                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                            }
                        },1000);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });



    }
}
