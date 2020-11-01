package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Stick normalStick = new Stick(3.0);
        EnglishStick englishStick = new EnglishStick(6.0,0.5);
        EnglishStickAdapter englishStickAdapter = new EnglishStickAdapter(englishStick);

        List<Stick> sticksToTest = new ArrayList<>(List.of(normalStick, englishStickAdapter));

        for (int i = 0; i < sticksToTest.size(); i++) {
            if(sticksToTest.get(i).willReachBallOnTree()){
                System.out.println("Stick " + (i+1) + " will reach ball on tree.");
            } else{
                System.out.println("Stick " + (i+1) + " won't reach ball on tree.");
            }
        }
    }


}
