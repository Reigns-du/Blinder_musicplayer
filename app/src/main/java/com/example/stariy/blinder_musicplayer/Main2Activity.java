package com.example.stariy.blinder_musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button b2=(Button)findViewById(R.id.buttonback);
        b2.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent=new Intent();
                intent.setClass(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                Main2Activity.this.finish();

            }
        });
    }
}
