package com.common.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class ArrayUtils {

	public static int count(int[] a) {
		int count = 0;
		int[] tem = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			tem[i] = 0;
		}
		int maximumSofar = 0;
		for (int i = 0; i < a.length; i++) {
			int x = a[i] - 1;
			if (x< i ) {
				maximumSofar++;
			} else {
				tem[x]++;
			}
			if (tem[i] > 0) {
				maximumSofar = maximumSofar+tem[i];
			}
			if ((maximumSofar) == i + 1) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {

		int[] a = new int[] { 1, 3, 4, 2, 5 };
		System.out.print(count(a));
	}
}
