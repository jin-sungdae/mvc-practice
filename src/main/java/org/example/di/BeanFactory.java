package org.example.di;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BeanFactory {

    private final Set<Class<?>> preInstantiatedClazz;
    private Map<Class<?>, Object> beans = new HashMap<>();

    public BeanFactory(Set<Class<?>> preInstantiatedClazz) {
        this.preInstantiatedClazz = preInstantiatedClazz;
    }

    public <T> T getBean(Class<T> requiredType) {
        return (T) beans.get(requiredType);
    }
}
