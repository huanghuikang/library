<%@ page language="java" import="java.util.*,com.entity.*,com.dao.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>日常工作</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<link href="${pageContext.request.contextPath }/CSS/three.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
    <div id="work">
	    <form  action="${pageContext.request.contextPath}/work" method="get">
	    	<input class="form" type="hidden" name="method" value="search"/>
	    	<input class="form" type="text" name="key" title="请输入图书编号"/>
	    	<input class="form" type="submit" value="搜索"/>
	    </form>
    	<table border="1" width="80%">
    	 <tr align="center">
    	 	<td>编号</td>
    	 	<td>读者编号</td>
    	 	<td>图书编号</td>
    	 	<td>借书时间</td>
    	 	<td>还书时间</td>
    	 	<td>借书次数</td>
    	 	<td>还书次数</td>
    	 	<td>是否完整</td>
    	 	<td>操作</td>
    	 </tr>
    	 <%
				List<Work> work = (List)request.getAttribute("list");
				if(work!=null){
				for (int i = 0; i < work.size(); i++) {
			%>
    	 <tr align="center" width="800px">
    	 	<td><%=work.get(i).getId() %></td>
    	 	<td><%=work.get(i).getRid() %></td>
    	 	<td><%=work.get(i).getBid() %></td>
    	 	<td><%=work.get(i).getBorrowdate() %></td>
    	 	<td><%=work.get(i).getBackdate() %></td>
    	 	<td><%=work.get(i).getBorrowtimes() %></td>
    	 	<td><%=work.get(i).getBacktimes() %></td>
    	 	<td><%=work.get(i).getComplete() %></td>
    	 	<td>
    	 	<!-- 	<a href="workadd.jsp">借书</a> -->
    	 		<a href="/mylibrary/DeleteWorkServlet?id=<%=work.get(i).getId() %>&status=delete">还书</a>
    	 	</td>
    	 </tr>
    	 <%-- <tr align="center">
    	 	<td colspan="4" >
    	 		<!-- <input type="submit" value="借书" /> -->
    	 		<a href="/detail/workadd.jsp">借书</a>
    	 	</td>
    	 	<td colspan="4" >
    	 		<!-- <input type="submit" value="还书" /> -->
    	 		<a href="/mylibrary/DeleteWorkServlet?id=<%=work.get(i).getId() %>">还书</a>
    	 	</td>
    	 </tr> --%>
    	  <%
    			}
    		}
    	 %>
    	</table>
    </div>
  </body>
</html>
