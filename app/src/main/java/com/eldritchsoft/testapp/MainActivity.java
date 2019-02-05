package com.eldritchsoft.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.eldritchsoft.progressbutton.ProgressButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressButton progressButton = findViewById(R.id.pb_main);
        progressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressButton pb = (ProgressButton) v;

                if(pb.isInProgress()) {
                    pb.stopProgress();
                } else {
                    pb.startProgress();
                }
            }
        });
    }
}
