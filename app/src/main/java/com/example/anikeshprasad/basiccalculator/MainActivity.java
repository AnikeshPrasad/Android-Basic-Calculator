package com.example.anikeshprasad.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btAdd,btSub,btMul,btDiv;
    private EditText etNum1,etNum2;
    private TextView tvRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        btAdd=(Button)findViewById(R.id.btAddition);
        btSub=(Button)findViewById(R.id.btSubtract);
        btMul=(Button)findViewById(R.id.btMultiply);
        btDiv=(Button)findViewById(R.id.btDivide);
        etNum1=(EditText)findViewById(R.id.etNumber1);
        etNum2=(EditText)findViewById(R.id.etNumber2);
        tvRes=(TextView)findViewById(R.id.tvResult);

        btAdd.setOnClickListener(this);
        btSub.setOnClickListener(this);
        btMul.setOnClickListener(this);
        btDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String num1=etNum1.getText().toString();
        String num2=etNum2.getText().toString();

        switch(v.getId()){
            case R.id.btAddition:
                int a=Integer.parseInt(num1)+Integer.parseInt(num2);
                tvRes.setText(String.valueOf(a));
                break;
            case R.id.btSubtract:
                int s=Integer.parseInt(num1)-Integer.parseInt(num2);
                tvRes.setText(String.valueOf(s));
                break;
            case R.id.btMultiply:
                int m=Integer.parseInt(num1)*Integer.parseInt(num2);
                tvRes.setText(String.valueOf(m));
                break;
            case R.id.btDivide:
                try{
                    int d=Integer.parseInt(num1)/Integer.parseInt(num2);
                    tvRes.setText(String.valueOf(d));
                }catch(Exception e) {
                    tvRes.setText("Cannot Divide by 0 !!!");
                }
                break;
        }
    }
}
