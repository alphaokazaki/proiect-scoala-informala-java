[#ftl]

[#import "/spring.ftl" as spring /]
<head>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <link  href="[@spring.url '/css/bootstrap.min.css' /]" rel="stylesheet">
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="[@spring.url '/js/bootstrap.min.js' /] "></script>
	
	
	
</head>
[#escape x as x?html]





	<div class="container">



		<ol class="breadcrumb">

			<li class="active">Login</li>
		</ol>

		<div class="panel panel-default" style="margin-left:auto; margin-right:auto; width:400px">
		

			<div class="panel-body">
			
			  	        <ul>

				                <b style="color:red">NU AVETI DREPTURI SUFICENTE!</b>

				        </ul>

			    
			    

			</div>
		</div>
	</div>



[/#escape]