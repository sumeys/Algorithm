# 代码片段

1
```
 public static void main(String[] args) {
        String[][] s = {{"helloworld", "hello world"}, {"this is", "a java program"}};
        System.out.println((new StringTokenizer(s[1][1])).countTokens() > 2);  //true
    }
```
2

```
public class Main {

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class clazz = classLoader.loadClass("A");
        System.out.print("Test");
        clazz.forName("A");
    }

    //输出：TestA
}

class A {
    static {
        System.out.print("A");
    }
}
```

3
```
public class Main {

    private static int x = 10;
    private static Integer y = 10;

    public static void updateX(int value) {
        value = 3 * value;
    }

    public static void updateY(Integer value) {
        value = 3 * value;
    }

    public static void main(String[] args) {
        updateX(x);
        updateY(y);
        System.out.println(x);  //10
        System.out.println(y);  //10
    }
}
```
4
```
public class Main {
    public static void main(String[] args) {
        System.out.println("A");
        new Main();
        new Main();  //输出：DACBCB
    }

    public Main() {
        System.out.println("B");
    }

    {
        System.out.println("C");
    }

    static {
        System.out.println("D");
    }
}
```
5
```
public class Main {
    public static void main(String[] args) {
        System.out.println(main2.a); //okJD
        System.out.println(main2.b); //jd
    }
}

class main2 {
    static {
        System.out.print("ok");
    }

    public static final String a = new String("JD");
    public static final String b = "jd";
}
```
6



