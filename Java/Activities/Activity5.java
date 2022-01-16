package Activities;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    public String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    public void setTitle(String s) {
        title = s;
    }
        }

public class Activity5 {
    public static void main(String[] args) {
        Book nb = new MyBook();
        nb.setTitle("maths");
        System.out.println(nb.getTitle());
    }

}
