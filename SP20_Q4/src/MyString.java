/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class MyString implements IString {

    // Tính tổng các even digits
    @Override
    public int f1(String str) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c) && (c - '0') % 2 == 0) { // "13579".cotains(str.charAt(i) + ""
                sum += c - '0';                                // sum += Integer.parseInt(str.charAt(i)+"";
                count ++;                                       // prime: "2357".cotains(str.charAt(i) + ""
            }
        }
        return sum;
    }

    // Remove even digits
    @Override
    public String f2(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (!(Character.isDigit(c) && (c - '0') % 2 == 0)) {
            result += c;
        }
    }
    return result;
    
//  -----StringBuilder-----
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (!(Character.isDigit(c) && (c - '0') % 2 == 0)) {
//                result.append(c);
//            }
//        }
//        return result.toString();
    }
}
