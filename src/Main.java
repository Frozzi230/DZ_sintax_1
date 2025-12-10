//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Задача №1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        System.out.println( );

        System.out.println("Задача №2");
        final var CONST = 4.0;
        var dog1 = 8.0 + CONST;
        var cat1 = 3.6 + CONST;
        var paper1 = 763789 + CONST;
        System.out.println(dog1 + "\n" + cat1 + "\n" + paper1);

        System.out.println( );

        System.out.println("Задача №3");
        var dog2 = 8.0 - 3.5;
        var cat2 = 3.6 - 1.6;
        var paper2 = 763789 - 7639;
        System.out.println(dog2 + "\n" + cat2 + "\n" + paper2);

        System.out.println( );

        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend + "\n" + (friend - 2) + "\n" + (friend - 2)/7);

        System.out.println( );

        System.out.println("Задача №5");
        var frog = 3.5;
        var frog1 = frog * 10;
        var frog2 = frog1 / 3.5;
        var frog3 = frog2 + 4;
        System.out.println(frog1 + "\n" + frog2 + "\n" + frog3);

        System.out.println( );

        System.out.println("Задание №6");
        var mass1 = 78.2;
        var mass2 = 82.7;
        var all = mass1 + mass2;
        var diff = mass2 - mass1;
        System.out.println("Обший вес бойцов: " + all);
        System.out.println("Разница в весе между бойцами: " + diff);

        System.out.println( );

        System.out.println("Задача №7");
        var mass3 = 78.2;
        var mass4 = 82.7;
        var remains = mass4 % mass3;
        System.out.println("Остаток от деления между весами: " + remains);
    }
}