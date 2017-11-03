## xml 约束
为什么需要约束？

比如现在定义了一个 person 的 xml 文件，只想要在这个文件里面保存人的信息。比如: name, age 等。但从语法上来说，在里面定义一个\<dog>\</dog>,也是完全可以的。此时就需要规范来约束 xml 里面出现的元素。

xml 的约束技术：dtd 约束 和 schema 约束。
### dtd 约束快速入门
1. 创建一个文件，后缀名为 .dtd
2. 看 xml 中有多少个元素，在 dtd 文件中写相应个数的 <!ELEMENT>
3. 判断元素是复杂元素还是简单元素
    - 复杂元素：有子元素的元素
        ```
        <!ELEMENT 元素名称 (子元素1,子元素2...)>
        ```
    - 简单元素：没有子元素
        ```
        <!ELEMENT 元素名称 (#PCDATA)>
        ```
4. 在 xml 文件中引入 dtd 文件
    ```
    <!DOCTYPE 根元素 SYSTEM "dtd文件路径">
    ```
### dtd 的三种引入方式
1. 引入外部的 dtd 文件
    ```
    <!DOCTYPE 根元素名称 SYSTEM "dtd文件路径">
    ```
2. 使用内部的 dtd 文件
    ```
    <!DOCTYPE 根元素名称 [
        <!ELEMENT 元素名称 (子元素1, 子元素2, ...)>
        <!ELEMENT 元素名称 (#PCDATA)>
        <!ELEMENT 元素名称 (#PCDATA)>
        ...
    ]>
    ```
3. 使用外部的 dtd 文件（网络上的 dtd 文件）
    ```
    <!DOCTYPE 根元素名称 PUBLIC "dtd 名称" "dtd路径">
    ```