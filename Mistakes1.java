package FixTheCode_1;

public class Mistakes1 {
    // TODO: 11.02.2021 Найдите и исправьте ошибки в каждом закоментированном куске кода последовательно.

    double d = 5.2;
    System.out.println(d); // в консоль должно выводится число, поэтому пишем 5,2 вместо d


        byte b = 10;
        int k = 20;
        b = b + k; // необходимо написать k = (byte) (b + k)

      if b > 100 {
      System.out.println(b + "> 100");
      } // нужно продолжить условие



      for(j = 0; j<100; j++){
      j += 1;
      } // не будет вывода в консоль, т.к. отсутсвует system.out.println(j)



      int z = 14;
      int x = 3;
      System.out.println(z/d); //нужно указать тип и заменить d на x

    }
}
