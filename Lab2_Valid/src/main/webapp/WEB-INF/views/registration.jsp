<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

<h1>Registration Form</h1><br />

    <form:form modelAttribute="student" action="" method="post">
        <fieldset>
            <legend>Add a Student</legend>
            <p>
                <form:errors path="*" cssStyle="color : red;" />
            </p>
            <p>
                <label for="id">ID: </label>
                    <form:input path="id" id="id" />
                <form:errors path="id" cssStyle="color : red;" />
            </p>
            <p>
                <label for="firstName">First Name: </label>
                    <form:input path="firstName" />
                <form:errors path="firstName" cssStyle="color : red;" />
            </p>
            <p>
                <label for="lastName">Last Name: </label>
                    <form:input path="lastName" />
                    <form:errors path="lastName" cssStyle="color : red;" />
            </p>
            <p>
                <label for="email">Email: </label>
                    <form:input path="email" id="email"/>
                <form:errors path="email" cssStyle="color : red;" />
            </p>
            <p>
                <form:radiobutton path="gender" value="Male" id="male" />
                <label for="male">Male:</label>
                <form:radiobutton path="gender" value="Female" id="female" />
                <label for="female">Female:</label>
                <form:errors path="gender" cssStyle="color : red;" />
            </p>
            <p>
                <label for="birthday">Date Of Birth: </label>
                <form:input path="birthday" id="birthday" />
                <form:errors path="birthday" cssStyle="color : red;" />
            </p>
            <p>
                Phone No:<br>
                <label for="area">Area: </label>
                    <form:input path="phone.area" id="area" />
                <form:errors path="phone.area" cssStyle="color : red;" />
                <label for="prefix">Prefix: </label>
                    <form:input path="phone.prefix" id="prefix" />
                <form:errors path="phone.prefix" cssStyle="color : red;" />
                <label for="number">Number: </label>
                    <form:input path="phone.number" id="number" />
                <form:errors path="phone.number" cssStyle="color : red;" />
            </p>

            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5" value="Register">
            </p>
        </fieldset>
    </form:form>
</body>
</html>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
</body>
</html>