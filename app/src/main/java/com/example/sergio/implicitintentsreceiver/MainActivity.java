package com.example.sergio.implicitintentsreceiver;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //https://codelabs.developers.google.com/codelabs/android-training-activity-with-implicit-intent/index.html?index=..%2F..%2Fandroid-training#6
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();//recoger la otra acc de la app
        //solo recojera las uri
        Uri uri = intent.getData();//cogemos el valor y guardarlo en uri
        if (uri != null) {
            String uri_string = "URI: " + uri.toString();
            String uri_fixed=uri_string.split(":")[1];//posicion 1, detras del tame:
            TextView textView=findViewById(R.id.text_uri_message);
            textView.setText(uri_fixed);//se podria manejar ese uri , cambiar el string.....
        }
    }
}
