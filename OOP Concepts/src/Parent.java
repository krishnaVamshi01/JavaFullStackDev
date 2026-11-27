public class Parent {
    void property(){
        System.out.println("Parents Property");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("child method");
    }
}

void main(String[] args) {
    Child c =new Child();
    c.property();
    c.display();
}
