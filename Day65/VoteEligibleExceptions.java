public class VoteEligibleExceptions {
    
    public static void main(String[] args) {

        
        Vote v = new Vote();

           try {
            v.setAge(17);
            System.out.println("you are eligible to vote");
           }
           catch(VoteEligibleException e) {

               System.out.println(e);
           }


    }
    
}
class Vote {

    private int age;

    public int getAge() {

        return age;
    }

    public void setAge(int a) throws VoteEligibleException {

        if(a < 18) {
            throw new VoteEligibleException("you are not eligible");
        }
        this.age = a;
    }
}
class VoteEligibleException extends Exception {

    public VoteEligibleException(String b) {

        super(b);
    }
}
