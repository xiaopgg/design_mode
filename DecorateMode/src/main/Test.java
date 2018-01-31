package main;

/**
 * Created by apple on 2018/1/31.
 */
public class Test {
    public static void main(String[] args)
    {
        ConcreteComponent concreteComponent = new ConcreteComponent();


        DecorateA decorateA = new DecorateA();  // 创建修饰器A

        DecorateB decorateB = new DecorateB(); // 创建修饰器B

        decorateA.setComponent(concreteComponent);  // 把行为实现类 加入修饰器A 进行修饰

        decorateB.setComponent(decorateA);  // 把经过修饰器A 修饰过得行为类加入修饰器B 进行再修饰

        decorateB.Operation();  // 经过修饰器A B 修饰的行为执行

    }
}
