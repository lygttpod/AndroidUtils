package com.allen.utils;

/**
 * Created by allen on 2016/11/15.
 * 字符串处理工具类
 */

public class StringUtils {

    /**
     * 判断字符串是否为空
     *
     * @param str 传入的字符串
     * @return 返回 true or false
     */
    public static boolean isEmpty(CharSequence str) {
        if (str == null || str.length() == 0)
            return true;
        else
            return false;
    }

    /**
     * 隐藏部分字符，以*代替对应位置的明文
     *
     * @param originStr  明文字符串
     * @param startIndex 要隐藏的起始位置(包含)
     * @param endIndex   要隐藏的结束位置(包含)
     * @return 如果没有异常，返回带*的字符串；否则返回原字符串
     * 例：(ABCDEFG, 3, 5)-->ABC***G
     */
    public static String hideChars(String originStr, int startIndex, int endIndex) {
        if (isEmpty(originStr))
            return originStr;
        if (startIndex < 0 || endIndex >= originStr.length())
            return originStr;
        if (startIndex > endIndex)
            return originStr;

        StringBuilder sb = new StringBuilder(originStr.length());
        for (int i = 0; i <= startIndex - 1; i++) {
            sb.append(originStr.charAt(i));
        }
        for (int i = startIndex; i <= endIndex; i++) {
            sb.append('*');
        }
        for (int i = endIndex + 1; i <= originStr.length() - 1; i++) {
            sb.append(originStr.charAt(i));
        }
        return sb.toString();
    }

}
