<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #f0f4f8;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        h1 {
            margin-bottom: 30px;
            color: #2c3e50;
        }

        .btn-container {
            display: flex;
            gap: 20px;
        }

        .btn {
            padding: 14px 28px;
            font-size: 16px;
            border: none;
            background-color: #3498db;
            color: white;
            border-radius: 6px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .btn:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <h1>Welcome to Ticketing System</h1>
    <div class="btn-container">
        <form action="book" method="get">
            <button class="btn">Book A Ticket</button>
        </form>
        <form action="view" method="get">
            <button class="btn">View Booked Tickets</button>
        </form>
    </div>
</body>
</html>
