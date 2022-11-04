## JQuery

#### 什么是JQuery？

- 一个JavaScript函数库
- JQuery库包含以下功能：HTML 元素选取、HTML 元素操作、CSS 操作、HTML 事件函数、JavaScript 特效和HTML DOM 遍历和修改
- 需要引入js

#### JQuery语法

1. 入口函数(页面加载完成后执行)

   ```javascript
   $(function(){
   	//js代码
   })
   ```

2. $是什么？

   $就是一个函数，参数不一样，功能不一样

   1. $(function() {});//参数是function，说明是入口函数
   2. $(“#btnSetConent”);//参数是字符串，并且以#开头，是一个标签选择，查找id=“btnSetContent”的元素
   3. $(“div”);//查找所有的div元素
   4. $(document).ready(funciton(){})//将document转换成jQuery对象

3. jQuery 入口函数与 JavaScript 入口函数的区别

   |          | window.onload                                            | $(document).ready()                                   |
   | -------- | -------------------------------------------------------- | ----------------------------------------------------- |
   | 执行时机 | 必须等待网页全部加载完毕(包括图片等)，然后再执行包裹代码 | 只需要等待网页中的DOM结构加载完毕，就能执行包裹的代码 |
   | 执行次数 | 只能执行一次，如果有第二次，那么第一次的执行会被覆盖     | 可以执行多次，第N次都不会被上次覆盖                   |
   | 简写方案 | 无                                                       | $(function(){<br />})                                 |

   

#### JQuery选择器

1. ###### 基本选择器

   获取id比较特殊，也是获取多个

   | 名称                           | 用法               | 描述                                                         |
   | ------------------------------ | ------------------ | ------------------------------------------------------------ |
   | ID选择器                       | $(“#id”);          | 获取指定ID的元素                                             |
   | 类选择器                       | $(“.class”);       | 获取同一类class的元素                                        |
   | 标签选择器                     | $(“div”);          | 获取同一类标签的所有元素                                     |
   | 并集选择器                     | $(“div,p,li”);     | 使用逗号分隔，只要符合条件之一就可。获取所有的div、p、li元素 |
   | 交集选择器（标签指定式选择器） | $(“div.redClass”); | 注意选择器1和选择器2之间没有空格，class为redClass的div元素，注意区分后代选择器。 |

2. ###### 层级选择器

   | 名  称     | 用法        | 描述                                                        |
   | ---------- | ----------- | ----------------------------------------------------------- |
   | 子代选择器 | $(“ul>li”); | 使用>号，获取儿子层级的元素，注意，并不会获取孙子层级的元素 |
   | 后代选择器 | $(“ul li”); | 使用空格，代表后代选择器，获取ul下的所有li元素，包括孙子等  |

3. ###### 过滤选择器

   |                  | 用法                                                         | 描述                                                        |
   | ---------------- | ------------------------------------------------------------ | ----------------------------------------------------------- |
   | **:eq（index）** | **$(“li:eq(2)”).css(“color”,”red”);等于2的<br />$(“li:lt(3)”).css(“color”,”red”);小于3的<br />$(“li:gt(3)”).css(“color”,”red”);大于3的**<br /><br />**le 小于等于<br />ge大于等于** | 获取到的li元素中，选择索引号为2的元素，索引号index从0开始。 |
   | :odd             | $(“li:odd”).css(“color”,”red”);                              | 获取到的li元素中，选择索引号为奇数的元素                    |
   | :even            | $(“li:even”).css(“color”,”red”);                             | 获取到的li元素中，选择索引号为偶数的元素                    |

4. ###### 筛选选择器

   |                    |                             |                                        |
   | ------------------ | --------------------------- | -------------------------------------- |
   | children(selector) | $(“ul”).children(“li”)      | 相当于$(“ul>li”)，子类选择器           |
   | find(selector)     | $(“ul”).find(“li”);         | 相当于$(“ul li”),后代选择器            |
   | siblings(selector) | $(“#first”).siblings(“li”); | 查找兄弟节点，不包括自己本身。         |
   | parent()           | $(“#first”).parent();       | 查找父亲                               |
   | eq(index)          | $(“li”).eq(2);              | 相当于$(“li:eq(2)”),index从0开始       |
   | next()             | $(“li”).next()              | 找下一个兄弟                           |
   | prev()             | $(“li”).prev()              | 找上一次兄弟                           |
   | Index()            | $(“li”).index()             | 获取当前的位置（索引）                 |
   | not()              | $("p").not(".intro")        | 返回不带有类名 "intro" 的所有 <p> 元素 |

#### JQuery事件

###### 事件语法

1. 注意点：
   1. Jquery对象转DOM对象 Jquery[0]
   2. DOM对象转Jquery对象$(DOM对象)

#### Jquery.css方法

1. ###### css方法

   1. 两个参数，设置值

      ```javascript
      $("p").css("background-color","yellow");
      ```

   2. 一个参数，获取值

      ```javascript
      $("p").css("background-color");
      ```

   3. 一个参数，传对象，那就是设置对象中的所有属性

      ```javascript
      $("p").css({"background-color":"yellow","font-size":"200%"});
      ```

2. addClass() 添加类

   ```javascript
   $("button").click(function(){ 
   $("h1,p").addClass("blue");
   $("div").addClass("important"); 
   });
   ```

3. removeClass()删除类

   ```javascript
   $("button").click(function(){ $("h1,h2,p").removeClass("blue"); });
   ```

4. toggleClass()对被选元素进行添加/删除类的切换操作

#### JQuery动画

1. 隐藏显示

   1. hide() 隐藏
   2. show() 显示

2. 淡入淡出

   1. fadeOut()  淡出可见元素
   2. fadeIn() 淡入已隐藏元素
   3. fadeToggle() 切换
   4. fadeTo() 变成某个透明色

3. 滑动

   1. slideDown
   2. slideUp

4. 自定义动画

   animate() 用于创建自定义动画，可选的callback参数是动画完成后所执行的而函数名称(回调函数)

   1. 参数1：css样式
   2. 参数2：动画时间
   3. 参数3：完成后执行的函数

   ```javascript
   $('button').click(function(){
   $('li').animate({
       opacity : '0.5'
       height : '300px'
       width : '300px'
   },3000,function(){console.log('动画结束')})
   })
   ```

5. stop方法

   停止动画，但是会清除掉overflow:hidden

6. 回调函数

   1.  

#### JQuery事件机制

1. 注册事件
   1. bind()
   2. on() 可以动态绑定
2. 委托事件
   1. delegate
   2. event和this都是事件源
3. each

#### JQuery对HTML的设置与捕获

1. html()
   1. 

#### JQuery添加元素

1. append 末尾添加
2. preappend 首部添加
3. before 在选中元素之前添加
4. after 在选中元素之后添加

#### JQuery删除元素

1. remove() 删除被选元素
2. empty() 从被选元素中删除子元素