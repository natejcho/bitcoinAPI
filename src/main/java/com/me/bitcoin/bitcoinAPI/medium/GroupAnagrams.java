package com.me.bitcoin.bitcoinAPI.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.me.bitcoin.bitcoinAPI.easy.ValidAnagram;

public class GroupAnagrams {
    public List<List<String>> mySolution(String[] strs) {
        int n = strs.length;
        List<List<String>> res = new ArrayList<>();
        List<String> first = new ArrayList<>();
        first.add(strs[1]);
        res.add(first);
        for (int i=1;i<n;i++) {
            boolean unique = true;
            for (int j=0;j<res.size();j++) {
                if (ValidAnagram.isAnagram(res.get(j).get(0), strs[i])) {
                    res.get(j).add(strs[i]);
                    unique = false;
                } 
            }
            if (unique) {
                List<String> next = new ArrayList<>();
                next.add(strs[i]);
                res.add(next);
            }
        }
        return res;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}