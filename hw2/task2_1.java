//Реализуйте алгоритм сортировки пузырьком числового массава, результат после каждой итерации записат  в лог файл

package java.hw2;

import java.io.IOException;
import java.util.logging.*;





public class task2_1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task2_1.class.getName());
        FileHandler fh = new FileHandler("logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int [] array = {2, 5, 1, -7, 3, 64, 0};
        lib.printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        lib.printArrayInt(newArr);
        public static int[] listSort(int [] arr){
            for(int k = 0; k < arr.length-1; k++) {
                
                for (int i = 0; i < arr.length - k-1; i++){
                    if (arr[i] > arr[i+1]) {
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                }
            }
            return arr;
        }
        
    }
}