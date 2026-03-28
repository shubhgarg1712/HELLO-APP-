public class HelloAppUC6_SubstringMethod {

    public static void main(String[] args) {

        String result;

        if (args.length == 0) {
            result = "World";
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Step 1: Add all names with ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Step 2: Remove last ", "
            if (nameBuilder.length() > 0) {
                result = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                result = "";
            }
        }

        System.out.println("Hello, " + result + "!");
    }
}