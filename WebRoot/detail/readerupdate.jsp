<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>读者更新</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/page_common.js"></script>
	<link href="${pageContext.request.contextPath }/CSS/three.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
  <div id="readerupdate">
  <form action="${pageContext.request.contextPath }/ReaderUpdateServlet" method="get">
    <table align="center" cellpadding="0" cellspacing="0">
    	<tr>
    		<td width="80px">姓名：</td>
    		<td>
    		<input type="text"  name="name" value="${requestScope.reader.name }"/>
    		<input type="hidden" name="rid" value="${requestScope.reader.rid }"/>
    		</td>
    	</tr>
    	<tr>
    		<td width="80px">性别：</td>
    		<td>
    		<input type="text"  name="sex" value="${requestScope.reader.sex }"/>
    		<input type="hidden" name="rid" value="${requestScope.reader.rid }"/>
    		</td>
    	</tr><tr>
    		<td width="80px">年龄：</td>
    		<td>
    		<input type="text"  name="age" value="${requestScope.reader.age }"/>
    		<input type="hidden" name="rid" value="${requestScope.reader.rid }"/>
    		</td>
    	</tr>
    	<tr>
    		<td width="80px">班级：</td>
    		<td>
    		<input type="text"  name="grade" value="${requestScope.reader.grade }"/>
    		<input type="hidden" name="rid" value="${requestScope.reader.rid }"/>
    		</td>
    	</tr>
    	<tr>
    		<td width="80px">学号：</td>
    		<td>
    		<input type="text"  name="studentid" value="${requestScope.reader.studentid }"/>
    		<input type="hidden" name="rid" value="${requestScope.reader.rid }"/>
    		</td>
    	</tr>
    	<tr>
    		<td>证件：</td>
	    	<td >
	    	<select name="style" size="1">
	        <option value="身份证" selected="selected">身份证</option>
	        <option value="学生证">学生证</option>
	    	</select>
	    	</td>
    	</tr>
    	<tr>
    		<td width="80px">卡号：</td>
    		<td>
    		<input type="text"  name="cardnum" value="${requestScope.reader.cardnum }"/>
    		<input type="hidden" name="rid" value="${requestScope.reader.rid }"/>
    		</td>
    	</tr>
    	<tr>
    		<td width="80px">电话：</td>
    		<td>
    		<input type="text"  name="tel" value="${requestScope.reader.tel }"/>
    		<input type="hidden" name="rid" value="${requestScope.reader.rid }"/>
    		</td>
    	</tr>
    	<tr>
    		<td width="80px">邮箱：</td>
    		<td>
    		<input type="text"  name="email" value="${requestScope.reader.email }"/>
    		<input type="hidden" name="rid" value="${requestScope.reader.rid }"/>
    		</td>
    	</tr>
    	<tr>
    			<td colspan="2" align="center">
    			<input type="submit" value="修改" />
    			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    			<input  type="reset" value="重置" />
    	</tr>
    </table>
    </form>
    </div>
  </body>
</html>
