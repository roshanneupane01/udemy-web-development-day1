class Palindrome {
    
    public static Boolean palindrome(String word){
        boolean isPalindrome = true;

        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                isPalindrome = false;
            }
        }
        
        return isPalindrome;
    }
    
    public static void main(String[] args){
        System.out.println(palindrome("abbc")); //prints false
        System.out.println(palindrome("abba")); //prints true
        System.out.println(palindrome("racefcar")); //prints false
    }
}