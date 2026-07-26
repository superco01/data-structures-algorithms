class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 || s.length() != t.length()) {
            return false;
        }

        var map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}