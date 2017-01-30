<%@ page import="encje.Dane"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html 
	PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pl" lang="pl">
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-2" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>


        <div id="content">
            <%
			String tekst = "";
			Dane klient= (Dane) session.getAttribute("klient");
			if (klient != null) {
				tekst = "Jestes zalogowany jako: <b>" + klient.getUzytkownik().getImie()
						+ " " + klient.getUzytkownik().getNazwisko() + "</b>";
			} else {
				tekst = "Nie jestes zalogowany";
			}
		%>
		<p style="color: black; margin-bottom: 0px; text-align: center;">
		<h1>	<%=tekst%></h1>
		<a href="wylog.jsp" class="button">Wyloguj</a>
		</p>
        </div>
    </div>
</body>
</html>