package com.example.firstdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    EditText et1,et2,et3,et5,et6;
    RadioButton rbm,rbf;
    Button btn;
    String gender="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);

        et5=findViewById(R.id.et5);
        et6=findViewById(R.id.et6);

        //For Radio Button Click

        rbm=findViewById(R.id.rbm);
        rbf=findViewById(R.id.rbf);
      rbm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override

          public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
          {
              if(isChecked==true)
              {
                  gender="Male";
              }

            //Toast.makeText(MainActivity.this,"male Choosen ",Toast.LENGTH_LONG).show();
          }
      });
      rbf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
          {
              if(isChecked==true)
              {

                  gender="Female";
              }

          }
      });

      btn=findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String s1,s2,s3,s4,s5,s6;
                s1=et1.getText().toString();
                s2=et2.getText().toString();
                s3=s1+" "+s2;
                s4=et3.getText().toString();



                Toast.makeText(MainActivity.this,"Your name is "+s3+"Gender is:- "+gender,Toast.LENGTH_LONG).show();
            }
        });

    }
}
