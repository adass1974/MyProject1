 <%@ include file="header.jsp" %>

 <div class="container">
 <table class="table table-hover">
 <thread>
 <tr class="table-primary"><th scope="col">Employee ID</th><th scope="col">Name</th><th scope="col">Pay</th>
 <th scope="col">Department</th></tr>
 </thread>

 <c:forEach items="${employeeList}" var="employee">
 <body>
    <tr>
        <td><c:out value="${employee.empId}"/></td>
        <td><c:out value="${employee.empName}"/></td>
        <td><c:out value="${employee.empPay}"/></td>
        <td><c:out value="${employee.deptName"/></td>
    </tr>
 </body>

 </c:forEach>
 </table>

 <br/>

 <a href="addNewEmployee" type="button" class="btn btn-primary">Add New Employee</a>

 <br/>


<form action="employee">


<div class="form-group">
<label for="empId">Enter Employee Id: </label>
<input class="form-control" id="empId" type="text" name="empId"/>
</div>


</input type="submit" value="Find Employee By Id" class="btn btn-primary"/>
</form>

</div>

<br/>
<br/>
<br/>

<$@ include file="footer.jsp" %>



