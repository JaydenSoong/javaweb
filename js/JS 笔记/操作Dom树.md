### 1. appendChild() 方法
* 添加子节点到末尾
* 特点：类似于剪切粘帖的效果
### 2. insertBefore(newNode, oldNode)
- 在某个节点之前插入新节点
- 两个参数（要插入的节点， 在谁之前插入）
- 要插入的节点不存在，则创建。
  
  1. 创建标签
  2. 创建文本
  3. 把文本添加到标签下面
    ```
    var ul1 = document.getElementsByTagName("ul")[0];
    // 创建节点
    var lix = document.createElement("li");
    var textx = document.createTextNode("华国锋"); 
    lix.appendChild(textx);
    // 插入的位置
    var liy = document.getElementsByTagName("li")[1];
    // 在指定位置插入
    ul1.insertBefore(lix, liy);
    ```
### 3. 没有 insertAfter() 方法
### 4. removeChild() 方法，删除节点
* 通过父节点删除，不能自行删除
    ```
    // 删除节点
    function remove_child() {
        var ul1 = document.getElementsByTagName("ul")[0];
        // 返回 li 标签集合
        var li_col = document.getElementsByTagName("li");
        // 删除最后一个 li 标签
        if(li_col.length > 0)
            ul1.removeChild(li_col[li_col.length - 1]);
    } 
    ```
### 5. replaceChild(newNode, oldNode) 替换节点
* 通过父节点替换
    ```
    // 替换节点
    function replace_child() {
        // 创建节点
        var lix = document.createElement("li")
        lix.appendChild(document.createTextNode("邓小平"));
        // 父节点
        var ul1 = document.getElementsByTagName("ul")[0];
        // 被替换的节点
        var liy = document.getElementsByTagName("li")[1];
        // 替换操作
        ul1.replaceChild(lix, liy);
    }
    ```
### 6.cloneChild() 复制节点
* 代码
    
    ```
    // 复制节点
    function clone_child() {
        // 获取需要被复制的节点
        var ul1 = document.getElementsByTagName("ul")[0];
        // 创建副本——复制
        var ul2 = ul1.cloneNode(true);
        // 通过父节点完成复制操作
        var parent1 = document.getElementsByTagName("body")[0];
        parent1.appendChild(ul2);
    }
    ```