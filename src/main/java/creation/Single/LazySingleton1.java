package creation.Single;

//懒汉式
public class LazySingleton1 {
    private static LazySingleton1 lazySingleton1 = null;
    /**
     * 构造方法私有化
     */
    private LazySingleton1(){}

    public static synchronized LazySingleton1 getInstance(){
        if(lazySingleton1 == null){
            return lazySingleton1 = new LazySingleton1();
        }
        return lazySingleton1;
    }
}
