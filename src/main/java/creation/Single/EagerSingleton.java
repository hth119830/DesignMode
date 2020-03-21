package creation.Single;

//饿汉式

/**
 * 空间换时间
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    /**
     * 私有默认构造
     */
    private EagerSingleton(){}

    /**
     * 静态工厂方法
     */
    public static EagerSingleton getInstance(){
        return instance;
    }



}
