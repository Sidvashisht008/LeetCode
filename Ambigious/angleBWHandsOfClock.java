class Solution {
    public double angleClock(int hour, int minutes) {
        
        double hDeg = (hour/ 12.0) * 360;
        
        minutes = minutes == 0 ? 60 : minutes;
        double mDeg = (minutes/ 60.0) * 360.0;
        
        double hDeltaDeg = minutes == 60 ? 0 : (0.5 * minutes);
        
        hDeg += hDeltaDeg;
        
        return Math.abs(hDeg - mDeg) > 180.0 ? 360 - Math.abs(hDeg - mDeg) : Math.abs(hDeg - mDeg);   
  
    }
}
