[#ftl]
<!DOCTYPE html>
<html lang="en">
<head>
	<title>-=Stocuri=-</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Stoc Ingrediente</h2>
		<p></p>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nr.Crt</th>
					<th>Ingredienta</th>
					<th>Tip</th>
					<th>Stock Actual</th>
					<th>Stock Critic</th>
					<th></th>
				</tr>
			</thead>
			[#list stoc as stoc]
			<tbody>
				<tr>
					<td>${stoc.nrCrt}</td>
					<td>${stoc.ingredienta}</td>
					<td>${stoc.gamaIngedienta}</td>
					<td>${stoc.stocCurent}</td>
					<td>${stoc.stocCritic}</td>
					[#if stoc.stocCurent < stoc.stocCritic ]
						<td><span class="glyphicon glyphicon-alert"></span></td>
					[#else]
						<td></td>
					[/#if]
				</tr>
			</tbody>
			[/#list]
		</table>
	</div>
</body>
</html>