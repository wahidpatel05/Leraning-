class occurence {
    public static void main(String[] args) {
        int a = 915575;
//        int count=0;
        int rev = 0;
        while (a > 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a /= 10;
        }
        System.out.println(rev);

    }
}