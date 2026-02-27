package JavaBasics.week5;

public class String2_StringBuilder {
    public static void main(String[] args) {
//        String s = "123";
//
//        int b = Integer.parseInt(s);
//        System.out.println(b);

        StringBuilder sB1 = new StringBuilder("abcd");
        System.out.println(sB1);

        sB1.append(" --efgh"); //appends in the end of StringBuilder
        sB1.setCharAt(0,'A'); //changes character at 0th index to given char 'A'

        System.out.println(sB1);
    }
}
