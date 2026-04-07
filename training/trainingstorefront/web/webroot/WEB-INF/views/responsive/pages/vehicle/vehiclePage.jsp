<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<style>
    .vehicle__section {
        margin: 30px;
        font-family: Arial, sans-serif;
    }

    .vehicle__headline {
        font-size: 24px;
        font-weight: bold;
        margin-bottom: 20px;
        color: #2c3e50;
    }

    .custom-table {
        width: 100%;
        border-collapse: collapse;
        margin-bottom: 30px;
    }

    .custom-table th {
        background-color: #34495e;
        color: white;
        padding: 10px;
        text-align: left;
    }

    .custom-table td {
        padding: 10px;
        border: 1px solid #ddd;
    }

    .custom-table tr:nth-child(even) {
        background-color: #f2f2f2;
    }

    .custom-table tr:hover {
        background-color: #e6f2ff;
    }

    .sub-headline {
        font-size: 18px;
        margin: 20px 0 10px;
        color: #2980b9;
    }
</style>

<div class="vehicle__section">

```
<div class="vehicle__headline">
    <spring:theme code="vehicle.list.title" text="Vehicle List"/>
</div>

<c:choose>

    <%-- If list is empty --%>
    <c:when test="${empty vehicles}">
        <p>
            <spring:theme code="vehicle.list.empty" text="No vehicles found." />
        </p>
    </c:when>

    <%-- If list has data --%>
    <c:otherwise>

        <%-- MAIN VEHICLE TABLE --%>
        <div class="sub-headline">Vehicle Details</div>
        <table class="custom-table">
            <thead>
                <tr>
                    <th>Code</th>
                    <th>Name</th>
                    <th>CC</th>
                    <th>HP</th>
                    <th>Top Speed</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="vehicle" items="${vehicles}">
                    <tr>
                        <td>${vehicle.code}</td>
                        <td>${vehicle.name}</td>
                        <td>${vehicle.cc}</td>
                        <td>${vehicle.hp}</td>
                        <td>${vehicle.topSpeed}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <%-- EMAIL + PROCESS TABLE --%>
        <div class="sub-headline">Order Tracking Details</div>
        <table class="custom-table">
            <thead>
                <tr>
                    <th>Email</th>
                    <th>Process</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="vehicle" items="${vehicles}">
                    <tr>
                        <td>${vehicle.email}</td>
                        <td>${vehicle.processDefinitionName}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </c:otherwise>

</c:choose>
```

</div>
