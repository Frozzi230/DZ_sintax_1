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

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        System.out.println( );

        System.out.println("Задача №3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper);

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
        var remains = mass2 % mass1;
        System.out.println("Остаток от деления между весами: " + remains);

        System.out.println( );

        System.out.println("Задача №8");
        var allTimes = 640;
        var times = 8;
        var human = allTimes / times;
        System.out.println("Всего работников в компании - " + human + " человек ");
        human = human + 94;
        allTimes = human * times;
        System.out.println("Если в компании работает " + human + " человек, то всего " + allTimes + " часов работы может быть поделено между сотрудниками ");
    }
}