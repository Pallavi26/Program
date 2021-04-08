package com.recurrence.no;

import java.util.HashMap;

public class RecurrenceNo {

	public static void main(String[] args) {
		
		String s="PallaviKumari";
		char[] ch=s.toCharArray();
		for(Character c:ch)
		System.out.print(c+",");
		
		HashMap<Character,Integer> hm=new HashMap<>();
		System.out.println("\n" +hm +" ");
		
		for(Character c:ch) {
			if(hm.containsKey(c))
				hm.put(c, hm.get(c)+1);
			else
				hm.put(c, 1);
		}
		System.out.println(hm);
		
	}

}
