class ParameterizedExample{
    public static void main(String[] args) {
        

    }
    public static boolean  isPalindrome(String text) {
        return new StringBuffer(text).reverse().toString().equals(text);
    }
}