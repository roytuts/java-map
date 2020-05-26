package com.roytuts.java.custom.hashmap;

import com.roytuts.java.custom.hashmap.HashMap.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>(3);

		map.put("1", "Hello");
		map.put("2", "World");

		System.out.println("Size: " + map.size());

		String hello = map.get("1");
		String world = map.get("2");

		System.out.println(hello + " " + world);

		System.out.println("Contains Key 1: " + map.containsKey("1"));
		System.out.println("Contains Key 2: " + map.containsKey("2"));
		System.out.println("Contains Key 3: " + map.containsKey("3"));

		map.put("3", "Dummy");

		System.out.println("Contains Key 3: " + map.containsKey("3"));
		System.out.println("Size: " + map.size());

		map.remove("3");

		System.out.println("Contains Key 3: " + map.containsKey("3"));
		System.out.println("Size: " + map.size());

		HashMap<String, String> map2 = new HashMap<>();
		map2.put("1", "Hello");
		map2.put("2", "World");
		map2.put("3", "Hello");
		map2.put("4", "World");
		map2.put("5", "Hello");
		map2.put("6", "World");
		map2.put("7", "Hello");
		map2.put("8", "World");
		map2.put("9", "Hello");
		map2.put("10", "World");
		map2.put("11", "Hello");
		map2.put("12", "World");
		map2.put("13", "Hello");
		map2.put("14", "World");
		map2.put("15", "Hello");
		map2.put("16", "World");

		System.out.println();
		System.out.print("Keys: ");
		map2.keySet().forEach(k -> System.out.print(k + " "));
		System.out.println();

		System.out.println();
		System.out.print("Values: ");
		map2.values().forEach(v -> System.out.print(v + " "));

		System.out.println();
		System.out.println("Entries: ");
		for (Entry<String, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		System.out.println();
		System.out.println("map2 size: " + map2.size());
		System.out.println("Get Key 1: " + map2.get("1"));
		System.out.println("Get Key 11: " + map2.get("11"));
		System.out.println("Get Key 6: " + map2.get("6"));
		System.out.println("Get Key 16: " + map2.get("16"));
	}

}
