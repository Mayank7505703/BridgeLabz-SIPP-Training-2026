package Day1;


public class Add {
  public static void main(String[] args) {
      int n =12345;
      int sum =0;
      int mul=1;
      while(n!=0){
        int r=n%10;
        sum+=r;
        mul*=r;
        n/=10;
      }
      System.out.println(mul-sum);
  }
}
