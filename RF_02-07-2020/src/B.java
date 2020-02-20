public class B extends A {
    public B() {

    }

    //method 3
//    public boolean readFile(String s) {
//        return false;
//    }

    // adding '@Override' attribute here is an error, as it becomes an overloaded method
//    public int readFile(String s){
//        return false;
//    }

    //method 4
    public boolean setValue(double d) {
        System.out.println("Method 4 gets executed");
        return false;
    }

    public boolean setValue(int i){
        System.out.println("Method from sub-class is called");
        return false;
    }
}
