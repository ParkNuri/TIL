<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8" />
<title>jQuery treeview</title>

<link rel="stylesheet" href="/erp/common/css/jquery.treeview.css" />
<link rel="stylesheet" href="/erp/common/css/screen.css" />

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>
<script src="/erp/common/js/jquery.cookie.js"></script>
<script src="/erp/common/js/jquery.treeview.js"></script>

<script type="text/javascript" src="/erp/common/js/demo.js"></script>

</head>
<body>


	<h4>조직도 plug-in사용하기</h4>
	<ul id="browser" class="filetree">
		<li><span class="folder">Folder 1</span>
			<ul>
				<li><span class="file">Item 1.1</span></li>
			</ul></li>
		<li><span class="folder">Folder 2</span>
			<ul>
				<li><span class="folder">Subfolder 2.1</span>
					<ul id="folder21">
						<li><span class="file">File 2.1.1</span></li>
						<li><span class="file">File 2.1.2</span></li>
					</ul></li>
				<li><span class="file">File 2.2</span></li>
			</ul></li>
		<li class="closed"><span class="folder">Folder 3 (closed
				at start)</span>
			<ul>
				<li><span class="file">File 3.1</span></li>
			</ul></li>
		<li><span class="file">File 4</span></li>
	</ul>




</body>
</html>