# java-custom-annotation-injection

There is a example of Custom Injection on your class.

```Shell
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MyCustomInject {
    Class whichClass();
}
```
