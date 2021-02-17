public class RunStack {
    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        defaultStack();
        tenItemsStack();
        fullAndEmptyStack();
        tryOutOfBounds();
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

        strStack.push("A");

        show(strStack.toString());

        show(strStack.pop());

        show(strStack.toString());

        strStack.push("A");

        show(strStack.toString());

        show(strStack.pop());

        show(strStack.toString());

        showEnd();
    }

    public static void tenItemsStack() {
        int size = 10;
        SelfStack<String> strStack = new SelfStack<>(size);

        show(strStack.toString());

        strStack.push("A1");
        strStack.push("A2");
        strStack.push("A3");

        show(strStack.toString());

        strStack.push("A4");
        strStack.push("A5");
        strStack.push("A6");
        strStack.push("A7");

        show(strStack.toString());

        strStack.push("A8");
        strStack.push("A9");
        strStack.push("A10");

        show(strStack.toString());

        show(strStack.pop());
        show(strStack.pop());
        show(strStack.pop());

        show(strStack.toString());

        strStack.push("AN1");
        strStack.push("AN2");
        strStack.push("AN3");

        show(strStack.toString());

        show(strStack.pop());

        show(strStack.toString());

        showEnd();
    }

    public static void fullAndEmptyStack() {
        int size = 5;
        SelfStack<String> strStack = new SelfStack<>(size);

        show(strStack.toString());

        strStack.push("A1");
        strStack.push("A2");
        strStack.push("A3");
        strStack.push("A4");
        strStack.push("A5");

        show(strStack.toString());

        show(strStack.pop());
        show(strStack.pop());
        show(strStack.pop());
        show(strStack.pop());
        show(strStack.pop());

        show(strStack.toString());

        strStack.push("AN1");
        strStack.push("AN2");
        strStack.push("AN3");
        strStack.push("AN4");
        strStack.push("AN5");

        show(strStack.toString());

        showEnd();
    }

    public static void tryOutOfBounds() {
        int size = 4;
        SelfStack<String> strStack = new SelfStack<>(size);

        show(strStack.toString());

        strStack.push("A1");
        strStack.push("A2");
        strStack.push("A3");
        strStack.push("A4");

        show(strStack.toString());

        strStack.push("OUT5");

        show(strStack.toString());

        show(strStack.pop());
        show(strStack.pop());
        show(strStack.pop());
        show(strStack.pop());

        show(strStack.toString());

        show(strStack.pop());

        show(strStack.toString());

        strStack.push("AN1");
        strStack.push("AN2");
        strStack.push("AN3");
        strStack.push("AN4");

        show(strStack.toString());

        strStack.push("OUTN5");

        show(strStack.toString());

        showEnd();
    }
}
