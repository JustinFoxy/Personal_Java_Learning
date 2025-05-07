# **Java后端自学路线**

## 序幕

###### 想成为一名 Java 后端程序员，要求可不低。

**基础要求**：

- **Java 基础**：必须极其扎实。像**多线程、集合、I/O 流**，要深入理解原理并能熟练运用。

  **多线程**，不仅要知道怎么创建线程，还要清楚线程安全问题怎么解决，各种锁机制的应用场景。

  **集合**方面，不同集合类的优缺点、适用场景要了如指掌，在实际开发中能准确选择合适的集合。

  **I/O 流**要能根据不同的数据类型和业务场景，正确选择字节流或字符流进行高效的数据处理。

- **面向对象编程**：要精通**封装、继承、多态**的概念及应用，懂得如何设计良好的类结构，提高代码的可维护性和复用性。

**数据库知识**：

- **关系型数据库**：精通 MySQL 是基本要求。要熟练掌握数据库设计原则，能设计出合理的数据库表结构。

  SQL 语句要写得又快又准，包括复杂的查询、连接、分组、排序等操作，还要懂得数据库索引原理及优化，提升查询性能。

- **非关系型数据库**：Redis 必须掌握，了解它的数据结构，如字符串、哈希、列表、集合、有序集合等，知道在什么场景下使用哪种数据结构，以及如何利用 Redis 实现缓存、分布式锁等功能。

**框架方面**：

- **Spring 家族**：Spring Boot 要熟练掌握，能够快速搭建项目，整合各种中间件，理解自动配置原理。

  Spring Cloud 也要有所涉猎，了解微服务架构下的服务注册与发现、配置中心、熔断器等组件的原理及使用。

- **MyBatis**：掌握其 SQL 映射、动态 SQL 等功能，能实现 Java 对象与数据库表的高效交互。

**中间件**：

- **消息队列**：像 RabbitMQ、Kafka 要熟悉，明白消息队列的应用场景，如异步处理、削峰填谷等，掌握消息的发送、接收及可靠性保证机制。
- **缓存**：除了 Redis，对 Memcached 等也应有所了解，理解缓存穿透、缓存雪崩、缓存击穿等问题及解决方案。

**其他**：

- **设计模式**：熟悉常用设计模式，如单例模式、工厂模式、代理模式等，在实际开发中能合理运用设计模式优化代码结构，提高可扩展性。
- **Linux 基础**：掌握基本的 Linux 命令，如文件操作、权限管理、进程管理等，因为很多 Java 项目都是部署在 Linux 服务器上。

只有书本概念，那就需要大量实践。可以先从简单的 Java 项目入手，比如 Web 项目，利用 Spring Boot 搭建项目骨架，整合 MyBatis 操作数据库，使用 MySQL 存储数据。接着尝试引入 Redis 缓存，消息队列等中间件，一步步提升自己的实践能力。同时，多参与开源项目，学习别人的代码结构和开发思路。



##### 二级 Java 考试存在一定局限性。

它**侧重于基础知识的考查，覆盖的知识点虽广，但深度往往不够**。比如对于集合、多线程这些关键内容，考试可能仅涉及表面概念，不会深入到实际应用场景及底层原理。

然而，也不能完全否定它的价值。对于初学者，准备计算机二级考试能帮助你系统梳理 Java 基础知识框架，让你对 Java 有一个较为全面的初步认识。但要成为一名合格的 Java 后端程序员，仅靠计算机二级的知识远远不够。你需要在其基础上，深入钻研像集合源码、多线程并发控制这样的重点难点，掌握主流框架和中间件，积累项目实践经验。所以，别因为它有不足就轻视之前学习的收获，而是要以其为起点，朝着更专业、更深入的方向继续学习。



##### 只有书本概念，实践经验匮乏，强烈建议先扎实巩固 Java 基础。

Java 基础是整个 Java 编程体系的基石。多线程、集合、I/O 流等基础知识如果理解不深，在实际项目开发中会遇到诸多阻碍。例如，不透彻理解多线程的同步机制，在处理并发业务时就极易出现数据不一致等严重问题；对集合的底层原理若掌握不好，选择了不恰当的集合类，可能导致程序性能低下。

只有将这些基础打牢，你在接触项目时才能更顺畅。比如在 Spring Boot 项目中，无论是处理请求数据（可能涉及集合操作），还是实现异步任务（需要多线程知识），扎实的基础都能让你更快上手。

等你对 Java 基础有了较为深入且熟练的掌握后，再着手进行简单 Java 项目开发。通过项目实践进一步巩固知识，同时学习项目开发流程、架构设计等实际应用技能，这样循序渐进的学习路径能让你更稳健地成长为一名合格的 Java 后端程序员。



