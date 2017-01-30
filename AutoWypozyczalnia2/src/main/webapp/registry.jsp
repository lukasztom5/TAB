<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html 
	PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pl" lang="pl">
<head>
<title></title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-2" />
</head>
<script>
function validateForm() {
	var x=document.forms["form2"]["imie"].value;
	var x2=document.forms["form2"]["nazwisko"].value;
	var x3=document.forms["form2"]["login"].value;
	var x4=document.forms["form2"]["haslo"].value;
	
	if (x== null || x == "") {
  		alert("Podaj swoje imie");
  		return false;
  	} if (x2 == null || x2 == "") {
  		alert("Podaj swoje nazwisko");
  		return false;
  	} if (x3 == null || x3 == "") {
  		alert("Podaj swój login");
  		return false;
  	}if (x4 == null || x4 == "") {
  		alert("Podaj swoje hasło");
  		return false;
  	}
}
</script>
<body>
   

        <div id="templatemo_main">
			<h2>Formularz rejestracyjny</h2>
			<div class="col_w630">
				<div id="mystyle" class="myform">
					 <form id="form" name="form2" method="post" onsubmit="return validateForm()" action="kontroler1">
						 <h1>Panel Rejestracji</h1>
						 <p>Wprowadź dane</p>
						 
						 <label>Imie*
							 </label>
						 <input type="text" name="imie" id="imie" />
						 <label>Nazwisko*
						 </label>	 
						 <input type="text" name="nazwisko" id="nazwisko" />
						 <label>Login*
							</label> 
						 <input type="text" name="login" id="login" />
						 <label>Hasło *
							  </label>
						 <input type="text" name="haslo" id="haslo" />
                         <div class="spacer2"></div>
						 <label>* - pola wymagane</label>
						 <button type="submit">Zarejestruj</button><br>
						 Jezeli chcesz anulować, <a href="index.jsp">kliknij tutaj<br>
						 <div class="spacer"></div>
			
					 </form>
	 			</div>
			</div>
</div>
			</div>
			<div class="cleaner"></div>
		</div>
    </div>
</body>
</html>