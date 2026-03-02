package arrays;
//Find average of array elements.
public class arrays5 {
    public static void main(String[] args) {
    int []nums={61,6549,619,564,5419,519,51,544,54,57,87,21};
    int sum=0;

    for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
    }
    int average=sum/nums.length;
        System.out.println("the average of the array is "+average);
    }
}
