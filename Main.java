
import java.util.Scanner;
import java.util.stream.Stream;

import example.Human;
import example.Maou;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] d = input.split(" ", 3);
        int[] data = Stream.of(d).mapToInt(Integer::parseInt).toArray();

        Maou maou = new Maou();
        maou.setHp(data[0]);
        maou.setMaxHp(data[0]);
        maou.setB(data[2]);

        Human h = new Human();
        h.setDamage(data[1]);

        int count = 1;

        if (maou.getB() > h.getDamage()) {

            System.out.println("あなたは魔王に勝てません");

        } else {

            while(true) {

                maou = h.attack(maou);
    
                if(maou.getHp() <= 0) {
                    break;
                }
                
                if((maou.getHp() + maou.getB()) < maou.getMaxHP()) {
                    maou.kaihuku();
                }

                count++;
            }
    
            System.out.println(count);

        }


    }
}

