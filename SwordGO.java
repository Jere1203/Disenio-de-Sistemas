@Entity
public class Personaje{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long personaje_id;
	
	String nombre;
	Integer monedas;
	
	@Enumerated
	TipoPersonaje tipoPersonaje;
	
	@Embedded
	Coordenadas coordenadas;
	
	@ManyToMany
	JoinTable("jugador_x_ubicacion")
	Collection<Ubicacion> ubicacionesVisitadas;
	
	@OneToMany
	@JoinColumn("jugador_id")
	Collection<Item> inventario;
	
	@OneToMany
	@JoinColumn("jugador_id")
	Collection<Accesorio> accesoriosEnUso;

	@OneToMany
	@JoinColumn("jugador_id")
	Collection<Arma> armasEnUso;	
}

public enum TipoPersonaje {
	Hechicero{
		@Override
		comerciar(item,otro){}
		
		@Override
		pelear(otro){}
		
		@Override 
		buscarItem(ubicacion){}
	},Guerrero{
		@Override
		comerciar(item,otro){}
		
		@Override
		pelear(otro){}
		
		@Override 
		buscarItem(ubicacion){}
	},Comerciante{
		@Override
		comerciar(item,otro){}
		
		@Override
		pelear(otro){}
		
		@Override 
		buscarItem(ubicacion){}
	}
	
}

@Embeddable
public class Coordenadas {
	Integer x;
	Integer y;
	Integer nivel;
}

@Entity
public class Ubicacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long ubicacion_id
	
	String nombre;
	
	@Embedded
	Coordenadas coordenadas;
}

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long item_id;
}

@Entity
public class BolsaDeMonedas extends Item {
	Integer monedas;
}

@Entity
public class Regalo extends Item {
	String fraseMotivacional;
}

@Entity
public class Accesorio extends Item {
	Integer costo;
	String nombre;
}

@Entity
public class Arma extends Item {
	Integer costo;
	Integer defensa;
	Integer ataque;
	String nombre;
}