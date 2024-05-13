class Bankai {
    public static void main(String[] args) {
        sum(new int[] { 1, 2, 3 });
    }

    public static void sum(int[] is) {
        int total = 0;
        for (int i : is) {
            total += i;
        }
        System.out.println(total);
    }
}