## 使用 dtd 定义元素
1. 语法
    ```
    <!ELEMENT 元素名 约束>
    ```
2. 简单元素，没有子元素的元素
    ```
    // 文本
    <!ELEMENT 元素名 (#PCDATA)>
    // 空元素
    <!ELEMENT 元素名 EMPTY>
    // 任意元素
    <!ELEMENT 元素名 ANY>
    ```
3. 复杂元素
    ```
    // 没有加修饰，子元素只能出现一次
    <!ELEMENT 元素名 (name, age, sex, school)>
    // + 可以出现一次或多次(至少一次)
    <!ELEMENT 元素名 (name+, age, sex, school)>
    // ? 可以出现零次或一次(最多一次)
    <!ELEMENT 元素名 (name?, age, sex, school)>
    // * 可以出现零次或多次
    <!ELEMENT 元素名 (name*, age, sex, school)>
    // 子元素用 “，” 隔开，表示出现的顺序
    // 子元素用 “|” 隔开，表示只能出现其中任意一个
    ```