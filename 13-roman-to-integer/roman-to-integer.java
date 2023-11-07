class Solution {
    public int romanToInt(String s) {
        
         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        
        int result = 0;
        int prevValue = 0; // To keep track of the previous numeral's value
        
        // Iterate through the input string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = map.get(s.charAt(i));
            
            if (currentValue < prevValue) {
                // If the current numeral is smaller than the previous, subtract it
                result -= currentValue;
            } else {
                // Otherwise, add it to the result
                result += currentValue;
            }
            
            prevValue = currentValue;
        }return result;

    }
}
