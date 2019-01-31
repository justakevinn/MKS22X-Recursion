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
      return SqrtH(n, tolerance, newGuess);
    }
  }

  public static int fib(int n){
    if (n <= 1) return 1;
    return fibH(n, 0, 0);
  }

  public static int fibH(int n, int, current, int sum){
    newSum = sum + fib(n-1) + fib(n-2);
    if (current <= n ){
      return newSum
    }
    return fibH(n, current + 1, newSum;)
  }


//  public static ArrayList<Integer> makeAllSums(){

//  }

  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println(Sqrt(n,0.001));
    }


}
