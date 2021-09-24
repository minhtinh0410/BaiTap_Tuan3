package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivitytrangchu_tree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitytrangchu_tree);
        findViewById( R.id.button3 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivitytrangchu_tree.this,MainActivityDanhsach_tree.class) );
                overridePendingTransition( R.anim.enter_x,R.anim.exit_x);


            }
        } );
    }
}