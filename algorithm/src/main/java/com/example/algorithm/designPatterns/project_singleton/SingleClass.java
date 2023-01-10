package com.example.algorithm.designPatterns.project_singleton;

public class SingleClass {
    public String toString() {
        return "This is a Single Instance Class.";
    }
    private static SingleClass instance = new SingleClass();
    public static SingleClass getInstance(){
        return instance;
    }
}
/**
 //1. 饿汉模式：在类加载时就完成单例对象的创建，线程安全但效率不高(浪费时间和内存)
 public class Singleton {
 private Singleton(){}
 private static Singleton instance = new Singleton();
 public Singleton getInstance(){
 return instance;
 }
 }
 //2. 静态代码块：变相的饿汉模式，同样是在类加载时就完成单例对象的创建
 public class Singleton {
 private Singleton(){}
 private static Singleton instance;
 static {
 instance = new Singleton();
 }
 public Singleton getInstance(){
 return instance;
 }
 }
 //3. 懒汉模式：只有调用getInstance方法时才创建单例对象的实例，线程不安全但效率高
 public class Singleton {
 private Singleton(){}
 private static Singleton instance;
 public Singleton getInstance(){
 if(instance == null){
 instance = new Singleton();
 }
 return instance;
 }
 }
 //4. 线程安全的懒汉模式（不推荐）：使用synchronized同步锁实现Double Check Lock，保证了线程安全，但牺牲了一些性能
 //   参考: https://www.jianshu.com/p/ca19c22e02f4
 public class Singleton {
 private Singleton(){}
 private static volatile Singleton instance;
 //也可以在函数上加同步锁(加锁的对象是Singleton对应的Class类的实例),
 //缺点在于：已经创建instance之后，获取instance的多个线程还需要排队获取锁，性能非常差
 public Singleton getInstance(){
 //这一层if判断，保证当instance创建后，获取instance时不需要加锁
 if(instance == null){
 synchronized(Singleton.class){ //加锁的对象是Singleton对应的Class类的实例
 //这一层if判断，保证只有一个线程能够创建instance
 if(instance == null){
 instance = new Singleton();
 }
 }
 instance = new Singleton();
 }
 return instance;
 }
 }

 //5. 静态内部类(推荐)：利用一个内部类实现了懒加载，线程安全，效率高
 public class Singleton {
 private Singleton(){}
 private static class SingletonHandler{
 private static Singleton instance = new Singleton();
 }
 public Singleton getInstance(){
 return SingletonHandler.instance;
 }
 }

 //6. 枚举类型实现(推荐)：枚举类的一个枚举项就是这个枚举类的一个实例
 //   使用枚举类型实现单例，不仅线程安全，效率高，而且可以防止通过反射或序列化破坏单例的限制
 //   参考: https://www.jianshu.com/p/d9d9dcf23359
 public enum Singleton {
 INSTANCE;
 private Singleton(){}
 }
 **/