package lecture_17.proxy;

public class CatServiceImpl implements CatService{
    @Override
    public void introduceCat(String name) {
        System.out.println("Meet my cat " + name);
    }
}
