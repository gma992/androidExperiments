package com.stocksncode.stockfacts;

public class FactBook {

	public String[] mColors = {
	    "#39add1", // light blue
	    "#3079ab", // dark blue
	    "#c25975", // mauve
	    "#e15258", // red
	    "#f9845b", // orange
	    "#838cc7", // lavender
	    "#7d669e", // purple
	    "#53bbb4", // aqua
	    "#51b46d", // green
	    "#e0ab18", // mustard
	    "#637a91", // dark gray
	    "#f092b0", // pink
	    "#b7c0c7"  // light gray
	};
	
	// Method capabilities: things can do
	public String getFact(){



        String fact = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        fact = mFacts[randomNumber];

		return fact;
	}
}
