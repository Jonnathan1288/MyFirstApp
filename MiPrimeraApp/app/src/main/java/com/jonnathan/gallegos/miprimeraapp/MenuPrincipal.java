package com.jonnathan.gallegos.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

    TextView tv_sal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        asignacion();
        Intent inte = getIntent();
        String user = inte.getStringExtra("user");
        tv_sal.setText(user);
    }

    private void asignacion(){
        tv_sal = (TextView) findViewById(R.id.tv_salida);
    }
}