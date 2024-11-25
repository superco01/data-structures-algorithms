class Solution {
    public char repeatedCharacter(String s) {
        Map map = new HashMap<Character, Boolean>();
        for (char ch : s.toCharArray()) {
            var exist = map.get(ch);
            if (exist == null) {
                map.put(ch, true);
            } else {
                return ch;
            }
        }

        return 0;
    }
}