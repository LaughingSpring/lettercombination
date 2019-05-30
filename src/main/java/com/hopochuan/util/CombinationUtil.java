package com.hopochuan.util;

import java.util.*;

/**
 * @program: letter_combinations
 * @description:
 * @author: liucc@topband.com.cn
 * @create: 2019-05-30 13:24
 **/
public class CombinationUtil {

    private static final String[][] lettersMap = {{},{},{"A","B","C"}, {"D","E","F"}, {"G","H","I"}, {"J","K","L"}, {"M","N","O"}, {"P","Q","R","S"},
            {"T","U","V"}, {"W","X","Y","Z"}};

    public List<String> combinLetter(int[] digits) {
        List<Set<String>> sets = new ArrayList<Set<String>>();
        for (int i = 0; i < digits.length; i++) {
            Set<String> set = new HashSet<>();
            int digit = digits[i];
            String digitStr = String.valueOf(digit);
            char[] digitChar = digitStr.toCharArray();
            for (int j = 0; j < digitChar.length; j++) {
                int index = Integer.parseInt(String.valueOf(digitChar[j]));
                set.addAll(Arrays.asList(lettersMap[index]));
            }
            sets.add(set);
        }
        List<String> result = this.combin(sets);
        List<String> sortResult = new ArrayList<>();
        for (String origin : result
             ) {
            String sort = this.sortString(origin);
            sortResult.add(sort);
        }
        Set<String> set = new HashSet<>();
        set.addAll(sortResult);
        sortResult.clear();
        sortResult.addAll(set);
        Collections.sort(sortResult);

        return sortResult;
    }

    public List<String> combin(List<Set<String>> sets) {
        if (sets == null) {
            return new ArrayList<String>();
        }
        Set<String> result = new HashSet<String>();
        for (Set<String> set : sets
             ) {
            if (result.size() == 0) {
                result.addAll(set);
            } else {
                Set<String> comset = new HashSet<>();
                for (String s : set
                     ) {
                    for (String com : result
                         ) {
                        if (com.indexOf(s)<0) {
                            com += s;
                            comset.add(com);
                        }
                    }
                }
                result.clear();
                result.addAll(comset);
            }
        }
        List<String> list = new ArrayList<String>();
        list.addAll(result);
        return list;
    }

    public String sortString(String origin) {
        char[] chars = origin.toCharArray();
        Arrays.sort(chars);
        return new String(chars).toLowerCase();
    }
}
