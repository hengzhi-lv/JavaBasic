## 第三章 Java的基本程序设计结构
### 1.简单程序
```java
public class FirstSample {
    public static void main(String[] args) {
        System.out.println("we will not use 'Hello , World !'");
    }
}
```
基本结构：  
**修饰符**  
关键字public为访问权限修饰符，用于控制程序的其他部分对这段代码的访问级别。  
public表示该class是公开的  
不写public，也能正确编译，但是这个类将无法从命令行执行。  
**类名**  
Java程序的基本单位，关键字class FirstSample表示该calss的名字，一个class中可以有多个方法  
* 类名必须以英文字母开头，后接字母，数字和下划线的组合
* 习惯以大写字母开头

**方法名**  
这里的方法名是main，返回值是void，表示没有任何返回值。

* 方法名也有命名规则，命名和class一样，
* 首字母小写：


### 2.注释
当行注释
//  

多行注释
/*
*/

自动生成的文档
/**
*/
### 3.数据类型
Java强语言类型必须每一个变量声明一次数据类型，8种基本数据类型  
**4种整型 byte、short、int、long**  



| 整型  |占用字节空间大小| 取值范围                          | 默认值 |
|-----|---|-------------------------------|---|
| byte |1字节| -128（-2^7） ~ 127(2^7-1)       | 0 |
| short |2字节 | -32768(-2^15) ~ 32767(2^15-1) | 0 |
| int |4字节 | -2^31 ~ （2^31） - 1            | 0 |
| long |8字节 | -2^63 ~ （2^63） - 1            | 0L|
       
 要声明long型可以加"l"或者"L"，小写l或者大写L。


**2种浮点型 float、double**  

| 整型  | 占用字节空间大小 | 取值范围                             | 默认值  |
|-----|----------|----------------------------------|------|
| float | 4字节      | -3.403E38~3.403E38           | 0.0F |
| double | 8字节      | 4.9E-324 ～1.7976931348623157E308 | 0.0D |

java中的小数，默认类型是double
在运算过程中，由于不同的数据类型会转换成同一种数据类型，所以整型、浮点型以及字符型都可以参与混合运算。自动转换的规则是从低级类型数据转换成高级类型数据。转换规则如下：
数值型数据的转换：byte→short→int→long→float→double。
字符型转换为整型：char→int。
java中，包含浮点数的运算，其结果都是近似值，因为浮点数在java中的存储不是完全精确的，举个例子，
```
System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
System.out.println(1.0 - 0.1);
```
O/P
```
0.5000000000000001
0.09999999999999998
```
这种舍入误差的主要原因是浮点数值采用二进制系统表示，
//而在二进制系统中无法精确地表示分数1/10。这就好像十进制无法精确地表示分数1/3一样。
//如果在数值计算中不允许有任何舍入误差，就应该使用 BigDecinal 类

**1种字符型 char**  

| 整型   | 占用字节空间大小 | 取值范围      | 默认值 |
|------|----------|-----------|---|
| char | 16 字节    | 0 ~ 65535 | 0 |
char型数据用来表示通常意义上“字符”。
表示单个的字符，使用单引号引起来的，但本质上是个数值，因为对应的字符编码值。
Java字符采用Unicode编码，每个字符占两个字节，因而可用十六进制编码形式表示(Unicode是全球语言统一编码)

|     | 名称   | 描述      |
|-----|------|---------|
| \n  | 换行   | 将光标移到下一行的第一格。 |
| \r  | 回车   |  将光标移到当前行的第一格。        |
| \t  | 水平制表 | 将光标移到下一个水平制表位置。         |
| \'  | 单引号  |   产生一个单引号。       |
| \"  | 双引号  | 产生一个双引号。 |
| \\  | 斜杠   |  产生一个斜杠。|




**1种真值 boolean**  
两个值 true、false  
整数值和布尔值之间不能互相转换

**类型转换**
**自动类型转换**：  
数据类型取值范围小的转为取值范围大的
1.byte ---> short--->int--->long--->float --->double
2.char---> int
3.byte,short,char三者在计算时会转换成int类型  （了解）
4.int整型常量和字符常量在合理范围内可以直接赋值给 byte、short、int、char （了解）  
**强制转换**  
需要使用强制转换符：就是在要转换的数值前，使用小括号扩起来要转换的数据类型。


### 4.变量与常量  
变量用来储存值，常量是值不变的变量。
#### 3.4.1 变量声明
Java 中每个变量都有类型（type），声明时先指定类型然后是变量名。  
例如：
```
int a, b, c;         // 声明三个int型整数：a、 b、c
int d = 3, e = 4, f = 5; // 声明三个整数并赋予初值
byte z = 22;         // 声明并初始化 z
String s = "runoob";  // 声明并初始化字符串 s
double pi = 3.14159; // 声明了双精度浮点型变量 pi
char x = 'x';        // 声明变量 x 的值是字符 'x'。
```
**tips**:  
变量名以字母数字开头，不能使用保留字来命名，声明以分号结束，可以在一行声明多个变量。  
变量声明的地方尽量离第一次使用的地方近一些  

#### 3.4.2 变量初始化
从Java10 开始，对于局部变量，如果可以从变量的初始值推断出它的类型，就不再需要声明类型。只需要使用关键字 var 而无须指定类型：

声明一个变量之后，必须用赋值语句对变量进行显式初始化， 干万不要使用未初始化的变量的值。  
例如，Java 编译器认为下面的语句序列是错误的：int vacationDays；System.out.println(vacationDays);// ERROR--variable not initialized要想对一个已经声明过的变量进行赋值，就需要将变量名放在等号(）左侧，再把一个适当取值的 Java 表达式放在等号的右侧。int vacationDays；vacationDays = 12；也可以将变量的声明和初始化放在同一行中。例如：int vacationDays = 12；
```
var a = 100;
var b ="Hello world!";
```
### PS：参考博客
原文链接：https://blog.csdn.net/hanru723/article/details/116735621
#### 3.4.3 常量
利用关键字final指代常量
```java
/**
 * Created by zejian on 2017/5/7.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 * 使用普通方式定义日期常量
 */
public class DayDemo {

    public static final int MONDAY =1;

    public static final int TUESDAY=2;

    public static final int WEDNESDAY=3;

    public static final int THURSDAY=4;

    public static final int FRIDAY=5;

    public static final int SATURDAY=6;

    public static final int SUNDAY=7;

}

```
#### 3.4.4 枚举类型
枚举类型（一种特殊的数据类型 1.5中新增类型），使用关键字enum，值一般是大写的字母，多个值之间以逗号分隔
```java
//枚举类型，使用关键字enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```
### 3.5 运算符