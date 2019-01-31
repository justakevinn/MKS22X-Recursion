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
    int ary[] = new int[];
    f[0] = 0;
    f[1] = 1;
    for (int i = 2; i <= n; i++)
    {
        f[i] = f[i-1] + f[i-2];
    }
    return f[n];
    }
  }


//  public static ArrayList<Integer> makeAllSums(){

//  }

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
