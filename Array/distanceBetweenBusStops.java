class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int d1 = 0;
        if(start>destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        for(int i = start;i<destination;i++){
            d1 += distance[i];
        }
        int d2 = 0;
        for(int i = destination;i%distance.length!=start;i++){
            i = i%distance.length;
            d2+=distance[i];
        }
        return Math.min(d1,d2);
    }
}
