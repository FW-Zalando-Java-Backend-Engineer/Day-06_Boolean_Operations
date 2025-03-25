public class BooleanPractice {
    public static void main(String[] args) {
      boolean  isHungry = true;
      boolean  hasFood = false;

      // Print the result of:
        //  `isHungry && hasFood`
        System.out.println("Is both true? " + (isHungry && hasFood));
        //  `isHungry || hasFood`
        System.out.println("Is either true? " + (isHungry || hasFood));
        // `!isHungry`
        System.out.println( "Are you NOT hungry? " + (!isHungry));
    }
}
