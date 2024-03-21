#include <iostream>
using namespace std;

void moveNegative(int nums[], int size)
{
    int start = 0;
    for (int i = 0; i < size; i++)
    {
        if (nums[i] < 0)
        {
            swap(nums[i], nums[start]);
            start++;
        }
    }
}

void printing(int nums[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << nums[i] << " ";
    }
}

int main()
{
    int arr[6] = {1, 2, -3, 4, -5, 6};
   
    moveNegative(arr, 6);
    printing(arr, 6);
    return 0;
}
