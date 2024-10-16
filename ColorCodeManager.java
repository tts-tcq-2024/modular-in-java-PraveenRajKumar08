package colorcoder;

import colorcoder.MajorColorConstants.MAJORCOLOR;
import colorcoder.MinorColorConstants.MINORCOLOR;

public class ColorCodeManager {

    public static void main(String[] args) {
    	ColorCodePairPrinter.printCodeToPair(4, MAJORCOLOR.WHITE, MINORCOLOR.BROWN);
    	ColorCodePairPrinter.printCodeToPair(5, MAJORCOLOR.WHITE, MINORCOLOR.SLATE);
    
    	ColorCodePairPrinter.printPairToCode(MAJORCOLOR.BLACK, MINORCOLOR.ORANGE, 12);
    	ColorCodePairPrinter.printPairToCode(MAJORCOLOR.VIOLET, MINORCOLOR.SLATE, 25);
    	
    	ColorCodeManualPrinter.printManual();
    }
}
