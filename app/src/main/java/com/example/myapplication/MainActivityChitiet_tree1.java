package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

public class MainActivityChitiet_tree1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chitiet_tree1);
        Fade fade=new Fade();
        View decor=getWindow().getDecorView();

        getWindow().setEnterTransition( fade );
        getWindow().setExitTransition( fade );

        findViewById( R.id.button44 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivityChitiet_tree1.this,MainActivityDanhsach_tree.class) );


            }
        } );
    }
}