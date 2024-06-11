class Sample111 {
    public static void main(String[] args) {
        // Sample inputs
        int floor_val = 11;
        int ceil_val = 9;

        int result = floorCeil(floor_val, ceil_val);
        System.out.println("Value of integer A: " + result);
    }

    public static int floorCeil(int floor_val, int ceil_val) {
        // Calculating A from floor and ceiling values of A/2
        int A = (floor_val + ceil_val) * 2;
        return A;
    }
}
