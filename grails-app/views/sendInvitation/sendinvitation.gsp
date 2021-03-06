<%--
  Created by IntelliJ IDEA.
  User: amir
  Date: 25/2/15
  Time: 5:38 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <%@ page import="com.linksharing.*" %>
    <link rel="stylesheet" type="text/css" href="/linksharing/css/style.css">
    <link rel="stylesheet" type="text/css" href="/linksharing/css/home.css">
    <title>Send Invitation</title>
</head>

<body>
<div class="Header">
    <h1>Link Sharing</h1>
</div>
<h2 style="text-align: center;color:rgba(117, 33, 46, 0.98);">Send Invitation to People</h2>
<g:form controller="sendInvitation" action="send">
    <table class="Document" style="margin-top:4%;width:70%">
        <tr>
            <td>Email *</td>
            <td><input type="email" name="email" class="Text"></td>
        </tr>
        <tr>
            <td>
                Topic *
            </td>
            <td colspan="2" align="right">
                <g:if test="${params.id}">
                    <g:textField name="topic" value="${Topic.get(Long.parseLong(params.id)).name}" class="Text" readonly="readonly"></g:textField>
                </g:if>
                <g:else>
                    <select class="Text" name="topic">
                        <g:each in="${Topic.findAllByCreatedByAndVisibility(User.get(session["id"]),Visibility.PRIVATE)}" var="topic">
                            <option>${topic.name}</option>
                        </g:each>
                    </select>
                </g:else>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <g:submitButton name="Send" class="Button">
                </g:submitButton>
                <input type="reset" value="Reset" class="Button">
            </td>
        </tr>
    </table>
</g:form>
</body>
</html>