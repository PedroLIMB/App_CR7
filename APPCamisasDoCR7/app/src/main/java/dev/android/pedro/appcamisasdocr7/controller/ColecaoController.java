package dev.android.pedro.appcamisasdocr7.controller;

import android.content.ContentValues;
import android.content.SharedPreferences;

import dev.android.pedro.appcamisasdocr7.database.ColecaoDB;
import dev.android.pedro.appcamisasdocr7.model.Colecao;
import dev.android.pedro.appcamisasdocr7.view.Al_NassrActivity;
import dev.android.pedro.appcamisasdocr7.view.Manchester_UnitedActivity;
import dev.android.pedro.appcamisasdocr7.view.PortugalActivity;
import dev.android.pedro.appcamisasdocr7.view.Real_MadridActivity;

public class ColecaoController extends ColecaoDB {

    SharedPreferences preferences;
    SharedPreferences.Editor dadosPreference;
    public static final String NOME_PREFERENCES_COMBUSTIVEL = "pref_listaColecao";

    public ColecaoController(Al_NassrActivity al_nassrActivity) {
        super(al_nassrActivity);

        preferences = al_nassrActivity.getSharedPreferences(NOME_PREFERENCES_COMBUSTIVEL, 0);
        dadosPreference = preferences.edit();

    }

    public ColecaoController(Manchester_UnitedActivity manchester_unitedActivity) {
        super(manchester_unitedActivity);

        preferences = manchester_unitedActivity.getSharedPreferences(NOME_PREFERENCES_COMBUSTIVEL, 0);
        dadosPreference = preferences.edit();

    }

    public ColecaoController(PortugalActivity portugalActivity) {
        super(portugalActivity);

        preferences = portugalActivity.getSharedPreferences(NOME_PREFERENCES_COMBUSTIVEL, 0);
        dadosPreference = preferences.edit();

    }

    public ColecaoController(Real_MadridActivity real_madridActivity) {
        super(real_madridActivity);

        preferences = real_madridActivity.getSharedPreferences(NOME_PREFERENCES_COMBUSTIVEL, 0);
        dadosPreference = preferences.edit();

    }

    public void salvar(Colecao colecao){

        ContentValues dados = new ContentValues();

        dados.put("Titulo", colecao.getTitulo());
        dados.put("recomendacao", colecao.getDescricaoCamisa());

        salvarObjeto("colecao", dados);
    }
}