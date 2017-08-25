<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/11
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
</head>
<body>
姓名：<input type="text" id="name" name="name"/><br>
年龄：<input type="text" id="age" name="age"/><br>
<input type="button" value="提交" onclick="submitData()"/>



<script type="text/javascript">
    function submitData() {
        var name = $("#name").val().trim();
        var age = $("#age").val().trim();
        $.post("${pageContext.request.contextPath}/student/add", {
            name:name,age:age
        }, function (result) {
            console.log(result)
            alert(result.code_msg);
        });
    }
</script>
</body>
</html>
