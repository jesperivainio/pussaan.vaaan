package com.example.ussa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Määritetään main activitystä activity2:een siirtyvät tekstit
    public static  final String EXTRA_TEXT="com.example.ussa.EXTRA_TEXT";
    public static final String EXTRA_TEXT1="com.example.ussa.EXTRA_TEXT1";
    public static final String EXTRA_TEXT2="com.example.ussa.EXTRA_TEXT2";
    public static final String EXTRA_TEXT3="com.example.ussa.EXTRA_TEXT3";
    public static final String EXTRA_TEXT4="com.example.ussa.EXTRA_TEXT4";
    public static final String EXTRA_TEXT5="com.example.ussa.EXTRA_TEXT5";
    public static final String EXTRA_TEXT6="com.example.ussa.EXTRA_TEXT6";
    public static final String EXTRA_TEXT7="com.example.ussa.EXTRA_TEXT7";
    public static final String EXTRA_TEXT8="com.example.ussa.EXTRA_TEXT8";
    public static final String EXTRA_TEXT9="com.example.ussa.EXTRA_TEXT9";
    public static final String EXTRA_TEXT10="com.example.ussa.EXTRA_TEXT10";
    public static final String EXTRA_TEXT11="com.example.ussa.EXTRA_TEXT11";

    //Määritetään yleiset muuttujat kaikille napeille
    private Button buttonTallenna;
    private Button buttonUusliike;
    private Button buttonDel1;
    private Button buttonDel2;
    private Button buttonDel3;
    private Button buttonDel4;
    private Button buttonDel5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final RatingBar ratingFiilis = (RatingBar) findViewById(R.id.ratingFiilis);
        Button buttonFiilis = (Button) findViewById(R.id.buttonFiilis);
        final TextView textFiilis = (TextView) findViewById(R.id.textFiilis);

        buttonFiilis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textFiilis.setText("Fiilis on: " + ratingFiilis.getRating());
            }
        });


        buttonTallenna=findViewById(R.id.buttonTallenna);
        buttonTallenna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_2();
            }

        });

        buttonUusliike=findViewById(R.id.buttonUusliike);
        buttonUusliike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Yhdistetään poistonapit activitystä löytyviin nappeihin
                Button Del1=(Button)findViewById(R.id.buttonDel1);
                Button Del2=(Button)findViewById(R.id.buttonDel2);
                Button Del3=(Button)findViewById(R.id.buttonDel3);
                Button Del4=(Button)findViewById(R.id.buttonDel4);
                Button Del5=(Button)findViewById(R.id.buttonDel5);

                //Yhdistetään Sarjat tekstikenttiin
                TextView Sarjat1=(TextView)findViewById(R.id.editText4);
                TextView Sarjat2=(TextView)findViewById(R.id.editText6);
                TextView Sarjat3=(TextView)findViewById(R.id.editText10);
                TextView Sarjat4=(TextView)findViewById(R.id.editText11);
                TextView Sarjat5=(TextView)findViewById(R.id.editText12);

                //Yhdistetään Liikkeet tekstikenttiin
                TextView Liike1=(TextView)findViewById(R.id.editText5);
                TextView Liike2=(TextView)findViewById(R.id.editText3);
                TextView Liike3=(TextView)findViewById(R.id.editText7);
                TextView Liike4=(TextView)findViewById(R.id.editText8);
                TextView Liike5=(TextView)findViewById(R.id.editText9);

        //for loop muuttujan i aavulla määritetään mitä nappi "buttonUusliike" tekee

                for (int i=0; i<6;i++) {
                    if (!Liike1.isShown() && !Sarjat1.isShown() && !Del1.isShown() && i == (1)) {
                        Liike1.setVisibility(View.VISIBLE);
                        Sarjat1.setVisibility(View.VISIBLE);
                        Del1.setVisibility(View.VISIBLE);
                        break;

                    } else if (!Liike2.isShown() && !Sarjat2.isShown() && !Del2.isShown() && i == (2)) {
                        Liike2.setVisibility(View.VISIBLE);
                        Sarjat2.setVisibility(View.VISIBLE);
                        Del2.setVisibility(View.VISIBLE);
                        break;

                    } else if (!Liike3.isShown() && !Sarjat3.isShown() && !Del3.isShown() && i == (3)) {
                        Liike3.setVisibility(View.VISIBLE);
                        Sarjat3.setVisibility(View.VISIBLE);
                        Del3.setVisibility(View.VISIBLE);
                        break;

                    } else if (!Liike4.isShown()&&!Sarjat4.isShown()&&!Del4.isShown()&&i==(4)) {
                        Liike4.setVisibility(View.VISIBLE);
                        Sarjat4.setVisibility(View.VISIBLE);
                        Del4.setVisibility(View.VISIBLE);
                        break;

                    } else if (!Liike5.isShown()&&!Sarjat5.isShown()&&!Del5.isShown()&&i==(5)) {
                        Liike5.setVisibility(View.VISIBLE);
                        Sarjat5.setVisibility(View.VISIBLE);
                        Del5.setVisibility(View.VISIBLE);
                        break;

                    }
                }

            }
        });


        //Määritetään toiminta jokaiselle poistonapille erikseen.

        buttonDel1=findViewById(R.id.buttonDel1);
        buttonDel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView Sarjat1=(TextView)findViewById(R.id.editText4);
                    Sarjat1.setVisibility(View.INVISIBLE);
                TextView Liike1=(TextView)findViewById(R.id.editText5);
                    Liike1.setVisibility(View.INVISIBLE);
                Button Del1=(Button)findViewById(R.id.buttonDel1);
                    Del1.setVisibility(View.INVISIBLE);
            }
        });

        buttonDel2=findViewById(R.id.buttonDel2);
        buttonDel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView Sarjat2=(TextView)findViewById(R.id.editText6);
                    Sarjat2.setVisibility(View.INVISIBLE);
                TextView Liike2=(TextView)findViewById(R.id.editText3);
                    Liike2.setVisibility(View.INVISIBLE);
                Button Del2=(Button)findViewById(R.id.buttonDel2);
                    Del2.setVisibility(View.INVISIBLE);
            }
        });

        buttonDel3=findViewById(R.id.buttonDel3);
        buttonDel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView Sarjat3=(TextView)findViewById(R.id.editText10);
                    Sarjat3.setVisibility(View.INVISIBLE);
                TextView Liike3=(TextView)findViewById(R.id.editText7);
                    Liike3.setVisibility(View.INVISIBLE);
                Button Del3=(Button)findViewById(R.id.buttonDel3);
                    Del3.setVisibility(View.INVISIBLE);

            }
        });

        buttonDel4=findViewById(R.id.buttonDel4);
        buttonDel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView Sarjat4=(TextView)findViewById(R.id.editText11);
                    Sarjat4.setVisibility(View.INVISIBLE);
                TextView Liike4=(TextView)findViewById(R.id.editText8);
                    Liike4.setVisibility(View.INVISIBLE);
                Button Del4=(Button)findViewById(R.id.buttonDel4);
                    Del4.setVisibility(View.INVISIBLE);
            }
        });

        buttonDel5=findViewById(R.id.buttonDel5);
        buttonDel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView Sarjat5=(TextView)findViewById(R.id.editText12);
                    Sarjat5.setVisibility(View.INVISIBLE);
                TextView Liike5=(TextView)findViewById(R.id.editText9);
                    Liike5.setVisibility(View.INVISIBLE);
                Button Del5=(Button)findViewById(R.id.buttonDel5);
                    Del5.setVisibility(View.INVISIBLE);
            }
        });

    }

    //Ratingbar touhu tässä. :)




    //Määritetään tekstikentät jotka siirtyy main activitystä activityyn 2 painamalla nappia "Tallenna"

    public void openactivity_2(){
        EditText editText1= (EditText) findViewById(R.id.editText1);
        String text=editText1.getText().toString();

        EditText editText2=(EditText) findViewById(R.id.editText2);
        String text1=editText2.getText().toString();

        EditText editText3=(EditText) findViewById(R.id.editText3);
        String text2=editText3.getText().toString();

        EditText editText4=(EditText) findViewById(R.id.editText4);
        String text3=editText4.getText().toString();

        EditText editText5=(EditText) findViewById(R.id.editText5);
        String text4=editText5.getText().toString();

        EditText editText6=(EditText) findViewById(R.id.editText6);
        String text5=editText6.getText().toString();

        EditText editText7=(EditText) findViewById(R.id.editText7);
        String text6=editText7.getText().toString();

        EditText editText8=(EditText) findViewById(R.id.editText8);
        String text7=editText8.getText().toString();

        EditText editText9=(EditText) findViewById(R.id.editText9);
        String text8=editText9.getText().toString();

        EditText editText10=(EditText) findViewById(R.id.editText10);
        String text9=editText10.getText().toString();

        EditText editText11=(EditText) findViewById(R.id.editText11);
        String text10=editText11.getText().toString();

        EditText editText12=(EditText) findViewById(R.id.editText12);
        String text11=editText12.getText().toString();

        //EXTRA_TEXTiin text1, text2, text3 jne...

        Intent intent=new Intent(this,activity_2.class);

        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_TEXT1, text1);
        intent.putExtra(EXTRA_TEXT2, text2);
        intent.putExtra(EXTRA_TEXT3, text3);
        intent.putExtra(EXTRA_TEXT4, text4);
        intent.putExtra(EXTRA_TEXT5, text5);
        intent.putExtra(EXTRA_TEXT6, text6);
        intent.putExtra(EXTRA_TEXT7, text7);
        intent.putExtra(EXTRA_TEXT8, text8);
        intent.putExtra(EXTRA_TEXT9, text9);
        intent.putExtra(EXTRA_TEXT10, text10);
        intent.putExtra(EXTRA_TEXT11, text11);

        startActivity(intent);
    }
}
