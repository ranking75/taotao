<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>菜鸟教程(runoob.com)</title>
    <script src="https://static.runoob.com/assets/vue/1.0.11/vue.min.js"></script>
</head>
<body>
<div id="app">
    <ul>
       <li v-for="book in books">
           {{book.name}}
       </li>
    </ul>
</div>
<!-- JavaScript 代码需要放在尾部（指定的HTML元素之后） -->
<script>
    new Vue({
        el:'#app',
        data: {
            books:[{name:"china"},
                   {name:"math"},
                   {name:"english"}]
        }
    });
</script>
</body>
</html>
