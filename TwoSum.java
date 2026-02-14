public class TwoSum
{
    public static int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args)
    {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }
}
/* EXPLANATION :
1. We are given an array of numbers and a target value.
2. We check each number with every other number.
3. If the sum of two numbers equals the target, we stop.
4. We return the positions (indexes) of those two numbers.
5. We use two loops to compare all possible pairs.
*/
