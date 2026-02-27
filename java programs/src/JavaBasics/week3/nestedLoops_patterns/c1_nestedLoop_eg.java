package JavaBasics.week3.nestedLoops_patterns;

// demonstration how nested for loop works
public class c1_nestedLoop_eg {

    public static void main(String[] args) {
        int n = 5;

        // 1 --> ( 1 2 3 4 5)
        // 2 --> ( 1 2 3 4 5)
        // 3 --> ( 1 2 3 4 5)
        // 4 --> ( 1 2 3 4 5)
        // 5 --> ( 1 2 3 4 5)

        for(int i = 1; i <= n; i++ )
        {
            for(int j = 1;j <= n; j++)
            {
                System.out.println(i +" -> "+ j);
            }
        }

    }
}