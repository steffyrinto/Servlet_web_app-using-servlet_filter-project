<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="menu2.jsp"></jsp:include>
<form method="POST" action="${pageContext.request.contextPath}/add">
     <table border="0">
          <tr>
             <td>Enter product id :</td>
 <td><input type="text" name="productid" > </td>
           </tr>
           <tr>
              <td>Enter product name :</td>
<td><input type="text" name="productname" > </td>
           </tr>
           <tr>
           <td><input type="submit" value="add" formaction="productListView.jsp"></td>
           
           </tr>
           </table>
           </form>
            <div style="background: #E0E0E0; text-align: center; padding:5px;margin-top:10px;">
		@Copyright FACEPrep
	</div>
             
</body>
</html>