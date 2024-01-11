package Javaday2;
import java.util.Arrays;


class secondbn {
    public static void main(String[] args) {
        int[] arr = new int[]{98,32,72,94,75,73,92,36,28,34};
        Arrays.sort(arr);
        int a=arr.length;
        for (int i=0;i<a;i++)
        {
            System.out.println(arr[a-2]);
            break;
        }
        
    }
}
