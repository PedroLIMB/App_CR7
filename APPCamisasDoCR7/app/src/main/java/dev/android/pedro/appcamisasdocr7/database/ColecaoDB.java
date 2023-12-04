package dev.android.pedro.appcamisasdocr7.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ColecaoDB extends SQLiteOpenHelper {

    private static final String DB_NAME = "colecao_db";

    private static final int DB_VERSION = 1;

    Cursor cursor;
    SQLiteDatabase db;

    public ColecaoDB(Context context) {

        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sqlTabela_Colecao =
                "CREATE TABLE colecao(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "Titulo TEXT, " +
                        "recomendacao TEXT)";

        db.execSQL(sqlTabela_Colecao);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {}

    public void salvarObjeto(String tabela, ContentValues dados){

        db.insert(tabela, null, dados);
    }

}