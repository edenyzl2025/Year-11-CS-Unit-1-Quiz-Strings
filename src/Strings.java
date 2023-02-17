public class Strings {

    public static void main(String[] args) {

        // 1. Declare and initialize a variable of type int called age to a value of 33.
        int age = 33;
        // 2. Declare and initialize a variable of type String called name to a value of T Swizzle.
        String name = "T Swizzle";
        // 3. Print out the variable age using a single println statement.
        System.out.println(age);
        // 4. Print out the variable name using the println statement.
        System.out.println(name);
        // 5. Declare and initialize a variable of type String called description to a value of My name is T Swizzle and I am 33 years old. Make sure to use the variables age and name in this String. That is, you must use String concatenation. Do not hardcode the values T Swizzle and 33.
        String description = "My name is "+name+" and I am "+age+" years old";
        // 6. Print out the variable description using a single println statement.
        System.out.println(description);
        // 7. Use the length method in the String class to print out the length of the description.
        System.out.println(description.length());
        // 8. Use the substring method to capture the String “T Swizzle” within description. Store this in a variable called nameSubDescription.
        String nameSubDescription = description.substring(11,20);
        // 9.Use the substring method to capture the String “33” within description. Store this in a variable of type int called ageSubDescription. You will need to convert this value to an integer. Use Integer.parseInt(insert string here). Do this in a single statement.
        int ageSubDescription = Integer.parseInt(description.substring(30,32));
        // 10. Declare and initialize a variable of type String called subDescription to a value of My name is T Swizzle and I am 33 years old. Make sure to use the variables ageSubDescription and nameSubDescription in this String. That is, you must use String concatenation. Do not hardcode the values T Swizzle and 33.
        String subDescription = "My name is "+nameSubDescription+" and I am "+ageSubDescription+" years old";
    }

}