##### 关于 Android Studio ，如果你的目标是成为 Java 后端程序员，它并非核心重点，但了解一些基础知识也有好处。

Android 开发主要侧重于移动端应用，与后端开发的业务逻辑处理、数据存储交互等重点不太一样。不过**掌握 Android 基础知识能让你对整个移动开发生态有更全面的理解，尤其在前后端交互方面可能会有帮助**。

而 **JSP，在如今的 Java Web 开发中，其使用场景已逐渐减少**。

现代 Java Web 开发更多倾向于使用前后端分离架构，**前端使用 Vue.js、React 等框架构建用户界面，后端提供 RESTful API 接口**。但 JSP 作为 Java Web 发展历程中的重要技术，了解它有助于你理解 Web 开发的演变过程，对一些遗留项目的维护也可能有帮助。如果时间有限，**不将其作为重点学习也无妨，把精力更多放在主流的后端开发技术上**。总之，两者都不是当下 Java 后端程序员核心必备技能，但了解它们能拓宽你的知识面。



##### 对于 Java 后端程序员来说，正则表达式是非常值得学习且有必要掌握的一项技能。

在实际开发中，很多场景都会用到正则表达式。比如在数据验证方面，当你接收前端传来的数据时，像邮箱地址、手机号码、身份证号码等格式的验证，使用正则表达式可以简洁高效地完成。在文本处理上，如果你需要从一段文本中提取特定格式的信息，或者替换符合某种模式的字符串，正则表达式就派上用场了，例如从日志文件中提取特定格式的时间戳。

在 Java 中，通过`java.util.regex`包提供了对正则表达式的支持，包括`Pattern`和`Matcher`类等。掌握正则表达式，能让你在处理字符串相关业务逻辑时更加得心应手，提升代码的简洁性和效率。所以，别忽视对正则表达式的学习，它会成为你开发工具库中的有力武器。



##### 如果你的目标是成为 Java 后端程序员，Java GUI 并不是重点学习内容。

Java GUI 主要用于开发桌面应用程序，比如 Swing 和 AWT 等技术。

然而，**当下后端开发主要聚焦于服务器端编程，处理业务逻辑、数据库交互、提供 API 接口等，与前端通过网络进行数据交互。在这个过程中，很少会涉及到 Java GUI 相关内容。**

但如果你对跨平台桌面应用开发感兴趣，或者想拓展自己的技能边界，了解一些 Java GUI 知识也无妨。只是从主流的 Java 后端开发岗位需求来看，将大量时间投入到 Java GUI 学习上并非明智之举，你更应该把精力放在诸如多线程、集合、I/O、数据库、后端框架（如 Spring Boot 等）以及中间件等关键领域。



##### 在当下的 Java 后端开发领域，MySQL 的应用远比 SQL Server 更为广泛。

MySQL 是开源数据库，具有**成本低、性能高、可扩展性强等优点，尤其适合用于互联网项目的开发**。众多互联网公司，从小型创业公司到大型科技企业，都广泛使用 MySQL 来存储和管理数据。

在学习 MySQL 过程中，你**不仅要掌握基本的 SQL 语句，如数据定义（DDL）、数据操作（DML）、数据查询（DQL），还要深入理解数据库设计原则、索引优化、事务管理等内容，这对于开发高效稳定的后端应用至关重要**。

虽然你在大学里学习了 SQL Server，但**如果你的目标是 Java 后端开发，建议你着重学习 MySQL**。当然，SQL Server 也有其优势，在一些传统企业级项目中仍有应用，如果你对传统企业开发方向感兴趣，或者未来有可能接触到相关项目，SQL Server 的知识也可作为补充。但就主流的 Java 后端开发趋势而言，MySQL 是优先且必须掌握的数据库技术。



##### 对于多线程、I/O 和集合，吃透它们可不光是记住概念。

多线程要深入到源码级别，比如线程池的实现原理，ThreadPoolExecutor 类中各个参数的作用和对线程池运行的影响，还要能熟练运用并发包下的各种工具类解决实际问题。

I/O 流不仅要会基本的文件读写，还要掌握网络 I/O，像 NIO（New I/O）的多路复用机制，对比传统 I/O 理解其优势和适用场景。

集合则要对每个常用集合类的源码了如指掌，像 HashMap 的哈希算法、扩容机制，以及如何优化其性能等。

等你觉得这些基础已经扎实了，再逐步深入到数据库、框架和中间件等方面的学习，稳扎稳打，才能真正成为一名优秀的 Java 后端程序员。

# 现在我们开始学习Java SE中的基础

## 遗漏知识点

##### int 与 Integer（包装类）

int 是 Java 的基本数据类型，**Integer 是 int 对应的包装类**。

