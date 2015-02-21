/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestl3;

/**
 *
 * @author Cheryl Allred
 */
public class findPlayer {
    
}
public void search(String[] names) {
        System.out.println("\n\t===============================================================");
        System.out.println("\tfind a name");
        Scanner inFile = new Scanner(System.in);
        playersName = inFile.nextLine();
        playersName = playersName.trim();
        for(x: names) {
               if (x==playerName) {
              found = true;
              break;
        }  
}
        if (found) 
            System.out.println(playersName "found!");
        else
            System.out.println(playersName "NOT found!");
}
