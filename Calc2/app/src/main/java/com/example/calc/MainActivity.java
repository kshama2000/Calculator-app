package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bclear,bequal;
    TextView data;
    float val1,val2;
    Boolean addition,subtraction,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setView();

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText()+"9");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data == null) {
                    data.setText(null);
                }
                val1 = Float.parseFloat(data.getText() + "");
                addition = true;
                data.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data == null){
                    data.setText(null);
                }
                val1=Float.parseFloat(data.getText()+"");
                subtraction = true;
                data.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data == null){
                    data.setText(null);
                }
                val1=Float.parseFloat(data.getText()+"");
                multiplication = true;
                data.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data == null){
                    data.setText(null);
                }
                val1=Float.parseFloat(data.getText()+"");
                division = true;
                data.setText(null);
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2=Float.parseFloat(data.getText()+"");
                if(addition == true)
                {
                    data.setText(val1 + val2 + "");
                    addition=false;
                }
                else if(subtraction == true)
                {
                    data.setText(val1 - val2 + "");
                    subtraction=false;
                }
                else if(multiplication == true)
                {
                    data.setText(val1 * val2 + "");
                    multiplication=false;
                }
                else if(division == true)
                {
                    data.setText(val1 / val2 + "");
                    division=false;
                }
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(null);
                //result.setText(null);
            }
        });
    }
    void setView()
    {
        b0=(Button) findViewById(R.id.button0);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        badd=(Button) findViewById(R.id.add);
        bsub=(Button) findViewById(R.id.sub);
        bmul=(Button) findViewById(R.id.mul);
        bdiv=(Button) findViewById(R.id.div);
        bequal=(Button) findViewById(R.id.equal);
        bclear=(Button) findViewById(R.id.clear);
        data=(TextView) findViewById(R.id.input);
        //result=(TextView) findViewById(R.id.output);

    }
}
