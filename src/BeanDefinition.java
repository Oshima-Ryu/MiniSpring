import org.apache.commons.lang3.StringUtils;

import java.util.List;

public interface BeanDefinition {

    String SINGLETON = "singleton";
    String PROTOTYPE = "prototype";

    Class<?> getBeanClass();

    String getBeanName();

    String getBeanFactory();

    String getCreateBeanMethod();

    String getInitBeanMethodName();

    String getBeanDestoryName();

    default boolean valiate(){
        if(getBeanClass() == null){
            if(StringUtils.isBlank(getBeanFactory()) && StringUtils.isBlank(getCreateBeanMethod())){
                return false;
            }
        }
        return true;
    }

    List<?> getConstructorAge();

}