首先，从存储方式来说，**int 变量直接存储数值，占用 4 个字节**，存储在栈中（局部变量情况下）。而 **Integer 对象是引用类型**，存储的是对象的引用，对象本身存储在堆中，**占用空间相对较大**。

在使用场景上，基本数据类型 int 通常用于简单的数值运算，性能更高，因为不需要像对象那样进行复杂的创建和管理过程。Integer 更多用于需要将 int 作为对象处理的场景，比如在集合框架中，因为**集合只能存储对象类型，所以要使用 Integer**。

关于默认值，**int 的默认值是 0，而 Integer 的默认值是 null**。这在涉及到空值判断等逻辑时非常关键，如果使用不当可能会引发空指针异常。

在进行一些自动装箱和拆箱操作时，**Java 5.0 引入了自动装箱（将 int 自动转换为 Integer）和拆箱（将 Integer 自动转换为 int）机制**。虽然这在一定程度上简化了代码，但也要理解其原理，因为在某些复杂场景下，比如在循环中频繁进行装箱拆箱操作，会影响性能。

所以，不能简单认为 int 和 Integer 的区别只是包装类，要全面理解它们在存储、使用场景、默认值以及装箱拆箱等多方面的差异。



## 学习方向

#### **先学习泛型和多态，对理解集合会有极大帮助。**

**泛型与集合紧密相关，集合框架大量运用了泛型**。比如范型类`List<String>`明确了该列表只能存放`String`类型元素，这不仅增强了类型安全性，还避免了类型转换异常。掌握泛型能让你更清晰地理解集合如何处理不同类型的数据，编写更健壮、通用的集合操作代码。

多态在集合场景中也有体现。例如，**你可以将不同子类对象放入以父类类型定义的集合中，利用多态特性对这些对象进行统一操作，这在面向对象编程中是常见的设计方式**。

**先学习泛型和多态，能为学习集合打下良好基础，让你在学习集合时理解更深入、学习更高效。**若直接学习集合，后续再回头学泛型和多态，可能在理解集合一些特性和用法时会有阻碍，还需重新梳理相关知识。因此，建议你先完成泛型和多态的学习，再进入集合的学习。



#### **泛型和多态是 Java 的核心特性。**

**泛型允许你在定义类、接口和方法时使用类型参数，使得代码能够适应不同的数据类型，提高了代码的复用性和类型安全性**。比如在集合框架中，泛型就发挥了巨大作用，像`List<String>`明确表明这个列表只能存放字符串类型的数据，避免了运行时的类型错误。如果不掌握泛型，在实际开发中处理集合等数据结构时会遇到诸多不便，代码也会变得冗长且容易出错。

多态是面向对象编程的重要特性之一。**它基于继承和接口实现，使得同一个方法调用在不同的对象上可以产生不同的行为**。比如一个父类引用可以指向子类对象，通过这个父类引用调用子类重写后的方法，就体现了多态。多态让代码更具灵活性和扩展性，当有新的子类加入时，无需修改太多原有代码，只需要在子类中实现相应方法即可。在大型项目的架构设计中，多态无处不在，对提高代码的可维护性和复用性至关重要。

**泛型和多态是 Java 开发必须掌握的关键内容，绝不能忽视。**



**集合相对来说可以最先学**。集合在 Java 编程中应用极为广泛，是日常开发中频繁使用的基础部分。掌握集合框架能够快速上手一些简单的 Java 程序编写，建立起对 Java 编程实用性的初步认识。而且集合的学习难度相对没那么高，其原理和操作比较直观，通过学习集合，能快速熟悉 Java 的泛型等基础语法特性。

**多线程和 I/O 流相比集合要复杂一些**。多线程涉及到并发编程的概念，对逻辑思维要求较高，理解线程的生命周期、线程同步、死锁等问题需要花费较多精力。

I/O 流虽然理解起来不算特别难，但要掌握不同类型流的使用场景、字节流与字符流的区别等细节，也需要一定时间。

**建议先从集合入手，打下一定基础后，再学习 I/O 流，最后攻克多线程。这样循序渐进，有助于更好地吸收知识。**



# 范型（Generics）

范型类、范型方法

**范型方法**自由度更高，因为不是类是方法所以可以到处实现方法。而**范型类**一旦定义后就固定了，整型就只能放整型，字符型就只能放字符型不能混用，这使泛型类更严谨。

范型还可以定义上下界：

```java
<T extends Number>	//可以是Number或Number的子类（往下派生），适合用来读取数据
```

```java
<T super Number>	//可以是Number或Number的父类（往上追溯），适合用来写入数据
```



# 多态（Polymorphism）

**同一个方法，在不同对象上表现出不同的行为。**



# 集合（Collection Framework）

集合框架是 Java 中专门用来：

