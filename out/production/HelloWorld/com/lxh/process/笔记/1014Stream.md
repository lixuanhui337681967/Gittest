## Stream流

概念说明：

1. 数据渠道、管道，用于操作数据源（集合、数组等）所产生的元素序列。集合讲的是数据，流讲的是计算。即一组用来处理数据，集合的API
2. Stream不是数据结构，没有内部存储，自己不会存储元素
3. Stream不会改变源对象。相反，他们会返回一个持有新结果的新Stream
4. Stream操作是延迟执行的，这意味着他们会等到需要结果的时候才执行
5. 不支持索引访问
6. 延迟计算
7. 支持并行
8. 很容易生成数据或集合
9. 支持过滤、查询、转换、汇总、聚合等操作

应用场景：

1. 流式计算处理，需要延迟计算，更方便的并行计算
2. 更灵活、简洁的结合处理方式场景

#### 五种创建方法：

1.  数组方式生成

   ```java
   String[] s1 = {"shadjkhsdjk","sahdjkasjdkla","ashjdjasdjk"};
   Stream<String> s11 = Stream.of(s1);
   ```

2. 集合方式

   ```java
   List<Integer> list = new ArrayList<>();
   list.add(3);
   list.add(1);
   list.add(2);
   Stream<Integer> stream = list.stream();
   ```

3. generate是一个无限流，你放什么，里面就是什么

   ```java
   Stream<Integer> generate = Stream.generate(() -> 2);
   generate.forEach(x -> System.out.println(x));
   ```

4. iterate也是无限流，第一个传参初始值，第二个传参Lambda步长值

   ```java
   Stream<Integer> iterate = Stream.iterate(6,x -> x+3)；
   iterate.limit(3).forEach(x -> System.out.println(x));
   ```

5. String的chars()

   ```java
   String s2 = "1561651561";
   IntStream chars = s2.chars();
   chars.forEach(x -> System.out.println((char)x));
   ```

#### 常用转换算子（中间算子）

###### 迭代器、matcher、stream再次调用需要重新创建，否则报错

常用转换算子：filter，distinct，map，limit,skip,flatMap等

```java
List<Integer> list = new ArrayList<>();
list.add(3);
list.add(1);
list.add(2);
System.out.println(list);
Stream<Integer> stream = list.stream();
```

1. filter：对元素进行过滤筛选，不符合的就不要了,为true留下，为false过滤掉

   ```java
   stream.filter(x -> x!=3).forEach(x -> System.out.println(x));
   ```

2. distinct：去掉重复的元素

   ```java
   stream.distinct().forEach(x -> System.out.println(x));
   ```

3. skip：跳过多少元素

   ```java
   stream.skip(3).forEach(x -> System.out.println(x));
   ```

4. limit：去一个集合的前几条数据

   ```java
   stream.limit(3).forEach(x -> System.out.println(x));
   ```

5. map：处理每一项的值，将返回值覆盖掉每一项

   ```java
   stream.map(x -> x+2).filter(x -> x!=5).forEach(x -> System.out.println(x));
   ```

6. sorted：排序

   ```java
   stream.sorted((o1,o2) -> o2-o1).forEach(x -> System.out.println(x));
   ```

#### 终止算子

1. 循环：forEach

2. 计算：min、max、count、average

3. 匹配：anyMatch、allMatch、noneMatch、findFrist、findAny

4. 汇聚：rudece

5. 收集器：collect

   

1. forEach 循环遍历

   ```java
   stream.map(x->x*2).forEach(x-> System.out.println(x));
   ```

   

2. min取排好序的最左边，max取排好序的最右边

   ```
   stream = list.stream();
   Optional<Integer> min = stream.map(x -> x * 2).min((o1,o2) -> o2 - o1);
   System.out.println(min);
   steam = list.stream();
   Optional<Integer> max = stream.map(x -> x * 2).max((o1,o2) -> o2 - o1);
   System.out.println(max);
   ```

3. count

   ```java
   stream = list.stream();
   long count = stream.filter(x -> x!=3).count();
   System.out.println(count);
   ```

4. collect 收集器，一般传Collectors.toList(),返回一个新的集合，集合中数据就是处理好的数据

   ```java
   stream = list.stream();
   List<Integer> collect = stream.map(x -> x * 2).collect(Collectors.toList());
   System.out.println(collect);
   ```

5. anyMatch 是否包含,contains有局限性，用anyMatch可以完成自定义类的判断

   ```java
   stream = list.stream();
   boolean b = stream.map(x -> x * 2).anyMatch(x -> x ==4);
   System.out.println(b);
   String a ="asdda";
   System.out.println(a.contains("z"));
   
   //传入对象
   Student student1 = new Student("张三1", 21);
           Student student2 = new Student("张三2", 22);
           Student student3 = new Student("张三3", 23);
           Student student4 = new Student("张三4", 24);
           Student student5 = new Student("张三5", 25);
           List<Student> list1 = Arrays.asList(student1, student2, student3, student4, student5);
           boolean b1 = false;
           for (Student student : list1) {
               if (student.getAge() == 21){
                   b1 = true;
                   break;
               }
           }
           System.out.println(b1);
           boolean b2 = list1.stream().anyMatch(new Predicate<Student>() {
               @Override
               public boolean test(Student student) {
                   if (student.getAge() == 21){
                       return true;
                   }
                   return false;
               }
           });
           System.out.println(b2);
           boolean b3 = list1.stream().anyMatch(x -> x.getAge() == 21);
           System.out.println(b3);
   ```