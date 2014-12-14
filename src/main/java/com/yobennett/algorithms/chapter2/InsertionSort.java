package com.yobennett.algorithms.chapter2;

import java.util.List;

public class InsertionSort<T extends Comparable> {

	@SuppressWarnings("unchecked")
	private List<T> doSort(List<T> a) {
		for (int j = 1; j < a.size(); j++) {
			T key = a.get(j);
			int i = j - 1;
			while (i >= 0 && (a.get(i).compareTo(key) > 0)) {
				a.set(i + 1, a.get(i));
				i = i - 1;
			}
			a.set(i + 1, key);
		}
		return a;
	}

	public static <T extends Comparable> List<T> sort(List<T> a) {
		InsertionSort<T> insertionSort = new InsertionSort<T>();
		return insertionSort.doSort(a);
	}

}
