import org.apache.commons.lang3.StringUtils;

import java.util.List;

public interface BeanDefinition {

    String SINGLETON = "singleton";
    String PROTOTYPE = "prototype";

    Class<?> getBeanClass();
    String getScope();

    boolean isSingleton();
    boolean isPrototype();
    String getFactoryBeanName();
    String getFactoryMethodName();
    String getInitMethodName();
    String getDestoryMethodName();

//    String getBeanName();
//
//    String getBeanFactory();
//
//    String getCreateBeanMethod();
//
//    String getInitBeanMethodName();
//
//    String getBeanDestoryName();

    default boolean valiate(){
        if (getBeanClass() == null) {
            if(StringUtils.isBlank(getFactoryBeanName()) && StringUtils.isBlank(getFactoryMethodName())){
                return false;
            }
        }

        if (this.getBeanClass() != null && StringUtils.isNoneEmpty(this.getFactoryMethodName())) {
            return false;
        }
        return true;
    }

    List<?> getConstructorAge();

}