- **存储一组对象**（比如一堆学生、商品、订单…）
- **方便地遍历、搜索、增删改查**

在实际开发里，集合用得特别多！！（SpringBoot到处是List、Map、Set）



### 学集合的顺序：

1. 什么是集合？为什么需要集合？
2. 最常用的集合接口和实现类
   - List（ArrayList、LinkedList）
   - Set（HashSet）
   - Map（HashMap）
3. 增删改查操作
4. 遍历集合（for、迭代器）



### **集合是什么**

集合就是一种用来存储多个数据对象的工具

它们就像是**容器**或者**口袋**，可以放很多东西在里面，比如：10个学生，100条订单，10000个商品…



### 为什么要用集合？

**想象一下：**

如果我们想存5个学生名字，以前学过的是——用变量！

```java
String student1 = "小明";
String student2 = "小红";
String student3 = "小刚";
String student4 = "小美";
String student5 = "小强";
```

这样很麻烦吧！！🤯

- 每加一个学生，要多声明一个变量。
- 要找、要删、要改…超级混乱！
- 程序一点都不灵活。

**这时候，集合就登场了！**

用集合，比如 List，可以一次性存很多学生：

```java
List<String> students = new ArrayList<>();
students.add("小明");
students.add("小红");
students.add("小刚");
students.add("小美");
students.add("小强");
```

然后：

- 想加人 ➔ .add()
- 想删人 ➔ .remove()
- 想改人 ➔ .set()
- 想查人 ➔ .get()
- 想统计总人数 ➔ .size()

是不是又快又方便！！✨

### 小总结：

| **没有集合（原始写法）** | **有集合（现代写法）** |
| ------------------------ | ---------------------- |
| 每个元素单独变量         | 元素统一存放到集合     |
| 查找、增删复杂           | 增删查改超简单         |
| 代码又臭又长             | 代码简洁又优雅         |



## List

#### **什么是 List？**

- **List** 是 Java 集合框架里的一种集合接口。
- **特点**：
  - **有顺序**（元素有排列顺序，从第0个开始）
  - **可以存重复的元素**
- 常见实现类有：ArrayList、LinkedList。

### 最常用的：ArrayList

- ArrayList 是 **用数组实现的 List**。
- **增删改查**都很灵活、常用，非常适合日常开发。

例：

```java
package List;

import java.util.ArrayList;
import java.util.List;

//放进去 5 个喜欢的水果 🍎🍉🍊🍇🍌,然后依次：打印所有水果、修改第3个水果、删除第5个水果、输出剩下的水果数量
public class FruitList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("strawberry");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("pear");

        //打印所有水果
        System.out.println("我喜欢的水果有："+fruits);
        //修改第3个水果
        fruits.set(2,"🍌");
        //删除第5个水果
        fruits.remove(4);
        //输出剩下的水果数量
        System.out.println("剩下的水果数量:"+fruits.size());
    }
}
```

### 小总结（超重要记忆）：

| **方法**           | **作用**         |
| ------------------ | ---------------- |
| .add(元素)         | 增加             |
| .get(索引)         | 获取             |
| .set(索引, 新元素) | 修改             |
| .remove(索引)      | 删除             |
| .size()            | 查询当前元素数量 |







## 遍历

### for循环（普通版）

可以通过 i 访问每个元素，适合需要知道索引的位置。

```java
List<String> list = new ArrayList<>();
list.add("苹果");
list.add("香蕉");
list.add("橘子");
//	for循环实现遍历
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

### 增强for循环（foreach）

更简洁，直接拿到每个元素，不用关心下标。（注意 : 左边是元素类型，右边是集合）

```java
for (String fruit : list) {
  System.out.println(fruit);
}
```

```java
for (元素类型 元素变量 : 集合/数组) {
  // 直接拿到每一个元素，顺序访问
}
```

**内部其实是：**

- 隐藏了 Iterator
- 隐藏了 .hasNext()
- 隐藏了 .next()
- 让你**直接拿到元素**

你只看到：

- 第1次拿出第1个元素
- 第2次拿出第2个元素
- 第3次拿出第3个元素
- …

简直就是在**喂你吃数据🍚**！





### 迭代器（Iterator）

更灵活，能在遍历时安全地删除元素。

```java
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    String fruit = iterator.next();
    System.out.println(fruit);
}
```

##### 用Iterator正确删除

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo02 {
  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    fruits.add("苹果");
    fruits.add("香蕉");
    fruits.add("橘子");
    
    Iterator<String> iterator = fruits.iterator();
    while (iterator.hasNext()) {
      String fruit = iterator.next();
 *     if (fruit.equals("香蕉")) {
 *       iterator.remove(); // 	✅ 正确使用Iterator自己的remove
      }
    }
    System.out.println(fruits);
  }
}
```

