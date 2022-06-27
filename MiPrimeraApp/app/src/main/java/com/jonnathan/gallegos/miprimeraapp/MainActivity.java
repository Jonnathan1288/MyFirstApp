package com.jonnathan.gallegos.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_email, et_password;
    Button btn_ingresa, btn_registra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Asignacion_Variables();
        Eventos_Botones();
    }
    private  void Asignacion_Variables(){
        et_email = (EditText) findViewById(R.id.etEmail);
        et_password = (EditText) findViewById(R.id.etPasswd);
        btn_ingresa = (Button) findViewById(R.id.btnIngresar);
        btn_registra = (Button) findViewById(R.id.btnRegistra);
    }

    private void Eventos_Botones(){
        btn_ingresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newVista_Menu = new Intent(getApplicationContext(), MenuPrincipal.class);
                newVista_Menu.putExtra("user", et_email.getText().toString());
                startActivity(newVista_Menu);
            }
        });
    }
}