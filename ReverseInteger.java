class Solution {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.reverse(241));
  }
  
  public int reverse(int x) {

    // Test if the value is negative
    boolean isNegative = false;
    if (x < 0) {
      isNegative = true;
    }
      
    // Convert to string
    String intString = String.valueOf(x);

    // Setup the return string with room for a negative if needed
    char[] returnCharArr = new char[intString.length()];

    // Remove the negative value if it is there, and put in a negative if needed
    if (isNegative) {
      intString = intString.substring(1);
      returnCharArr[0] = '-';
    }

    // Loop through the values and reverse them.
    for (int i = 0; i < intString.length(); i++) {
      if (isNegative) {
        returnCharArr[i + 1] = intString.charAt(intString.length() - (i + 1));
      } else {
        returnCharArr[i] = intString.charAt(intString.length() - (i + 1));
      }
    }

    // Convert the Char array into a String
    String returnString = new String(returnCharArr);

    // Convert the string back to an integer. 
    int returnInt = Integer.parseInt(returnString);

    return returnInt;
  }
}