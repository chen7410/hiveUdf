package model;

import org.apache.hadoop.hive.ql.exec.UDF;

@SuppressWarnings("deprecation")
public class CountSpace extends UDF {
	private final static char OCCURANCE = ' ';
	/**
	 * count the number of ' ' in the given airportName.
	 * @param airportName
	 * @return for example "this1is2a3airport4name"
	 */
	public String evaluate(String airportName) {
		if (airportName == null) {
			return null;
		}
		int count = 0;
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < airportName.length(); i++) {
			if (airportName.charAt(i) == OCCURANCE) {
				count++;
				result.append(count);
			} else {
				result.append(airportName.charAt(i));
			}
		}
		return result.toString();
	}
}
