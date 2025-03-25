public class SchoolBus {
    public static String canBoardBus(int age, boolean hasBusPass){
        return (age >= 5) ?
                (hasBusPass ? "Access Granted" : "No Pass"):
                (hasBusPass ? "Too Young" : "Denied");
    }

    public static void main(String[] args) {
        System.out.println(canBoardBus(6, true));    // Access Granted
        System.out.println(canBoardBus(4, true));    // Too Young
        System.out.println(canBoardBus(7, false));   // No Pass
        System.out.println(canBoardBus(3, false));   // Denied
    }
}
