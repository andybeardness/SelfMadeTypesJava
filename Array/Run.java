public class Run {
    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        defaultNullArray();
        resizeDefaultTest();
        resizeWithResizerClass();
        resizeWithResizerCustom();
        removeTest();
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

    public static void defaultNullArray() {
        int size = 10;
        SelfArray<String> strArray = new SelfArray<>(size);

        show(strArray.toString());

        showEnd();
    }

    public static void resizeDefaultTest() {
        int size = 3;
        SelfArray<String> strArray = new SelfArray<>(size);

        strArray.add("Andy");
        strArray.add("Alby");
        strArray.add("Ivan");
        strArray.add("Bash");

        show(strArray.toString());

        showEnd();
    }

    public static void resizeWithResizerClass() {
        int size = 3;
        Resize2X rs = new Resize2X();
        SelfArray<String> strArray = new SelfArray<>(size, rs);

        strArray.add("Andy");
        strArray.add("Alby");
        strArray.add("Ivan");
        strArray.add("Bash");

        show(strArray.toString());

        showEnd();
    }

    public static void resizeWithResizerCustom() {
        int size = 3;
        ResizeMethodInterface rs = new ResizeMethodInterface() {
            @Override
            public int getNewSize(int size) {
                return size + 100;
            }
        };

        SelfArray<String> strArray = new SelfArray<>(size, rs);

        strArray.add("Andy");
        strArray.add("Alby");
        strArray.add("Ivan");
        strArray.add("Bash");

        show(strArray.toString());

        showEnd();
    }

    public static void removeTest() {
        int size = 3;
        SelfArray<String> strArray = new SelfArray<>(size);

        strArray.add("Andy");
        strArray.add("Alby");
        strArray.add("Ivan");
        strArray.add("Bash");

        strArray.remove(2);
        strArray.remove(1);

        show(strArray.toString());

        showEnd();
    }
}
