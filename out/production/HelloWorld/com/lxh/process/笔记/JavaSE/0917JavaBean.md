成员方法的名可以和类名相同（最好不要）

#### JavaBean

什么是JavaBean：

​	JavaBean是一种java语言写成的可重用的组件(类)，就是一种特殊类，遵循特定的规范，遵循的规范如下：

- 必须使用public修饰(JavaBean)类
- (JavaBean)类必须有公共的无参构造器
- 对于所有的成员变量都需要有相应的创建方法(Getter/Setter)

#### 空指针中静态变量的调用：

对象.静态变量调用  ==>  类名.静态变量

#### 变量优先级

- 在静态方法体内部，局部变量比静态变量优先级高
- 在成员方法体内部，局部变量比成员变量优先级高

#### this

作用

- 区分成员方法中成员变量名和局部变量名（参数名）
- 返回当前对象的引用
- 在构造方法中调用其他构造方法
  - 注意：this()必须在构造方法的第一行

#### static

- static修饰修饰变量：静态变量
- static修饰修饰方法：静态方法
- static修饰修饰{}：     静态代码块
  - 代码块：
  - 静态代码块：
    - 静态代码块在类加载的时候就执行，并且只执行一次
  - {} ：实例代码块(构造块)
    - 在创建对象前执行，每次创建对象前都执行一次，如果存在多个构造块，从上往下执行