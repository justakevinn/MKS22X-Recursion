public class Recursion{


  public static double Sqrt(double n, double tolerance){
    return SqrtH(n, tolerance, 1);
  }


  public static double SqrtH(double n, double tolerance, double guess){
    if( Math.abs((n - guess*guess )) / n < (tolerance/100) ){
      return guess;
    }
    else{
      //System.out.println(guess);
      double newGuess =  ( n / guess + guess) / 2;
      return SqrtH(n, newGuess);
    }
  }

  public static int fib(int n){

  }

  public static ArrayList<Integer> makeAllSums(){

  }

  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println(Sqrt(n));
    }


}
