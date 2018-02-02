package main.java;

/**
 * Created by apple on 2018/2/2.
 */
public class Test
{
    public  static void  main(String [] args)
    {
        Factory factory= SimpleFactory.CreateOperation("+",2.3,4.5);

        Operation operation= factory.Createfactory();

        System.out.println(operation.getResult());
    }
}
