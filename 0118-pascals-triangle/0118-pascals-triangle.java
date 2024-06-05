class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
          result.add(Arrays.asList(1)); //1st row
         
            for(int i =1;i<numRows;i++){ // next rows
                List<Integer> row = new ArrayList<>();
                List<Integer> prevRow = result.get(i-1);
                
                row.add(1); // 1st element
                
                //middle elements
                for(int j =1;j<i;j++){
                    row.add(prevRow.get(j-1)+prevRow.get(j));
                }
                row.add(1); //last Element
                result.add(row);
                }
        
            
        
        return result;
    }
}