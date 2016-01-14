<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%

	String message = (String) request.getAttribute("message");
	List<Integer> param1 = (List<Integer>) request.getAttribute("listOnJsp");
	
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body style="height:100%; background: #fefcea; /* Old browsers */
background: -moz-linear-gradient(top, #fefcea 0%, #f1da36 100%); /* FF3.6+ */
background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#fefcea), color-stop(100%,#f1da36)); /* Chrome,Safari4+ */
background: -webkit-linear-gradient(top, #fefcea 0%,#f1da36 100%); /* Chrome10+,Safari5.1+ */
background: -o-linear-gradient(top, #fefcea 0%,#f1da36 100%); /* Opera 11.10+ */
background: -ms-linear-gradient(top, #fefcea 0%,#f1da36 100%); /* IE10+ */
background: linear-gradient(to bottom, #fefcea 0%,#f1da36 100%); /* W3C */
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#fefcea', endColorstr='#f1da36',GradientType=0 ); /* IE6-9 */">
<h1>Test NEW</h1>

<%
	for (Integer val : param1) {
		out.println(val);
		out.println("<br/>");
	}

	
%>

<br><br>
<%
	String string1 = "This is first String.";
%>
<%=string1%>
<br><br>


<%= message %>
<br><br>


	<%
		Integer year = 2014 + 2;

		if (year > 2014) {
	%>

	<p>
		Year is:<%=year%>
	
	<p>

		<%
			}
		%>


		<%
			try {
				int x = 5 / 0;
			} catch (Exception ex) {
		%>
	
	
	<p>
		The exception is :
		<%=ex%>
		<br /> There is an exception:
		<%=ex.getMessage()%></p>
	<%
	}

%>

</body>
</html>