package strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Appending strings
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World");
        System.out.println("Appended string: " + stringBuilder.toString());

        // Inserting a string at a specific position
        stringBuilder.insert(5, " Java");
        System.out.println("Inserted string: " + stringBuilder.toString());

        // Deleting characters from a StringBuilder
        stringBuilder.delete(5,10); // Deletes "Java "
        System.out.println("After deleting: " + stringBuilder.toString());

        // Replacing characters in a StringBuilder
        stringBuilder.replace(5, 10, "Planet"); // Replaces "World" with "Planet"
        System.out.println("After replacing: " + stringBuilder.toString());

        // Reversing a StringBuilder
        stringBuilder.reverse();
        System.out.println("Reversed string: " + stringBuilder.toString());
        // Converting StringBuilder to a String
        String finalString = stringBuilder.toString();
        System.out.println("Final String: " + finalString);
    }
}
