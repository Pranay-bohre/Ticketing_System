<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Booked Tickets</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #eef3f7;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 800px;
            margin: 60px auto;
            background: #fff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.08);
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
            color: #2c3e50;
        }

        .ticket {
            background-color: #f8fafd;
            border-left: 6px solid #3498db;
            padding: 20px;
            margin-bottom: 20px;
            border-radius: 8px;
        }

        .ticket p {
            margin: 5px 0;
            color: #333;
        }

        .pagination {
            display: flex;
            justify-content: center;
            margin-top: 30px;
        }

        .pagination a {
            display: inline-block;
            padding: 10px 15px;
            margin: 0 5px;
            background-color: #3498db;
            color: #fff;
            text-decoration: none;
            border-radius: 6px;
            font-weight: bold;
        }

        .pagination a.disabled {
            background-color: #ccc;
            pointer-events: none;
        }

        .no-tickets {
            text-align: center;
            color: #888;
            font-size: 18px;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Your Booked Tickets</h2>

        <c:choose>
        <c:when test="${empty tickets}">
            <div class="no-tickets">You haven't booked any tickets yet.</div>
        </c:when>
        <c:otherwise>
            <c:forEach var="ticket" items="${tickets}">
                <div class="ticket">
                    <p><strong>From:</strong> ${ticket[0]}</p>
                    <p><strong>To:</strong> ${ticket[1]}</p>
                    <p><strong>Date:</strong> ${ticket[2]}</p>
                </div>
            </c:forEach>
        </c:otherwise>
    </c:choose>

        <!-- Optional Pagination -->
        <div class="pagination">
            <a href="#">Previous</a>
            <a href="#">Next</a>
        </div>
    </div>
</body>
</html>
