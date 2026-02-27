package OOP;
/*
note --> in java "public" class_Name must be the one with name same as fileName
 */

/*
both setter and getter are user defined funt and NOT builtin
setter() --> to set values
getter() --> to get values from setter funt

accessing private member using setter() and get() funtion
 */

class Cars2 {

    private int speed;
    private String color;
    // now we cannot access speed and color fields outside this class

    //but we can create function within same class, here we can access private members.
    // and call this public function outside the class if needed. mostly named as "setter function"
    public void setterSpeed(int s){
        speed = s; //private member accessed and assigned to s variable.
    }

    public int getSpeed(){
        return speed;
    }
}
public class c3_setter_get_func {
    public static void main(String[] args) {

        Cars2 obj = new Cars2();

        obj.setterSpeed(80); //assigns value 80, to speed private variable using public method.

        System.out.println(obj.getSpeed());
    }
}
