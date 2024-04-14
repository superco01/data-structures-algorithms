class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> charMap = new HashMap<>() {{
                put('{', '}');
                put('[', ']');
                put('(', ')');
        }};
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