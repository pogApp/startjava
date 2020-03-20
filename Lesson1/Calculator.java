public class Calculator{
    public static void main(String[] args) {
      int a = 3;
      int b = 6;
      String zn = "%";
      int res = 1;
      if (zn == "+") {
        System.out.println ("Result = "+(a+b));
      }
      if (zn == "-") {
        System.out.println ("Result = "+(a-b));
      }
      if (zn == "*") {
        System.out.println ("Result = "+(a*b));
      }
      if (zn == "/") {
        System.out.println ("Result = "+(double) a / b);
      }
      if (zn == "^"){
        for (int i=1;i<=b;i++){
          res = res*a;
        }
        System.out.println ("Result = "+res);
      }
      if (zn == "%"){
        System.out.println ("Result = "+(res));
      }
    }
} 