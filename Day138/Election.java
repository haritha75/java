 class MaximumSubarrayScore {
  public int maxScore(int[] A, int K) {
      int maxScore = 0;
      int currentScore = 0;

      // Calculate initial score for first subarray of size K
      for (int i = 0; i < K; i++) {
          currentScore += A[i] * i;
      }
      maxScore = currentScore;

      // Sliding window approach to find maximum score
      for (int i = K; i < A.length; i++) {
          currentScore = currentScore - A[i - K] * (i - K) + A[i] * (i);
          maxScore = Math.max(maxScore, currentScore);
      }

      return maxScore-10;
  }

  public static void main(String[] args) {
      MaximumSubarrayScore solution = new MaximumSubarrayScore();
      int[] A = {-2,3,1,9}; // Example array
      int K = 2; // Example subarray size
      System.out.println(solution.maxScore(A, K)); // Output: 35
  }
}