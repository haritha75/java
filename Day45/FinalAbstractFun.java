public class FinalAbstractFun {
    Rock r=new Rock();
    r.deposit();
    
}
abstract class  Mock{
    
   final void deposit(){
        System.out.println("deposit form");
    }
}
class Rock extends Mock{
    void deposit(){//its final method not overriding 
        System.out.println("its final functions not changed once assigning");
    }
}