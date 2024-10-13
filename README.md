# java-custom-annotation-injection

There is a example of Custom Injection of your class.

```Shell
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MyCustomInject {
    Class whichClass();
}
```
