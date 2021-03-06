package org.moon.framework.core.utils.basic;

import org.moon.framework.core.utils.collection.ArrayUtils;

/**
 * Created by 明月   on 2019-01-13 / 23:19
 *
 * @email: 1814031271@qq.com
 *
 * @Description: 断言工具类
 */
public final class Assert {

	private Assert() {
	}

	/**
	 * 断言对象是否为空
	 * @param obj 校验实例
	 * @param message 提示错误信息
	 */
	public static void isNull(Object obj, String message) {
		if (null == obj)
			throw new IllegalArgumentException(message);
	}

	/**
	 * 断言字符序列为空
	 * @param charSequence 校验的字符序列
	 * @param message 提示的错误信息
	 */
	public static void isEmptyString(CharSequence charSequence, String message) {
		if (StringUtils.isEmpty(charSequence))
			throw new IllegalArgumentException(message);
	}

	/**
	 * 断言数组为空
	 * @param charSequence 校验的数组
	 * @param message 提示的错误信息
	 */
	public static void isEmptyArray(Object[] array, String message) {
		if (ArrayUtils.isEmpty(array))
			throw new IllegalArgumentException(message);
	}
}