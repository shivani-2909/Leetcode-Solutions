class Solution {
    public String convertToTitle(int cNum) {
        StringBuilder res = new StringBuilder();
        while(cNum > 0){
            cNum--; 
         
            int letterDistFromA = cNum % 26;
            
            cNum /= 26;
            
            res.append((char)('A' + letterDistFromA));
        }
        res.reverse();
        
        return res.toString();
    }
}