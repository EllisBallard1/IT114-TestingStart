public class SwitchFlow {
    public static void main(String[] args) {
        int age = 21;
        switch (age) {
            case 21:
                System.out.println("You are 21");
                //break;
                //not the missing break statement, makes the output 21 AND 18
            case 18:
                System.out.println("You are 18");
                break;
            
            default:
                System.out.println("Sorry, the data was a poor example so we can only accept 18 or 21");
                break;
        }
    }
}
