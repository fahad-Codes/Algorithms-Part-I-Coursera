public class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java HelloGoodbye <name1> <name2>");
            return;
        }

        String name1 = args[0];
        String name2 = args[1];

        printHelloAndGoodbye(name1, name2);
    }

    private static void printHelloAndGoodbye(String name1, String name2) {
        System.out.println("Hello " + name1 + " and " + name2 + ".");
        System.out.println("Goodbye " + name2 + " and " + name1 + ".");
    }
}

