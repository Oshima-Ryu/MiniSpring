/**
 * @author:wangdingxiong
 * @date: 2019-08-12
 * @time: 20:41
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception;

    BeanDefinition getBeanDefinition(String beanName);

    Boolean containsBeanDefinition(String beanName);
}
