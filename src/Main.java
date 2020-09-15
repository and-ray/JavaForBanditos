public class Main {

    public static void main(String[] args) {
        /**
         * первая программа
         */

        // ТД ссылочные. строки. null
        //int aaa = null;
        //boolean ddsd = null;
        String aaaaa = null;
        Double asdf = null;


        Integer a1 = 1;
        Integer b1 = 1;
        Integer c1 = new Integer(1);
        // System.out.println(a1 == b1); // true
        //System.out.println(a1 == c1); // false

        //parse
        //a1.toString()
        String qwa = "10";
        System.out.println(qwa + 5);
        int qwa2 = 10;
        Integer qwa3 = Integer.parseInt(qwa);
        System.out.println(qwa3);//10 число
        int qwa33 = Integer.parseInt(qwa);
        String antiqwa33 = qwa3.toString(); //"10" - строка
        System.out.println(qwa3 + qwa3 + qwa3);//30
        System.out.println(antiqwa33 + antiqwa33 + antiqwa33);//101010

        System.out.println(a1.equals(b1));


        //double a2 = a;
        Double a2 = a1.doubleValue();

        int i = Integer.parseInt("10");
        System.out.println(i); // ?

        String line1 = "Мама";
        String line2 = " не мыла ";
        String line3 = "раму";

        System.out.println(line2);
        line2 = line2.replace(" не", "");
        System.out.println(line2);
        line3 = line3.substring(0, 3);
        line3 = line3.substring(1);
        System.out.println(line3);

        System.out.println(line1 + line2 + line3);


        String abc = null;
        String cde = null;

        System.out.println(abc == cde); //("null == null is true in Java");
        System.out.println(abc != cde); //"null != null is false in Java");
        System.out.println(abc == null); //домашнее задание
        //System.out.println(abc > null) - дз
        // остальное дз.
        //github - дз зарегистрироваться.


    }

    //git что это как зайти, как пользоваться, разные ветки. мерж, пул, пуш, эдд, коммит, и более сложные вещи.

    //3. операции, которые можно выполнять с переменными, особенно логические. Капризы строк.

    //4. if else.


    // циклы: continue, break;
    //try - catch
    // коллекции

    // объект, поле, метод. доступность. статика.
    // git
    //ООП - принципы.
    // абстрактные классы, ИФСы.

    //ассерты.
    // локаторы
    // тестовые фреймворки


}
