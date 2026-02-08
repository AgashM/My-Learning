package classandobject;

class Cat implements Cloneable{
    String catName = "fluffy";
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Clone {
    public static void main(String[] args) {

        try{
            Cat persianCat = new Cat();
            Cat mexicanCat = (Cat) persianCat.clone();
            System.out.println(mexicanCat.catName);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
