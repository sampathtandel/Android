package com.example.signin_signup;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Success extends AppCompatActivity {



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
       // usname=findViewById(R.id.username);
        Bundle b=getIntent().getExtras();

         String name=b.getString("uname");
        String FName=b.getString("FFName");
        String USN=b.getString("USSN");
        String Email=b.getString("EEmail");
        String DOB=b.getString("DDOB");



        TextView txt;
        txt=findViewById(R.id.username);
        txt.setText("User Name: "+name);

        TextView txt1;
        txt1=findViewById(R.id.username1);
        txt1.setText("Full Name: "+FName);

        TextView txt2;
        txt2=findViewById(R.id.username2);
        txt2.setText("Usn: "+USN);

        TextView txt3;
        txt3=findViewById(R.id.username3);
        txt3.setText("Email: "+Email);

        TextView txt4;
        txt4=findViewById(R.id.username4);
        txt4.setText("DOB: "+DOB);




    }
}