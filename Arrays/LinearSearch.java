public class LinearSearch {

    public static int LinearSearch(int nums[],int key){
        for (int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12,14};
        int key=10;
        int ans=LinearSearch(nums,key);

        System.out.println("The key is found at " + ans);

    }
}

// Note :- Here the Time complexity is 0(n)
