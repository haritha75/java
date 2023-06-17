public class ToStringUsingEnums {

    public static void main(String[] args) {

        System.out.println(Size3.MEDIUM.toString());


    }
}
enum Size3 {

    SMALL {

        @Override

        public String toString() {
            return "size is small";
        }
    },
    MEDIUM {
        @Override

        public String toString() {
            return "size is medium";
        }
    },
    LARGE{

        @Override
        public String toString() {
            return "size is large";
        }
    }

}