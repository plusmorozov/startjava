import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private int secretNum;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        secretNum = (int) ((Math.random() * 100) + 1);
        do {
            inputNum(playerOne);
            if (checkNum(playerOne)) {
                break;
            }
            inputNum(playerTwo);
        } while (!checkNum(playerTwo));
    }

    private void inputNum(Player player) {
        System.out.print("Игрок " + player.getName() + " введите число: ");
        player.setNum(scanner.nextInt());
    }

    private boolean checkNum(Player player) {
        int num = player.getNum();
        String name = player.getName();
        if (num == secretNum) {
            System.out.println(name + ", вы угадали!");
            return true;
        }
        if (num > secretNum) {
            System.out.println(name + ", введенное число больше загаданного");
        } else if (num < secretNum) {
            System.out.println(name + ", введенное число меньше загаданного");
        }
        return false;
    }
}