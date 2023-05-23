//at the same point of time, we cannot have two variables with the same name in same funtion.
public class ScopeVariable {

    public static void main(String[] args) {
        

        {
            int x = 10; //this variable scope will end at closed brackets .whenever end brackets ends that time varible will be removed .and next variable stored .
        }

        int s =10 ;
        {

            int s = 20; //here we are getting error because above variable scope willnot be ended but again we are using same variable.already we have s it will not removed untill s varible scope will be ended.
        }

        {

            int d = 12;
        }
        int d = 20; //it will working because above variable scope will ended at closed bracket then d will be removed and next d will come  and placed.
    }
    
}
