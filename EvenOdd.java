class EvenOdd {
    public static void main(String args[]) {
        int a[] = { 1, 2, 5, 6, 3, 2 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println("Even  :" + a[i]);
            }
            if (a[i] % 2 == 0) {
                System.out.println("Odd   :" + a[i]);
            }
        }
    }
}
