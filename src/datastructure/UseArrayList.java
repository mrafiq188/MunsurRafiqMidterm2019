package datastructure;

import com.mysql.cj.x.protobuf.MysqlxExpr;
import databases.ConnectToSqlDB;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> list = new ArrayList<>();
		//adding elements to arraylist
		list.add("NY");
		list.add("VA");
		list.add("DC");
		list.add("FL");
		list.add("TX");

		//print arSray list
		System.out.println("Getting elements from ArrayList:" + list);




	}

}
