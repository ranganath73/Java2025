
/* 
Joy and sorrow sleep in the same bed.
*/

public class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("looking for food");
            System.out.println("found " + food.name);
            System.out.println("ate everything");
        } catch (NullPointerException e) {
            System.out.println("found nothing");
            return;
        } //write your code here

        System.out.println("went to bed" + (food == null ? " hungry" : ""));
    }
}