class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls[]=new int [nums.length];
        int rs[]=new int [nums.length];
        int ans[]=new int [nums.length];
        ls[0]=0;
        rs[nums.length-1]=0;
        for(int i=0,j=nums.length-1;i<nums.length-1;i++,j--)
        {
            ls[i+1]=ls[i]+nums[i];
            rs[j-1]=rs[j]+nums[j];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(ls[i]-rs[i]<0)
            {
                ans[i]=(ls[i]-rs[i])*-1;
            }
            else
                ans[i]=ls[i]-rs[i];
        }
        return ans;
    }
}