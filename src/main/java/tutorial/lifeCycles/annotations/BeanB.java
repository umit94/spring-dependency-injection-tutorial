package tutorial.lifeCycles.annotations;

public class BeanB {

//    public void close(){ // public olan close veya shutdown methodu otomatik olarak çağırılır
//        System.out.println("beanB close");
//    }

    public void shutdown(){ // public olan close veya shutdown methodu otomatik olarak çağırılır
        System.out.println("beanB shutdown");
    }
}
