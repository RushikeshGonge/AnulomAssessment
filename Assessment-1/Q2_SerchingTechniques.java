import java.util.Arrays;
import java.util.HashMap;
public class Q2_SerchingTechniques {

    public static int linearSearch(int[] arr, int target) //Time-Complexity: O(n)
    {
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] == target) return i;
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int target) //Time-Complexity: O(log(n))
    {
        //first of all sort the given array

        int[] tempArr = arr;
        Arrays.sort(tempArr);

        int left = 0;
        int right = tempArr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(tempArr[mid] == target) return mid;
            else if(tempArr[mid] < target) left = mid + 1;
            else{
                right = mid - 1;
            }
        
        }

        return -1; //target element is not found in the array
    }

    public static int hashSearch(int arr[], int target) //Time-Complexity: O(n) for building map, for lookup O(1)
    {
        HashMap<Integer, Integer> searchMap = new HashMap<>();
        for(int i = 0;i < arr.length;i++)
        {
            searchMap.put(arr[i], i); //element is put as a key and index of that element is put as a value in the hashmap
        }

        return searchMap.getOrDefault(target, -1);
    }


    public static void main(String[] args) {

        int[] arr = {21, 34, 54, 12, 5, 67};

        int target = 21;
        int index1 = linearSearch(arr, target);
        System.out.println("Element found by using linear search at index : " + index1);

        int index3 = hashSearch(arr, target);
        System.out.println("Element found by using hashMap search at index : " + index3);

        int index2 = binarySearch(arr, target); //binary search works upon sorted array hence the index position of the element may change if the array is not sorted
        System.out.println("Element found by using binary search at index : " + index2);

        
    }
    
}
