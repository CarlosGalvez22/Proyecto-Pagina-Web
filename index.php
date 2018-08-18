<?php  session_start(); ?>
<?php
//login.php

include("database_connection.php");

if(isset($_SESSION['sesion']))   // Checking whether the session is already there or not if
    // true then header redirect it to the home page directly
{
    header("Location: proyecto/home.php");
}

$message = '';

if(isset($_POST["login"]))
{
    if(empty($_POST["usuario"]) || empty($_POST["contraseña"]))
    {
        $message = "<div class='alert alert-danger'>Espacios Requeridos</div>";
    }
    else
    {
        $query = "SELECT * FROM test.tb_usuarios
        Inner Join
        test.tb_roles
        on
        test.tb_roles.ID_ROL = test.tb_usuarios.ID_ROL
        Inner Join
        test.tb_unidad_trabajo
        on
        test.tb_unidad_trabajo.ID_UNIDAD_TRABAJO = test.tb_usuarios.ID_UNIDAD
        where
        EMAIL =:EMAIL";
        $statement = $connect->prepare($query);
        $statement->execute(array('EMAIL' => $_POST["usuario"]));
        $count = $statement->rowCount();
        if($count > 0)
        {
            $result = $statement->fetchAll();
            foreach($result as $row)
            {
                if(password_verify($_POST["contraseña"], $row["CLAVE"]))
                {
                    $_SESSION['sesion']= $row['EMAIL'];


                    header("Location: proyecto/home.php");
                }
                else
                {
                    $message = '<div class="alert alert-danger">Contraseña Incorrecta</div>';
                }
            }
        }
        else
        {
            $message = "<div class='alert alert-danger'>Correo electronico Incorrecto</div>";
        }
    }
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Basic Login Form A Flat Responsive Widget Template  :: w3layouts</title>
<link href="css/font-awesome.css" rel="stylesheet"><!-- Font-awesome-CSS --> 
<link href="css/style.css" rel='stylesheet' type='text/css'/><!-- style.css --> 
<link href="//fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Basic Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<script src="js/jquery.min.js"></script>
		<script>$(document).ready(function(c) {
		$('.alert-close').on('click', function(c){
			$('.main-agile').fadeOut('slow', function(c){
				$('.main-agile').remove();
			});
		});	  
	});
	</script>
</head>
<body>
	<h1>BIENVENIDOS</h1>
	<div class="main-agile">
		<div class="alert-close"> </div>
		<div class="content-wthree">
		<div class="circle-w3layouts"></div>
			<h2>Iniciar Sesión</h2>
			  <span><?php echo $message; ?></span>
			<form  method="post">
								<div class="inputs-w3ls">
									<i class="fa fa-user" aria-hidden="true"></i>
									<input type="text" name="usuario" id="usuario" placeholder="Usuario" required/>
								</div>
								<div class="inputs-w3ls">
									<i class="fa fa-key" aria-hidden="true"></i>
									<input type="password" name="contraseña" id="contraseña" placeholder="Contraseña" required/>
								</div>
									<input type="submit" name="login" id="login" value="login">
									<div class="wthree-text"> 
										<ul> 
											<li> <a href="#">Olvido su Contraseña?</a> </li>
										</ul>
									</div>  
								</form>
		</div>
	</div>
	<div class="footer-w3l">
		<p class="agileinfo"> &copy; 2017 Basic Login Form. All Rights Reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
	</div>
</body>
</html>