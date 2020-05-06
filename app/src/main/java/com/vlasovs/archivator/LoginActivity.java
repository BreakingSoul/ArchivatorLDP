package com.vlasovs.archivator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private Button butLog, butForgotPass;
    private TextInputLayout editEmail, editPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        butLog = findViewById(R.id.buttonLogin);
        butForgotPass = findViewById(R.id.buttonForgotPass);
        editEmail = findViewById(R.id.editEmail);
        editPass = findViewById(R.id.editPassword);


        butLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        butForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openContact();
            }
        });

    }

    public void openContact(){
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }

}
