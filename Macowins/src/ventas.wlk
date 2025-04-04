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

object credito inherits Efectivo {
    var property cantidadCuotas = 0
    var property coeficienteCuotas = 0

    override method venta(prendas) = super(prendas) + self.calculoCuotas(prendas)

    method calculoCuotas(prendas) = cantidadCuotas * coeficienteCuotas + self.sumatoriaPrendasCredito(prendas).sum()

    method sumatoriaPrendasCredito(prendas) = prendas.forEach { unaPrenda => unaPrenda.precio() * 0.01 }
}