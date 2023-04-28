package leetCode;

import java.util.HashMap;

/**
 * @Author Administrator
 * @Date 2023/3/19 23:14
 * @Version 1.0
 * Desc:
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class L1TwoSum {
    public static void main(String[] args) {
      int[]  nums = {2,7,11,15};
        int target = 26;
        int[] ints = twoSum(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public  static  int[] twoSum(int[] nums, int target) {
        int[] res =  new int[2];
        HashMap<Integer,Integer>  hm =  new HashMap();

        for (int i = 0; i < nums.length; i++) {
            //要寻找的第二个值
            int n2 = target - nums[i];
            if ( hm.get(n2) == null ){
                //根据数字放入key,对应数据索引放入value中
                hm.put(nums[i],i);
            }else {
                 res[0] = i ;
                 res[1] =hm.get(n2);
            }
        }

    return res ;

    }
}
