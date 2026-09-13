class Solution {
    public String firstPalindrome(String[] words) {
        boolean isPalindrome = true;
        
        for (int i = 0; i < words.length; i++) {
            int x = 0;
            int y = words[i].length() - 1;

            if(words[i].length() == 1){
                return words[i];
            }
            while (x < y) {
                if (words[i].charAt(x) != words[i].charAt(y)) {
                    break;
                } else {
                    x++;
                    y--;
                }

                if(x>=y){
                    return words[i];
                }
            }

        }

        return "";




    }
}