public class HCFAndLCM {

  public static void main(String[] args) {
    System.out.println(hcf(10,40));
    System.out.println(lcm(10, 40));
    Fraction(4, 8);
    frac1(4, 8);

    
  }
  public static int hcf(int n1,int n2) {
    int rem =1;
    for(int i=2;i<=Math.min(n1,n2);i++) {
      if((n1%i)==0 && (n2%i)==0)
        rem = i;
    }
    return rem;
  }
  public static  void frac1(int numerator,int denominator) {
    int gcd = 1;
    int min = Math.min(numerator,denominator);
    for (int i=min;i>=1;i--) {
        if(numerator%i==0 && denominator%i==0) {
            gcd=i;
            break;
        }
    }
    numerator /= gcd; // numerator = numerator/gcd
    denominator /= gcd;
    System.out.println(numerator+"/"+denominator);
}

  public static int lcmOfNumbers(int denm1,int denm2) {

    int lcm = Math.max(denm1, denm2);

    while (true) {
        if (lcm % denm1 == 0 && lcm % denm2 == 0) {
            return lcm;
        }
        ++lcm;
    }

}
  public static int lcm(int n1,int n2) {
    return (n1*n2)/hcf(n1, n2);
  }
  public static  void Fraction(int nu,int de) {
    if(de==0)
      throw new IllegalArgumentException();
    int hcf = hcf(nu, de);
    nu /=hcf;
    de /=hcf;
    System.out.println(nu+"/"+de);  
  }
  
}
