package ch7;

class InnerEx2 {
    class InstanceInner{}
    static class StaticInner {}
    InstanceInner iv = new InstanceInner();
    static StaticInner staticInner = new StaticInner();
    static void staticMethod() {
        //InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        InnerEx2 innerEx2 = new InnerEx2();
        InstanceInner obj1 = innerEx2.new InstanceInner();
    }
    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }
}
