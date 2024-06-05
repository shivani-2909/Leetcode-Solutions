class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        
        // Initialize the result list
        List<List<Integer>> result = new ArrayList<>();
        
        // Add the first row
        result.add(Arrays.asList(1));
        
        // Generate rows from 1 to numRows - 1
        for (int rowIndex = 1; rowIndex < numRows; rowIndex++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = result.get(rowIndex - 1);
            
            // First element is always 1
            row.add(1);
            
            // Fill in the middle elements
            for (int j = 1; j < rowIndex; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // Last element is always 1
            row.add(1);
            
            // Add the row to the result
            result.add(row);
        }
        
        return result;
    
    }
}