#####  **Iterator 本质理解**

- Iterator就像是一个**指针（游标）**，指向集合中的每一个元素。
- iterator.hasNext() ➔ 判断 **有没有下一个元素**（就像判断指针是不是空的一样）。
- iterator.next() ➔ **拿到当前指向的元素**，然后指针自动往下移动一格。

所以整个 while (iterator.hasNext()) {} 的意思就是：

> ➔ **只要还有元素，就继续拿出来处理。**

一旦元素取完了（没有下一个了），hasNext() 返回 false，循环停止。

### 类比：

| **操作**           | **意思**                             |
| ------------------ | ------------------------------------ |
| iterator.hasNext() | 判断指针有没有指向下一个元素         |
| iterator.next()    | 拿出当前指向的元素，同时指针向后移动 |
| 遍历结束           | 指针到末尾，没有元素，停止           |

为什么要有 Iterator？

- 如果用 for 循环直接遍历，再在遍历中删除元素，会出问题（集合大小变了）。
- 但是 Iterator 提供了一个安全的方法，可以在遍历时删除元素（后面可以学）。

所以 Iterator 特别灵活，适合做比较复杂的操作！

> **Iterator就像一个可以安全移动的指针，一边取元素一边往后滑动。**



```java
Iterator<Type> it = list.iterator();
while (it.hasNext()) {
    Type element = it.next();
    // 手动取每一个元素
}
```

**这里：**

- 你要自己检查还有没有元素（hasNext）
- 你要自己拿元素（next）
- 你可以在遍历过程中 .remove() 元素

就是**更底层**、**更控制细节**。

**练一练：分别用（普通for）（增强for）（Iterator）都遍历一遍**

```java
package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//水果列表分别用	普通for	增强for	Iterator都遍历一遍
public class FruitList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("strawberry");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("pear");

        //第一种遍历
        System.out.println("第一种遍历");
        for(int i=0;i<fruits.size();i++){
            System.out.print(fruits.get(i)+" ");
        }
        System.out.println();

        //第二种遍历
        System.out.println("第二种遍历");
        for (String fruit : fruits) {
            System.out.print(fruit+" ");
        }
        System.out.println();

        //第三种遍历
        System.out.println("第三种遍历");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.print(fruit+" ");
        }
    }
}

```









## Set集合：唯一性容器，认识HashSet

| **阶段** | **内容** | **说明**                                                  |
| -------- | -------- | --------------------------------------------------------- |
| 1        | Set集合  | 了解什么是无重复集合                                      |
| 2        | Map集合  | 了解键值对存储，超级常用！（比如用户名-密码这种对应关系） |

**Set** 和 **Map** 是 Java 集合框架中非常重要的两大家族。

### **为什么需要 Set 集合？**

我们先来复习一下：

- ArrayList ➜ 有顺序、可重复（一个元素可以出现多次）
- LinkedList ➜ 也是有顺序、可重复，但底层结构是链表，更适合频繁插入删除

✅ **但有时候，我们需要一个“不能重复”的集合！**



## 举个例子：

#### 场景一：注册用户名

你做一个**注册系统，有人注册了用户名 "jack"**

那**你肯定不希望后面有人也能再注册 "jack" 对吧？**

✔️ 所以你就要用一个**“去重集合”**，来判断用户名是否已经存在。

这时候：

```java
Set<String> usernames = new HashSet<>();
```

### **场景二：抽奖系统（不能重复中奖）**

你让一个人只中奖一次，不能中两次，那你就要用一个只存“唯一中奖人”的集合。

✔️ 又是 Set！



### 所以，Set 是解决 “不能重复” 的问题！

| **集合类型** | **是否有顺序** | **是否允许重复** | **底层结构**     |
| ------------ | -------------- | ---------------- | ---------------- |
| ArrayList    | ✅ 有           | ✅ 可以重复       | 动态数组         |
| LinkedList   | ✅ 有           | ✅ 可以重复       | 双向链表         |
| HashSet      | ❌ 无           | ❌ 不可重复       | 哈希表（查重快） |

### **为什么 Set 不重复？**

Set 的实现类比如 HashSet：

- 它在添加元素时，会先通过哈希算法算出位置
- 如果发现已经有一个“哈希值一样”的元素了
- 就认为是重复的，不让你加！

💬 你加两个 Set.add("banana")，只有一个能加进去，另一个会被悄悄忽略。

> **List** 是：**谁来都收，重复也行，排好顺序**

> **Set** 是：**来的人我先检查，重复的我不收，顺序不保证**



###  Set 的核心：

