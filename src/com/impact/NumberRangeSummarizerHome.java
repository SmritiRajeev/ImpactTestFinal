package com.impact;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

   public class NumberRangeSummarizerHome implements NumberRangeSummarizer{

	  @Override
	  public Collection<Integer> collect(String input) {
		String arrInput[] = input.split(",");

		Collection<Integer> inputList= new ArrayList<Integer>();
		for(int i = 0; i< arrInput.length; i++) {
			inputList.add(Integer.parseInt(arrInput[i]));
		}
		
		//sort the input list before returning
		return inputList;
	}

	 @Override
	 public String summarizeCollection(Collection<Integer> inputlist) {
		List<Integer> input = (List<Integer>) inputlist;
		// Validate input list
				if (input == null || input.isEmpty()) {
					return "Invalid input";
				}

				// Initialize variables
				StringBuilder output = new StringBuilder();
				int start = input.get(0);
				int end = input.get(0);

				// Iterate through the list
				for (int i = 1; i < input.size(); i++) {
					// If current element is not consecutive to the previous one
					if (input.get(i) - input.get(i - 1) != 1) {
						// If start and end are same
						if (start == end) {
							output.append(start).append(", ");
						} else {
							output.append(start).append("-").append(end).append(", ");
						}

						// Reset the start and end
						start = input.get(i);
						end = input.get(i);
					} else {
						// Update the end
						end = input.get(i);
					}
				}

				// For the last range
				if (start == end) {
					output.append(start);
				} else {
					output.append(start).append("-").append(end);
				}
				return output.toString();
	}





	}


