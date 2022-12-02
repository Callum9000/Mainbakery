class Singleton{
    private static volatile Singleton obj = List<String>;

    private Singleton() {}

    public static Singleton getInstance(){
        if(obj == null){
            synchronized (Singleton.class){
                if(obj == null)
                    obj = new Singleton():
            }
        }
        return obj;
    }
}