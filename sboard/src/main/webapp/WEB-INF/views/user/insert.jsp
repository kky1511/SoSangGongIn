<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 가입</title>
</head>
<body>
<form action="/sboard/user/insert" method="post">
	<table>
		<tr><td>아이디</td><td><input type="text" name="id"></td></tr>
		<tr><td>비밀번호</td><td><input type="password" name="password"></td></tr>
		<tr><td>이메일</td><td><input type="text" name="email"></td></tr>
		<tr><td>연락처</td><td><input type="text" name="tel"></td></tr>
		<tr><td>생일</td><td><input type="date" name="birthDate"></td></tr>
		<tr><td>권한</td>
			<td><select name="authorities">
					<option value="ROLE_USER">유저</option>
					<option value="ROLE_MANAGER">부운영자</option>
					<option value="ROLE_ADMIN">운영자</option>
			    </select>
			</td></tr>
	</table>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
	<button>가입</button>
</form>
</body>
</html>







