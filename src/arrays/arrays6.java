package arrays;
//Count even and odd numbers in array.
public class arrays6 {
    public static void main(String[] args) {
        int []nums={61,6549,619,564,5419,519,51,544,54,57,87,21};
        int even=0;
        int odd=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]%2==0)  even++;
            else odd++;

        }
        System.out.println("No of even elements are: "+even);
        System.out.println("No of even elements odd: "+odd);
    }
}
