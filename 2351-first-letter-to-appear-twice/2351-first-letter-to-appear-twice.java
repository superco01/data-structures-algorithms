class Solution {
    public char repeatedCharacter(String s) {
        Map map = new HashMap<Character, Integer>();
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == null) {
                map.put(ch, 0);
            } else {
                return ch;
            }
        }

        return 0;
    }
}