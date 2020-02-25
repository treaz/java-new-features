package com.horiaconstantin;

//https://www.journaldev.com/33204/java-13-features
public class Java13Demo {

    @SuppressWarnings("preview")
    static void textBlocks(){
        String textBlock = """
				Hi
				Hello
				Yes""";

        var output = String.format("""
			    Name: %s
			    Phone: %d
			    Salary: $%.2f
			    """, "Pankaj", 123456789, 2000.5555);

        System.out.println(output);
    }

    @SuppressWarnings("preview")
    static void enhancedSwitch() {
        Integer choice = 2;

        // switch expressions, use yield to return, in Java 12 it was break
        int x = switch (choice) {
            case 1, 2, 3:
                yield choice;
            default:
                yield -1;
        };
        System.out.println("x = " + x);

    }

}
