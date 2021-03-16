package ru.job4j.collection;

public class ForwardArray {

    public static void main(String[] args) {
        ForwardArray array = new ForwardArray();
        array.fillArray();
        String[] testArray = array.revert();
        array.printArray(testArray);
    }

    private String[] myArray = new String[10];

    public void fillArray() {
        myArray[0] = "1";
        myArray[1] = "2";
        myArray[2] = "3";
        myArray[3] = "4";
        myArray[4] = "5";
        myArray[5] = "6";
        myArray[6] = "7";
        myArray[7] = "8";
        myArray[8] = "9";
        myArray[9] = "10";
    }

    public String[] revert() {
        int middleArray = myArray.length / 2;
        for (int index = 0; index < middleArray; index++) {
            String temp = myArray[index];
            int tempIndex = myArray.length - 1 - index;
            myArray[index] = myArray[tempIndex];
            myArray[tempIndex] = temp;
        }

        return myArray;
    }

    public void printArray(String[] array) {
        for (String value : array) {
            System.out.println(value);
        }
    }
}
