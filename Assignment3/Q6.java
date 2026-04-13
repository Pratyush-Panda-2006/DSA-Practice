class Q6 {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i].equals(item)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Double[] grades = {9.5, 8.0, 7.5, 9.5, 10.0};
        Double target = 9.5;

        int occurrences = count(grades, target);
        System.out.println("The value " + target + " appears " + occurrences + " times.");
    }
}