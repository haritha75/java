public class InitializedBlockAndScopeMethod {

    public static void main(String[] args) {

        Mock  m = new Mock();
        m.nock();
        

    }
}

class Mock {

    void nock() {

        System.out.println("hello guys!");
        {

            System.out.println("where are you");
        }

    }

    {

        System.out.println("initilized block");
    }
}