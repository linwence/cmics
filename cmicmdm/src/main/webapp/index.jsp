<%--
  Created by IntelliJ IDEA.
  User: Vincent
  Date: 2016/7/14
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
    <script type="text/javascript" src="<%=basePath%>js/jquery/jquery-3.1.0.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/handlebars/handlebars-v4.0.5.js"></script>
    <script language="javascript" type="text/javascript">

        function queryEmp() {
            $("#mytbody").empty();
            var mytbodytemple = Handlebars.compile($("#mytbody-temple").html());
            Handlebars.registerHelper("indexhelp", function (index) {
                        return index + 1;
                    }
            )
            ;
            $.ajax({
                        url: "<%=basePath%>"+"api/emp/list",
                        type: 'get',
                        cache: false,
                        success: function (data) {
                            $("#mytbody").append(mytbodytemple(data));

                        },
                        error: function (data) {

                        }
                    }
            );
        }
    </script>

    <style id="style1">


        /* CSS Document */

        body {
            font: normal 11px auto "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            color: #4f6b72;
            background: #E6EAE9;
        }

        a {
            color: #c75f3e;
        }

        #mytable {
            width: 700px;
            padding: 0;
            margin: 0;
        }

        caption {
            padding: 0 0 5px 0;
            width: 700px;
            font: italic 11px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            text-align: right;
        }

        th {
            font: bold 11px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            color: #4f6b72;
            border-right: 1px solid #C1DAD7;
            border-bottom: 1px solid #C1DAD7;
            border-top: 1px solid #C1DAD7;
            letter-spacing: 2px;
            text-transform: uppercase;
            text-align: left;
            padding: 6px 6px 6px 12px;
            background: #CAE8EA no-repeat;
        }

        /*power by www.winshell.cn*/
        th.nobg {
            border-top: 0;
            border-left: 0;
            border-right: 1px solid #C1DAD7;
            background: none;
        }

        td {
            border-right: 1px solid #C1DAD7;
            border-bottom: 1px solid #C1DAD7;
            background: #fff;
            font-size: 11px;
            padding: 6px 6px 6px 12px;
            color: #4f6b72;
        }

        /*power by www.winshell.cn*/

        td.alt {
            background: #F5FAFA;
            color: #797268;
        }

        th.spec {
            border-left: 1px solid #C1DAD7;
            border-top: 0;
            background: #fff no-repeat;
            font: bold 10px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
        }

        th.specalt {
            border-left: 1px solid #C1DAD7;
            border-top: 0;
            background: #f5fafa no-repeat;
            font: bold 10px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
            color: #797268;
        }

        /*---------for IE 5.x bug*/
        html > body td {
            font-size: 11px;
        }

        body, td, th {
            font-family: 宋体, Arial;
            font-size: 12px;
        }
    </style>
</head>
<body>
<h1>测试</h1>
<div id="form1">


    <table id="mytable">
        <thead>
        <tr>
            <th>序号</th>
            <th>empno</th>
            <th>ename</th>
            <th>job</th>
            <th>mgr</th>
            <th>hiredate</th>
            <th>sal</th>
            <th>comm</th>
            <th>deptno</th>
        </tr>
        </thead>
        <tbody id="mytbody">

        </tbody>
        <script id="mytbody-temple" type="text/x-handlebars-template">
            {{#each this}}
            <tr>
                <td>{{indexhelp @index}}</td>
                <td>{{empno}}</td>
                <td>{{ename}}</td>
                <td>{{job}}</td>
                <td>{{mgr}}</td>
                <td>{{hiredate}}</td>
                <td>{{sal}}</td>
                <td>{{comm}}</td>
                <td>{{deptno}}</td>
            </tr>
            {{/each}}
        </script>

    </table>

</div>
<div>
    <input type="button" value="查询" onclick="queryEmp()"/>

</div>

</body>
</html>
