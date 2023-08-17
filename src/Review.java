import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Review {
    public static void main(String[] args) {
        int [] arr1 = {2, 3, 4, 5, 6, 7, 8};
        int [] arr2 = {3, 5, 6, 9, 10, 11, 12};

        // To find the elements which are not common

        List<Integer> nonCommonElements = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++){
            boolean isCommon = false;
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    isCommon = true;
                    break;
                }
            }
            if (!isCommon){
                nonCommonElements.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++){
            boolean isCommon = false;
            for (int j = 0; j < arr1.length; j++){
                if (arr2[i] == arr1[j]){
                    isCommon = true;
                    break;
                }
            }
            if (!isCommon){
                nonCommonElements.add(arr2[i]);
            }
        }
        System.out.println("Non Common elements are: " + nonCommonElements);
    }
}
