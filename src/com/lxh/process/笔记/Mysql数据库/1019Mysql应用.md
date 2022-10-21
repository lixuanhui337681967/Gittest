## Mysql应用

1. DDL增强

   Alter：

   1. 重命名
      
      ```mysql
      ALTER TABLE student2222 RENAME student;
      ```
   2. 添加字段
      
      ```mysql
      ALTER TABLE student ADD school1 VARCHAR(20);
      ```
   3. 修改字段
      
      ```mysql
      ALTER TABLE student CHANGE school1 school2 VARCHAR(10);
      ```
   4. 删除字段
      
      ```mysql
      ALTER TABLE student DROP school2;
      ```
   5. 更改字段类型(尽量不要更改)
      
      ```mysql
      ALTER TABLE student MODIFY school char(10);
      ```

2. DDL约束

   1. 唯一（add）unique

      ```mysql
      ALTER TABLE temp ADD UNIQUE
      ```

      

   2. notnull和默认值（modify）not null 和 default ‘值’;

   3. 主键 add

   4. 外键 一个表中的外键是另一个表中的主键，类型必须一致 （references）

      - 物理外键：真实存在，增删改的时候受其他表的限制

      - 逻辑外键：自己用的时候自己知道就行

   5. 自增：只能是主键，自增的列只有一个

3. 条件判断
   **and的优先级大于or**

   1. AND
   2. OR
   3. = | < > =
   4. IS NULL | IS NOT NULL
   5. BETWEEN AND

      ```mysql
      SELECT * FROM student1 WHERE score BETWEEN 98 AND 99.2;
      ```
   6. IN

      ```mysql
      SELECT * FROM student1 WHERE score IN (98,99.2,97.9);
      ```
   7. ORDER BY

      ```mysql
      SELECT * FROM student1 ORDER BY score ASC;
      ```
   8. LIMIT

      ```mysql
      SELECT * FROM student1 ORDER BY score DESC LIMIT 3;
      ```
   9. LIKE

      ```mysql
      SELECT * FROM student1 WHERE NAME LIKE '%小%';
      ```

4. 组函数：

   - count()

   - max()

   - min()

   - avg()

   - sum()

   - group by

5. 单表查询（组函数）
   顺序：表限定 > 行限定 > 列限定
   sql中一个字符一个字节，utf8汉字占3个字节

   1. GROUP BY

      ```mysql
      -- 查询每个老师分别带了多少学生(显示老师id即可)
      SELECT teacher_id,COUNT(*) AS '学生个数' FROM student GROUP BY teacher_id;
      -- 查询每个老师带的学生中的最高分数
      SELECT teacher_id,COUNT(*) AS '学生个数',MAX(score) as '学生最高分' FROM student GROUP BY teacher_id;
      -- 查询每个老师所带学生的总成绩与平均分
      SELECT teacher_id,SUM(score) AS '总分',AVG(score) as '学生平均分' FROM student GROUP BY teacher_id;
      ```

   2. HAVING：顺序：表限定 > 行限定 > 列限定

      ```mysql
      SELECT teacher_id,AVG(score) AS agv FROM student GROUP BY teacher_id HAVING agv>60;
      ```

   3. 合并查询

      - union	去重

      - union all 不去重


      ```mysql
      -- 查询出 teacher_id = 1 的所有学生信息
      SELECT * FROM student WHERE teacher_id = 1;
      -- 查询出 学生分数大于60的所有学生信息
      SELECT * FROM student WHERE score > 60;
      -- 查询出 学生分数大于60 或 teacher_id = 1 的所有学生信息(去除重复)
      SELECT * FROM student WHERE teacher_id=1 or score > 60;
      SELECT * FROM student WHERE teacher_id=1 
      UNION
      SELECT * FROM student WHERE score > 60;
      -- 查询出 学生分数大于60 或 teacher_id = 1 的所有学生信息(可重复)
      SELECT * FROM student WHERE teacher_id=1 
      UNION ALL
      SELECT * FROM student WHERE score > 60;
      ```

6. 常用函数

   - **contact**
   - **subString**


   ```mysql
   select version() ;显示当前MySQL软件的版本
   select database();显示当前所处数据库是哪个
   select  char_length('中国');返回字符个数。
   select  length('中国');返回字符所占字节数,MySQL中，一个UTF8编码的汉字占3个字节
   select  concat(  'a',  'b',  'c',  'd');返回  'abcd'。字符串拼接函数
   select  concat_ws(  '=',  'a',  'b',  'c');返回  'a=b=c'。字符串拼接函数,第一个是拼接间隔符
   select   upper('abcd');返回ABCD。将参数中所有小写字母转换为大写
   select  lower('ABCD');返回abcd。将参数中所有大写字母转换为小写
   select  substring(  '系统信息类',  1,  3  );返回  系统信。第2个参数代表想要截取的对象，第2个参数代表开始的位置，第3个参数代表截取字符个数
   ```

   
