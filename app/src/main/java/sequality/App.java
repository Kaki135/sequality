/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Calculate calc =new Calculate();
        double a=calc.sum(2,3);
        double b=calc.sum2(1,10);
        System.out.println(new App().getGreeting());
        System.out.println("Sum of 2 and 3 is"+calc.sum(2,3)+".Average is "+ a/2 +".\n");
        System.out.println("Sum of 1 and 10 is"+calc.sum2(1,10)+".Average is "+ b/10+".\n");
        System.out.println("Sum of odd of 1 to 10 is"+calc.sumodd(1,10)+".Average is "+ calc.sumeven(1,10)+".\n");
    }
}
