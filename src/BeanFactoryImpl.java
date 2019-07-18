import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactoryImpl implements BeanFactory{

    private Map<String, Object> beanMap = new ConcurrentHashMap<>();
    
    @Override
    public Object getBean(String beanName) {
        if(this.containsBean(beanName)){
            return beanMap.get(beanName);
        }
        return null;
    }

    @Override
    public void registeBean(String beanName, Object bean) {
        //some illegal judge

        if(this.containsBean(beanName)){
            System.out.println("bean已存在" + beanName);
        }

        beanMap.put(beanName, bean);
    }

    @Override
    public Boolean containsBean(String beanName) {
        return beanMap.containsKey(beanName);
    }

}
