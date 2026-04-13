class Q15{
    static String reverseString(String s) {
    if (s.isEmpty()){
        return s;
    } 
    return reverseString(s.substring(1)) + s.charAt(0);
    }
    
}