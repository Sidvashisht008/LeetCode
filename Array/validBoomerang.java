class Solution {
    public boolean isBoomerang(int[][] points) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for(int[] a:points){
            x.add(a[0]);
            y.add(a[1]);
        }
        return x.get(0)*(y.get(1)-y.get(2)) + x.get(1)*(y.get(2)-y.get(0))+x.get(2)*(y.get(0)-y.get(1))!=0;
    }
}
