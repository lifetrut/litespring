/**
 * @author:Leo
 * @create 2018/6/21
 * @desc
 */
package com.litespring.context.support;

import com.litespring.beans.factory.support.DefaultBeanFactory;
import com.litespring.beans.factory.xml.XmlBeanDefinitionReader;
import com.litespring.context.ApplicationContext;
import com.litespring.core.io.ClassPathResource;
import com.litespring.core.io.Resource;

public class ClassPathXmlApplicationContext implements ApplicationContext {

    private DefaultBeanFactory factory = null;

    public ClassPathXmlApplicationContext(String configFile) {
        factory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        Resource resource = new ClassPathResource(configFile);
        reader.loadBeanDefinitions(resource);
    }

    public Object getBean(String beanId) {
        return factory.getBean(beanId);
    }
}
