package lecture_7;

public class InstanceofExample_6 {
    public static void main(String[] args) {
        String str1 = "Hello The Killers";
        String str2 = "Hello The Killers";

        if(str1 instanceof String){
            String string = (String) str1;
            System.out.println(string.toLowerCase());
        }

        if(str2 instanceof String string){
            System.out.println(string.toLowerCase());
        }
    }
}
