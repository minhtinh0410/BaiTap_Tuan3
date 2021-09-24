package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class MainActivityDanhsach_tree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_danhsach_tree);

        Fade fade=new Fade();
        View decor=getWindow().getDecorView();
        getWindow().setEnterTransition( fade );
        getWindow().setExitTransition( fade );

        final ImageView imageView4=findViewById( R.id.imageView4 );
        imageView4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivityDanhsach_tree.this,MainActivitychiTiet_tree2.class);
                ActivityOptionsCompat optionsCompat =ActivityOptionsCompat.makeSceneTransitionAnimation( MainActivityDanhsach_tree.this
                        ,imageView4, ViewCompat.getTransitionName( imageView4 ));
                startActivity( intent,optionsCompat.toBundle() );


            }
        } );

        final ImageView imageView=findViewById( R.id.imageView6 );
        imageView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivityDanhsach_tree.this,MainActivityChitiet_tree1.class);
                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation( MainActivityDanhsach_tree.this
                        ,imageView, ViewCompat.getTransitionName( imageView ) );
                startActivity( intent,optionsCompat.toBundle() );

            }
        } );




    }
}