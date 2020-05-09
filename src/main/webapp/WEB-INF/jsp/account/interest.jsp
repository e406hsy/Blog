<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/css/login.css">
    <title>My Personal Web</title>
</head>

<body>
    <jsp:include page="../common/header.jsp"></jsp:include>
    <main class="app">
        <h2>예금 이자 계산하기</h2>
        <form>
            <input name="amount" id="amount" type="number" />
            <input name="rates" id="rates" type="number" />
            <button id="calculate_btn" type="button">계산하기</button>
        </form>
        <table>
            <thead>
                <tr>
                    <td>개월</td>
                    <td>원금</td>
                    <td>이자</td>
                    <td>총액</td>
                </tr>
            </thead>
            <tbody>
            </tbody>
        </table>
    </main>
    <script type="text/javascript" src="../js/account/interest.js"></script>
</body>

</html>