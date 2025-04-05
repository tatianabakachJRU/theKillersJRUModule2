package lecture_17.proxy;

import java.lang.reflect.Proxy;

public class CatProxyExample {
    public static void main(String[] args) {
        CatService catService = new CatServiceImpl();
        CatService proxyInstance = (CatService) Proxy.newProxyInstance(
                CatService.class.getClassLoader(),
                new Class<?>[]{CatService.class},
                new CatServiceProxy(catService)
        );
        proxyInstance.introduceCat("Tom");
    }
}
