<!DOCTYPE html>
<html>
<head>
    <title>To-Do List</title>
</head>
<body>
<h1>To-Do List</h1>
<form action="${pageContext.request.contextPath}/task" method="post">
    <input type="text" name="description" placeholder="Enter task description" />
    <button type="submit">Add Task</button>
</form>
<ul>
    <c:forEach var="task" items="${tasks}">
        <li>
            <span>${task.description}</span>
            <a href="${pageContext.request.contextPath}/task/delete?id=${task.id}">Delete</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
