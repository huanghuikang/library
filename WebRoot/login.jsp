<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理员登录</title>
<link href="CSS/login.css" rel="stylesheet" type="text/css" />
<Script type="text/javascript" src="js/jquery-1.8.3.js"></Script>
<Script language="javascript">
function check1()
{
	if(form1.name.value=="")
	{
		alert("请添入姓名");
		/* form1.name.focus();
		return false; */
	}
	if(form1.pwd.value=="")
	{
		alert("请添入密码");
		/* form1.pwd.focus();
		return false; */
	}
}
function checks(){
	var pic=document.getElementById("imgs");
	var i=Math.random();//目的是使页面不一样
 	pic.src="CheckCodeServlets?id="+i;
}
function showInfo(){
	var timeSpan = document.getElementById("userName");
	timeSpan.innerHTML = "用户名是由6位的英文与数字组成".fontcolor("green");	
}

function hideInfo(){
	var timeSpan = document.getElementById("userName");
	timeSpan.innerHTML = "";	
}
	
</Script>
</head>

<body>
 <form action="${pageContext.request.contextPath }/manager?method=login" name="form1" method="post">

<div id="all">
    <div id="f1">
        <div id="f11"></div>
      <div id="f12">
      	<!-- <input type="hidden" name="mid" value="1"> -->
      	<div id="f121"><span id="ch">用户名：</span>
        <input type="text" placeholder="请输入用户名" name="name" value="" onfocus="showInfo()"  onblur="hideInfo()"/>
        <span id="userName" ></span>
        <%-- &nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/register.jsp">注册</a> --%>
        </div>
        <div id="f122"><span id="ch">密&nbsp;&nbsp;&nbsp;&nbsp;码:</span>
        
        <input class="ai" name="pwd" placeholder="请输入密码" type="password" value=""/>
        <%-- &nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/querypwd.jsp">&nbsp;找回密码</a> --%>
        </div>
        <div class="new" style="margin:20px;">  
        <label class="new" style="color:yellow">验证码：</label>
		<input type="text" placeholder="验证码" name="code" value="">&nbsp;
		 <img src="CheckCodeServlet" style="border:1px solid darkgray" onclick="checks() " name="code1" id="imgs"></img>
		</div>
        <!-- <div id="f123">
        <input name="repwd" type="checkbox" />&nbsp;&nbsp;记住密码&nbsp;&nbsp;
        <input name="log" type="checkbox" />&nbsp;&nbsp;自动登录 </div> -->
        <div id="f124">
        <input name="login" type="submit" value="登录" onclick="check1()" />
		 <!--修改后的 
		  <input name="login" type="submit" value="登录" />-->
        <input type="reset" value="重置" />
        </div>
      </div>
    </div>
</div>
</form>
</body>
</html>