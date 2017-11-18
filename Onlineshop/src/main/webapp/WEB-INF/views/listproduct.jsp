<%-- 
    Document   : listproduct
    Created on : Nov 18, 2017, 1:36:45 PM
    Author     : Galaxy
--%>


<div class="container">
    <div class="row">
        
            <div class="row">
                <div class="col-lg-12">
                    <c:if test="${userClickAllProduct==true or userClickProduct==true}">
                        <ol class="breadcrumb">
                            <li><a href="${contextRoot}/home">Home</a></li>
                            <li class="active">All Products</li>
                        </ol>
                    </c:if>
                   <c:if test="${userClickCatogeryProduct==true}">
                        <ol class="breadcrumb">
                            <li><a href="${contextRoot}/home">Home</a></li>
                            <li class="active">/category</li>
                            <li class="active">/${catogery.name}</li>
                        </ol>
                    </c:if>
                </div>
        </div>
    </div>
</div>