本周安排：

1. **集合Map(重要)**
2. IO流
3. 文件复制
4. 多线程



- ## 散列表

  1. 先调用hashCode方法，计算hash值
  2. 放在算列表数组对应的位置
  3. 当再次存放值时，先调用hashCode方法计算hash值，如果和之前的hash值相同(对应的hash值数组位置已经存放了元素)
  4. 再去用equals() 方法比较这两个元素是否真正相等
  5. 相同不添加，不同则在该位置生成一个链表，存放在链表上
  6. 当该链表存放个数超过7时，该链表自动转化为红黑树

  set可以去重，但不统计个数

  HashSet是一个特殊的HashMap，只存K的，V是空

- ## Map

  Map用于保存具有映射关系的数据，因此Map集合里保存两组值

  1. 一组值用于保存key，一组值用于保存value
  2. key~ value之间存在单向的一对一关系，通过指定key可以找到唯一的value值
  3. key和value都可以是任意引用类型对象
  4. 允许存在vale为null，但是只允许存在一个key为null

  特点：

  1. 当放入的key相同时，key不变，value值覆盖

- ### 常用方法：

  | 方法                               | 描述                                                         |
  | ---------------------------------- | ------------------------------------------------------------ |
  | **V put(K key, V value)**          | **将指定的值与此映射中的指定键关联**                         |
  | boolean containKey(Object key)     | 如果此映射包含指定键的映射关系，则返回true                   |
  | boolean containValue(Object value) | 如果此映射将一个或多个键映射到指定值，则返回true             |
  | boolean isEmpty()                  | 如果此映射未包含键-值映射关系，则返回true                    |
  | V get(Object key)                  | 返回指定键所映射的值，如果此映射不包含该键的映射关系，则管会null |
  | Set<K> keySet()                    | 返回此映射中包含的键的set集合                                |
  | **Collection<V> values()**         | 返回此映射中包含的值的Collection集合                         |
  | **Set<Map.Entry<K,V>> entrySet()** | **返回此映射中包含的映射关系的set集合**                      |
  | boolean equals(Object o)           | 返回指定对象与此映射是否相等                                 |
  | int hashCode()                     | 返回此映射的哈希码值                                         |
  | **V remove(Object key)**           | **如果存在一个键的映射关系，则将其从此映射中移除**           |

  | 方法             | 描述                        |
  | ---------------- | --------------------------- |
  | **void clear()** | **从此映射中移除映射关系**  |
  | **int size()**   | **返回此映射中的键-值关系** |

  

- HashMap
  底层是哈希表/散列表

- TreeMap

  1. 只能对key排序
  1. 底层由可排序二叉树实现
  1. 不指定比较器默认按照key自然升序，指定比较器按比较器排序

- properties

  1. setProperty()

  2. getProperty(Key)

  3. getProperty(Key,defaultValue)

     ```java
     System.out.println(properties.getProperty("username"));
     System.out.println(properties.getProperty("password"));     System.out.println(properties.getProperty("username2","admin123456"));
     ```

     
