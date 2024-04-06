class Solution {
    public boolean isValid(String s) {
        char[] closingParentheses = new char[128];
        closingParentheses[')'] = '(';
        closingParentheses[']'] = '[';
        closingParentheses['}'] = '{';

        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (closingParentheses[ch] == 0) {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || stack.pop() != closingParentheses[ch]) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}