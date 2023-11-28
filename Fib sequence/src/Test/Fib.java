package Test;

public class Fib {
    int next ;
    public boolean Fibonnaci(int first, int second){
        for (int i = 0 ; i< 10; i++){
          if (i<2){
              System.out.println(i);

          }
          else {
              next= first + second;
              first = second;
              second = next;
              System.out.println(next);

          }

        }
        return next == 34;
    }
}