| **特性**   | **意义**                                            |
| ---------- | --------------------------------------------------- |
| 无重复     | 任何值只能存在一次                                  |
| 无顺序     | 添加的顺序无法保证输出顺序                          |
| 可存泛型   | 支持任何引用类型，包括你自己写的类                  |
| 常用实现类 | HashSet, LinkedHashSet（有顺序）, TreeSet（可排序） |



### HashSet 是啥？

- **基于哈希表（HashMap）实现**
- 自动去重 ✅
- 不保证元素顺序 ❌



### LinkedHashSet —— 有“顺序感”的去重集合

| **特性**       | **说明**                                      |
| -------------- | --------------------------------------------- |
| ✅ 自动去重     | 和 HashSet 一样，不能重复元素                 |
| ✅ 保留插入顺序 | 谁先加谁先排，输出时按添加顺序来              |
| 🔧 底层结构     | 哈希表 + 双向链表，链表维护顺序，哈希判断重复 |

```java
Set<String> fruits = new LinkedHashSet<>();
fruits.add("🍎");
fruits.add("🍌");
fruits.add("🍊");
fruits.add("🍎");  // 重复，不添加
System.out.println(fruits);
```

输出

```
[🍎, 🍌, 🍊]
```

> 用于：**既想去重，又希望有“插入顺序”的场景**

### LinkedHashSet就像“入队出队”的集合容器：

- 先添加的先输出（保持顺序 ✅）
- 不能重复（自动查重 ✅）
- 内部用链表维护顺序，哈希判断重复

✅ **你可以理解为：**

> **“有顺序的去重队列”** 🧺





### TreeSet —— 会“自动排序”的集合

| **特性**     | **说明**                                       |
| ------------ | ---------------------------------------------- |
| ✅ 自动去重   | 同样不能重复元素                               |
| ✅ 自动排序   | 默认升序（数字从小到大、字符串按字母顺序）     |
| ❌ 无插入顺序 | 排序会打乱你加的顺序                           |
| 🔧 底层结构   | 红黑树（一种平衡二叉排序树）实现，排序稳定高效 |



```java
Set<String> words = new TreeSet<>();
words.add("banana");
words.add("apple");
words.add("orange");
words.add("apple"); // 重复不会加

System.out.println(words);
```

输出（自动排序）：

```
[apple, banana, orange]
```

>  用于：**你希望集合元素保持“有序”（字母、数字大小排序）的时候**

### TreeSet 的重点是：

- 元素 **自动升序排列**（数字升序、字符串按字典顺序）
- 不能重复（也有查重 ✅）
- 内部用红黑树排序

✅ **你可以理解为：**

> **“自动排序的去重器”** 📚

#### Set总结表：

| **特性**     | **HashSet** | **LinkedHashSet** | **TreeSet**          |
| ------------ | ----------- | ----------------- | -------------------- |
| 自动去重     | ✅           | ✅                 | ✅                    |
| 顺序是否保留 | ❌ 不保证    | ✅ 保留插入顺序    | ❌ 会按规则自动排序   |
| 自动排序     | ❌           | ❌                 | ✅ 升序（可定制）     |
| 底层结构     | 哈希表      | 哈希表 + 链表     | 红黑树（平衡排序树） |
| 添加效率     | ⭐⭐⭐⭐        | ⭐⭐⭐               | ⭐⭐（因为要排序）     |

> HashSet：谁来我先哈希去重，不管顺序

> LinkedHashSet：我哈希+排队，谁先来谁先输出

> TreeSet：我不光去重，还给你排好顺序！



## Map 集合：键值对存储的宝藏容器

### 🧠 什么是 Map？

​	Map 就像一本**字典 📖**，

​	每一页（key）都配有一个定义（value）

在 Java 中，Map 用来存储这种：`键（key） ➜ 值（value）`的 **一对一关系**

Map 是一个 **键值对（key-value）** 的集合。

每个 key 只能出现一次，但 value 可以重复。

常见用途：**表示用户名-密码、学号-学生信息、商品ID-库存量……**

### ✨ 举几个真实场景：

| **业务场景**     | **适合用 Map 表达**  |
| ---------------- | -------------------- |
| 用户名和密码     | Map<String, String>  |
| 商品ID和商品名称 | Map<Integer, String> |
| 学号和学生信息   | Map<String, Student> |

只要你看到“用某个信息找另一个信息”，基本上都可以用 Map 来存！



### ✅ 最常用的 Map 实现类：

### HashMap

| **类名**      | **特点**                               |
| ------------- | -------------------------------------- |
| HashMap       | 最常用，键不能重复，值可以重复，查找快 |
| LinkedHashMap | 有顺序的 HashMap（记住插入顺序）       |
| TreeMap       | 会对 Key 自动排序                      |

### 📦 来个小例子：用户名和密码

