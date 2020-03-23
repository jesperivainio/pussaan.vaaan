package com.example.ussa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //Tässä jokainen tekstikenttä main activitystä

        Intent intent=getIntent();
        String text=intent.getStringExtra(MainActivity.EXTRA_TEXT);
        String text1= intent.getStringExtra(MainActivity.EXTRA_TEXT1);
        String text2= intent.getStringExtra(MainActivity.EXTRA_TEXT2);
        String text3= intent.getStringExtra(MainActivity.EXTRA_TEXT3);
        String text4= intent.getStringExtra(MainActivity.EXTRA_TEXT4);
        String text5= intent.getStringExtra(MainActivity.EXTRA_TEXT5);
        String text6= intent.getStringExtra(MainActivity.EXTRA_TEXT6);
        String text7= intent.getStringExtra(MainActivity.EXTRA_TEXT7);
        String text8= intent.getStringExtra(MainActivity.EXTRA_TEXT8);
        String text9= intent.getStringExtra(MainActivity.EXTRA_TEXT9);
        String text10= intent.getStringExtra(MainActivity.EXTRA_TEXT10);
        String text11= intent.getStringExtra(MainActivity.EXTRA_TEXT11);

        //Tässä yhdistetään textviewit muuttujiiin

        TextView textView1=(TextView) findViewById(R.id.textView1);
        TextView textView2=(TextView) findViewById(R.id.textView2);
        TextView textView3=(TextView) findViewById(R.id.textView3);
        TextView textView4=(TextView) findViewById(R.id.textView4);
        TextView textView5=(TextView) findViewById(R.id.textView5);
        TextView textView6=(TextView) findViewById(R.id.textView6);
        TextView textView7=(TextView) findViewById(R.id.textView7);
        TextView textView8=(TextView) findViewById(R.id.textView8);
        TextView textView9=(TextView) findViewById(R.id.textView9);
        TextView textView10=(TextView) findViewById(R.id.textView10);
        TextView textView11=(TextView) findViewById(R.id.textView11);
        TextView textView12=(TextView) findViewById(R.id.textView12);

        //Textviewin text muutetaan text1, text2 ,text3... jne mukaisiksi

        textView1.setText(text);
        textView2.setText(text1);
        textView3.setText(text2);
        textView4.setText(text3);
        textView5.setText(text4);
        textView6.setText(text5);
        textView7.setText(text6);
        textView8.setText(text7);
        textView9.setText(text8);
        textView10.setText(text9);
        textView11.setText(text10);
        textView12.setText(text11);

    }
}
