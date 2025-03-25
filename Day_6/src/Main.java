//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isCoffeeCold = false;

        System.out.println("Java is fun: " + isJavaFun);
        System.out.println("Coffee is cold: " + isCoffeeCold);
        System.out.println( "Is both true? " + (isJavaFun && isCoffeeCold));
        System.out.println("Is either true? " + (isJavaFun || isCoffeeCold));
        System.out.println( "Is Java NOT fun? " + (!isJavaFun));

    }
}