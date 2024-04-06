class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> charMap = Map.of(
                '{', '}',
                '[', ']',
                '(', ')');
        Deque<Character> stack = new ArrayDeque<>();
        for (Character ch : s.toCharArray()) {
            if (stack.isEmpty() || charMap.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (charMap.get(stack.peek()) == ch) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}