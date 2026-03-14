package arrays;
//Check if array is sorted or not.
public class arrays10 {
    public static void main(String[] args) {

        int []nums1={1,2,3,4,5,6,7,8,9};
        int []nums2={1,2,10,4,5,6,7,8,9};
        boolean isSorted=true;
        for(int i=0;i<nums2.length-1;i++){
            if(nums2[i]<nums2[i+1]){
                 isSorted=true;}
        else{

            System.out.println("Array is not sorted");
            isSorted=false;
            break;
        }

    }
        if(isSorted==true) {
            System.out.println("Array is sorted");
        }

}}
