public class Largest {

    public static int Largest(int nums[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >Largest){
                Largest=nums[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12,14};
        int ans=Largest(nums);

        System.out.println("The largest number in the array is " + ans);
    }
}
