package org.algodaily;

public class ReverseAString {
    public String reverseString(String str) {
        int len = str.length();
        StringBuilder resultStr = new StringBuilder();
        for (int i = len - 1; i >= 0; i--)
            resultStr.append(str.charAt(i));
        return resultStr.toString();
    }

    public String reverseString1(String str) {
        if(str.isEmpty())
            return "";
        return str.charAt(str.length()-1)+reverseString(str.substring(0, str.length()-1));
    }
}
