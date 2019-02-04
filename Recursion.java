import java.util.ArrayList;

public class Recursion{


  public static double sqrt(double n, double tolerance){
    if (n == 0) return 0;
    return sqrtH(n, tolerance, 1);
  }


  public static double sqrtH(double n, double tolerance, double guess){
    if( Math.abs((n - guess*guess )) / n < (tolerance/100) ){
      return guess;
    }
    else{
      //System.out.println(guess);
      double newGuess =  ( n / guess + guess) / 2;
      return sqrtH(n, tolerance, newGuess);
    }
  }



/*  public static int fib(int n){     //Isn't recursion//
    int ary[] = new int[n+2];
    ary[0] = 0;
    ary[1] = 1;
    for (int i = 2; i <= n; i++){
      ary[i] = ary[i-1] + ary[i-2];
    }
    return ary[n];
    }
*/

  public static int fib(int n){
    if (n == 0) return 0;
    else if (n == 1) return 1;
    else{
      return fib (n-1) + fib (n-2);
    }
  }

  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> sums = new ArrayList<Integer>();
    makeAllSumsH(sums, n, 0);
    return sums;
  }

  public static void makeAllSumsH(ArrayList<Integer> sums, int n, int current){
    if (n == 0){
      sums.add(current);
    }
    else{
      makeAllSumsH(sums, n-1, current+n);
      makeAllSumsH(sums, n-1, current);
    }


  }

  /*public static void main(String[] args){
    String s = args[0];
    int n = Integer.parseInt(args[1]);


    if (s.equals("sqrt")){
    System.out.println(Sqrt(n, 0.001));
    }

    else if(s.equals("fib")){
      System.out.println(fib(n));
    }

    else if(s.equals("mas")){
      System.out.println(makeAllSums(n));
    }
  }
*/
public static void main(String[] args) {
        System.out.println("sqrt()");
        System.out.println("-----------------------\n");

        System.out.println("sqrt(4, 0.00001)");
        System.out.println("EXPECTED: 2");
        System.out.println(sqrt(4, 0.00001));         // 2

        System.out.println("----");

        System.out.println("sqrt(8, 0.00001)");
        System.out.println("EXPECTED: ~2.8284");
        System.out.println(sqrt(8, 0.00001));         // ~2.8284

        System.out.println("----");

        System.out.println("sqrt(0, 0.00001)");
        System.out.println("EXPECTED: 0");
        System.out.println(sqrt(0, 0.00001));         // 0

        System.out.println("\n");

        System.out.println("fib()");
        System.out.println("-----------------------\n");

        System.out.println("fib(0)");
        System.out.println("EXPECTED: 0");
        System.out.println(fib(0));                   // 0

        System.out.println("----");

        System.out.println("fib(1)");
        System.out.println("EXPECTED: 1");
        System.out.println(fib(1));                   // 1

        System.out.println("----");

        System.out.println("fib(7)");
        System.out.println("EXPECTED: 13");
        System.out.println(fib(7));                   // 13

        System.out.println("makeAllSums()");
        System.out.println("-----------------------\n");

        System.out.println("makeAllSums(0)");
        System.out.println("EXPECTED: [0]");
        System.out.println(makeAllSums(0));           // [0]

        System.out.println("----");

        System.out.println("makeAllSums(1)");
        System.out.println("EXPECTED: [1, 0]");
        System.out.println(makeAllSums(1));           // [1, 0]

        System.out.println("----");

        System.out.println("makeAllSums(3)");
        System.out.println("EXPECTED: [0, 3, 2, 5, 1, 4, 3, 6]");
        System.out.println(makeAllSums(3));           // [0, 3, 2, 5, 1, 4, 3, 6]
}

}
