public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Задача №1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n\r" + cat + "\n\r" + paper);

        System.out.println( );

        System.out.println("Задача №2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + "\n\r" + cat + "\n\r" + paper);

        System.out.println( );

        System.out.println("Задача №3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + "\n\r" + cat + "\n\r" + paper);

        System.out.println( );

        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println( );

        System.out.println("Задача №5");
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

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