package colorcoder;

public class MinorColorConstants {

	public enum MINORCOLOR {
		BLUE(0),
		ORANGE(1),
		GREEN(2),
		BROWN(3),
		SLATE(4);
		private int code;

		private MINORCOLOR(int code) {
			this.code = code;
		}

		public int getCode() {
			return code;
		}

		public static MINORCOLOR fromIndex(int code) {
			for(MINORCOLOR color: MINORCOLOR.values()) {
				if(color.getCode() == code) {
					return color;
				}
			}
			return null;
		}
	}

	public static final String[] MINORCOLORNAMES = {
			"Blue", "Orange", "Green", "Brown", "Slate"
	};

	public static final int MINORCOLORSLENGTH = MINORCOLORNAMES.length;

}
