package CharExample_2;

import java.util.Random;

public class Flight {
    public static void main(String[] args) {
        Random random = new Random();
        boolean findPass = false;
        int iteration = 0;
        String c = "Москва";
        while (!findPass) {
            // TODO: 11.02.2021   1. Напишите условие, обеспечивающее выход из цикла,
            //  если выпавшее число соответствует символу 'p'.
            //  2. Организуйте вывод в консоль при каждой итерации по очереди "Москва" и "Рим".
            int randomInt = random.nextInt(256) + 1;
            char targetC = 'p';
            System.out.println(c);
            if (randomInt == targetC) {
                System.out.println("Capital!");
                break;
            }
            if (c == "Москва") c = "Рим";
            else {
                c = "Москва";
            }
        }
    }
}