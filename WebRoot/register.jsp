<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	
	<link href="CSS/register.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/page_common.js"></script>
	<script language="javascript">    
function isValid(form2)    
{
	
	/* if(form2.id.value=="")
	{
		alert("编号不能为空");
		return false;
		} */	
	if (form2.uname.value=="")    
	 {    
	 alert("用户名不能为空");    
	 return false;    
	 }
	 if(form2.age.value=="")
	 {
		 alert("年龄不能为空");
		 return false;
		 }
	if(form2.idcard.value=="")
	{
		alert("身份证不能为空");
		return false;
		}
	if(form2.time.value=="")
	{
		alert("办证日期不能为空");
		return false;
		}
	if(form2.tel.value=="")
	{
		alert("联系电话不能为空");
		return false;
		}  
	if(document.form2.value!=document.form2.pwd2.value){
		alert("你输入的密码不一样!");
		return false;
		}
		return true;
	} 
</script>
  </head>
  
  <body>
    <form action="${pageContext.request.contextPath }/manager?method=register" name="form2" method="post">
   	  <div id="all">
        	<div id="t1"></div>
            <div id="t2"></div>
        <div id="t3">
            <table width="400" height="360" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td width="141" align="right"><strong>用户编号：</strong></td>
    <td width="259" align="center">
      <input type="text" name="id" id="textfield" /></td>
    </tr>
    <tr>
    <td align="right"><strong>用户姓名：</strong></td>
    <td align="center"> <input type="text" name="name" id="textfield" />
    <font color=red>${requestScope.message }</font> <!-- 如果用户名存在注册失败，给用户提示 -->
    </td>
    </tr>
    <tr>
    <td align="right"><strong>性别：</strong></td>
    <td align="center">
      男
          <input name="sex" type="radio" value="男" checked="$manager.sex()" />
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      女
          <input type="radio" name="sex" value="女" />
        </td>
    </tr>
    <tr>
    <td align="right"><strong>年龄：</strong></td>
    <td align="center"> <input type="text" name="age" id="textfield" /></td>
    </tr>
    <tr>
    <td align="right"><strong>出生日期：</strong></td>
    <td align="center"> <input type="text" name="birthday" id="textfield" /></td>
    </tr>
    <tr>
    <td align="right"><strong>身份证：</strong></td>
    <td align="center"> <input type="text" name="cardnum" id="textfield" /></td>
    </tr>
     <tr>
    <td align="right"><strong>工作时间：</strong></td>
    <td align="center"> <input type="text" name="workdate" id="textfield" /></td>
    </tr>
    <tr>
    <td align="right"><strong>联系电话：</strong></td>
    <td align="center"> <input type="text" name="tel" id="textfield" /></td>
    </tr>
    <tr>
    <td align="right"><strong>密码：</strong></td>
    <td align="center"> <input type="text" name="pwd" id="textfield" /></td>
    </tr>
    <tr>
    <td align="right"><strong>确定密码：</strong></td>
    <td align="center"><input type="text" name="pwd2" id="textfield"/></td>
    </tr>
    <tr>
    <td align="right"><strong>问题：</strong></td>
    <td align="center">
    <!-- <input type="text" name="problem" id="textfield"/> -->
    <select name="problem" id="textfield">
	  <option>父亲的生日</option>
	  <option>母亲的生日</option>
	  <option>自己的生日</option>
	</select>
    </td>
    </tr>
    <tr>
    <td align="right"><strong>答案：</strong></td>
    <td align="center"><input type="text" name="answer" id="textfield"/></td>
    </tr>
    </table>
   		  <div id="t31"></div>
          <div id="t32">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input name="submit" type="submit" value="注册"  name="register" onclick="return isValid(form2)"/>
	<input name="reset" type="reset" value="重置" /></div>
        </div>
        
	</div>
	</form>
  </body>
</html>
