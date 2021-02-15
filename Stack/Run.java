public class Run {
    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        defaultStack();
    }

    public static void show(String str) {
        System.out.println(str);
    }

    public static void showEnd() {
        System.out.println();
        System.out.println("= = = = = = = = = = = =");
        System.out.println("=      END  TEST      =");
        System.out.println("= = = = = = = = = = = =");
        System.out.println();
    }

    public static void defaultStack() {
        SelfStack<String> strStack = new SelfStack<>();

        strStack.push("Andy");

        show(strStack.toString());

        show(strStack.pop());

        show(strStack.toString());

        strStack.push("Andy");

        show(strStack.toString());

        showEnd();
    }
}
