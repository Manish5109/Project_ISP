package com.study.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFromList {
	
	/**
	 *  adding duplicate value in list
	 */
	public static void storeDuplicate() {
		List<Integer> list = Arrays.asList(11,23,45,76,22,11,33,22,33);
		Set<Integer> set = getUnique(list);
		
		//list.add(11); java.lang.UnsupportedOperationException
		
		set.forEach(st->{
			System.out.println(st);
		});
	}
	
	/**
	 * @param <T>
	 * @param list
	 * @return duplicate value in set
	 */
	public static <T> Set<T> getUnique(List<T> list){
		Set<T> set = new HashSet<T>();
		return list.stream().filter(lst -> !set.add(lst)).collect(Collectors.toSet());
		 
	}
	
	/**
	 * count the duplicate value and store into map
	 */
	public static void duplicateCountToMap() {
		List<Integer> list = Arrays.asList(11,23,45,76,22,11,33,22,33);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		list.forEach(lst -> map.put(lst, map.getOrDefault(lst, 0)+1));
		map.forEach((key, value) ->{
			System.out.println(key +"=="+value);
		});
	}
	
	public static void main(String[] args) {
		storeDuplicate();
		duplicateCountToMap();
	}

}
