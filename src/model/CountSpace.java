package model;

import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class CountSpace extends UDF {
	public String evaluate(String airportName) {
		if (airportName == null) {
			return null;
		}
		int count = 0;
		String result = "";
		for (int i = 0; i < airportName.length(); i++) {
			if (airportName.charAt(i) == ' ') {
				count++;
				result += count;
			} else {
				result += airportName.charAt(i);
			}
		}
		return result;
	}
}
