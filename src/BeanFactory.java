public interface BeanFactory {

    Object getBean(String beanName);

    void registeBean(String beanName, Object bean);

    Boolean containsBean(String beanName);

}
