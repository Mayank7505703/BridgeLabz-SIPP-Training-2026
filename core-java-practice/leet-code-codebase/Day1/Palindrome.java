package Day1;

public class Palindrome {
  public static boolean check(int n ){
    String s= String.valueOf(n);
    int start=0;
    int end =s.length()-1;
    while(start<end){
      if(s.charAt(start)!=s.charAt(end)){
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
  public static void main(String[] args) {
    int n= 121;
    System.out.println(check(n));
  }
}
