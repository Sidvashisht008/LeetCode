class Solution {
    public int dayOfYear(String date) {
	    String[] split = date.split("-");
	    int y = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]); 
        int d =Integer.parseInt(split[2]);
        int result = d;
	    int[] daysInMonth = new int[] 
        {31, (y%100 !=0 || y%400 ==0) && y%4==0 ? 29 :28,31,30,31,30,31,31,30,31,30,31};
	    for(int i=0;i<m-1;i++){
            result+=daysInMonth[i];
        } 
	    return  result;
    }
}
