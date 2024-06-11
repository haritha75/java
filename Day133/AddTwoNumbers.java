class PrimeOrNot {
    public static void main(String[] args) {


        int n = 11;
        boolean res = prime(n);
        System.out.println(res);

    }
    public static boolean prime(int n) {

        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }


}
