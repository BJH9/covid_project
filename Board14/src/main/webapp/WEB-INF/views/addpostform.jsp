<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addok" method="post">
<table id="edit">
<tr><td>residence_type</td><td><input type="text" name="residence_type"/></td></tr>
<tr><td>confirmed_date</td><td><input type="text" name="confirmed_date"/></td></tr>
<tr><td>confirmed_status</td><td><input type="text" name="confirmed_status"/></td></tr>
<tr><td>route_date</td><td><input type="text" name="route_date"/></td></tr>
<tr><td>route_name</td><td><input type="text" name="route_name"/></td></tr>
<tr><td>route_arrive_time</td><td><input type="text" name="route_arrive_time"/></td></tr>
<tr><td>route_leave_time</td><td><input type="text" name="route_leave_time"/></td></tr>
</table>
<button type="button" onclick="location.href='list'">목록보기</button>
<button type="submit">등록하기</button>
</form>

</body>
</html>