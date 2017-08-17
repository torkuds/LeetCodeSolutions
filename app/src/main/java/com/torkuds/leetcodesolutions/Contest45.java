package com.torkuds.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Des:LeetCode Weekly Contest 45 August 13, 2017, 09:30
 * Created by wangtianchao
 * on 2017/8/17.
 */

public class Contest45 {
    public static void main(String[] args){

    }

    /**
     *  657. Judge Route Circle
     *  Initially, there is a Robot at position (0, 0). Given a sequence of its moves,
     *  judge if this robot makes a circle, which means it moves back to the original place.
     *  The move sequence is represented by a string.
     *  And each move is represent by a character.
     *  The valid robot moves are R (Right), L (Left), U (Up) and D (down).
     *  The output should be true or false representing whether the robot makes a circle.
     *  Example 1:
     *  Input: "UD"
     *  Output: true
     *  Example 2:
     *  Input: "LL"
     *  Output: false
     * @param moves
     * @return
     */
    public boolean judgeCircle(String moves) {
        if(moves == null){
            return true;
        }
        int length = moves.length();
        if(length % 2 != 0){
            return false;
        }else{
            int horizontal = 0;
            int vertical = 0;
            for(int i = 0; i < length; i++){
                char ch = moves.charAt(i);
                switch (ch){
                    case 'R':
                        horizontal++;
                        break;
                    case 'L':
                        horizontal--;
                        break;
                    case 'U':
                        vertical++;
                        break;
                    case 'D':
                        vertical--;
                        break;
                }
            }
            if(horizontal == 0 && vertical == 0){
                return true;
            }else{
                return false;
            }
        }
    }

    /**
     * 658. Find K Closest Elements
     * Given a sorted array, two integers k and x, find the k closest elements to x in the array.
     * The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.
     * Example 1:
     *   Input: [1,2,3,4,5], k=4, x=3
     *   Output: [1,2,3,4]
     * Example 2:
     *   Input: [1,2,3,4,5], k=4, x=-1
     *   Output: [1,2,3,4]
     *   思路：
     *   关键点：找出x的index（index小于最小值为-1，大于最大值为arr.length() + 1）
     *   分三种情况：
     *   1、index <= k：取数组前面k个值
     *   2、k < index < arr.length()：取index - k到index
     *   3、index >= arr.length()：取数组后面k个值
     * @param arr
     * @param k
     * @param x
     * @return
     */
    public List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
        List<Integer> result = new ArrayList();
        int index;
        return null;

    }
}
