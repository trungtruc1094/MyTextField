package com.trungtrucnguyen.mytextfield;

import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void tappedImage(View view){
        ImageView bart1 = (ImageView) findViewById(R.id.bart2);
        bart1.animate().translationXBy(1000f).translationYBy(1000f).setDuration(2000);

        //ImageView bart2 = (ImageView) findViewById(R.id.bart1);
        //bart2.animate().alpha(1f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart1 = (ImageView) findViewById(R.id.bart2);
        bart1.setTranslationX(-1000f);
        bart1.setTranslationY(-1000f);
    }
}
