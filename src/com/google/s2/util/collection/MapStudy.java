package com.google.s2.util.collection;

import java.util.HashMap;

public class MapStudy {
	
	public void study1() {

	HashMap<String,Integer> map= new HashMap<>();
	
map.put("f1", 1);
map.put("f2", 2);
map.put("f3", 1);

System.out.println(map);
Integer num =map.get("f2");
System.out.println(num);

map.remove("f3");
System.out.println(map);

map.put("f1", 100);
System.out.println(map);

//없는키로 꺼내면? -> null이 나온다. 
//null을 int로 바꾸려고 하니까 불가능
Integer n = map.get("df");// null
//int n=map.get("test"); //error
System.out.println(n);

String name="k5";
map.put(name, null);

map.clear();
System.out.println(map);
	}
}
