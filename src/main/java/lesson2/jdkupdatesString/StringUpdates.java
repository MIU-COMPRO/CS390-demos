package lesson2.jdkupdatesString;

public class StringUpdates {
    public static void main(String[] args){
        // Text Block - JDK 15
        String rgb = """
               Red
               Green
               Blue
                """;
        System.out.println(rgb);
        String ams = """
                Hello my name is %s
                """.formatted("Amadu Sarjo Jallow");
        System.out.println(ams);
        String name = "Tom";
        int age = 30;
        String greeting = """
                  Hello, my name is %s and I am %d years old.
                  """.formatted(name, age);
        System.out.println(greeting);

        // String Template
        var x = 10;
        var y = 20;
        // If I want to print 10 + 20 = 30, you will get suggestion to replace with String Template
        System.out.println(x + " + " + y + " = " + (x + y));
        // Simplified with String Template, STR is a template processor
//        System.out.println(STR."\{x} + \{y} = \{x + y}");
        String user = "Duke";
        char option = 'b';
//        String choice  = STR."\{user} has chosen option \{option}";
//        System.out.println(choice);
//        System.out.println(STR."\{user} has the length of \{user.length()} characters");
    }
}
