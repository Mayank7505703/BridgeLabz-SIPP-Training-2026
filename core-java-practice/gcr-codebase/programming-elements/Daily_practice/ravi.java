public class ravi {
  
    public static void main(String[] args) {
        
        // Store data using correct data types
        String name = "Ravi";
        int age = 22;
        int rank = 5;
        double salary = 50000;
        float membershipFee = 999.99f;

        // Compute annual bonus (12% of salary)
        double bonus = salary * 0.12;

        // Cast bonus to int
        int annualBonus = (int) bonus;

        // Print formatted welcome card
        System.out.println("===== WELCOME CARD =====");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : ₹" + salary);
        System.out.println("Membership Fee : ₹" + membershipFee);
        System.out.println("Annual Bonus   : ₹" + annualBonus);
        System.out.println("========================");
    }
}
