import java.util.Scanner;

public class ChuckNorrisEncryptsonlyWithZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String str = scanner.nextLine();
        String res="";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String binaryRepresentation = String.format("%7s", Integer.toBinaryString(c)).replace(' ', '0');

            res+=binaryRepresentation;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i=0;
        for(;i<res.length();i++){
            if(res.charAt(i)=='1'){
                int count =0;
                int j = i;
                for (; j < res.length(); j++) {
                    if(res.charAt(j)=='1'){
                        count++;
                    }
                    else {
                        break;
                    }
                }
                i=(j-1);
                stringBuilder.append("0"+" ");
                for (int k = 0; k < count; k++) {
                    stringBuilder.append("0");
                }
                stringBuilder.append(" ");
            }
            else{
                int count =0;
                int j = i;
                for (; j < res.length(); j++) {
                    if(res.charAt(j)=='0'){
                        count++;
                    }
                    else {

                        break;
                    }
                }
                i=(j-1);
                stringBuilder.append("00"+" ");
                for (int k = 0; k < count; k++) {
                    stringBuilder.append("0");
                }
                stringBuilder.append(" ");
            }

        }
        System.out.println("The result:");
        System.out.println(stringBuilder);

    }
}

