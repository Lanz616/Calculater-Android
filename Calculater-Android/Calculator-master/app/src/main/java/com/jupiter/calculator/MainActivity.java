package com.jupiter.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button Btn;
    private EditText password;
    private String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn = (Button) findViewById(R.id.button);
        password = (EditText) findViewById(R.id.password) ;
        Btn.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                pass = password.getText().toString();
                if("123456".equals(pass)) {
                    Intent intent = new Intent(this, main_activity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(this,"密码错误",Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
