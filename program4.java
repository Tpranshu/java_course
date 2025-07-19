public class program4 {
    public static void main(String[] args) {
        // string all important methods --
        /*
         * original string change nhi hota hai but us original string ki copy(lower case
         * version of original string) change kr skte hai.
         * 
         */
        String name = "Pranshu";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lower = name.toLowerCase();
        // returns a string with lower case of original string object.
        System.out.println(lower);

        String upper = name.toUpperCase();
        // returns a string with upper case of original string object.
        System.out.println(upper);

        String a = "    pranshu       ";
        System.out.println(a);
        String b = a.trim();
        // trim() remove all spaces from string.
        System.out.println(b);
        

        System.out.println(name.substring(2));
        // substring() function cut the string from given index.

        System.out.println(name.substring(2, 4));
        // here beginIndex are include but endIndex are not include in the substring(2, 4).

        System.out.println(name.replace('a', 'x'));
        System.out.println(name.replace("ns","abcde"));
        
        System.out.println(name.startsWith("P"));
        System.out.println(name.endsWith("hu"));
        // it returns the boolean expression true or false.

        System.out.println(name.charAt(1));

        System.out.println(name.indexOf("r"));
        String name2 = "Pranshutiwari";
        System.out.println(name2.indexOf("nsh", 2));




    }
}
