<%-- 
    Document   : sidemenu
    Created on : Nov 17, 2017, 10:45:31 AM
    Author     : Galaxy
--%>


<div class="col-lg-3">

<h1 class="my-4">Srinathji</h1>
 <div class="list-group">
     <c:forEach items="${catogerys}" var="catogery">
         <a href="#" class="list-group-item">${catogery.name}</a>
     </c:forEach>
 </div>
 </div>