public class InitializedBlockWorksLikeScopeVarType {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.hello();
        
    }
    
}

class Dog {

    int x;

    { //initialized block.it written inside the method only.

        int c = 10;
        System.out.println(c);
    }

    void hello() { //here we are written variable scope inside the method so it is not initlalized block but it works same scope of the variable type.where is ends and where is start same it works scope of the variable.

        int g;

        {
            int c = 20;
            System.out.println(c);
        }
    }

}
