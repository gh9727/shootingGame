package Main;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame {
    public Game() {
        setTitle("500x300 프레임 만들기"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300); // 프레임 크기 설정

        setVisible(true); //화면에 프레임 출력
    }
    public static void main(String [] args) {
        Game mf = new Game();
    }
}