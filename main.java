import java.util.Scanner;

public class ThisIsTheThirdAssignment {
    public static void main(String[] args) {
   
        Scanner jedi = new Scanner(System.in);
        
        System.out.println("Investment Amount: ");
        double invest = jedi.nextDouble();
        
        System.out.println("What is your annual interest rate in decimal form?");
        double aninterest = jedi.nextDouble();
        
        System.out.println("How many years are you investing?");
        double years = jedi.nextDouble();

      double monthlyinterestrate = aninterest/12;
      double middle = 1 + monthlyinterestrate;
      double newyears = years * 12;
      double square = Math.pow(middle, newyears);
            
      System.out.println(invest * square);
        
}}
