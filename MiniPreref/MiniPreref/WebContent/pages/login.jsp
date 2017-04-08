<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="s" uri="/struts-tags"%>

<html ng-app="myAppName">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js'></script>
<script src='${pageContext.request.contextPath}/pages/js/controller.js'></script>


</head>
<body>
<s:form action="login.action" >

	<input type="text" ng-model='query'/>
	<select ng-model="order">
    	<option value="name">Organiser par nom</option>
    	<option value="comment">Organiser par contenu</option>
    </select>
    
    
	<div ng-controller="CommentsCtrl">
		<div ng-repeat="comment in comments | filter:{about:query} | orderBy:order">
			<p>
				<strong>{{comment.name | uppercase}}</strong><br>
				{{comment.about}}				
			</p>
			
		</div>
	</div>
	
	
    <%-- <s:textfield name="username" key="label.username" size="20"  />    
    <s:password name="password" key="label.password" size="20" />
    <s:submit method="execute" key="label.login" align="center" /> --%>
</s:form>
</body>
</html>