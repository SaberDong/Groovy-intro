package groovy;

import java.util.ArrayList;

public class Generics2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1); //自动装箱， int 转为 Integer
		list.add(2.0);
		list.add("hello");
		
		System.out.println("List populated");
		
		for (int element : list) {
			System.out.println(element);
		}
		
	}
	
}
