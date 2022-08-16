package tutorial.lifeCycles.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.SmartLifecycle;

public class BeanA implements InitializingBean, SmartLifecycle, DisposableBean {
    private boolean isRunning=false;

    @Override //DisposableBean
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override //InitializingBean
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override //LifeCyle
    public void start() {
        isRunning=true;
        System.out.println("start");
    }

    @Override //LifeCyle
    public void stop() {
        isRunning=false;
        System.out.println("stop");
    }

    @Override //LifeCyle
    public boolean isRunning() {
        System.out.println("isRunning "+isRunning);
        return isRunning;
    }
}