```java
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        
        // 添加数据：用户名 ➜ 密码
        userMap.put("alice", "123456");
        userMap.put("bob", "qwerty");
        userMap.put("charlie", "abc123");

        // 打印整个 Map
        System.out.println(userMap);

        // 查找某个用户的密码
        String password = userMap.get("bob");
        System.out.println("bob 的密码是：" + password);

        // 修改密码
        userMap.put("bob", "newpass");
        System.out.println("修改后：" + userMap);

        // 删除用户
        userMap.remove("charlie");
        System.out.println("删除后：" + userMap);

        // 判断是否包含某个用户名
        System.out.println("是否包含 alice？" + userMap.containsKey("alice"));

        // 获取所有用户名（key）
        System.out.println("所有用户名：" + userMap.keySet());

        // 获取所有密码（value）
        System.out.println("所有密码：" + userMap.values());
    }
}
```

### ✅ 输出示意：

```
{charlie=abc123, alice=123456, bob=qwerty}
bob 的密码是：qwerty
修改后：{charlie=abc123, alice=123456, bob=newpass}
删除后：{alice=123456, bob=newpass}
是否包含 alice？true
所有用户名：[alice, bob]
所有密码：[123456, newpass]
```

Map 就是一个用“键”快速找到“值”的超好用工具箱！🔑📦



## ⭐️ Map 的三种遍历方式

在实际开发中，我们经常需要“遍历所有键值对”来做事情，比如：打印、过滤、统计……

#### 先准备一个示例 Map

```java
Map<String, String> userMap = new HashMap<>();
userMap.put("Alice", "123456");
userMap.put("Ben", "abc123");
userMap.put("Justin", "abc1234");
```

- `Map<String, String>`：这是一个接口，代表键值对的集合。这里键和值的类型均为 `String`，意味着键（用户名）和值（密码）都用字符串表示。
- `new HashMap<>()`：创建了一个 `HashMap` 实例，`HashMap` 是 `Map` 接口的一个常见实现类，它采用哈希表来存储键值对，具备快速查找的特性。
- `put` 方法：用于向 `Map` 里添加键值对。第一个参数是键（用户名），第二个参数是值（密码）。
- 分别把 "Alice"、"Ben" 和 "Justin" 作为键，对应的密码作为值添加到 `userMap` 中。

##  遍历方式 1：

###   用 keySet( )拿 key，再 get( )值

```java
for (String key : userMap.keySet()) {
    String value = userMap.get(key);
    System.out.println(key + " 的密码是：" + value);
}
```

**特点：**

- 适合只关注 key 或者根据 key 找 value
- 最通俗好理解（但效率略低，调用了多次 get( )）

### 🧠 逐步解释：

- `userMap.keySet()`：返回一个包含 `Map` 中所有键的 `Set` 集合。

  userMap 是一个 Map，当你调用 `userMap.keySet()`，它返回的是**所有的 key**，也就是用户的名字："Alice"，"Bob"，"Justin"

  这个东西的类型是一个 `Set<String>`，因为 key 不允许重复。

- `for (String key : userMap.keySet())`：**增强型 `for` 循环**，用于遍历 `Map` 中的所有键。

  每次循环，`key` 都会被赋值为 `Map` 中的一个键。

  “从 userMap.keySet( ) 这个集合中，**一个个取出 key**，每次放进变量 key 里，然后执行大括号内的代码。”

  ###### 传统 `for` 循环遍历数组：

  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
  }
  ```

  在传统 `for` 循环中，你需要手动管理索引 `i`，并通过索引访问数组元素。

  ###### 增强 `for` 循环遍历数组

  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  for (int num : numbers) {
      System.out.println(num);
  }
  ```

​	使用增强 `for` 循环，你不需要管理索引，直接通过 `num` 变量访问数组中的每个元素。

- `userMap.get(key)`：依据键从 `Map` 里获取对应的值（密码）。
- `System.out.println(key + " 的密码是：" + value)`：把键（用户名）和值（密码）组合成一条消息并输出到控制台。

## 遍历方式 2：

### 用 entrySet( )一次拿出 key 和 value（推荐 ✅）

```java
Map<String, String> userMap = new HashMap<>();
userMap.put("Alice", "123456");
userMap.put("Ben", "abc123");
userMap.put("Justin", "abc1234");

for (Map.Entry<String, String> entry : userMap.entrySet()) {
    String key = entry.getKey();
    String value = entry.getValue();
    System.out.println(key + " 的密码是：" + value);
}
```

### 特点：它更高效一些，因为一次就能同时拿到 key 和 value，不需要再查找。

- 效率更高（不需要再去 get()）
- 一次性同时拿 key 和 value
- 在实际项目开发中非常常用！🔥

### 🧠 逐步解释：

### userMap.entrySet()

返回的是一个包含所有键值对的“集合”。

