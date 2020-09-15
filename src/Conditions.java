public class Conditions {
    public static void main(String[] args) {
        //psvm
        int a = 3;
        int b = 4;
        int c = 5;

        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("b is less");
        }


//1 || 01
        if ((a < b) || (a > c)) { //логическое или
            System.out.println("a is less than b");
        } else {
            System.out.println("b is less");
        }
//0 && 01
        if ((a > b) && (a > c)) { //логическое и
            System.out.println("a is less than b");
        } else {
            System.out.println("b is less");
        }

        if (!(a > c)) { //логическое не: true or false
            System.out.println("a is less than b");
        } else {
            System.out.println("b is less");
        }

        for (int i = 1; i < 10; i++){
            System.out.println("variable i = " + i);
        }

        int x = 20;
        while (x > 2) {
            System.out.println("variable x = " + x);
            x--;
        }

        //continue

        // break

        x = 20;
        while (x > 2) {
            System.out.println("variable x = " + x);
            x--;
            if (x == 13) {break;}
        }

        //continue;
        // case switch
        //

        //todo iterator
    }
}
