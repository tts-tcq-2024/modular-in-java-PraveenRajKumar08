package colorcoder;

import colorcoder.MajorColorConstants.MAJORCOLOR;
import colorcoder.MinorColorConstants.MINORCOLOR;

public class ColorCodePairPrinter {

	public static void printCodeToPair(int pairCode, MAJORCOLOR expectedMajor, MINORCOLOR expectedMinor)
	{
		ColorPair colorPair = ColorPairManager.getColorFromPairCode(pairCode);
		System.out.println("Got pair " + colorPair.convertToString());
		assert(colorPair.getMajorColor() == expectedMajor);
		assert(colorPair.getMinorColor() == expectedMinor);
	}

	public static void printPairToCode(MAJORCOLOR major, MINORCOLOR minor, int expectedPairCode)
	{
		int pairCode = ColorPairManager.getPairCodeFromColor(major, minor);
		System.out.println("Got pair number " + pairCode);
		assert(pairCode == expectedPairCode);
	}

}
