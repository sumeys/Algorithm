package com.sumey.niuke.jianzhiOffer;

/**
 * @author sumey
 * @date 2018/9/3 下午7:01
 */

/**
 * 题目描述：请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class s2_ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        StringBuffer out = new StringBuffer();
        for (int i = 0; i < str.toString().length(); i++) {
            char c = str.charAt(i);
            if (String.valueOf(c).equals(" ")) {
                out.append("%20");
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }
}
