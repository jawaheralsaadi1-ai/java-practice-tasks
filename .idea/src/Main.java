public class Main {
    static void main(String[] args) {
        //task 1
        System.out.println("Task 1:" + cigarParty(50, false));
        //task 2
        System.out.println("Task 2:" + caughtSpeeding(65, true));
        //task 3
        System.out.println("Task 3: " + love6(1,5) );
        //task 4
        System.out.println("Task 4: " + more20(22) );
        System.out.println("Task 5: " + nearTen(17));
    }

    //Task 1:  cigarParty
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) return cigars >= 40;
        return (cigars >= 40 && cigars <= 60);
    }

    //Task 2: caughtSpeeding
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int limit1 = 60;
        int limit2 = 80;
        if (isBirthday) {
            limit1 = 65;
            limit2 = 85;
        }
        if (speed <= limit1) {
            return 0;
        }
        if (speed <= limit2) {
            return 1;
        }
        return 2;
    }

    // Task3 : love6
    public static boolean love6(int a , int b){
        return ( a == 6 || b == 6 || a + b == 6 || a - b == 6);

    }
    // Task4 : more20
    public static boolean more20(int n){
        return (n % 20 ==1  || n % 20 == 2);
    }
    // Task5: nearTen
    public static boolean nearTen (int num){
        return (num % 10 <= 2 || num % 10 >= 8 );

    }
}