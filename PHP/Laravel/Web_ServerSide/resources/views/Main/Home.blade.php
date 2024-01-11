<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>
</head>
<body>
<h3>Hello World, estamos na views</h3>
<h5>Tem disponivel os seguintes links:</h5>

<ul>
    <li><a href="{{route('bemvindos')}}">Vai para Home</a></li>
    <li><a href="{{route('youtube')}}">Quero ver social media</a></li>
    <li><a href="{{route('users.add_user')}}">Área do Utilizador</a></li>
</ul>


</body>
</html>
