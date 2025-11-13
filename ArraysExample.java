import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        int[] numbers2 = {5, 2, 8, 1, 9};
        int[] numbers3 = {1, 2, 5, 8, 9};
        
        // toString - преобразует массив в строку
        System.out.println("toString: " + Arrays.toString(numbers));
        
        // sort - сортирует массив
        Arrays.sort(numbers);
        System.out.println("После sort: " + Arrays.toString(numbers));
        
        // binarySearch - бинарный поиск в отсортированном массиве
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("binarySearch для 8: индекс " + index);
        
        // equals - сравнивает два массива
        boolean areEqual = Arrays.equals(numbers, numbers2);
        System.out.println("equals numbers и numbers2: " + areEqual);
        
        // compare - сравнивает два массива лексикографически 
        int comparison = Arrays.compare(numbers, numbers3);
        System.out.println("compare numbers и numbers3: " + comparison);
    }
}