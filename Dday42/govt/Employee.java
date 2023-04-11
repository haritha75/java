package govt;


public class Employee {
    public static void main(String[] args) {
       govt.contract.Employee e=new govt.contract.Employee();//here without importing package but its working because we are mention package name with class name and creating object.
    e.age();
    govt.parment.Employee p=new govt.parment.Employee();
    p.age();
        
    }
    
    
    
}
