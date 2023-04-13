package govt;


public class Employee {
    public static void main(String[] args) {
       //govt.contract.Employee e=new govt.contract.Employee();//here without importing package but its working because we are mention package name with class name and creating object.
   govt.contract.Employee.age();//here without creating object we just calling function with package and class name.without import package.
    govt.parment.Employee p=new govt.parment.Employee();
    p.age();
        
    }
    
    
    
}
