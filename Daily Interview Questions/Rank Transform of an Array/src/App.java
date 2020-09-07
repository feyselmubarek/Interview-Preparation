public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        for(int i = 0; i < arr.length; i++){
            heap.add(new int[]{arr[i], i});
        }
        
        int[] result = new int[arr.length];
        int lastVal = Integer.MIN_VALUE;
        int lastRank = 0;
        
        while(!heap.isEmpty()){
            int[] curr = heap.poll();
            int rank = curr[0] == lastVal ? lastRank : lastRank + 1;
            result[curr[1]] = rank;
            lastRank = rank;
            lastVal = curr[0];
        }
        
        return result;
    }
}
