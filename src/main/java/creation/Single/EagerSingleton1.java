package creation.Single;
//饿汉式
//空间换时间
public class EagerSingleton1 {
    private static EagerSingleton1 eagerSingleton1 = new EagerSingleton1();
    /**
     * 构造方法私有化
     */
    private EagerSingleton1(){}

    public static synchronized EagerSingleton1 getInstance(){
        return eagerSingleton1;
    }


}
