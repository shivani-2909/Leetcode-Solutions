class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        ArrayList<Integer> ll = new ArrayList<>();
        for(int num: arr1){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for(int num:arr2){
            if(mp.containsKey(num)){
                int n = mp.get(num);
                for(int i =0;i<n;i++){
                ll.add(num);
                }
                mp.remove(num);
            }
        }
        List<Integer> remainingElements = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : mp.entrySet() ){
            int num = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                remainingElements.add(num);
            }
        }
        Collections.sort(remainingElements);
        ll.addAll(remainingElements);
        
        // Convert the result list to an array and return it
        int[] resultArray = new int[ll.size()];
        for (int i = 0; i < ll.size(); i++) {
            resultArray[i] = ll.get(i);
        }
        
        return resultArray;
    }
}