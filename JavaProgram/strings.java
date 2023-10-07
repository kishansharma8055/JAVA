// Question 1
// class Tester {

//     public static String removeWhiteSpaces(String str) {
//         // Implement your code here and change the return value accordingly
//         // String newStr = str.replace(" ", "");

//         String newStr = "";
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (Character.isWhitespace(ch)) {
//                 continue;
//             } else {
//                 newStr += Character.toString(ch);
//             }
//         }
//         return newStr;
//     }

//     public static void main(String args[]) {
//         String str = "Hello   How are you   ";
//         str = removeWhiteSpaces(str);
//         System.out.println(str);
//     }
// }
// 
// 
// 
// 
// 
// 
// 
// 
// 
// // Question 2 moveSpecialCharacters
// class Tester{

//     public static String moveSpecialCharacters(String str){
// 		//Implement your code here and change the return value accordingly
//         String sp = "[^a-zA-Z0-9\\s+]";
//         String spc = "";
//         String c = "";
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if(String.valueOf(ch).matches(sp)){
//                 spc = spc+ch;
//             }
//             else{
//                 c=c+ch;
//             }
//         }
//             return (c+spc);
//         // return null;
// 	}

// 	public static void main(String args[]){
// 	    String str = "He@#$llo!*&";
// 	    System.out.println(moveSpecialCharacters(str));
// 	}
// }
// 
// 
// 
// 
// 
// 
// 
// 
// 
// // Question 3 Palindrome
class Tester {
    public static boolean checkPalindrome(String str) {
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch)) {
                continue;
            } else {
                rev = rev + str.charAt(i);
            }
        }

        if (str.equals(rev)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        String str = "A man, a plan, a canal: Panama";
        if (checkPalindrome(str)) {
            System.out.println("the string is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
//
//
//
//
//
//
//
//
//
// Question 4 reverseEachWord
// class Tester {
// public static String reverseEachWord(String str){
// //Implement your code here and change the return value accordingly
// String rev = "";
// String newString;
// int len = str.length();
// for(int i=len-1;i>=0;i--){
// for(int j=0;j<=null;j++){
// if(str[i]){
// newString = newString + rev;
// break;
// }
// else{
// rev = rev+str.charAt(i);
// }
// }
// }

// // if(str.equals(rev)){
// return newString;

// }

// public static void main(String args[]){
// String str = "all cows eat grass";
// System.out.println(reverseEachWord(str));
// }
// }