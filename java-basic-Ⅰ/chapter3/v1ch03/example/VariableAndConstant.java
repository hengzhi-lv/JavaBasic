package v1ch03.example;

/**
 * @projectName: java-basic
 * @package: v1ch03.example
 * @className: VariableAndConstant
 * @author: lvnn5
 * @description: 变量和常量
 * @date: 2023/3/6 16:51
 * @version: 1.0
 */
public class VariableAndConstant {
    int a, b, c;         // 声明三个int型整数：a、 b、c
    int d = 3, e = 4, f = 5; // 声明三个整数并赋予初值
    byte z = 22;         // 声明并初始化 z
    String s = "runoob";  // 声明并初始化字符串 s
    double pi = 3.14159; // 声明了双精度浮点型变量 pi
    char x = 'x';        // 声明变量 x 的值是字符 'x'。

    int y = 100;
    String g = "Hello world!";

    // 常量类型声明，关键字 final
    public static final int MONDAY = 1;

    public static final int TUESDAY = 2;

    public static final int WEDNESDAY = 3;

    public static final int THURSDAY = 4;

    public static final int FRIDAY = 5;

    public static final int SATURDAY = 6;

    public static final int SUNDAY = 7;

    //枚举类型，使用关键字enum
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }


}
