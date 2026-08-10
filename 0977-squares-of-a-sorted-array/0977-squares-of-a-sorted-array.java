class Solution {
    public int[] sortedSquares(int[] nums)
    {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int pos = nums.length - 1;

        while (start <= end)
        {
            int leftSq = nums[start] * nums[start];
            int rightSq = nums[end] * nums[end];

            if (leftSq > rightSq)
            {
                result[pos] = leftSq;
                start++;
            }
            else
            {
                result[pos] = rightSq;
                end--;
            }
            pos--;
        }

        return result;
    }
}