package com.example.jjinetec.softgym;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void lanzar(View view){
        Toast.makeText(Login2.this, "Ingresando......", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,ProfileUser.class);
        startActivity(i);
    }
}
