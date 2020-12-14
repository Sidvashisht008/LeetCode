class Solution {
	public int nthUglyNumber(int n) {

		if(n == 1) return 1;

		PriorityQueue<Long> heap = new PriorityQueue<>();

		int [] prime = {2,3,5};

		heap.offer(1L);

		for(int i = 1; i < n; i++){
			long tmp = heap.poll();
			for(int num: prime){
				long uglyNum = tmp * num;
				if(!heap.contains(uglyNum)){
					heap.offer(uglyNum);
				}
			}
		}
		return heap.poll().intValue();
	}
}
