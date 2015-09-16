package com.stocksncode.stockfacts;

public class ColorWheel {

	public String[] mColors = {
                    "#53bbb4",
                    "#3079ab"
        };
	
	// Method capabilities: things can do
	public int getColor(){



        String color = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

		return colorAsInt;
	}
}
