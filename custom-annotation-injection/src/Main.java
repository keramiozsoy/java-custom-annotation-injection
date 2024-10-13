import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {

    @MyCustomInject(whichClass = Dog.class)
    public static Animal animal;

    @MyCustomInject(whichClass = Horse.class)
    public static Animal anotherAnimal;

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {


        Class mainClass = Main.class;
        Field[] fields = mainClass.getFields();
        for (Field field : fields){
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations){
                if(annotation instanceof MyCustomInject){
                    MyCustomInject myCustomInject = (MyCustomInject) annotation;
                    Class whichClass = myCustomInject.whichClass();
                    Object o = whichClass.newInstance();
                    if(o instanceof Dog){
                        Dog dog = (Dog)o;
                        field.set(null,dog);
                    }
                    if(o instanceof Horse){
                        Horse horse = (Horse)o;
                        field.set(null,horse);
                    }
                }
            }

            }

        //
        animal.eat();
        anotherAnimal.eat();
    }
}