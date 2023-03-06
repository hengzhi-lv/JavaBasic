package v1ch03.example;

import java.math.BigDecimal;
/**
 * @projectName: java-basic
 * @package: v1ch03.example
 * @className: PrimitiveType
 * @author: 珩之
 * @description: 基本数据类型
 * @date: 2023/3/6 16:51
 * @version: 1.0
 */
public class PrimitiveType {
    public static void main(String[] args) {
        //Integer Types整型
        /*
        byte:-2^7~2^7-1       -128～127
        short:-2^15~2^15-1    -32768～31767
        int: -2^31~2~31-1     -2147483648~2147483647
        long:-2^63~2^63-1     -9223372036854775808~9223372036854775807
        要声明long型可以加"l"或者"L"，小写l或者大写L。

         */

        BigDecimal data = new BigDecimal(Math.pow(2, 63));
        System.out.println("科学计数" + Math.pow(2, 63) + "整数：" + data);
        //科学计数9.223372036854776E18 整数：9223372036854775808       Math.pow（）精度位double 会跟float精度有差别
        byte integerType1 = -128;
        short integerType2 = -32768;
        int integerType3 = -2147483648;
        long integerType4 = 9223372036854775807L;
        long integerType5 = -9223372036854775808L;



       /*floating-point Types 浮点型
       float   单精度浮点数 （精度6，7位）     4字节
       double  双精度浮点数 （精度15，16位）   8字节
       Java浮点类型常量有两种表示形式: 1.十进制数 2.科学计数法
        注意：float double存储的数据都是近似值。
        java中的小数，默认类型是double
        在运算过程中，由于不同的数据类型会转换成同一种数据类型，所以整型、浮点型以及字符型都可以参与混合运算。自动转换的规则是从低级类型数据转换成高级类型数据。转换规则如下：
        数值型数据的转换：byte→short→int→long→float→double。
        字符型转换为整型：char→int。
        */

        float floatingPointType1 = 1F;
        double floatingPointType2 = 1;
        System.out.println(2.0 - 1.1);
        //0.8999999999999999 这种舍入误差的主要原因是浮点数值采用二进制系统表示，
        //而在二进制系统中无法精确地表示分数1/10。这就好像十进制无法精确地表示分数1/3一样。
        //如果在数值计算中不允许有任何舍入误差，就应该使用 BigDecinal 类

        /*
        char Type
        char型数据用来表示通常意义上“字符”。
        表示单个的字符，使用单引号引起来的，但本质上是个数值，因为对应的字符编码值。
        Java字符采用Unicode编码，每个字符占两个字节，因而可用十六进制编码形式表示(Unicode是全球语言统一编码)
       */
        char charType = 1;
    /*
     转义字符：将字符进行转义-->语法上使用\
       1、将有特殊作用的字符，转为普通的字符，不再起作用
         \',\",\\
       2、还可以将一些普通的字符，转为有特殊含义的作用
         \n,\t
     */
        char c = '\'';//'
        System.out.println(c);
        char c2 = '"';//"
        System.out.println(c2);
        System.out.println("Hello\nWor\tld");
        System.out.println("D:\\Ruby\\程序咖");//路径
        System.out.println("\"HelloWorld\"");//打印带双引号的helloworld




        //boolean Type 布尔类型
        boolean booleanType = true;
    }
}
