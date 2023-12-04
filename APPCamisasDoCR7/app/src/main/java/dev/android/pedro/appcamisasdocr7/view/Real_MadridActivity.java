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

public class Real_MadridActivity extends AppCompatActivity {

    ColecaoController controller;

    Colecao titulo;
    Colecao descricaoCamisa;

    TextView txt_real_madrid_2009;
    EditText edit_real_madrid_2009;
    Button btn_real_madrid_2009;

    TextView txt_real_madrid_2010;
    EditText edit_real_madrid_2010;
    Button btn_real_madrid_2010;

    TextView txt_real_madrid_2011;
    EditText edit_real_madrid_2011;
    Button btn_real_madrid_2011;

    TextView txt_real_madrid_2012;
    EditText edit_real_madrid_2012;
    Button btn_real_madrid_2012;

    TextView txt_real_madrid_2013;
    EditText edit_real_madrid_2013;
    Button btn_real_madrid_2013;

    TextView txt_real_madrid_2014;
    EditText edit_real_madrid_2014;
    Button btn_real_madrid_2014;

    TextView txt_real_madrid_2015;
    EditText edit_real_madrid_2015;
    Button btn_real_madrid_2015;

    TextView txt_real_madrid_2016;
    EditText edit_real_madrid_2016;
    Button btn_real_madrid_2016;

    TextView txt_real_madrid_2017;
    EditText edit_real_madrid_2017;
    Button btn_real_madrid_2017;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_madrid);

        controller = new ColecaoController(Real_MadridActivity.this);

        controller.toString();

        txt_real_madrid_2009 = findViewById(R.id.txt_real_madrid_2009);
        edit_real_madrid_2009 = findViewById(R.id.edit_real_madrid_2009);
        btn_real_madrid_2009 = findViewById(R.id.btn_real_madrid_2009);

        txt_real_madrid_2010 = findViewById(R.id.txt_real_madrid_2010);
        edit_real_madrid_2010 = findViewById(R.id.edit_real_madrid_2010);
        btn_real_madrid_2010 = findViewById(R.id.btn_real_madrid_2010);

        txt_real_madrid_2011 = findViewById(R.id.txt_real_madrid_2011);
        edit_real_madrid_2011 = findViewById(R.id.edit_real_madrid_2011);
        btn_real_madrid_2011 = findViewById(R.id.btn_real_madrid_2011);

        txt_real_madrid_2012 = findViewById(R.id.txt_real_madrid_2012);
        edit_real_madrid_2012 = findViewById(R.id.edit_real_madrid_2012);
        btn_real_madrid_2012 = findViewById(R.id.btn_real_madrid_2012);

        txt_real_madrid_2013 = findViewById(R.id.txt_real_madrid_2013);
        edit_real_madrid_2013 = findViewById(R.id.edit_real_madrid_2013);
        btn_real_madrid_2013 = findViewById(R.id.btn_real_madrid_2013);

        txt_real_madrid_2014 = findViewById(R.id.txt_real_madrid_2014);
        edit_real_madrid_2014 = findViewById(R.id.edit_real_madrid_2014);
        btn_real_madrid_2014 = findViewById(R.id.btn_real_madrid_2014);

        txt_real_madrid_2015 = findViewById(R.id.txt_real_madrid_2015);
        edit_real_madrid_2015 = findViewById(R.id.edit_real_madrid_2015);
        btn_real_madrid_2015 = findViewById(R.id.btn_real_madrid_2015);

        txt_real_madrid_2016 = findViewById(R.id.txt_real_madrid_2016);
        edit_real_madrid_2016 = findViewById(R.id.edit_real_madrid_2016);
        btn_real_madrid_2016 = findViewById(R.id.btn_real_madrid_2016);

        txt_real_madrid_2017 = findViewById(R.id.txt_real_madrid_2017);
        edit_real_madrid_2017 = findViewById(R.id.edit_real_madrid_2017);
        btn_real_madrid_2017 = findViewById(R.id.btn_real_madrid_2017);

        btn_real_madrid_2009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_real_madrid_2009.getText().toString();
                String mensagem_final = "2009(Possui) " + mensagem_edit;
                txt_real_madrid_2009.setText(mensagem_final);

                titulo.setTitulo("Camisa 2009 - Real Madrid");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_real_madrid_2009));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_real_madrid_2010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_real_madrid_2010.getText().toString();
                String mensagem_final = "2010(Possui) " + mensagem_edit;
                txt_real_madrid_2010.setText(mensagem_final);

                titulo.setTitulo("Camisa 2010 - Real Madrid");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_real_madrid_2010));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_real_madrid_2011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_real_madrid_2011.getText().toString();
                String mensagem_final = "2011(Possui) " + mensagem_edit;
                txt_real_madrid_2011.setText(mensagem_final);

                titulo.setTitulo("Camisa 2011 - Real Madrid");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_real_madrid_2011));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_real_madrid_2012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_real_madrid_2012.getText().toString();
                String mensagem_final = "2012(Possui) " + mensagem_edit;
                txt_real_madrid_2012.setText(mensagem_final);

                titulo.setTitulo("Camisa 2012 - Real Madrid");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_real_madrid_2012));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_real_madrid_2013.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_real_madrid_2013.getText().toString();
                String mensagem_final = "2013(Possui) " + mensagem_edit;
                txt_real_madrid_2013.setText(mensagem_final);

                titulo.setTitulo("Camisa 2013 - Real Madrid");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_real_madrid_2013));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_real_madrid_2014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_real_madrid_2014.getText().toString();
                String mensagem_final = "2014(Possui) " + mensagem_edit;
                txt_real_madrid_2014.setText(mensagem_final);

                titulo.setTitulo("Camisa 2014 - Real Madrid");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_real_madrid_2014));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_real_madrid_2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_real_madrid_2015.getText().toString();
                String mensagem_final = "2015(Possui) " + mensagem_edit;
                txt_real_madrid_2015.setText(mensagem_final);

                titulo.setTitulo("Camisa 2015 - Real Madrid");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_real_madrid_2015));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_real_madrid_2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_real_madrid_2016.getText().toString();
                String mensagem_final = "2016(Possui) " + mensagem_edit;
                txt_real_madrid_2016.setText(mensagem_final);

                titulo.setTitulo("Camisa 2016 - Real Madrid");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_real_madrid_2016));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

        btn_real_madrid_2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulo = new Colecao();
                descricaoCamisa = new Colecao();

                String mensagem_edit = edit_real_madrid_2017.getText().toString();
                String mensagem_final = "2017(Possui) " + mensagem_edit;
                txt_real_madrid_2017.setText(mensagem_final);

                titulo.setTitulo("Camisa 2017 - Real Madrid");
                descricaoCamisa.setDescricaoCamisa(String.valueOf(txt_real_madrid_2017));

                controller.salvar(titulo);
                controller.salvar(descricaoCamisa);
            }
        });

    }
}