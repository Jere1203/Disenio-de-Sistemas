import src.estado.*
class Prenda {
    const property precio
    const property estado
    var tipoPrenda

    method precio() = precio

    method precioFinal() = estado.precio(self)

    method tipoPrenda(unTipo) {
        if (self.noEsTipoPermitido(unTipo)) {
            throw new DomainException ( message = "No es un tipo de prenda permitido" )
        } else {
            tipoPrenda = unTipo
        }
    }
    method noEsTipoPermitido(unTipo) = unTipo != Saco or unTipo != Pantalon or unTipo != Camisa

    method tipoPrenda() = tipoPrenda
}

class Saco {}

class Pantalon {}

class Camisa {}