public class Main {
    static void main(String[] args) {
        //task 1
        System.out.println("Task 1:" + cigarParty(50, false));
        //task 2
        System.out.println("Task 2:" + caughtSpeeding(65, true));
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
}