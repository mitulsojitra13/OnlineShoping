<%-- 
    Document   : page
    Created on : Nov 16, 2017, 5:08:17 PM
    Author     : Galaxy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>


<spring:url var="images" value="/resources/images"/> 
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Galaxy-Shoping -${title}</title>
    <script>
        Window.menu ='${title}';
        /* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
switch (menu)
{
    case 'Home':
        $(#Home).addClass('nav-item active');
        document.getElementById('Home.nav-link').innerHTML += 'Home <span class="sr-only">(current)</span>';
            break;
    case 'About US':
        $(#About US).addClass('nav-item active');
        document.getElementById('About US.nav-link').innerHTML += '<span class="sr-only">(current)</span>';
            break;
    case 'Services':
        $(#Services).addClass('nav-item active');
        document.getElementById('Services.nav-link').innerHTML += '<span class="sr-only">(current)</span>';
            break;
    case 'Contact US':
        $(#Contact US).addClass('nav-item active');
        document.getElementById('Contact US.nav-link').innerHTML += '<span class="sr-only">(current)</span>';
            break;
    case 'Product':
        $(#Product).addClass('nav-item active');
        document.getElementById('Product.nav-link').innerHTML += '<span class="sr-only">(current)</span>';
            break;
    case default:
         $(#Product).addClass('nav-item active');
         document.getElementById('Product.nav-link').innerHTML += '<span class="sr-only">(current)</span>';
         break;
            
               
}
    </script>
    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

  </head>

  <body>
  <div class="wrapper">
      <%@include  file="shared/navbar.jsp" %>
    <!-- Page Content -->
    <div class="container">
          <div class="row">
        <!--side Menu -->
       
            <%@include file="shared/sidemenu.jsp" %>
       
     
        <!--side Menu -->
        
        <!-- /.col-lg-3 -->
      <!-- /.col-lg-3 -->
     <div class="col-lg-9">
        <!-- Slider -->
        <%@include  file="shared/slider.jsp" %>
        <!-- incomming Pagis -->
        <div class="content">
        <c:if test="${userClickHome == true}">
            <%@include file="pages/home.jsp" %>
        </c:if>
         <c:if test="${userClickContact==true}">
             <%@include file="pages/Contact.jsp" %>
        </c:if>
         <c:if test="${userClickAbout==true}">
             <%@include file="pages/about.jsp" %>
        </c:if>
         <c:if test="${userClickServices==true}">
             <%@include file="pages/services.jsp" %>    
        </c:if>
        <c:if test="${userClickProduct==true}">
            <%@include file="listproduct.jsp" %>             
        </c:if>
        <c:if test="${userClickCatogeryProduct==true or userClickAllProduct==true}">
            <%@include file="listproduct.jsp" %>             
        </c:if>
        </div>
     
     </div>
        <!-- /.col-lg-9 -->
      <div class="col-lg-9">
              welcome
        </div>

     </div>
      <!-- /.row -->

    </div>
    <!-- /.container -->

    <!-- Footer -->
    <%@include file="shared/footer.jsp" %>
    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.min.js"></script>
    <script src="${js}/bootstrap.bundle.min.js"></script>
    <!--wrapper-->
  </div>
  </body>

</html>
