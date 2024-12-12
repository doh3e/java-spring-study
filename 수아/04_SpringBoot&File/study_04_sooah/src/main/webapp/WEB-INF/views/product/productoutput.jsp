<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Output</title>
<style type="text/css">
	ul {
		display: flex;
		gap: 20px;
	}
	img {
		max-width: 200px;
	}
</style>
</head>
<body>
	<h1>Product Output</h1>
	<p>상품명: ${name}</p>
	<p>가격: ${price}</p>
	<p>카테고리: ${category}</p>
	<c:if test="${not empty fileNames}">
		<ul>
			<c:forEach var="fileName" items="${fileNames}">
				<li>
					<p>첨부 파일: <a href="/img/${fileName}" target="_blank">${fileName}</a></p>
					<p>(미리보기)</p> 
					<img src="/img/${fileName}">				
				</li>
			</c:forEach>
		</ul>
	</c:if>
	<c:if test="${empty fileNames}">
		<p>첨부파일 : 없음</p>
	</c:if>
</body>
</html>