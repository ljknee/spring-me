<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
	<title>Products</title>
</head>
<body>
    
    <section>
    	<div class="jumbotron">
	    	<div class="container">
	    		<h1>Products</h1>
	    		<p>All the available products in our store.</p>
	    	</div>
	    </div>
    </section>
    
    <section class="container">
    	<div class="row">
    		<div class="col-sm-6 col-m-3" style="padding-bottom: 15px">
    			<div class="img-thumbnail">
    				<div class="caption">
    					<h3>${product.name }</h3>
    					<p>${product.description }</p>
    					<p>${product.unitPrice } USD</p>
    					<p>Available ${product.unitsInStock} units in stock</p>
    				</div>
    			</div>
    		</div>
    	</div>
    </section>
    
</body>
</html>