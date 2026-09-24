class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        char c = '0';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch - 97]++;

            while (!q.isEmpty() && freq[q.peek() - 97] != 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.println("-1 ");
                c='0';
            } else {
                System.out.println(q.peek() + " ");
                c = q.peek();
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                return i;
            } 
        }

        return -1;
    }
}