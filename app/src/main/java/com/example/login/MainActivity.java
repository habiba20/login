package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.UserName);
        ed2=findViewById(R.id.password);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);

        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                login();
            }
        });
    }
    public void login()
    {
        String username=ed1.getText().toString();
        String password=ed2.getText().toString();
        if(username.equals("") || password.equals(""))
        {
            Toast.makeText(this,"Username or Password Blank",Toast.LENGTH_LONG).show();
        }
        else if(username.equals("john") || password.equals("123")) {
            Intent i=new Intent( MainActivity.this,Main.class);
            startActivity(i);
    }
        else {
            Toast.makeText(this, "Username or Password do not match", Toast.LENGTH_LONG).show();
            ed1.setText("");
            ed2.setText("");
            ed1.requestFocus();


        }
    }
}