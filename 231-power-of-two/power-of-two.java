class Solution {
    public boolean isPowerOfTwo(int n) {
        // Step 1: Negative numbers and 0 are not powers of two
        if (n <= 0) return false;

        // Step 2: Keep dividing by 2 while divisible
        while (n % 2 == 0) {
            n /= 2;
        }

        // Step 3: If we end up at 1, it's a power of two
        return n == 1;
    }
}
