class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }

        int count = 0;
        if (stack.isEmpty()) {
            return count;
        } else {
            while (!stack.isEmpty()) {
                stack.pop();
                count++;
            }
        }

        return count;

    }
}
