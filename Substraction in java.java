 class calc{
        int num1;
        int num2;
        int substraction(){
        
            int x = num1 - num2;
            return x;
            
        }
        void getData(int x, int y){
            num1 = x;
            num2 = y;
        }
        
        
    }

 public class Main {
   public static void main(String args[]){
       calc myObj = new calc();
       myObj.getData(43 ,5);
       
       int x= myObj.substraction();
       System.out.println(x);
   }
}
