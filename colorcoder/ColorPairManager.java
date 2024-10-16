package colorcoder;

import colorcoder.MajorColorConstants.MAJORCOLOR;
import colorcoder.MinorColorConstants.MINORCOLOR;

public class ColorPairManager {

	public static ColorPair getColorFromPairCode(int pairCode) {
		int zeroBasedPairNumber = pairCode - 1;
		MAJORCOLOR majorColor = MAJORCOLOR.fromIndex(zeroBasedPairNumber / MinorColorConstants.MINORCOLORSLENGTH);
		MINORCOLOR minorColor = MINORCOLOR.fromIndex(zeroBasedPairNumber % MinorColorConstants.MINORCOLORSLENGTH);
		return new ColorPair(majorColor, minorColor);
	}

	public static int getPairCodeFromColor(MAJORCOLOR majorColor, MINORCOLOR minorColor) {
		return majorColor.getCode() * MinorColorConstants.MINORCOLORSLENGTH + minorColor.getCode() + 1;
	}

}
