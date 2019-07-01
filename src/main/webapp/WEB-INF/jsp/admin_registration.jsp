<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script src="../js/states.js"></script>
<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script> -->
<script type="text/javascript">


$("documents").ready(function(){
	
	
	/* $.get("../CountryServlet",function(data){
		
		var a="<option>--Select Country--</option>";
		$.each(data,function(k,v){
			//alert(data);
			a+=("<option value='"+v.cId+"'>"+v.cName+"</option>");
		});
		$("#c").append(a);
	});
	 */
	 
	 
	 $.get("./getCountry",function(data){
		 alert("function called"+" "+data);
		 var a="<option>---Select Coutnry</option>";
		 $.each(JSON.Parse(data),function(k,v){
			 alert(data)
			 a+="<option value='"+v.cId+"'>"+v.cName+"</option>";
			 
		 });
		 $("#c").append(a);
		 
	 });
	
	$("#c").change(function(){
		
		var e =$("#c").val();
		/* alert(e); */
		$.get("../StateServlet",{str : $("#c").val() },function(data){
			/* alert("hello");
			alert($("#c").val());
			alert(data); */
			//($("#c").val());
			var a="<option>--Select Sates--</option>";
			$.each(data,function(k,v){
				
				a+=("<option value='"+v.sId+"'>"+v.sName+"</option>");
			});
			$("#st").append(a);
		});
	});
	
	
	$("#st").change(function(){
		
		var e =$("#st").val();
		/* alert(e); */
		$.get("../CityServlet",{str : $("#st").val() },function(data){
		/* 	alert("hello");
			alert($("#st").val());
			alert(data); */
			//($("#c").val());
			var a="<option>--Select Citys--</option>";
			$.each(data,function(k,v){
				
				a+=("<option value='"+v.cId+"' >"+v.cName+"</option>");
			});
			$("#cty").append(a);
		});
	});
	
	
	
	
});



</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body background="../images/nature.jpg" >

<center>
<h1>Admin Sign Up</h1>
<form action="/AdminRegistration" method="post" >
<table bgcolor="yellow" border="50"> 

<tr>
<td>UserName<span style="color:red"></span><span style="color:red">*</span></td>
<td><input type="text" name="name"  /></td>
</tr>

<tr>
<td>Email<span style="color:red">*</span></td>
<td><input type="text" name="email"  /></td>
</tr>

<tr>
<td>Password<span style="color:red">*</span></td>
<td><input type="password" name="password"  /></td>
</tr>



<tr>
<td>MobileNo<span style="color:red">*</span></td>
<td><input type="number" name="mobileNo"  /></td>
</tr>

<tr>
<td>Country<span style="color:red">*</span></td>
<td><select id=c name="country">

</select></td>
</tr>

<tr>
<td>State<span style="color:red">*</span></td>
<td><select id=st name="state">

</select></td>
</tr>

<tr>
<td>City<span style="color:red">*</span></td>
<td><select id=cty name="city">

</select></td>
</tr>
<tr>
<td>Gender<span style="color:red">*</span></td>

<td><INPUT TYPE="Radio" Name="Gender" Value="Male">Male
<INPUT TYPE="Radio" Name="Gender" Value="Female">Female
</td>

</tr>
<tr>
<td>PinCode<span style="color:red">*</span></td>
<td><input type="number" name="pin"  /></td>
</tr>

<tr>
<td>Adderess<span style="color:red">*</span></td>
<td><textarea name="address" rows="05"></textarea>
  </td>
</tr>
<tr>
<td><input type="submit" value="Submit" /></td>
<td><input type="reset" value="Clear" /></td>
</table>
</form>
</center>
</body>
</html>