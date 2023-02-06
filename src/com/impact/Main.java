package com.impact;

import java.util.Collection;

public class Main {
	public static void main(String[] args) {
		NumberRangeSummarizer numberRangeSummarizer = new NumberRangeSummarizerHome();
		String inputString = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
		Collection<Integer> inputList = numberRangeSummarizer.collect(inputString);
		System.out.println("input:"+inputList);
		String output = numberRangeSummarizer.summarizeCollection(inputList);
		System.out.println("output:"+output);
	}


}
