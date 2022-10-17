## String定义：

- #### 字符串：底层就是一个字符数组

- #### 特点：

  1. 一旦长度确定，不能更改（数组没有增删）
  2. Java提供了一个常量池的概念，可以让String直接指向常量池，如果没有，则自动创建
  3. Java为了字符串更加高效的执行，设计了两个类StringBulid&StringBuffer

- #### String的构造方法：

  1. 字面量，直接写

     ```java
     String s = "ab";
     ```

  2. ```java
     String a1 = new String("ab");
     ```

  3. 字节数组

     ```java
     byte[] bytes = {97,98,99,100};	//abcd
     String s2 = new String(bytes);
     ```

  4. 字符数组

     ```java
     char[] chars = {'e','f','g','h'};	
     String s4 = new String(chars);//efgh
     String s5 = new String(chars,1,2);//fg
     ```

- #### Sting的常用方法：

  - lenght()
  - toString()
  - charAt(1)  输入数组下标，返回该下标位置的字符
  - getBytes() 
  - toUpperCase() 转大写
  - toLowerCase() 转小写
  - **indexOf() 查询对应字符串或者字符的ASCII在该字符串的位置**
  - lastIndexOf() 最后一次出现的位置
  - **spilt() 分割字符串，而且可以指定分隔符**
  - equalsIgnoreCase() 忽略大小写进行比较
  - **substring() 切割字符串,传入一个值要开始位置到最后,传两个值要前不要后**
  - toCharArray()  
  - **contains() 字符串是否包含，注意多态的使用**
  - **concat() 向尾部拼接或追加(在sql里面使用)**
  - pre前缀，suffix后缀
    startsWith() 
    **endWith()** 
    **以XXX**开始或**结尾**
  - isEmpty() 判断是否是空字符串
  - **trim()  去除两边空格**
  
- #### StringBuild&StringBuffer

  - 都是可变的字符序列(数组)

  - 原理：

    1. 也是创建数组，但是可以自动扩容
    2. 扩容原理：

  - 怎么使用：

    1. length() 看长度
    2. 
  
         - capacity() 看容量
  
         - 容量默认16，超出之后继续添加则 新容量= (原容量+1)*2
  
         - 创建对象时传入的字符串长度会默认加到默认容量上
  
    3. **append() 向底部添加**
    4. insert(a,b) a是在哪个下标位置，b是添加什么  
    5. **reverse() 反转**
  
  - StringBuild&StringBuffer区别
  
    
    StringBuilder：线程不安全，速度快
    
    StringBuffer：线程安全，速度慢

