package com.example.appcadastrologin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Button salvar = findViewById(R.id.btnSalvar);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText nome = findViewById(R.id.edtNome);
                EditText datanascimento = findViewById(R.id.edtDataNascimento);
                RadioGroup radiosexo = findViewById(R.id.radioSexo);
                RadioButton rbnf = findViewById(R.id.rbnFeminino);
                RadioButton rbnm = findViewById(R.id.rbnMaculino);
                RadioButton rbno = findViewById(R.id.rbnOutro);
                CheckBox chkIngles = findViewById(R.id.chkIngles);
                CheckBox chkMusica = findViewById(R.id.chkMusica);
                CheckBox chkTeatro = findViewById(R.id.chkTeatro);
                CheckBox chkModa = findViewById(R.id.chkModa);


                if (nome.getText().toString().isEmpty()) {
                    Toast.makeText(CadastroActivity.this,
                            "Campo nome vazio",
                            Toast.LENGTH_LONG
                    ).show();
                    return;
                }
                if (datanascimento.getText().toString().isEmpty()) {
                    Toast.makeText(CadastroActivity.this,
                            "Campo data nascimento vazio",
                            Toast.LENGTH_LONG
                    ).show();
                    return;
                }
                if (!rbnf.isChecked() && !rbnm.isChecked() && !rbno.isChecked()) {
                    Toast.makeText(CadastroActivity.this,
                            "Deve escolher um sexo!",
                            Toast.LENGTH_LONG
                    ).show();
                    return;
                }
                if (!rbnf.isChecked() && !rbnm.isChecked() && !rbno.isChecked()) {
                    Toast.makeText(CadastroActivity.this,
                            "Deve escolher um sexo!",
                            Toast.LENGTH_LONG
                    ).show();
                    return;
                }
                if (!chkIngles.isChecked() && !chkModa.isChecked() && !chkMusica.isChecked()
                        && !chkTeatro.isChecked()) {
                    Toast.makeText(CadastroActivity.this,
                            "Deve escolher um Curso de Interesse!",
                            Toast.LENGTH_LONG
                    ).show();
                    return;
                }

                String strNome = nome.getText().toString();
                String strData = datanascimento.getText().toString();
                String strsexo = "";

                if (rbnf.isChecked()) {
                    strsexo = "feminino";
                }
                if (rbnm.isChecked()) {
                    strsexo = "masculino";
                }
                if (rbno.isChecked())
                strsexo = "outro";


                String cursos = "";

                if (chkIngles.isChecked()) {
                    cursos += " Inglês,";
                }
                if (chkModa.isChecked()) {
                    cursos += " Moda,";
                }
                if (chkTeatro.isChecked()) {
                    cursos += " Teatro,";
                }
                if (chkMusica.isChecked()) {
                    cursos += " Musica,";
                }
                cursos += ".";
                cursos = cursos.replace(",.", ".");
                //Moda.Musica,.(substitui o caractere',.' por "."

                String mensagem = "";

                mensagem = "Nome: " + strNome + "\n";
                mensagem += "Data de Nascimento: " + strData + "\n";
                mensagem += "Sexo: " + strsexo + "\n";
                mensagem += "Cursos de Interesse : " + cursos + "\n";

                Toast.makeText(CadastroActivity.this, mensagem,
                        Toast.LENGTH_LONG).show();


            }
        });

    }
}