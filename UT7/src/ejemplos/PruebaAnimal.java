package ejemplos;

public class PruebaAnimal {

	public static void main(String[] args) {
		Animal mimascota = new Animal();
		
		mimascota.comer();
		
		Perro miperro = new Perro();
		
		miperro.comer();
		miperro.ladrar();
		
		Husky ca�ete = new Husky();
		ca�ete.ladrar();
		ca�ete.cerrarVentana();

	}

}
