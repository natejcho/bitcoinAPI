package com.me.bitcoin.bitcoinAPI.easy;


public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] abc = new int[26];
        for (int i=0;i<s.length();i++) {
            abc[s.charAt(i) - 'a']++;
        }
        for (int i=0;i<t.length();i++) {
            abc[t.charAt(i) - 'a']--;
        }
        for (int i=0;i<26;i++) {
            if (abc[i] != 0) return false;
        }
        return true; 
    }
}