import src.estado.*
class Prenda {
    const property precio
    const property estado
    const property tipoPrenda

    method precio() = precio

    method precioFinal() = estado.precio(self)
}

object saco {

}

object pantalon {

}

object camisa {}