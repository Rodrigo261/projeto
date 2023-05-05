package dev.rodrigo.projeto

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase

abstract class tabelaBD(val db: SQLiteDatabase,val nome:String) {
    abstract fun cria()

    fun insere(valores: ContentValues) =
        db.insert(nome,null,valores)


    fun consulta(
        colunas: Array<String>,
        selecao: String?,
        argsSelecao: Array<String>?,
        groupby: String,
        having: String,
        orderby: String
    ) : Cursor =
        db.query(nome,colunas,selecao,argsSelecao,groupby,having,orderby)


    fun altera(valores: ContentValues, where: String, argswhere: Array<String>) =
        db.update(nome,valores,where,argswhere)



    fun delete(where: String, argsWhere: Array<String>) =
        db.delete(nome,where,argsWhere)



}
