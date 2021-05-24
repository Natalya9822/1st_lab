package FixTheCode_1;

public class MistakesN {
    // TODO: 11.02.2021 Найдите и исправьте ошибки в каждом закоментированном куске кода последовательно.
    public static void main(String[] args) {

        System.out.println(5.2);
        double d = 5.2;

        int k = 20;
        byte b = 10;
        k = (byte) (b + k); // указываем тип "byte", т.к. 1 байт можно поместить в 4

        int f;
        f = 100;
        if (f > 100) {
            System.out.println("f больше 100");
        } else if (f < 100) {
            System.out.println("f меньше 100");
        } else {
            System.out.println("f = 100");
        }

        //Цикл for: тело цикла будет выполнено заданное количество раз
        for (int j = 0; j < 100; j += 1) {
            System.out.println(j);
        }

        int z = 14;
        int x = 3;
        System.out.println((double) z / x);
    }
}

