public class Main {
    static void main(String[] args) {
        //task 1
        System.out.println("Task 1:" + cigarParty(50, false));
        //task 2
        System.out.println("Task 2:" + caughtSpeeding(65, true));
        //task 3
        System.out.println("Task 3: " + love6(1, 5));
        //task 4
        System.out.println("Task 4: " + more20(22));
        System.out.println("Task 5: " + nearTen(17));
        System.out.println("Task 6: " + teaParty(20, 6));
        System.out.println("Task 7: " + twoAsOne(3, 2, 2));
        System.out.println("Task 8: " + lastDigit(23, 19, 13));
        System.out.println("Task 9: " + maxMod5(6, 2));
        System.out.println("Task 10: " + blueTicket(9, 2, 0));
        System.out.println("Task 11: " + dateFashion(5, 5));
        System.out.println("Task 12: " + sortaSum(9, 4));
        System.out.println("Task 13: " + in1To10(11,true));
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
    public static boolean love6(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || a - b == 6);

    }

    // Task4 : more20
    public static boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }

    // Task5: nearTen
    public static boolean nearTen(int num) {
        return (num % 10 <= 2 || num % 10 >= 8);

    }

    //Task6 : teaParty
    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (2 * tea >= candy || 2 * candy >= tea) {
            return 2;
        }

        return 1;
    }

    // Task7 : twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        return (a + b == c || a + c == b || b + c == a);
    }

    //Task8 : lastDigit
    public static boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10);
    }

    //Task9 : maxMod5
    public static int maxMod5(int a, int b) {
        if (a == b) return 0;
        if (a % 5 == b % 5) return Math.min(a, b);
        return Math.max(a, b);
    }
    //Task10 : blueTicket
    public static int blueTicket (int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int cb = c + b;
        if (ab == 10 || ac == 10 || cb == 10) return 10;
        if (ab == 10 + cb || ab == 10 + ac) return 5;
        return 0;
}
//Task 11 : dateFashion
public static int dateFashion (int you, int date) {
     if ( you <= 2 || date <= 2 ) return 0;
     if ( you >= 8 || date >= 8 ) return 2;
     return 1;
}
// Task12 : sortaSum
    public static int sortaSum (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;
    }
// Task13 in1To10
    public static boolean in1To10(int n, boolean outsideMode){
        if (outsideMode) return (n <= 1 || n>= 10) ;
        return (n >= 1 && n <= 10);
    }
}
