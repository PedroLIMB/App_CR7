package dev.android.pedro.appcamisasdocr7.view;

import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;

import dev.android.pedro.appcamisasdocr7.R;
import dev.android.pedro.appcamisasdocr7.controller.ColecaoController;

public class MainActivity extends AppCompatActivity {

    ImageButton colecao_portugal;
    ImageButton colecao_al_nassr;
    ImageButton colecao_real_madrid;
    ImageButton colecao_manchester_united;
    ImageButton nova_colecao;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colecao_portugal = findViewById(R.id.img_btn_portugal);
        colecao_al_nassr = findViewById(R.id.img_btn_alNassr);
        colecao_real_madrid = findViewById(R.id.img_btn_realMadrid);
        colecao_manchester_united = findViewById(R.id.img_btn_manchesterUnited);
        nova_colecao = findViewById(R.id.nova_imagem);

        colecao_portugal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telaPortugal = new Intent(MainActivity.this, PortugalActivity.class);
                startActivity(telaPortugal);

            }
        });


        colecao_al_nassr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telaAlNassr = new Intent(MainActivity.this, Al_NassrActivity.class);
                startActivity(telaAlNassr);

            }
        });


        colecao_real_madrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telaRealMadrid = new Intent(MainActivity.this, Real_MadridActivity.class);
                startActivity(telaRealMadrid);

            }
        });


        colecao_manchester_united.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telaManchesterUnited = new Intent(MainActivity.this, Manchester_UnitedActivity.class);
                startActivity(telaManchesterUnited);

            }
        });


        nova_colecao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nova_colecao = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                startActivityForResult(Intent.createChooser( nova_colecao, "Escolha uma imagem para sua coleção"), 1);
            }
        });

    }
}