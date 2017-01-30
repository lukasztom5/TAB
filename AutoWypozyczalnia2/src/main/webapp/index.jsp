<%@ page import="encje.Dane"%>
<%@ page import="kontroler.kontroler2"%>
<%@ page contentType="text/html;charset=UTF-8"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
<script>
function validateForm() {
	var x=document.forms["form"]["login"].value;
	var x2=document.forms["form"]["haslo"].value;
		var x3=document.forms["form"]["ID"].value;
		if (x3 == null || x3 == "") {
	  		alert("Podaj numer identyfikcyjny");
	  		return false;
		}
		if (x == null || x == "") {
	  		alert("Podaj login");
	  		return false;
	  	} if (x2 == null || x2 == "") {
	  		alert("Podaj Haslo");
	  		return false;
	  	}
	}
</script>
<div id="templatemo_middle">
        <div id="mystyle" class="myform">
		        <form id="form" name="form" method="post" onsubmit="return validateForm()" action="kontroler2">
           <h1>Logowanie</h1>
           <label>Identyfikator:<input type="text" name="ID" id="ID"/></label>
           <label>Login:<input type="text" name="login" id="login"/></label>
          <label>Haslo:<input type="password" name="haslo" id="haslo"/></label>
            <button type="submit">Zaloguj</button><br>
            Jezeli nie masz konta, <a href="registry.jsp">zarejestruj sie</a>
            
           </form>
           </div>
        </div>
        </body>
</html>