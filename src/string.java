public class string {
    public static void main(String args[]) {
        //find the length of the string with the help of in-build method or function.

        String str = "Hello I am string";
        System.out.println(str.length());

        // str convert uppercase or lowercase
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // find the character in string

        System.out.println(str.indexOf("am"));

        // concat method

        String fname = "Ravi";
        String lname = "Pandey";

        System.out.println(fname.concat(lname));

        // add number & string

        int a = 18;
        int b = a + Integer.parseInt(fname);

        System.out.println(b); // cant be done here



    }
}
