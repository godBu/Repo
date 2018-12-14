
public class lol {

    do{
    System.out.println("");
    System.out.print("Enter x and y coordinates to search: ");
    int xStick = keyboard.nextInt();
    int yStick = keyboard.nextInt();

    int dist1 = diamond.treasureStatus(xStick, yStick);
    int dist2 = gold.treasureStatus(xStick , yStick);

    if (dist1 == 0 || dist1 == MAX_DISTANCE){
        System.out.println("Diamonds: FOUND!");
    }else{
        System.out.println("Diamonds: " + dist1 + " away");
    }

    if (dist2 == 0 || dist2 == MAX_DISTANCE){
        System.out.println("Gold: FOUND!");
    }else{
        System.out.println("Gold: " + dist2 + " away");
    }

    }while(!diamond.isFound() && !gold.isFound());




    do{
    System.out.println("Play again? y/n:");
    playAgain = keyboard.next().charAt(0);
    }while(diamond.isFound() && gold.isFound());

}
