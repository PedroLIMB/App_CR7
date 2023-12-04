package dev.android.pedro.appcamisasdocr7.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import dev.android.pedro.appcamisasdocr7.R;
import dev.android.pedro.appcamisasdocr7.controller.ColecaoController;
import dev.android.pedro.appcamisasdocr7.model.Colecao;

public class PortugalActivity extends AppCompatActivity {

    ColecaoController controller;

    Colecao titulo;
    Colecao descricaoCamisa;

    TextView txt_portugal_2006;
    EditText edit_portugal_2006;
    Button btn_portugal_2006;

    TextView txt_portugal_2010;
    EditText edit_portugal_2010;
    Button btn_portugal_2010;

    TextView txt_portugal_2014;
    EditText edit_portugal_2014;
    Button btn_portugal_2014;

    TextView txt_portugal_2018;
    EditText edit_portugal_2018;
    Button btn_portugal_2018;

    TextView txt_portugal_2022;
    EditText edit_portugal_2022;
    Button btn_portugal_2022;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portugal);

        controller = new ColecaoController(PortugalActivity.this);

        controller.toString();

        txt_portugal_2006 = findViewById(R.id.txt_portugal_2006);
        edit_portugal_2006 = findViewById(R.id.edit_portugal_2006);
        btn_portugal_2006 = findViewById(R.id.btn_portugal_2006);

        txt_portugal_2010 = findViewById(R.id.txt_portugal_2010);
        edit_portugal_2010 = findViewById(R.id.edit_portugal_2010);
        btn_portugal_2010 = findViewById(R.id.btn_portugal_2010);

        txt_portugal_2014 = findViewById(R.id.txt_portugal_2014);
        edit_portugal_2014 = findViewById(R.id.edit_portugal_2014);
        btn_portugal_2014 = findViewById(R.id.btn_portugal_2014);

        txt_portugal_2018 = findViewById(R.id.txt_portugal_2018);
        edit_portugal_2018 = findViewById(R.id.edit_portugal_2018);
        btn_portugal_2018 = findViewById(R.id.btn_portugal_2018);

        txt_portugal_2022 = findViewById(R.id.txt_portugal_2022);
        edit_portugal_2022 = findViewById(R.id.edit_portugal_2022);
        btn_portugal_2022 = findViewById(R.id.btn_portugal_2022);

        btn_portugal_2006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_portugal_2006.getText().toString();
                String mensagem_final = "2006(Possui) " + mensagem_edit;
                txt_portugal_2006.setText(mensagem_final);

                titulo.setTitulo("Camisa 2006 - Portugal");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_portugal_2006));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_portugal_2010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_portugal_2010.getText().toString();
                String mensagem_final = "2010(Possui) " + mensagem_edit;
                txt_portugal_2010.setText(mensagem_final);
                String recomendacao = String.valueOf(txt_portugal_2006);

                titulo.setTitulo("Camisa 2010 - Portugal");
                descricaoCamisa.setDescricaoCamisa(recomendacao);

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_portugal_2014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_portugal_2014.getText().toString();
                String mensagem_final = "2014(Possui) " + mensagem_edit;
                txt_portugal_2014.setText(mensagem_final);

                titulo.setTitulo("Camisa 2014 - Portugal");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_portugal_2014));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_portugal_2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_portugal_2018.getText().toString();
                String mensagem_final = "2018(Possui) " + mensagem_edit;
                txt_portugal_2018.setText(mensagem_final);

                titulo.setTitulo("Camisa 2018 - Portugal");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_portugal_2018));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_portugal_2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_portugal_2022.getText().toString();
                String mensagem_final = "2022(Possui) " + mensagem_edit;
                txt_portugal_2022.setText(mensagem_final);

                titulo.setTitulo("Camisa 2022 - Portugal");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_portugal_2022));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });
    }
}