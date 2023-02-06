package com.impact;

import java.util.Collection;

public interface NumberRangeSummarizer {
	//collect the input
    Collection<Integer> collect(String input);

    //get the summarized string
    String summarizeCollection(Collection<Integer> input);
}



