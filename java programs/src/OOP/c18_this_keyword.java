package OOP;

class Vehicles
{
    int tyre = 4;
    public int auto(int tyre)
    {
        this.tyre = 3;
        return tyre+1;
    }
}
public class c18_this_keyword {
    public static void main(String[] args)
    {
        Vehicles obj = new Vehicles();
        System.out.println(obj.tyre);

        System.out.println(obj.auto(10));

        //now the value of tyre instance variable is updated to 3, inside the method using this. keyword
        System.out.println(obj.tyre);

    }
}
