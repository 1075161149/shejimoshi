package 练习;

public class lanhan {
    private  lanhan(){

    }
    private static lanhan instance=null;
    public static lanhan getInstance(){
        if(instance==null)
            instance=new lanhan();
         return instance;

    }
}
