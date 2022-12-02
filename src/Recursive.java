public class Recursive {

    public static int sumArray(int[] array, int arraySize){

        if (arraySize == 0){
            return array[arraySize];
        }

        return array[arraySize - 1] = array[arraySize] + sumArray(array, arraySize - 1);
    }

    public static int maxComumFactor(int num1, int num2){

        if (num2 == 0){
            return num1;
        }

        return maxComumFactor(num2, num1%num2);
    }

    public static int maxNumb(int[] array, int arraySize){
        if (arraySize == 1){
            return array[0];
        }

        if (array[0] < array[arraySize-1]){
            array[0] = array[arraySize-1];
            return maxNumb(array, arraySize - 1);
        }

        return maxNumb(array, arraySize - 1);
    }


}
