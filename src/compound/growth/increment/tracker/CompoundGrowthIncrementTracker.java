package compound.growth.increment.tracker;

public class CompoundGrowthIncrementTracker {
    public static void main(String[] args) {
        
        double balance = 1000;
        
        System.out.println("Initial Blance" + balance);
        
        balance += 500;
        
        System.out.println("After adding 500: " + balance);
        
        balance *= 1.20;
        System.out.println("After 20% growth" + balance);
        
        balance += 200;
        System.out.println("After adding 200" + balance);
        
        int count = 5;
        
        System.out.println("\nPostfix Increment");
        System.out.println(count++);
        System.out.println(count);
        
        System.out.println("\nPrefix Increment");
        System.out.println(count++);
        System.out.println(count);
        
    }
    
}
