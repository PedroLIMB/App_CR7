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

public class Manchester_UnitedActivity extends AppCompatActivity {

    ColecaoController controller;

    Colecao titulo;
    Colecao descricaoCamisa;

    TextView txt_manchester_united_2007;
    EditText edit_manchester_united_2007;
    Button btn_manchester_united_2007;

    TextView txt_manchester_united_2008;
    EditText edit_manchester_united_2008;
    Button btn_manchester_united_2008;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manchester_united);

        controller = new ColecaoController(Manchester_UnitedActivity.this);

        controller.toString();

        txt_manchester_united_2007 = findViewById(R.id.txt_manchester_united_2007);
        edit_manchester_united_2007 = findViewById(R.id.edit_manchester_united_2007);
        btn_manchester_united_2007 = findViewById(R.id.btn_manchester_united_2007);

        txt_manchester_united_2008 = findViewById(R.id.txt_manchester_united_2008);
        edit_manchester_united_2008 = findViewById(R.id.edit_manchester_united_2008);
        btn_manchester_united_2008 = findViewById(R.id.btn_manchester_united_2008);

        btn_manchester_united_2007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_manchester_united_2007.getText().toString();
                String mensagem_final = "2007(Possui) " + mensagem_edit;
                txt_manchester_united_2007.setText(mensagem_final);

                titulo.setTitulo("Camisa 2007 - Manchester United");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_manchester_united_2007));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_manchester_united_2008.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_manchester_united_2008.getText().toString();
                String mensagem_final = "2008(Possui) " + mensagem_edit;
                txt_manchester_united_2008.setText(mensagem_final);

                titulo.setTitulo("Camisa 2008 - Manchester United");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_manchester_united_2008));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });
    }
}