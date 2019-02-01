import java.util.ArrayList;

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

/*  public static int fib(int n){
    if (n <= 1) return n;
    return fib(n-1) + fib(n-2);
  }
*/

  public static int fib(int n){
    int ary[] = new int[n+2];
    ary[0] = 0;
    ary[1] = 1;
    for (int i = 2; i <= n; i++){
      ary[i] = ary[i-1] + ary[i-2];
    }
    return ary[n];
    }


  public static ArrayList<Integer> makeAllSums(int n){
    return makeAllSumsH(n, 0);
  }

  public static ArrayList<Integer> makeAllSumsH(int n, int current){
    ArrayList<Integer> sums = new ArrayList<Integer>();
    if (n == 0){
      sums.add(current);
    }
    else{
      makeAllSumsH(n-1, current+n);
      makeAllSumsH(n-1, current);
    }
    return sums;


  }

  public static void main(String[] args){
    String s = args[0];
    int n = Integer.parseInt(args[1]);


    if (s.equals("sqrt")){
    System.out.println(Sqrt(n,0.001));
    }

    else if(s.equals("fib")){
      System.out.println(fib(n));
    }
  }


}
