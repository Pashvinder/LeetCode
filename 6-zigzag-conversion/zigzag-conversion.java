class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        boolean goingDown = true;
        int currentRow = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            rows[currentRow].append(c);

            if (currentRow == numRows - 1)
                goingDown = false;
            else if (currentRow == 0)
                goingDown = true;

            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(rows[i]);
        }
        return res.toString();
    }
}