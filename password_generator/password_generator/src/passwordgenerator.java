import java.util.Random;
public class passwordgenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 18; i++) {
            int num = rand.nextInt(4);
            switch (num) {
                case 0:
                    int upCase = rand.nextInt(26) + 65;
                    password.append((char) upCase);
                    break;
                case 1:
                    int lowCase = rand.nextInt(26) + 97;
                    password.append((char) lowCase);
                    break;
                case 2:
                    int symbol = rand.nextInt(15) + 33;
                    password.append((char) symbol);
                    break;
                case 3:
                    int number = rand.nextInt(10) + 48;
                    password.append((char) number);
                    break;
                default:
                    break;
            }
        }
        System.out.println(password);
    }
}
