
public class StaticVar {
    public static void main(String[] args) {
       System.out.println(NetWorth.a);
       NetWorth.getFamily();
       NetWorth n=new NetWorth();
     n.sellPrice(88);
     n.collegeFee(2);
    }
    
}
class NetWorth{
    static int a=100000;//static vairable belongs class only not object.it will go to the class loaders.
    void capacity(){//belongs to object.
        a-=99;
    }
    void  sellPrice(int price){//it belongs to object.
System.out.println(a+=price);

    }
    static int getFamily(){//belongs to class only.this also go to the class loaders.
        System.out.println("get family details");
        return a;
    }
    void collegeFee(int s){//belongs to object.
        if(s==2)
        System.out.println(a-=20000);
        else if(s==4)
        a-=10000;
        else 
        a-=500;

    }

}
