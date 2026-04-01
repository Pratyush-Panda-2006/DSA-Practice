class Q5 {

    public static <E> void printArray(E[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40};
        String[] strArray = {"Java", "Generics", "ITER"};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(strArray);
    }
}