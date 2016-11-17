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
    <script type="text/javascript" src="<%=basePath%>js/LodopFuncs.js"></script>


    <object id="LODOP_OB" classid="clsid:2105C259-1E0C-4534-8141-A753534CB4CA" width=0 height=0>
        <embed id="LODOP_EM" type="application/x-print-lodop" width=0 height=0></embed>
    </object>

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
<h1>F4101打印</h1>
<div id="form1">

    <form>
        <table id="mytable">
            <tr>
                <th>imitm</th>
                <th>imlitm</th>
                <th>imdsc1</th>
                <th>imdsc2</th>
                <th>imuom1</th>
            </tr>
            <c:forEach items="${f4101s}" var="f4101">
                <tr>
                    <td>${f4101.imitm}</td>
                    <td>${f4101.imlitm}</td>
                    <td>${f4101.imdsc1}</td>
                    <td>${f4101.imdsc2}</td>
                    <td>${f4101.imuom1}</td>
                </tr>

            </c:forEach>
        </table>
    </form>
</div>
<input type="button" value="打印预览" onclick="prn1_preview()">
<input type="button" value="打印" onclick="prn1()">
<input type="button" value="打印设计" onclick="prtDesign()">
<script language="JavaScript">
    var LODOP;
    function prn1_preview() {
        CreateOneFormPage();
        LODOP.PREVIEW();

    }
    function prn1() {
        CreateOneFormPage();
        LODOP.PRINT();

    }


    function CreateOneFormPage() {
        LODOP = getLodop();
        var strBodyStyle = "<style>" + document.getElementById("style1").innerHTML + "</style>";

        var strFormHtml = strBodyStyle + "<body>" + document.getElementById("form1").innerHTML + "</body>";
        LODOP.PRINT_INIT("打印控件功能演示_Lodop功能_表单一");
        /*  LODOP.SET_PRINT_STYLE("FontSize", 18);*/
        /*   LODOP.SET_PRINT_STYLE("Bold", 1);*/
        LODOP.ADD_PRINT_TEXT(39,289,260,39,"F401菜品数据");
        LODOP.SET_PRINT_STYLEA(0,"FontSize",20);
        LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
        LODOP.SET_PRINT_STYLEA(0,"Bold",1);
        LODOP.ADD_PRINT_HTM(112,39,700,350, strFormHtml);
    }

   function prtDesign() {
       CreateOneFormPage();
       LODOP.PRINT_DESIGN();


   }

</script>
</body>
</html>
