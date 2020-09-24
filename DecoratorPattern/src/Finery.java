/*
Finery继承了Person，同时有一个Person类型的成员变量
每次调用Decorate方法来装饰
 */
public class Finery extends Person {
    protected Person component;

    public void Decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null)
            component.show();
    }
}
