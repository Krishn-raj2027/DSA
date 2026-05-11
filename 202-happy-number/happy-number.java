class Solution {
    // Helper function to compute sum of squares of digits
    private int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);                 // move 1 step
            fast = sumOfSquares(sumOfSquares(fast));   // move 2 steps
        } while (slow != fast);

        return fast == 1;
    }
}
