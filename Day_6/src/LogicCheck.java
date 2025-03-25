public class LogicCheck {
    public static void main(String[] args) {
        int score = 75;
        int bonus = 10;
        boolean condition1 = ((score > 70) && (bonus >5) );
        boolean condition2 = ((score > 90) && (bonus >5) );
        boolean condition3 = ((score < 50) && (bonus <5) );
        System.out.println( "- Is score > 70 AND bonus > 5? "+ condition1 );
        System.out.println( "- Is score > 90 OR bonus > 5?"  + condition2);
        System.out.println( "- Is score > 90 OR bonus > 5?"  + condition3);
    }
}
