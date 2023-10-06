package com.example.appcadastrologin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button entrar = findViewById(R.id.btnEntrar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String LOGIN = "user";
                final String SENHA = "123456";

                EditText edtlogin = findViewById(R.id.edtLogin);
                EditText edtsenha = findViewById(R.id.edtSenha);

                if (edtlogin.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Campo Login vazio",
                            Toast.LENGTH_SHORT
                    ).show();
                    return;
                }
                if (edtsenha.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Campo senha vazio",
                            Toast.LENGTH_SHORT
                    ).show();
                    return;
                }
                if (edtlogin.getText().toString().equals(LOGIN) &&
                        edtsenha.getText().toString().equals(SENHA)) {
                    Intent it = new Intent(MainActivity.this, CadastroActivity.class);
                    startActivity(it);
                } else {
                    return;
                }

            }
            });

    }
}

