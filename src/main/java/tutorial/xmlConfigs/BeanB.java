package tutorial.xmlConfigs;

public class BeanB {
    public BeanB(){
        System.out.println("BeanB default constructor call");
    }

    public BeanB(int a){
        System.out.println("BeanB smart constructor call");
    }
    @Override
    public String toString() {
        return "BeanB";
    }
}
