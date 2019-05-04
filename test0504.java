/*
统计所有小于非负整数 n 的质数的数量。

示例:

输入: 10
输出: 4
解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。

*/

package lianxi0504;

public class test0504 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 20;
        int a = s.countPrimes(n);
        System.out.println(a);
    }
}

class Solution {
    public int countPrimes(int n) {
        int count = 0;
        int[] arr = new int[n+1];
        for(int i = 2;i<n;i++){
            int a = 2;
            for(int j = a*i;j< arr.length;j=i*(++a)){
                if(j<arr.length){
                    arr[j] = 1;
                }
            }
        }
        for(int i= 2; i < n;i++){
            if(arr[i] == 0){
                count ++;
            }
        }
        return count;
    }
}