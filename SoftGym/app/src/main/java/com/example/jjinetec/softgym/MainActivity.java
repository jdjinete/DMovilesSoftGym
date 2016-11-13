package com.example.jjinetec.softgym;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // Button button = (Button) findViewById(R.id.btnVista);
       // button.setOnClickListener(new View.OnClickListener() {
          // public void onClick(View v) {
          //      // Perform action on click
         //      // setContentView(R.layout.login);
         //   }

       // });

    }
    public void lanzar(View view){
        Toast.makeText(MainActivity.this, "Llego", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,Login2.class);
        startActivity(i);
    }
    public void lanzare(View view){
        Toast.makeText(MainActivity.this, "Reportes", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,GraphicsReports.class);
        startActivity(i);
    }
}
