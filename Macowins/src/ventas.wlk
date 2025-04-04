import src.estado.*
import src.prendas.*

class Venta {
    var property tipoVenta
    const property prendas
    
    method realizarVenta() = tipoVenta.venta(prendas) 
}
class Efectivo {
    method venta(prendas) = prendas.forEach { unaPrenda => unaPrenda.precio() }
}

class Credito inherits Efectivo {
    var property cantidadCuotas
    var property coeficienteCuotas

    override method venta(prendas) = super(prendas) + self.calculoCuotas(prendas)

    method calculoCuotas(prendas) = cantidadCuotas * coeficienteCuotas + self.sumatoriaPrendasCredito(prendas).sum()

    method sumatoriaPrendasCredito(prendas) = prendas.forEach { unaPrenda => unaPrenda.precio() * 0.01 }
}