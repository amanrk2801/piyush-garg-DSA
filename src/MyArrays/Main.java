package MyArrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Primitive
        // Arrays are static in nature
        /*
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[3] = 3;

        System.out.println(arr);
         */
        /*
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
         */
        /*
        MyArray arr = new MyArray(15);
        arr.insert(1);
        arr.insert(2);
        arr.insert(-1);
        arr.insert(4);
        arr.insert(5);

//        arr.removeAt(6);

        System.out.println(arr);
        System.out.println(arr.max());
        System.out.println(arr.min());
         */

        /*
        int[] arr = new int[]{1,2,3,4,5};
        MyArray newArr = new MyArray(arr.length);

        for (int i = arr.length-1; i>=0; i--){
            newArr.insert(arr[i]);
        }
        System.out.println(newArr);
         */

        MyArray arr = new MyArray(2);
        for(int i=1; i<6; i++){
            arr.insert(i);
        }
        System.out.println(arr);
        arr.reverse();
        System.out.println(arr);
    }
}

/*
Notes:
int[] arr = new int[5]
int -> 4bytes
4bytes * 5 = 20 bytes

Why array start with 0 index?
int arr -> 1000
arr[0] -> arr + (0*size)
arr[1] -> arr + (1*size)

arr[0] -> 1000 + (0*4) = 1000
arr[1] -> 1000 + (1*4) = 1004
arr[3] = 20
arr[3] -> 1000 * (3*4) = 1012

*/
