class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> res = new ArrayList<>();
        for(int row= 0;row<matrix.length;row++){
            for(int col = 0;col<matrix[0].length;col++){
                res.add(matrix[row][col]);
            }
        }
        Collections.sort(res);
        return res.get(k-1);
    }
}
