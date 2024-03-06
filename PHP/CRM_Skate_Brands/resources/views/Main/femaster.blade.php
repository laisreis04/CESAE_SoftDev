<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous">
    </script>
    <title>Master</title>
</head>

<body>

    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Skate Brands</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="">About Skateboard</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="">Skateboard Brands</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="">Skaters</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="">BackOffice</a>
                    </li>
                    {{-- Login --}}
                    @if (Route::has('login'))
                        <div class="sm:fixed sm:top-0 sm:right-0 p-6 text-right z-10">
                            @auth

                                {{-- <a href="{{ url('/home') }}" --}}
                                    class="font-semibold text-gray-600 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white focus:outline focus:outline-2 focus:rounded-sm focus:outline-red-500">Home</a>

                                    {{-- <form action="{{ route('logout') }}" method="POST"> --}}
                                               @csrf <!-- Nunca esquecer de por isso no form -->
                                               <button type="submit" class="btn btn-warning">Logout</button>
                                             </form>
                            {{-- @else
                                {{-- <a href="{{ route('login') }}" --}}
                                    class="font-semibold text-gray-600 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white focus:outline focus:outline-2 focus:rounded-sm focus:outline-red-500">Log
                                    in</a>

                                {{-- @if (Route::has('users.add'))
                                    <a href="{{ route('users.add') }}"
                                        class="ml-4 font-semibold text-gray-600 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white focus:outline focus:outline-2 focus:rounded-sm focus:outline-red-500">Register</a>
                                @endif --}}
                            @endauth
                        </div>
                    @endif
                </ul>
            </div>
        </div>
    </nav>

    @yield('content')
    @yield('content2')

    <footer class="fixed-bottom">
        <div class="card">
            <div class="card-body">
              <h5 class="card-title">Female Skateboard Brands</h5>
              <p class="card-text">Woman supporting woman skatebording since 2002</p>
              <p class="card-text"><small class="text-body-secondary">Laís Reis</small></p>
            </div>
          </div>

    </footer>

</body>

</html>
