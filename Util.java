package cn.com.aladdinet.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	public static final String defaultKey = "linkdata1234567890";

	public static boolean isEmpty(String str) {
		//wwww
		//2222
		//3333
		if (str != null && !str.equals("")){
			return false;
		}
		return true;

	}
}
