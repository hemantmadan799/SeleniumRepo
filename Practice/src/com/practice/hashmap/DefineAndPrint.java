package com.practice.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

class HashMapDefineAndPrint {

	HashMap<String, String> hash_map = new HashMap<String, String>();

	public void input() {

		hash_map.put("002_TAT01", "Red");
		hash_map.put("1", "Black");
		hash_map.put("1", "Yellow");
		hash_map.put("004_TAT01", "Green");

	}

	public void display() {
		for (Entry<String, String> x : hash_map.entrySet()) {

			System.out.println(x.getKey() + " " + x.getValue());

		}

	}
}

public class DefineAndPrint {

	public static void main(String[] args) {

		HashMapDefineAndPrint obj = new HashMapDefineAndPrint();

		obj.input();

		obj.display();

	}

}
