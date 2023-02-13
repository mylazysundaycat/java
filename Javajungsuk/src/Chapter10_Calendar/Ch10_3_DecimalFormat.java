package Chapter10_Calendar;

import java.text.DecimalFormat;

public class Ch10_3_DecimalFormat {
	public static void main(String[] args) {
		double number = 12345.6789;
		String[] pattern = {
				"0",
				"0.0",
				"#",
				"#,###"
		};
		
		for(int i=0; i<pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.println(df.format(number));
		}
	}
}
