<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
</head>
<body bgcolor="#fffff">
	<form method="post" action="addServlet">
		<table width=500px cellpadding="2" cellspacing="2" align="center"
			border="1" bordercolor="#FF69B4" bgcolor="#E6E6FA">

			<tr>
				<td align="center" colspan="2"><font color="#0000F"><h2>Student
							Information</h2></font></td>
			</tr>

			<tr>
				<td align="center"><b>Student Name</td>
				<td><input type="text" size="20" name="sname"></td>
			</tr>
			<tr>

				<td align="center" valign="top"><b>Course<b></td>
				<td><select name="course">
						<option value="Vb.net">Vb.net</option>
						<option value="Enterprise Java">Enterprise Java</option>
						<option value="Core Java">Core Java</option>
				</select></td>
			</tr>
			<tr>

				<td align="center" valign="top"><b>Address<b></td>
				<td><input type=text name="address">
				</textarea></td>
			</tr>
			<tr>

				<td align="center"><b>Moblie No<b></td>
				<td><input type="text" size="20" maxlength="10" name="mno"></td>
			</tr>

			<tr>

				<td align="center">&nbsp;</td>
				<td><input type="submit" value="Register" /></td>
			</tr>

		</table>
	</form>
</body>
</html>
