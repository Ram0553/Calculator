package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,be,bp,bc;
    private TextView t;
    String a="";
    String b="";
    int k = -1;
    String c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.zero);
        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.three);
        b4=findViewById(R.id.four);
        b5=findViewById(R.id.five);
        b6=findViewById(R.id.six);
        b7=findViewById(R.id.sev);
        b8=findViewById(R.id.eig);
        b9=findViewById(R.id.nine);
        bc=findViewById(R.id.bc);
        t=findViewById(R.id.x);

        ba=findViewById(R.id.add);
        bs=findViewById(R.id.sub);
        bm=findViewById(R.id.mul);
        bd=findViewById(R.id.div);
        be=findViewById(R.id.eq);
        bp=findViewById(R.id.per);
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="";
                b="";
                k=-1;
                t.setText("");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==-1){
                    a=(a+"0");t.setText(a);}
                else {b=b+"0";t.setText(a+c+b);}

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==-1){
                    a=(a+"1");t.setText(a);}
                else {b=b+"1";t.setText(a+c+b);}

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==-1){
                    a=(a+"2");t.setText(a);}
                else {b=b+"2";t.setText(a+c+b);}

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==-1){
                    a=(a+"3");t.setText(a);}
                else {b=b+"3";t.setText(a+c+b);}

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==-1){
                    a=(a+"4");t.setText(a);}
                else {b=b+"4";t.setText(a+c+b);}

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==-1){
                    a=(a+"5");t.setText(a);}
                else {b=b+"5";t.setText(a+c+b);}

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==-1){
                    a=(a+"6");t.setText(a);}
                else {b=b+"6";t.setText(a+c+b);}

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==-1){
                    a=(a+"7");t.setText(a);}
                else {b=b+"7";t.setText(a+c+b);}

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==-1){
                    a=(a+"8");t.setText(a);}
                else {b=b+"8";t.setText(a+c+b);}

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==-1){
                    a=(a+"9");t.setText(a);}
                else {b=b+"9";t.setText(a+c+b);}

            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a=="")return;
                k=1;
                c="+";
                t.setText(a+c);

            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a=="")return;
                k=2;
                c="-";
                t.setText(a+c);

            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a=="")return;
                k=3;
                c="*";
                t.setText(a+c);

            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a=="")return;
                k=4;
                c="/";
                t.setText(a+c);

            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k==-1 || b==""){t.setText(a+c);return;}
                double d=0,l,r;
                String f="";
                l=Double.parseDouble(a);
                r=Double.parseDouble(b);
                if(k==1)
                {
                    d=l+r;
                }
                else if(k==2)d=l-r;
                else if(k==3)d=l*r;
                else if(k==4){if(r!=0)d=1.0*l/r;else f="infinity";}
                else
                {
                    d=1.0*(l*r)/100;
                }
                if(f.equals("infinity"))
                t.setText(a+c+b+"="+f);
                else{
                    f=valueOf(d);
                    t.setText(a+c+b+"="+f);a=f;  }
if(f=="infinity")a="0";
                b="";
                k=-1;
                c="";

            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a=="")return;
                k=5;
                c="%";
                t.setText(a+c);

            }
        });





    }



}