public class Main {
    static void main(String[] args) {
        System.out.println("Task 1:" + cigarParty(50,false));

    }

    //Task :  cigarParty
    public static boolean cigarParty (int cigars, boolean isWeekend) {
        if (isWeekend) return cigars >= 40;
        return (cigars >= 40 && cigars <=60);
    }
}
