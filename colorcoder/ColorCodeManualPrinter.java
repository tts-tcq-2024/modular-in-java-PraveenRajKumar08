package colorcoder;

public class ColorCodeManualPrinter {
	
	public static void printManual() {
		int totalColorPairs = MajorColorConstants.MAJORCOLORSLENGTH * MinorColorConstants.MINORCOLORSLENGTH;
		for(int index = 0; index < totalColorPairs; index ++) {
			int majorColorIndex = index /  MajorColorConstants.MAJORCOLORSLENGTH;
			int minorColorIndex = index % MinorColorConstants.MINORCOLORSLENGTH;
			System.out.println("Pair no: "+ (index+1) +" Major Color: " + MajorColorConstants.MAJORCOLORNAMES[majorColorIndex] +
					" Minor Color: " + MinorColorConstants.MINORCOLORNAMES[minorColorIndex]);
		}
	}

}
