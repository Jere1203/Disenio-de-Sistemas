@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Lugar{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long lugar_id;
  
  String nombre;
  Integer anioFundacion;
  
  @OneToMany
  @JoinColumn("lugar_id")
  List<Casa> poblacion; //Asumo que por poblacion se refiere a la cantidad de casas (familias) 
}

@Entity 
public class Castillo extends Lugar {
  Integer cantidadTorres;
  Integer cantidadMurallas;
}

@Entity
public class Ciudad extends Lugar {
  Integer cantidadDeComercios;
  Integer cantidadDeSantuarios;
  Double tasaDeMortalidad;
}

@Entity
public class Region {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long region_id;
  
  String nombre;
  
  @ManyToMany
  @JoinTable("lugar_x_region")
  List<Lugar> lugares;
  
  @ManyToOne
  Casa casaPrincipal;
}

@Entity
public class Casa {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long casa_id;
  
  String nombre;
  Integer anioFundacion;
  Integer patrimonio;
  
  @ManyToOne
  Lugar lugarDeOrigen;
  
  @ManyToOne
  Casa vasallaDe;
  
  @OneToMany
  @JoinColumn("casa_id")
  List<FuerzaMilitar> fuerzasMilitares;
}

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn("tipo_fuerza_militar")
public abstract class FuerzaMilitar {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long fuerzaMilitar_id;
}

@Entity
@DiscriminatorValue("Naval")
public class Naval extends FuerzaMilitar {
  Integer cantidadBarcos;
}

@Entity
@DiscriminatorValue("Terrestre")
public class Terrestre extends FuerzaMilitar {
  Integer cantidadSoldados;
}

@Entity
@DiscriminatorValue("Aerea")
public class Aerea extends FuerzaMilitar {
  Integer cantidadDragones;
}