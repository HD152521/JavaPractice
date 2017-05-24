/**
 * 
 */
package org.dimigo.interfaces;

/**
 *<pre>
 *org.dimigo.interfaces
 *     |_DBTest
 *
 * 1. 개요  : 
 * 2. 작성일 : 2017. 5. 24.
 *</pre>
 *
 * @author Dell
 * @version : 1.0
 */
public class DBTest {
public static void main(String[] args) {
	DBTest a = new DBTest();
	IDBManager s = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
	System.out.println("<<변경 전>>");
	a.crud(s);
	IDBManager o = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
	System.out.println("");
	System.out.println("<<변경 후>>");
	a.crud(o);
}

private void crud(IDBManager db){
	db.insert();
	db.search();
	db.update();
	db.delete();
}
}
