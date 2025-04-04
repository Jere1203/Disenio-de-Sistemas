object nueva{
    method precio(unaPrenda) = unaPrenda.precio()
}

object promocion {
    var valorPromocion = 0

    method precio(unaPrenda) = unaPrenda.precio() - valorPromocion

    method valorPromocion(unValor) {
        valorPromocion = unValor
    }

    method valorPromocion() = valorPromocion
}

object liquidacion {
    method precio(unaPrenda) = unaPrenda.precio() * 0.5
}