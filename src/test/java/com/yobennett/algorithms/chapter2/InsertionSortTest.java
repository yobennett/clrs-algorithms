package com.yobennett.algorithms.chapter2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class InsertionSortTest {

	@Test
	public void returnSortedList() {
		List<Integer> input = new ArrayList<Integer>(Arrays.asList(5, 2, 4, 6, 1, 3));
		List<Integer> sortedInput = InsertionSort.sort(input);
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		assertThat(sortedInput, equalTo(expected));
	}

}
