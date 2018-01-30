/**
 * Created by apple on 2018/1/30.
 */
public class test
{
    public static void main(String[] args)
    {
        Context context = new Context("满200减50");
        double total=context.getResult(258);

        System.out.println(total);
    }
}
