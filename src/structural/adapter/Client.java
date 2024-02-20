package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Stick normalStick = new Stick(3.0);
        EnglishStick englishStick = new EnglishStick(6.0,0.5);
        EnglishStickAdapter englishStickAdapter = new EnglishStickAdapter(englishStick);

        List<Stick> sticksToTest = new ArrayList<>(List.of(normalStick, englishStickAdapter));

        for (Stick stick : sticksToTest) {
            if(stick.willReachBallOnTree()){
                System.out.println("This stick will reach ball on tree.");
            } else{
                System.out.println("This stick won't reach ball on tree.");
            }
        }
    }


}
