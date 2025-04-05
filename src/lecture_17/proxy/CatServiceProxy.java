package lecture_17.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CatServiceProxy implements InvocationHandler {
    CatService catService;

    public CatServiceProxy(CatService catService) {
        this.catService = catService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Логика перед вызовом метода
        System.out.println("Getting ready to introduce cat...");

        // Вызов метода нашего объекта
        Object result = method.invoke(catService, args);

        // Логика после вызова метода
        System.out.println("Cat introduced successfull!");

        return result;
    }
}
