public class HelloAppUC7_StringJoin {

    public static void main(String[] args) {

        String result;

        if (args.length == 0) {
            result = "World";
        } else {
            result = String.join(", ", args);
        }

        System.out.println("Hello, " + result + "!");
    }
}