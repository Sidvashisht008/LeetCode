class Solution {
    public List<Integer> getRow(int rowIndex) {       
        List<Integer> result = new ArrayList<Integer>();
        helper(rowIndex, result);        
        return result;
    }    
    public List<Integer> helper (int rowIndex, List<Integer> list){
         list.add(1);
    	if(list.size() == rowIndex + 1)
    		return list; 
    	List<Integer> temp = new ArrayList<Integer>(list);
    	for (int i = 1; i < temp.size(); i++) 
			list.set(i, temp.get(i) + temp.get(i - 1));
    	return helper(rowIndex, list);
    }
}
