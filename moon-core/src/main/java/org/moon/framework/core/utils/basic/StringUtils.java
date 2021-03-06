package org.moon.framework.core.utils.basic;

/**
 * Created by 明月   on 2019-01-13 / 23:21
 *
 * @email: 1814031271@qq.com
 *
 * @Description: CharSequence 操作工具类
 */
public final class StringUtils {

	/**
	 * 编码格式
	 */
	private static final String ENCODE[] = new String[]{
			"UTF-8",
			"ISO-8859-1",
			"GB2312",
			"GBK",
			"GB18030",
			"Big5",
			"Unicode",
			"ASCII"
	};

	private StringUtils() {
	}

	/**
	 * 校验字符串为空
	 */
	public static boolean isEmpty(CharSequence charSequence) {
		return null != charSequence ? charSequence.length() == 0 : true;
	}

	/**
	 * 校验一组字符都为空
	 */
	public static boolean areEmpty(CharSequence... args) {
		for (int i = 0; i < args.length; i++)
			if (isNotEmpty(args[i]))
				return false;
		return true;
	}

	/**
	 * 校验字符串不为空
	 */
	public static boolean isNotEmpty(CharSequence charSequence) {
		return null != charSequence ? charSequence.length() != 0 : false;
	}

	/**
	 * 校验一组字符都不为空
	 */
	public static boolean areNotEmpty(CharSequence... args) {
		for (int i = 0; i < args.length; i++)
			if (isEmpty(args[i]))
				return false;
		return true;
	}

	/**
	 * 校验字符串为空性质
	 */
	public static boolean isBlank(CharSequence charSequence) {
		if (isEmpty(charSequence))
			return true;
		else
			for (int i = 0; i < charSequence.length(); i++)
				if (!Character.isWhitespace(charSequence.charAt(i)))
					return false;
		return true;
	}

	/**
	 * 校验一组字符串为空性质
	 */
	public static boolean areBlank(CharSequence... charSequence) {
		for (int i = 0; i < charSequence.length; i++)
			if (isNotBlank(charSequence[i]))
				return false;
		return true;
	}

	/**
	 * 校验字符串不为空性质
	 */
	public static boolean isNotBlank(CharSequence charSequence) {
		return !isBlank(charSequence);
	}

	/**
	 * 校验一组字符串不为空性质
	 */
	public static boolean areNotBlank(CharSequence... charSequence) {
		for (int i = 0; i < charSequence.length; i++)
			if (isBlank(charSequence[i]))
				return false;
		return true;
	}

	/**
	 * 获取首字母小写的Class名
	 */
	public static String getClassName(Class<?> clazz) {
		String className = clazz.getName().substring(clazz.getName().lastIndexOf(".") + 1);
		char firstWord = Character.toLowerCase(className.charAt(0));
		return firstWord + className.substring(1);
	}

	/**
	 * 获取字符串的编码格式
	 */
	public static String getEncoding(String str) {
		for (int i = 0; i < ENCODE.length; i++){
			try {
				if (str.equals(new String(str.getBytes(ENCODE[i]), ENCODE[i]))) {
					return ENCODE[i];
				}
			} catch (Exception ex) {
			}
		}
		return "";
	}
}