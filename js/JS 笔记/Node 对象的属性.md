### Node对象的属性
- nodeType
- nodeName
- nodeValue

使用 dom 解析 html 的时候，需要 html 里面的把标签、属性和文本都封装成对象。

1. 标签节点对应的值
    ```
    nodeType = 1;
    nodeName = 大写的标签名，比如 SPAN
    nodeValue = null;
    ```
2. 属性节点对应的值
    ```
    nodeType = 2;
    nodeName = 属性的名称;
    nodeValue = 属性的值;
    ```
3. 文本节点对应的值
    ```
    nodeType = 3;
    nodeName = #text;
    nodeValue = 文本内容;
    ```
### 父节点、子节点、同辈节点
```
<ul>
    <li>Jayden</li>
    <li>John</li>
</ul>
```
1. 父节点

    ul 是 li 的父节点，parentNode
2. 子节点
    
    li 是 ul 的子节点，childNodes
    
    firstElementChild 返回第一个子节点。

    lastElementChild 返回最后一个子节点。

    标准浏览器会把空格和换行当作文本节点。所以这里不能使用 firstChild、lastChild
2. 同辈节点

    li 之间的关系是同辈节点。

    nextElementSibling 返回下一个子节点。

    previousElementSibling 返回下一个子节点。

    同样的，在标准浏览器中要注意区分 nextElementSibling、nextSibling、previousElement、previousSibling。
