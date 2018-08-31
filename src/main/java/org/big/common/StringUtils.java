package org.big.common;

public class StringUtils {

	public static boolean isNotBlank(String str) {
		if (null != str && !"".equals(str)) {
			return true;
		}
		return false;
	}

	public static boolean isBlank(String str) {
		if (isNotBlank(str)) {
			return false;
		}
		return true;
	}
	
	public static int getA() {
		return 1;
	}

}
