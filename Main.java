// Throw an Exception if age is below 18("print access deined ").
// if age is older than 18 print access granted.










class Main{
    static void checkAge(int age) throws ArithmeticException{
        if (age<18){
            throw new ArithmeticException("dained_you must be 18 or 18+ years old");
        }
        else {
            System.out.println("yes done _you are old enough!");
            
        }
        }
            public static void main (String[] args) {
                checkAge(15);
            }
    }
