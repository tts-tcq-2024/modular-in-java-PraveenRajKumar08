package colorcoder;

import colorcoder.MajorColorConstants.MAJORCOLOR;
import colorcoder.MinorColorConstants.MINORCOLOR;

public class ColorPair {

	private MAJORCOLOR majorColor;
	private MINORCOLOR minorColor;

	public ColorPair(MAJORCOLOR major, MINORCOLOR minor)
	{
		this.majorColor = major;
		this.minorColor = minor;
	}

	public MAJORCOLOR getMajorColor() {
		return majorColor;
	}

	public MINORCOLOR getMinorColor() {
		return minorColor;
	}

	String convertToString() {
		String colorPairStr = MajorColorConstants.MAJORCOLORNAMES[majorColor.getCode()];
		colorPairStr += " ";
		colorPairStr += MinorColorConstants.MINORCOLORNAMES[minorColor.getCode()];
		return colorPairStr;
	}

}
