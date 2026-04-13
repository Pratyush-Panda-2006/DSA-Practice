class Box<T> {
    T content;
    void set(T content){
         this.content = content; 
    }
    T get(){ 
        return content;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        Box<String> b2 = b1; 
        b1.set("Hello");
        System.out.println("b2 reflects change: " + b2.get()); 

        Box<Integer> i1 = new Box<>();
        Box<Integer> i2 = i1;
        i1.set(100);
        System.out.println("i2 reflects change: " + i2.get()); 

        Box<Object> objBox = new Box<>();
        objBox.set("Text"); 
        System.out.println("Stored String: " + objBox.get());
        objBox.set(50); 
        System.out.println("Stored Integer: " + objBox.get());
    }
}