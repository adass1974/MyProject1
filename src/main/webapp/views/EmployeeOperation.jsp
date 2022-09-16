 <%@ include="header.jsp"%>
 <div class="container">

 <table class="table table-hover">
 <thread>
 <tr class="table-primary"><th scope="col">Employee</th><th scope="col">Name</th><th scope="col">Department</th></tr>
 </thread>
 <body>
 <tr>
    <td><c:out value="${employeeData.empId}"/></td>
    <td><c:out value="${employeeData.empName}"/></td>
    <td><c:out value="${employeeData.empPay}"/></td>
    <td><c:out value="${employeeData.deptName}"/></td>
 </tr>
 </body>

 </table>
 </br>

 <form method="post" action="updateEmployee">
 <input type="hidden" name="empId" value="${employeeData.empId}"/
 <input type="submit" value="Update Employee" class="btn btn-primary"/>
 </form>

 <br/>

 <form action="deleteEmployee">
 <input type="hidden" name="empId" value="${employeeData.empId}"/>
 <input type="submit" value="Delete Employee" class="btn btn-primary"/>
 </form>

 </div>
 <%@ include file="footer.jsp"%>
