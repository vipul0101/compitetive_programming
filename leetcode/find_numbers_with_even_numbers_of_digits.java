package leetcode;
//https:leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class find_numbers_with_even_numbers_of_digits {
    public static void main(String[] args) {
        int [] arr = {23,536,88,744,88,8956,54};
        int ans = findnumbers(arr);
        System.out.println(ans);
        System.out.println(digits(-0));
    }
    static int findnumbers(int[]nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
/*
        if(digits(num)%2 == 0){
            return true;
        }
        return false;
*/
        return digits(num) % 2 == 0;
    }
    static int digits(int num){
        if(num<0){
            num = num* -1;
        }
        if(num ==0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
