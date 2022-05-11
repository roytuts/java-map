package com.roytuts.java.maptolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		Map<String, String> propertiesMap = new HashMap<>();
		propertiesMap.put("success", "Success");
		propertiesMap.put("warning", "Warning");
		propertiesMap.put("error", "Error");
		
		List<ConfigProperty> configProperties = new ArrayList<>();
		
		propertiesMap.forEach((k, v) -> configProperties.add(new ConfigProperty(k, v)));
		
		configProperties.forEach(c -> System.out.println(c.getName() + " => " + c.getValue()));
	}

}
