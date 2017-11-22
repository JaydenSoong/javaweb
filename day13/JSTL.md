# JSTL
## 概述
* apache 的产品，依赖 EL 表达式。
* 使用 JSTL 需要先下载 jakarta-taglibs-standard-1.1.2，然后导入 jstl.jar、standard.jar 至 /web/lib 下
* 四大库
    1. core: 核心库，重点
    2. fmt：格式化，日期，数字
    3. sql：过时
    4. xml：过时
## core --> c 标签
1. out 和 set
    * <c:out> 输出
        * value：可以是字符串常量，也可以是 EL 表达式。
        * default：当要输出的内容为 null 时，会输出 default 指定的值。 
        * escapeXml：默认值为 true，表示转义。
    * <c:set> 设置
        * var：变量名
        * value：变量值，可以是 EL 表达式
        * scope：域，默认为 page，可选值 page、request、session、application
