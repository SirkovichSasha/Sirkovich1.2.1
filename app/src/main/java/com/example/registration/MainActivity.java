package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText UserNameEdit;
    private EditText emailEdit;
    private TextView result;
    private Button btnOK;
    private Button ClearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        ClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserNameEdit.getText().clear();
                emailEdit.getText().clear();
                result.setText("");
            }
        });

       btnOK.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String name=UserNameEdit.getText().toString();
               String email=emailEdit.getText().toString();

               String str1=getString(R.string.Result1);
               String str2=getString(R.string.Result2);



               result.setText(str1+" "+name+" "+str2+" "+email);


           }
       });
    }

    private void init() {
        result=findViewById(R.id.ResultTextView);
        UserNameEdit=findViewById(R.id.UserNameEdit);
        emailEdit=findViewById(R.id.EmailEdit);
        btnOK=findViewById(R.id.OkBtn);
        ClearBtn=findViewById(R.id.ClearBtn);


    }
}
