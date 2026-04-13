class Q14{
    static int product(int a, int b) {
        if(b==0){
            return 0;
        } 
        return a +product(a,b-1);
    }
    public static void main(String[] args) {
        product(5,8);
    }
}