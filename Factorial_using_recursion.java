public class Factorial_using_recursion {
    public static void main(String[] args) {
        int n = 5;
        Factorial_using_recursion  f = new Factorial_using_recursion();
        long fact= f.calculator(n);
        System.out.println(fact);
       
  
      }
      public  long calculator(int n)
      {
          if(n == 0 || n == 1)
          {
              return 1;
              
          }
          else
          {
              return n * calculator(n - 1);
          }
      }
      
  
  }
  
    

