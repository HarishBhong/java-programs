package JavaBasics.week1.if_Else_Loops;

public class nested_if {
    public static void main(String[] args) {
        int a = 10;
        int b= 5;
        int c = 20;
        int d = 1;

        if(a>b){
            if(a<c){
                if(a==d){
                    System.out.println("all conditions satisfied");
                }else{System.out.println("a != d");}
            }
        }else {
            System.out.println(" a > b not satisfied");
        }
    }
}
