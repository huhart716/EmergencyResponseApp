package com.cedoac.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {

    private void applyClickAnimation(View view) {
        Animation bounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
        view.setOnClickListener(v -> v.startAnimation(bounce));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        View fire = findViewById(R.id.fireIcon);
        View police = findViewById(R.id.policeIcon);
        View hospital = findViewById(R.id.hospitalIcon);
        View emergency = findViewById(R.id.emergencyIcon);
        View cam = findViewById(R.id.camIcon);
        ImageView profile = findViewById(R.id.profileIcon);
        ImageView home = findViewById(R.id.homeIcon);

        applyClickAnimation(fire);
        applyClickAnimation(police);
        applyClickAnimation(hospital);
        applyClickAnimation(emergency);
        applyClickAnimation(cam);
        applyClickAnimation(profile);
        applyClickAnimation(home);

    }
}
