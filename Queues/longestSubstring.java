class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayDeque<Character> q = new ArrayDeque<>();
        int longest = 0;
        int current = 0;
        int cutIndex;
        char c;
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            if(q.contains(c)){
                while(q.remove()!=c){
                    current--;
                }
                q.add(c);
            } else {
                q.add(c);
                current++;
                if(current>longest){
                    longest = current;
                }
            }
        }
        return longest;
    }
}
