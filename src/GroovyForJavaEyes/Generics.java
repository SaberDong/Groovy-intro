package GroovyForJavaEyes;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1); //自动装箱， int 转为 Integer
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (double)
	The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)

	at GroovyForJavaEyes.Generics.main(Generics.java:11)
		 */
		//list.add(2.0);
		//list.add("hello");
		
		System.out.println("List populated");
		
		for (int element : list) {
			System.out.println(element);
		}
		
	}
	
}
