import src.estado.*
class Prenda {
    const property precio
    const property estado

    method precio() = precio

    method precioFinal() = estado.precio(self)
}

class Saco inherits Prenda {}

class Pantalon inherits Prenda {}

class Camisa inherits Prenda {}