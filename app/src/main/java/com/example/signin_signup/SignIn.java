package com.example.signin_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        username=findViewById(R.id.usname);
        password=findViewById(R.id.passwd);


    }

    public void signin(View v)
    {

        Bundle b=getIntent().getExtras();
        String uname=b.getString("uname");
        String passwd=b.getString("pword");
        String FName=b.getString("FFName");
        String USN=b.getString("USSN");
        String Email=b.getString("EEmail");
        String DOB=b.getString("DDOB");

        if(username.getText().toString().equals(uname) && password.getText().toString().equals(passwd))
        {
            Toast.makeText(this, "Sign In Successful", Toast.LENGTH_LONG).show();
            Intent k=new Intent(this,Success.class);
            //Bundle c=getIntent().getExtras();
            k.putExtras(b);
            startActivity(k);

        }
        else
        {
            Toast.makeText(this, "Sign In Unsuccessful", Toast.LENGTH_LONG).show();
        }
    }
}