package create.singleton;

/**
 * 没有延时加载
 * 线程安全的
 * 防止反射和反序列化
 * @program: design
 * @description: 枚举
 * @author: Calabash
 * @create: 2019-04-16 23:08
 **/
public enum SingletonEnum {

    INSTANCE;

    //添加自己的操作方式
    public void singletonOperation(){

    }
}