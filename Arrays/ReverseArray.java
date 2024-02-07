public class ReverseArray {

    public static void ReverseArray(int nums[]){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;

        }
    }
    public static void PrintArray(int nums[]){
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i] +" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        ReverseArray(nums);
        PrintArray(nums);

    }
}
