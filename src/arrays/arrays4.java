package arrays;
//find the smallest and largest no in a array
public class arrays4 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9};
        int large=nums[0];
        int small=nums[0];
        for(int i=0;i<nums.length;i++){
           if(nums[i]>large) large=nums[i];
           if(nums[i]<small) small=nums[i];
        }

        System.out.println("The smallest no in the array is "+small);
        System.out.println("The largest no in the array is "+large);
    }
}
