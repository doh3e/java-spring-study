<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
    table {
       border-collapse: collapse; /* border 결합 */
    }
    table, th, td {
        border: 1px solid black;
        padding: 10px;
        text-align: center;
    }
</style>
<title>Score Result</title>
</head>
<body>
	<c:set var="total" value="${korean+english+math }"></c:set>
	<c:set var="avg" value="${total/3}" />
	
    <!-- 과목별 학점 계산 -->
    <c:choose>
        <c:when test="${korean >= 95}">
            <c:set var="koreanGrade" value="A+" />
            <c:set var="koreanPoint" value="4.5" />
        </c:when>
        <c:when test="${korean >= 90}">
            <c:set var="koreanGrade" value="A" />
            <c:set var="koreanPoint" value="4.0" />
        </c:when>
        <c:when test="${korean >= 85}">
            <c:set var="koreanGrade" value="B+" />
            <c:set var="koreanPoint" value="3.5" />
        </c:when>
        <c:when test="${korean >= 80}">
            <c:set var="koreanGrade" value="B" />
            <c:set var="koreanPoint" value="3.0" />
        </c:when>
        <c:when test="${korean >= 75}">
            <c:set var="koreanGrade" value="C+" />
            <c:set var="koreanPoint" value="2.5" />
        </c:when>
        <c:when test="${korean >= 70}">
            <c:set var="koreanGrade" value="C" />
            <c:set var="koreanPoint" value="2.0" />
        </c:when>
        <c:when test="${korean >= 65}">
            <c:set var="koreanGrade" value="D+" />
            <c:set var="koreanPoint" value="1.5" />
        </c:when>
        <c:when test="${korean >= 60}">
            <c:set var="koreanGrade" value="D" />
            <c:set var="koreanPoint" value="1.0" />
        </c:when>
        <c:otherwise>
            <c:set var="koreanGrade" value="F" />
            <c:set var="koreanPoint" value="0.0" />
        </c:otherwise>
    </c:choose>
    
    <!-- 영어 학점 계산 -->
	<c:choose>
        <c:when test="${english >= 95}">
            <c:set var="englishGrade" value="A+" />
            <c:set var="englishPoint" value="4.5" />
        </c:when>
        <c:when test="${english >= 90}">
            <c:set var="englishGrade" value="A" />
            <c:set var="englishPoint" value="4.0" />
        </c:when>
        <c:when test="${english >= 85}">
            <c:set var="englishGrade" value="B+" />
            <c:set var="englishPoint" value="3.5" />
        </c:when>
        <c:when test="${english >= 80}">
            <c:set var="englishGrade" value="B" />
            <c:set var="englishPoint" value="3.0" />
        </c:when>
        <c:when test="${english >= 75}">
            <c:set var="englishGrade" value="C+" />
            <c:set var="englishPoint" value="2.5" />
        </c:when>
        <c:when test="${english >= 70}">
            <c:set var="englishGrade" value="C" />
            <c:set var="englishPoint" value="2.0" />
        </c:when>
        <c:when test="${english >= 65}">
            <c:set var="englishGrade" value="D+" />
            <c:set var="englishPoint" value="1.5" />
        </c:when>
        <c:when test="${english >= 60}">
            <c:set var="englishGrade" value="D" />
            <c:set var="englishPoint" value="1.0" />
        </c:when>
        <c:otherwise>
            <c:set var="englishGrade" value="F" />
            <c:set var="englishPoint" value="0.0" />
        </c:otherwise>
    </c:choose>
	
	    
    <!-- 수학 학점 계산 -->
		<c:choose>
        <c:when test="${math >= 95}">
            <c:set var="mathGrade" value="A+" />
            <c:set var="mathPoint" value="4.5" />
        </c:when>
        <c:when test="${math >= 90}">
            <c:set var="mathGrade" value="A" />
            <c:set var="mathPoint" value="4.0" />
        </c:when>
        <c:when test="${math >= 85}">
            <c:set var="mathGrade" value="B+" />
            <c:set var="mathPoint" value="3.5" />
        </c:when>
        <c:when test="${math >= 80}">
            <c:set var="mathGrade" value="B" />
            <c:set var="mathPoint" value="3.0" />
        </c:when>
        <c:when test="${math >= 75}">
            <c:set var="mathGrade" value="C+" />
            <c:set var="mathPoint" value="2.5" />
        </c:when>
        <c:when test="${math >= 70}">
            <c:set var="mathGrade" value="C" />
            <c:set var="mathPoint" value="2.0" />
        </c:when>
        <c:when test="${math >= 65}">
            <c:set var="mathGrade" value="D+" />
            <c:set var="mathPoint" value="1.5" />
        </c:when>
        <c:when test="${math >= 60}">
            <c:set var="mathGrade" value="D" />
            <c:set var="mathPoint" value="1.0" />
        </c:when>
        <c:otherwise>
            <c:set var="mathGrade" value="F" />
            <c:set var="mathPoint" value="0.0" />
        </c:otherwise>
    </c:choose>        
    
    <!-- 평점 평균 계산 -->
    <c:set var="totalPoint" value="${koreanPoint + englishPoint + mathPoint}" />
    <c:set var="avgPoint" value="${totalPoint / 3}" />
	
	<h1>${name}님의 성적</h1>
	<table>
		<tr>
			<th>구분</th> 
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			<td>총점</td>
			<td>평균</td>
			<td>평점평균</td>
		</tr>
		<tr>
			<th>성적</th>
			<td>${korean}</td>
			<td>${english}</td>
			<td>${math}</td>
			<td rowspan="2">${total}</td>
			<td rowspan="2"><fmt:formatNumber value="${avg}" type="number" maxFractionDigits="2" /></td>
            <td rowspan="2"><fmt:formatNumber value="${avgPoint}" type="number" maxFractionDigits="2" /></td>
		</tr>
		<tr>
			<th>학점</th>
			<td>${koreanGrade}</td>
			<td>${englishGrade}</td>
			<td>${mathGrade}</td>
		</tr>
	</table>
    
    <a href="/">메인으로 이동 </a>
</body>
</html>