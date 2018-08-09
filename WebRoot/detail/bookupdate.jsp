<%@ page language="java" import="java.util.*,com.entity.*,com.dao.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图书更新</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<link href="${pageContext.request.contextPath }/CSS/three.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/page_common.js"></script>
  </head>
  
  <body>
  <div id="bookupdate">
  <form action="${pageContext.request.contextPath }/UpdateBookServlet" method="get">
  
    <div di="update">
    	<h4 align="center">图书更新</h4>
    	<div id=null></div>
    	<%-- <%
    		Book book=request.getAttribute("book");
    		if(book!=null){
				for (int i = 0; i < book.size(); i++) {
    	 %> --%>
    	<table align="center" cellpadding="0" cellspacing="0" class="mainForm">
    		<tr>
    			<td width="80px">类型：</td>
    			<td>
    				<input type="text" name="type" value="${requestScope.book.type }"/>*
    				<%-- <input type="hidden" name="bid" value="${requestScope.book.bid }"/> --%>
    				<input type="hidden" name="bid" value="${requestScope.book.bid }"/>
    			</td>
    		</tr>
    		<tr>
    			<td width="80px">书名：</td>
    			<td>
    				<input type="text" name="book" value="${requestScope.book.name }"/>*
    				<input type="hidden" name="bid" value="${requestScope.book.bid }"/>
    			</td>
    		</tr>
    		<tr>
    			<td width="80px">作者：</td>
    			<td>
    				<input type="text" name="author" value="${requestScope.book.author }"/>*
    				<input type="hidden" name="bid" value="${requestScope.book.bid }"/>
    			</td>
    		</tr>
    		<tr>
    			<td width="80px">出版社：</td>
    			<td>
    				<input type="text" name="pubname" value="${requestScope.book.pubname }"/>*
    				<input type="hidden" name="bid" value="${requestScope.book.bid }"/>
    			</td>
    		</tr>
    		<tr>
    			<td width="80px">出版时间：</td>
    			<td>
    				<input type="text" name="bubtime" value="${requestScope.book.pubtime }"/>*
    				<input type="hidden" name="bid" value="${requestScope.book.bid }"/>
    			</td>
    		</tr>
    		<tr>
    			<td width="80px">译者：</td>
    			<td>
    				<input type="text" name="translator" value="${requestScope.book.translator }"/>*
    				<input type="hidden" name="bid" value="${requestScope.book.bid }"/>
    			</td>
    		</tr>
    		<tr>
    			<td width="80px">价格：</td>
    			<td>
    				<input type="text" name="price" value="${requestScope.book.price }"/>*
    				<input type="hidden" name="bid" value="${requestScope.book.bid }"/>
    			</td>
    		</tr>
    		<tr>
    			<td colspan="2" align="center">
    			<input type="submit" value="修改" />
    			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    			<input type="reset" value="重置" />
    		</tr>
    		<%-- <%
    			}
    		}
    	 %> --%>
    	</table>
    	
    </div>
    </form>
    </div>
  </body>
</html>
