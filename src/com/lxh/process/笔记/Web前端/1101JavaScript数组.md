## 数组、函数、对象

##### Java中创建数组的三种方式：

- 声明 分配空间并赋值 int[] arr1 = {1,2,3};

- 显示初始化 int[] arr2; arr2 = new int[]{1,2,3}; 

- 显示初始化() int[] arr3; arr3 = new int[3]；


#### JavaScript中创建数组

- var a = [1,2,’c’]
- var a = new Array();
  - 传一个参数：5，指的是有5个位置
  - 传入多个值：1，2，3…，指的是把这些值存入数组

#### 增删改查

- 查：arr[0]
- 增：
  - push() 
  - arr[ 2 ] = 5 
- 删：
  - pop()
  - arr.length = arr.length-1：删除尾部元素
- 改：arr[ 2 ] = 5

#### 数组的遍历

- fori循环
- forof 迭代器
- foreach(数组的)方法
- forin 循环 注意：key是下标

#### 函数

- 代码的重用性

- 定义：

  ```javascript
          // 注意点：不要定义同名的方法和变量
          var f1 = 1;
          // Js函数的定义
          function f1(a, b) {
              console.log(a);
              console.log(b);
          }
  
  
          // 注意点：调用函数需要加括号
          f1(13, 54);
  
          console.log(typeof (f1));
  
          var f2 = function (a, b, c) {
              console.log(a);
              console.log(b);
              console.log(c);
          }
          f2(1, 2, 3)
          console.log(typeof(f2));
  
  ```

- 函数的调用、参数、返回值

  - 注意点：调用需要加()
  - 参数、返回值：灵活应用

- 函数的覆盖

  - 函数最后一个生效
  - 函数表达式：离调用位置上一个最近的生效

- 匿名函数

  - (funcation(){})()
  - 自执行一次，类比于Java中的静态代码块

- 函数当参数或返回值

  - 调用需要加()

#### 预解析

对JavaScript代码进行解释执行之前，会对JavaScript代码进行预解析，在预解析阶段，会将以关键字var和function开头的语句块提前进行处理。

函数表达式中只有变量提前

注意点：

- const声明必须赋值
- let不能重复声明同一个变量
- 局部变量var a
- 全局变量 b，相当于window.b

#### 作用域

1. 全局作用域：直接编写在 script 标签之中的JS代码，都是全局作用域；或者是一个单独的 JS 文件中的。

2. 局部作用域(函数作用域)：函数内部就是局部作用域

3. 隐式全局变量( = 和 ; )

   ```
   function fn(){
   	var a = b = c =1       ;  //b和c就是隐式全局变量(等号)
   	var a = 1; b = 2; c= 3 ;  //b和c就是隐式全局变量(分号)
   	var a =1 , b = 2 , c =3;  //b和c就不是隐式全局变量(逗号)
   }
   ```

#### 对象

###### JavaScript的对象是无序属性的集合

对象创建方式

```javascript
        // 第一种，直接写
        var a = {
            name: '张三',
            age: 16,
            sex: '女'
        }
        console.log(a.name);
        console.log(a.age);
        console.log(a.sex);
        console.log(typeof (a));

        // 第二种，new Object
        var b = new Object();
        b.name = '小黑';
        b.age = 4;
        b.sex = '公';
        console.log(b.name);
        console.log(b.age);
        console.log(b.sex);
        console.log(typeof (b));

        // 第三种，工厂
        function createPerson(name, age, job) {
            var person = new Object();
            person.name = name;
            erson.age = age;
            person.job = job;
            person.sayHi = function () {
                console.log('Hello,everyBody');
            }
            return person;
        }
        var p1 = createPerson('张三', 22, 'actor');

        // 第四种，構造函數
        function Person(name, age, job) {
            this.name = name;
            this.age = age;
            this.job = job;
            this.sayHi = function () {
                console.log('Hello,everyBody');
            }
        }
        var p1 = new Person('张三', 22, 'actor');
```

构造函数，是一种特殊的函数，主要用来创建对象时初始化对象，即为对象成员变量赋初始值时

1. 构造函数用于常见一类对象，首字母要大写
2. 构造函数要和new一起使用在有意义

new在执行时会做三件事：

1. new会在内存中创建一个新的空对象
2. new会让this指向这个新的对象
3. new会返回这个新对象

#### JavaScript错误

注意点：

- 正常报错error.messgae是错误描述
- throw出去的是什么，error就是什么

#### 内置对象使用

1. Math对象

   1. Math.PI 圆周率
   2. Math.random() 生成随机数

2. Date对象

   - Date()是构造函数 var date = new Date();

   ```javascript
   getSeconds()  // 返回0-59
   getMinutes()  // 返回0-59
   getHours()   // 返回0-23
   getDay()    // 返回星期几 0周日  6周6
   getDate()   // 返回当前月的第几天
   getMonth()   // 返回月份，***从0开始***
   getFullYear()  //返回4位的年份  如 2016
   ```

3. Array对象

   1. 检测一个对象是否是数组
      1. instanceof  如果返回true就是数组，false是非数组
      2. Array.isArray() 如果返回true就是数组，false是非数组
   2. 增删
      1. 栈操作(先进后出)
         1. push() 添加元素
         2. pop() 删除元素
      2. 队列操作(先进先出)
         1. shift() 删除元素
         2. unshift() 添加元素
   3. 排序
      1. reverse() 翻转数组
      2. sort(sortby); sortby为可选参数，规定排序顺序，必须是函数，如果调用该方法时没有使用参数，将按字母顺序对数组中的元素进行排序
   4. 操作方法
      1. concat()：把参数拼接到当前数组、 或者用于连接两个或多个数组
      2. slice(start,end)
         1. 从start开始截取元素，到end结束，包括start,不包括end,返回新数组，start,end是索引
         2. 不会改变原始数组
      3. splice(start,length)
         1. 从start开始截取元素，截取length个，,返回新数组，start是索引,length是个数
         2. 会删除原数组中截取出来的内容
   5. 清空数组
      1. **arr = [] 推荐使用**
      2. arr.length = 0
      3. arr.splice(0,arr.length)

4. String对象

