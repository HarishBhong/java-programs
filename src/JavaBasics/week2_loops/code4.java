package JavaBasics.week2_loops;
//infinte loop;

public class code4 {
    public static void main(String[] args) {

//        //infinite forLoop
//        for(int i = 1; i > 0; i++ )
//        {
//            System.out.println("hello");
//
//        }
//
//        //infinite WhileLoop
//        int j = 1;
//        while(j > 0)
//        {
//            System.out.println("hello");
//        }
//
//        //use of break statement
//        for(int i = 1; i > 0; i++ )
//        {
//            System.out.println("hello");
//            if(i == 10){
//                break;
//            }
//        }

        for(int i = 1; i > 0; i++ )
        {
            if(i == 6){
                continue;
            }
            System.out.println(i);
        }
    }

}
