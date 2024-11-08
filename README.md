# java-custom-annotation-injection

There is an example of Custom Injection in your class.

```Shell
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MyCustomInject {
    Class whichClass();
}
```
