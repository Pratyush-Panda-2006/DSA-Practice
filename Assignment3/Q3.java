class MarksOutOfBoundException extends Exception{
    MarksOutOfBoundException(String s){
        super(s);
    }

}
class Student{
    int m;
    String n;

    Student(int m, String n) {
        this.m = m;
        this.n = n;
    }

    void disp(){
        System.out.println("Name is "+n+" mark is "+m);
    }
}
class Q3{
    public static void main(String[] args) {
        Student s1=new Student(99,"Ram");
        try {
            if(s1.m>100){
                throw new MarksOutOfBoundException("More than 100");
            }else{
                s1.disp();
            }
        } catch (MarksOutOfBoundException e) {
            System.out.println("Greater than 100"+e);
        }
    }
}