<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Send an Omikuji!</h1>
	<form action="/process" method="POST">
		<label for="number">Pick any number from 5 to 25</label>
		<input type="number" name="number" min="5" max="25">
		<br>
		<label for="city">Enter the name of any city.</label>
		<input type="text" name="city">
		<br>
		<label for="name">Enter the name of any real person.</label>
		<input type="text" name="name">
		<br>
		<label for="hobby">Enter professional endeavor or hobby.</label>
		<input type="text" name="hobby">
		<br>
		<label for="pet">Enter any type of living thing.</label>
		<input type="text" name="pet">
		<br>
		<label for="comment">Say something nice to someone:</label>
		<textarea name="comment" rows="5"></textarea>
		<br>
		<input type="submit" value="Send">
	</form>
</body>
</html>
