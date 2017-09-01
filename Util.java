package cn.com.aladdinet.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	public static final String defaultKey = "linkdata1234567890";

	public static boolean isEmpty(String str) {
		if (str != null && !str.equals("")){
			//11111
			return false;
		}
		return true;

	}
}
