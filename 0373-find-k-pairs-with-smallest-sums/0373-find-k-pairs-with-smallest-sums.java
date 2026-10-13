// class Solution {
//     public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
//     }
// }

class Pair implements Comparable<Pair> {
    int i, j, sum;

    Pair(int i, int j, int sum) {
        this.i = i;
        this.j = j;
        this.sum = sum;
    }

    public int compareTo(Pair p) {
        return Integer.compare(this.sum, p.sum);
    }
}

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        if (nums1.length == 0 || nums2.length == 0 || k == 0)
            return ans;

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < nums1.length && i < k; i++) {
            pq.add(new Pair(i, 0, nums1[i] + nums2[0]));
        }

        while (k > 0 && !pq.isEmpty()) {
            Pair p = pq.remove();

            List<Integer> temp = new ArrayList<>();
            temp.add(nums1[p.i]);
            temp.add(nums2[p.j]);
            ans.add(temp);

            int j = p.j + 1;

            if (j < nums2.length) {
                pq.add(new Pair(p.i, j, nums1[p.i] + nums2[j]));
            }

            k--;
        }

        return ans;
    }
}