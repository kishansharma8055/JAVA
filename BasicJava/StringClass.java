// import javax.swing.plaf.synth.SynthLookAndFeel;

class StringClass {
    public static void main(String[] args) {
        // length()
        String str = "welcome";
        System.out.println(str.length());

        int a = str.length();
        System.out.println(a);

        // concat
        String str2 = "kishan";
        // str2.concat(" coder"); // this is not work because both string copy in other
        // new string
        String conc = str2.concat(" coder"); // okey
        System.out.println(conc);

        // + operator use to concat two or more string
        System.out.println(str + " " + str2);

        // equals()
        System.out.println(str.equals("welcome"));

        // equals() compare only the values of the strings
        String str3 = new String("welcome");
        System.out.println(str.equals(str3));

        // equalIgnoreCase()
        System.out.println(str.equalsIgnoreCase(str3));

        // use == operator
        // System.out.println(str == str3); //false

        // new keyword both are different memory space
        String str4 = new String("welcome");
        System.out.println(str3 == str4);

        // liiteral same memory space
        String str5 = "kishan";
        System.out.println(str2 == str5);

        // toLowerCase() and uppercase()
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // substring
        String subs = "hi kishan sharma";
        System.out.println(subs.substring(4, 8));
        System.out.println(subs.substring(4));

        // charAt()
        System.out.println(subs.charAt(10));

        // contains()
        System.out.println(subs.contains("is"));

        // replace()
        System.out.println(subs.replace('i', 'z'));

    }
}
