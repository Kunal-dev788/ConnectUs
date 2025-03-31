package com.helloapps.connectus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    FirebaseAuth auth;
    EditText emailBox, passwordBox;
    Button loginBtn, createBtn;

    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        auth = FirebaseAuth.getInstance();

        emailBox = findViewById(R.id.emailBox);
        passwordBox = findViewById(R.id.passwordBox);
        loginBtn = findViewById(R.id.loginBtn);
        createBtn = findViewById(R.id.createBtn);
        dialog = new AlertDialog.Builder(this)
                .setTitle("Alert")
                .setMessage("Login...")
                .create();

        loginBtn.setOnClickListener(v -> {
            dialog.show();
            String userEmail, userPass;
            userEmail = emailBox.getText().toString();
            userPass = passwordBox.getText().toString();

            auth.signInWithEmailAndPassword(userEmail,userPass).addOnCompleteListener(task -> {
                dialog.dismiss();
                if(task.isSuccessful()){
                    startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                }
                else{
                    Toast.makeText(LoginActivity.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        });

        createBtn.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, SignUpActivity.class)));

    }
}