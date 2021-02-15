public class Run {
    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        resizeTest();

    }

    public static void show(String str) {
        System.out.println(str);
    }

    public static void resizeTest() {
        int size = 3;
        SelfArray<String> strArray = new SelfArray<>(size);

        strArray.push("Andy");
        strArray.push("Alby");
        strArray.push("Ivan");
        strArray.push("Bash");

        show(strArray.toString());
    }
}
