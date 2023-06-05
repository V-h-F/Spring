package com.hope.bean;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestTime {
	public static void main(String[] args) {
		HashMap<Object, Object> map = new HashMap<>();
		HashMap<Object, Object> map2 = new HashMap<>();
		map.put("test1","1");
		map.put("test2","2");
		List<Object> list= map.entrySet().stream().map(et ->et.getKey()+"_"+et.getValue()).collect(Collectors.toList());
		map2.put("data",list);
		map2.put("type","U");
		map2.put("when",System.currentTimeMillis());
		List<Object> list2= map2.entrySet().stream().map(et ->et.getKey()+"_"+et.getValue()).collect(Collectors.toList());
		System.out.println(list2);

		System.out.println(System.currentTimeMillis());
	}
}
