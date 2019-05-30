package com.hopochuan;

import com.hopochuan.util.CombinationUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: letter_combinations
 * @description:
 * @author: liucc@topband.com.cn
 * @create: 2019-05-29 16:57
 **/
public class Main {

    public static void main(String[] args) {
        int[] digits = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            digits[i] = Integer.valueOf(args[i]);
        }
        System.out.println("Input: arr[] = " + Arrays.asList(args));
        CombinationUtil combinationUtil = new CombinationUtil();
        List<String> reuslt = combinationUtil.combinLetter(digits);
        System.out.println("Output: " + reuslt);
    }
}