每一个 entry 代表一对 key 和 value，比如：

- entry1: "Alice" → "123456"
- entry2: "Ben" → "abc123"
- entry3: "Justin" → "abc1234"

### for (Map.Entry<String, String> entry : userMap.entrySet())

- 每次循环会从集合中取出一个键值对（entry）。
- Map.Entry<String, String> 是 key 和 value 的“配对对象”。

### entry.getKey()和entry.getValue()

- 获取当前这组 entry 的 key 和 value

### 和keyset()的区别是：

| **遍历方式** | **查找 value**             | **效率**               |
| ------------ | -------------------------- | ---------------------- |
| keySet()     | 需要 map.get(key) 查找一次 | 较慢（尤其是大数据时） |
| entrySet()   | 一次取出 key 和 value      | 更高效 ✅               |



## 遍历方式 3：

### 用 Lambda 表达式（简洁现代）

```java
Map<String, String> userMap = new HashMap<>();
userMap.put("Alice", "123456");
userMap.put("Ben", "abc123");
userMap.put("Justin", "abc1234");

userMap.forEach((key, value) -> {
    System.out.println(key + " 的密码是：" + value);
});
```

###  **特点：**

- 写法更现代（Java 8+）
- 简洁明了，非常适合简化操作
- 但是初学时建议先理解前两种再来它

### 小总结表：

| **方式**         | **写法**           | **优点**       |
| ---------------- | ------------------ | -------------- |
| keySet() + get() | 最好理解，适合初学 | 简单直接       |
| entrySet()       | 推荐！效率高       | 一次拿出键值对 |
| forEach()        | Java 8+ 新写法     | 简洁、现代     |







# I/O 流

## 文本文件读写（FileReader/FileWriter）

我们从最基础的 FileWriter 和 FileReader 开始讲起，逐步掌握怎么把内容写入 .txt 文件、再从中读取出来。

### 第一部分：写入文本文件（FileWriter）

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
    public static void main(String[] args) {
        try {
            // 创建文件写入对象，文件名为output.txt（如果没有会自动创建）
            FileWriter writer = new FileWriter("output.txt");

            // 写入内容
            writer.write("你好，这是我写入文件的第一句话！");
            writer.write("\n再写一行内容也可以。");

            // 关闭流（很重要）
            writer.close();

            System.out.println("✅ 写入成功！");
        } catch (IOException e) {
            System.out.println("发生错误：" + e.getMessage());
        }
    }
}
```

- FileWriter("output.txt")：指定要写入的文件名
- write(...)：写入字符串（支持中文）
- close()：写完必须关闭，否则文件可能无法保存完整内容
- try-catch：IO 操作容易出错（如路径不存在），必须处理异常

###  第二部分：读取文本文件（FileReader）

```java
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) {
        try {
            // 创建文件读取对象，读取output.txt
            FileReader reader = new FileReader("output.txt");

            int ch;
            while ((ch = reader.read()) != -1) {
                // 一个字符一个字符地读取
                System.out.print((char) ch);
            }

            // 关闭流
            reader.close();
        } catch (IOException e) {
            System.out.println("读取出错：" + e.getMessage());
        }
    }
}
```

- reader.read()：一次读取一个字符，返回 int 类型（字符的 Unicode 编码）
- != -1：-1 表示已经读取完
- (char) ch：把读取的 int 转成字符输出

| **类名**   | **作用**     | **特点**           |
| ---------- | ------------ | ------------------ |
| FileWriter | 写入文本文件 | 覆盖写入、按字符写 |
| FileReader | 读取文本文件 | 按字符读取         |

# 多线程

1. 概念理解

   - 多线程允许程序同时执行多个任务，提高程序的效率和响应性。线程是进程中的一个执行单元。

     你要理解线程的生命周期，包括新建（New）、就绪（Runnable）、运行（Running）、阻塞（Blocked）和死亡（Dead）状态，以及状态之间是如何转换的。

   - 重点掌握线程同步的概念，由于多个线程可能同时访问共享资源，会导致数据不一致等问题，所以需要同步机制来保证数据的完整性。像`synchronized`关键字、`Lock`接口等都是实现线程同步的方式。

2. 实践

   - 首先可以通过继承`Thread`类或实现`Runnable`接口来创建和启动线程，编写简单的多线程程序，观察线程的执行顺序，感受线程的并发执行。
   - 接着尝试在多线程环境中共享数据，比如多个线程对同一个计数器进行操作，这时候就会出现线程安全问题，你可以用`synchronized`关键字来解决，看看同步前后的区别。
   - 还可以研究下`java.util.concurrent`包下的工具类，比如`ExecutorService`、`Future`等，它们提供了更高级的线程管理和异步执行的功能。