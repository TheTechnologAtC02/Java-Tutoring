public class ChangeCalc {

    public static void main(String[] args) {
        int input = 578;

        // 200er, 100er, 1er

        int a = 0;
        while (input >= 200) {
            input = input - 200;
            ++a;
        }

        int b = 0;
        while (input >= 100) {
            input = input - 100;
            ++b;
        }

        int c = 0;
        while (input >= 1) {
            input = input - 1;
            ++c;
        }

        System.out.println(a + "x200er " + b + "x100er " + +c + "x1er ");
    }
}
