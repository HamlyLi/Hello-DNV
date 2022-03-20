package cn.hamly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class BarryTest {
	public static void main(String[] args) {
		List<Integer> ll = getRamList200();
		System.out.println(ll);
		
		List<Integer> same = getSame(ll);
		System.out.println(same);
		
		Map<Integer, Integer> analysisResult= analysis(ll);
		System.out.println(analysisResult);
	}

	private static List<Integer> getSame(List<Integer> ll) {
		List<Integer> returnList = new ArrayList<Integer>();
		int repeat = 0;
		for (Integer number : ll) {
			repeat = 0;
			for (Integer numInList : ll) {
				if (number == numInList) {
					repeat ++;
				}
			}
			if (repeat == 1) {
				returnList.add(number);
			}
		}
		return returnList;
	}

	private static Map<Integer, Integer> analysis(List<Integer> ll) {
		Map<Integer, Integer> returnList = new HashMap<Integer, Integer>();
		int repeat = 0;
		for (Integer number : ll) {
			repeat = 0;
			for (Integer numInList : ll) {
				if (number == numInList) {
					repeat ++;
				}
			}
			if (repeat > 1) {
				if (returnList.get(number) == null) {
					returnList.put(number, repeat);
				}
			}
		}
		return returnList;
	}

	private static List<Integer> getRamList200() {
		List<Integer> returnList = new ArrayList<Integer>();
		Integer number = 0;
		Random rd = new Random();
		for (int i = 0; i < 200; i++) {

			number = rd.nextInt(1999) + 1;
			returnList.add(number);

		}
		
		//below just for test
		returnList.add(2);
		returnList.add(2);
		returnList.add(3);
		returnList.add(3);
		returnList.add(3);
		returnList.add(4);
		returnList.add(4);
		returnList.add(4);
		returnList.add(4);
		return returnList;

	}
}
