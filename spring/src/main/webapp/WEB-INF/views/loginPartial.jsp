
<%--
  Created by IntelliJ IDEA.
  User: denik
  Date: 01.02.2015
  Time: 6:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@if (Request.IsAuthenticated)--%>
<%--{--%>
<%--using (Html.BeginForm("LogOff", "Account", FormMethod.Post, new { id = "logoutForm", @class = "navbar-right" }))--%>
<%--{--%>
<%--@Html.AntiForgeryToken()--%>

<ul class="nav navbar-nav navbar-right">
  <li>
    <%--@{--%>
    <%--ApplicationDbContext _t = new ApplicationDbContext();--%>
    <%--var user = _t.Users.Find(User.Identity.GetUserId()) ?? new ApplicationUser(){Name = "noname"};--%>
    <%--if (user.Name.IsEmpty())--%>
    <%--{--%>

    <%--user.Name = "noname";--%>
    <%--}--%>
    <%--}--%>
    <%--@Html.ActionLink(Resource.hello+" " + user.Name + "!", "Index", "Manage", routeValues: null, htmlAttributes: new {title = "Manage"})--%>
  </li>
  <li><a href="javascript:document.getElementById('logoutForm').submit()">Login :</a></li>
</ul>
<%--}--%>
<%--}--%>
<%--else--%>
<%--{--%>
<ul class="nav navbar-nav navbar-right">
  <%--<li>@Html.ActionLink(Resource.RegisterRegister, "Register", "Account", routeValues: null, htmlAttributes: new { id = "registerLink" })</li>--%>
  <%--<li>@Html.ActionLink(Resource.LoginBtnLogin, "Login", "Account", routeValues: null, htmlAttributes: new {id = "loginLink"})</li>--%>

</ul>

<%--}--%>
