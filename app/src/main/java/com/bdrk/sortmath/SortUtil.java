package com.bdrk.sortmath;

/**
 * Created by 5u51_5 on 2017/2/23.
 */

public class SortUtil {
    /**
     * 冒泡排序
     * @param scores
     * @return
     */
    public static int[] bubbleSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j + 1];
                    scores[j + 1] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        return scores;
    }
}
