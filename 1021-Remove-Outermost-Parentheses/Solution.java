class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                count++;

                if (count > 1) {
                    result.append(ch);
                }

            } else {
                count--;

                if (count > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}