class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26]; // your "count" concept

        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // count from s
            count[t.charAt(i) - 'a']--; // subtract from t
        }

        for(int i = 0; i < 26; i++) {
            if(count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}