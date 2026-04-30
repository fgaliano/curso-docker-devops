<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Mi Microservicio Java</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #eef2f7; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }
        .container { background: white; padding: 30px; border-radius: 15px; box-shadow: 0 10px 25px rgba(0,0,0,0.1); text-align: center; border-top: 5px solid #007bff; }
        h1 { color: #333; }
        .badge { background: #007bff; color: white; padding: 5px 15px; border-radius: 20px; font-weight: bold; }
    </style>
</head>
<body>
    <div class="container">
        <!-- Aquí es donde ocurre la magia -->
        <h1>${textoParaLaVista}</h1>
        <p>Estado del contenedor: <span class="badge">Activo</span></p>
    </div>
</body>
</html>