public class RemoveX {

    public static void main(String[] args) {
        String str = "xaxb";
        System.out.println(removeX(str));
    }

    public static String removeX(String str) {

        if(str.length() == 0) {

            return "";
        }
        if(str.charAt(0) == 'x')
            return removeX(str.substring(1));

        return str.charAt(0) + removeX(str.substring(1));
    }
}
