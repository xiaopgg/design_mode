import java.util.Scanner;

/**
 * Created by apple on 2018/1/29.
 */
public class Test {
    public static void main(String[] args)
    {
        Caculator caculator = CaculatorFacotry.createCaculator("/",3.2f,1f);

        float result = 0f;
        try {
             result = caculator.getResult();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(result);
     //  Scanner input = new Scanner(System.in);


    }
}
