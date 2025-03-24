/**
 * Run the program and see what happens.
 * In the eat method, add a finally block so that the 
 * lion goes to bed even if he doesn't get anything to eat.
 *
 * Expected output when food != null:
 * looking for food
 * found meat
 * ate everything
 * went to bed
 *
 * Expected output when food == null:
 * looking for food
 * found nothing
 * went to bed hungry
 *
 * Requirements:
 * •	The eat method should have a finally block.
 * •	The output must match the task conditions.
 */

public class Solution {

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("meat"));
        lion.eat(null);
    }
}