import java.util.Stack;

/**
 * The website for this problem is: https://leetcode.com/problems/palindrome-number/
 */
class Solution {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.isPalindrome(23));
  }

  public boolean isPalindrome(int x) {
    Stack stack = new Stack();

    // Turn the integer into a String
    String intString = String.valueOf(x);

    // Add the values of the integer up to the halfway point
    int halfwayPoint = 
  }
}