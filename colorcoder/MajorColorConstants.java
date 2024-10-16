package colorcoder;

public class MajorColorConstants {

	public enum MAJORCOLOR {
		WHITE(0),
		RED(1),
		BLACK(2),
		YELLOW(3),
		VIOLET(4);
		private int code;

		private MAJORCOLOR(int code) {
			this.code = code;
		}

		public int getCode() {
			return code;
		}

		public static MAJORCOLOR fromIndex(int code) {
			for(MAJORCOLOR color: MAJORCOLOR.values()) {
				if(color.getCode() == code) {
					return color;
				}
			}
			return null;
		}
	}

	public static final String[] MAJORCOLORNAMES = {
			"White", "Red", "Black", "Yellow", "Violet"
	};

	public static final int MAJORCOLORSLENGTH = MAJORCOLORNAMES.length;

}
