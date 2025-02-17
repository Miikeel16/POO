class Genero:
    def __init__(self, nombre, edad_minima_recomendada):
        self.nombre = nombre
        self.edad_minima_recomendada = edad_minima_recomendada


class Autora:
    def __init__(self, nombre, apellidos):
        self.nombre = nombre
        self.apellidos = apellidos


class Libro:
    def __init__(self, titulo, anio_publicacion, numero_paginas, genero, sinopsis, autora):
        self.titulo = titulo
        self.anio_publicacion = anio_publicacion
        self.numero_paginas = numero_paginas
        self.genero = genero
        self.sinopsis = sinopsis
        self.autora = autora


class Cliente:
    def __init__(self, nombre, apellidos, dni, email, fecha_nacimiento, ultimo_libro_comprado):
        self.nombre = nombre
        self.apellidos = apellidos
        self.dni = dni
        self.email = email
        self.fecha_nacimiento = fecha_nacimiento
        self.ultimo_libro_comprado = ultimo_libro_comprado