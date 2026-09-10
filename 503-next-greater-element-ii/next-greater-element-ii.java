class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int nge[] = new int[arr.length];
        int n = arr.length;

        for (int i = (2 * n) - 1; i >= 0; i--) {
            int current = arr[i % n];
            while (!s.isEmpty() && s.peek() <= current) {
                s.pop();
            }

            if (i < n) {
                if (s.isEmpty()) {
                    nge[i % n] = -1;
                } else {
                    nge[i % n] = s.peek();
                }
            }

            s.push(current);
        }

        return nge;
    }
}