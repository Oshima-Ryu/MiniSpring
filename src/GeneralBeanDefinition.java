import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Data
public class GeneralBeanDefinition implements BeanDefinition {

    private Class<?> beanClass;
    private String scope = BeanDefinition.SINGLETON;
    private String factoryBeanName;
    private String factoryMethodName;
    private String destoryMethodName;

    public void setScope(String scope){
        if (StringUtils.isNoneBlank(scope)) {
            this.scope = scope;
        }
    }

    @Override
    public Class<?> getBeanClass() {
        return this.beanClass;
    }

    @Override
    public String getBeanName() {
        return null;
    }

    @Override
    public String getBeanFactory() {
        return null;
    }

    @Override
    public String getCreateBeanMethod() {
        return null;
    }

    @Override
    public String getInitBeanMethodName() {
        return null;
    }

    @Override
    public String getBeanDestoryName() {
        return null;
    }

    @Override
    public List<?> getConstructorAge() {
        return null;
    }
}
