package com.jc.demo.comtroller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author geng
 * @data 2019/5/30/20:08
 */
public class EmailUtil {
    // 随机验证码
    public String achieveCode() {  //由于数字1 和0 和字母 O,l 有时分不清，所有，没有字母1 、0
        String[] beforeShuffle= new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",
                "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a",
                "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z" };
        List list = Arrays.asList(beforeShuffle);//将数组转换为集合
        Collections.shuffle(list);  //打乱集合顺序
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)); //将集合转化为字符串
        }
        return sb.toString().substring(3, 8);  //截取字符串第4到8
//        String a=sb.toString().substring(3, 8);
//        return a;
    }
}
