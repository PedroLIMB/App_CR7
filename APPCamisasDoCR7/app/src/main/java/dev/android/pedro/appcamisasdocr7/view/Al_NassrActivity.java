package dev.android.pedro.appcamisasdocr7.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import dev.android.pedro.appcamisasdocr7.R;
import dev.android.pedro.appcamisasdocr7.controller.ColecaoController;
import dev.android.pedro.appcamisasdocr7.model.Colecao;

public class Al_NassrActivity extends AppCompatActivity {

    ColecaoController controller;

    Colecao titulo;
    Colecao descricaoCamisa;

    TextView txt_al_nassr;
    EditText edit_al_nassr;
    Button btn_al_nassr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_nassr);

        controller = new ColecaoController(Al_NassrActivity.this);

        controller.toString();

        txt_al_nassr = findViewById(R.id.txt_al_nassar_2023);
        edit_al_nassr = findViewById(R.id.edit_al_nassar_2023);
        btn_al_nassr = findViewById(R.id.btn_al_nassar_2023);

        btn_al_nassr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_al_nassr.getText().toString();
                String mensagem_final = "2023(Possui) " + mensagem_edit ;
                txt_al_nassr.setText(mensagem_final);

                titulo.setTitulo("Camisa 2023 - Al Nassr");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_al_nassr));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

    }
}