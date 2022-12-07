package com.example.signin_signup;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText username,passwd,USN,FName,DOB,Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.uname);
        passwd=findViewById(R.id.pwd);
        USN=findViewById(R.id.usn);
        FName=findViewById(R.id.fname);
        DOB=findViewById(R.id.dob);
        Email=findViewById(R.id.email);




    }
    public void signup(View v)
    {
        if(passwd.getText().toString().length()>=8 && validatepassword(passwd.getText().toString()))
        {
            Toast.makeText(this, "Signup Successful", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this,SignIn.class);


            Bundle b = new Bundle();
            b.putString("uname",username.getText().toString());
            b.putString("pword",passwd.getText().toString());
            b.putString("USSN",USN.getText().toString());
            b.putString("FFName",FName.getText().toString());
            b.putString("DDOB",DOB.getText().toString());
            b.putString("EEmail",Email.getText().toString());
            i.putExtras(b);
            startActivity(i);

        }
        else
        {

            Toast.makeText(this, "Password not meeting constraints", Toast.LENGTH_LONG).show();
        }
    }

    public boolean validatepassword(String password)
    {
        Pattern ptrn;
        Matcher mat;
        String passwordptrn="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[<>/+-@#$])(?=\\S+$).{8,}$";
        ptrn=Pattern.compile(passwordptrn);
        mat=ptrn.matcher(password);
        return mat.matches();
    }
}
