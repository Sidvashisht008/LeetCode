class Solution {
    public String dayOfTheWeek(int d, int m, int y) {
        String s[] = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
        y -= (m < 3) ? 1 : 0; 
        int day = ( y + y/4 - y/100 + y/400 + a[m-1] + d) % 7;
        return s[day];
    }
}
