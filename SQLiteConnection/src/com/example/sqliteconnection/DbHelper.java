package com.example.sqliteconnection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper{
	private static final String db_name = "archivo.sqlite";//no importa extencion
	private static final int db_schema_version = 1;
	

	public DbHelper(Context context){//, String name, CursorFactory factory,int version) {
		super(context, db_name, null, db_schema_version);
		// TODO Auto-generated constructor stub
		/*//name-nombre, 
		 *cursorFactory-clase curso para validaciones u operaciones en base de datos por defecto null
		 *version-version de esquema*/
		//no se necesita intanciar parametros puesto que ya los hicimos manualmente
		
	}

	@Override  //crear base de datos
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override //actualizaciones de esquema sqlite db
 	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
