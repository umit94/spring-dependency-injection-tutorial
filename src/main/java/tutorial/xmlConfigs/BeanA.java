package tutorial.xmlConfigs;

public class BeanA {
    private BeanB beanB;
    private int primitiveType;

    public BeanA(){
        System.out.println("BeanA default constructor call");
    }

    public BeanA(BeanB beanB){
        System.out.println("BeanA smart constructor call");
        setBeanB(beanB);
    }

    public void setBeanB(BeanB beanB) { // set methodunun ismi kurallara uygun olmalıdır
        this.beanB = beanB;
    }

    public void setPrimitiveType(int primitiveType){
        this.primitiveType=primitiveType;
    }
    @Override
    public String toString() {
        return "BeanA" +" primitive value="+primitiveType+" "+ beanB;
    }



    public static BeanA createBean(BeanB beanB){
        System.out.println("\nCreating by static method");
        return new BeanA(beanB);
    }
}
