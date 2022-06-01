public class IfJava {
    public static void main(String[] args){
        System.out.println("Script Started");
        if (true) {
            System.out.println("Hello!");
        }
        
        int age = 20;
        if (age >= 21) {
            System.out.println("You're at least 21 years old!");
        } else if (age >= 18) { 
            System.out.println("You're at least 18 years old!");
        } else { //if no other condition is met
            System.out.println("You're under 18 years old!");
        }
    }
}
