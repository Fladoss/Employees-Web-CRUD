<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html>
<head>

    <h2>Employee Information</h2>
    <br>

    <form:form action="save-employee" modelAttribute="employee">

        <form:hidden path="id"/>

        Name <form:input path="name"/>
        <br><br>
        Surname <form:input path="surname"/>
        <br><br>
        Department <form:input path="department"/>
        <br><br>
        Salary <form:input path="salary"/>
        <br><br>
        <input type="submit" value="OK">

    </form:form>

</head>
<body>

</body>
</html>
