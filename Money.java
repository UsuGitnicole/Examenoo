

	import java.util.Objects;

	/**
	 * <h2>Clase Money, Que guarda una cantidad y una moneda y opera con ella</h2>
	 * Busca información de javadoc en <a href="http://google.com">GOOGLE</a>
	 *
	 * @see <a href="http://www.google.com">Google</a>
	 * @author Naiara
	 * @version 1.0
	 * @since 01-01-2019
	 */

	public class Money {
		
		//Atributos
		/**
		 * variable double que guarda la cantidad de dinero
		 */
		double cantidad;
		/**
		 * variable String que guarda el nombre de la moneda
		 */
		String moneda;
		
		/**
		 * Constructor con 2 parametros
		 * @param cantidad Entero indicando el dinero
		 * @param moneda Nombre de la moneda
		 */
		public Money(double cantidad, String moneda) {

			this.cantidad = cantidad;
			this.moneda = moneda;
		}
		
		//Metodos publicos
		/**
		 * Devuelve la cantidad
		 * @return Cantidad
		 */
		
		public double getCantidad() {
			return cantidad;
		}
		
		/**
		 * Cambia el valor de cantidad
		 * @param cantidad Nueva cantidad
		 */
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		/**
		 * Devuelve la moneda
		 * @return Moneda
		 */
		public String getMoneda() {
			return moneda;
		}
		/**
		 * Cambia la moneda
		 * @param moneda Nueva moneda
		 */
		
		public void setMoneda(String moneda) {
			this.moneda = moneda;
		}
		/**
		 * Suma la cantidad de dos objetos
		 * @param objeto Objeto que se quiere sumar
		 * @return Nuevo objeto con la suma de las cantidades
		 */
		
		public Money add(Money objeto) {

			Money nuevo=new Money (this.getCantidad()+objeto.getCantidad(),this.getMoneda());
			return nuevo;
		}
		
		/**
		 * Comprueba si dos objetos son iguales
		 * @param obj Objeto que se quiere comparar
		 * @return <ul>
		 * 		    <li>true: Son iguales</li>
		 * 			<li>false: Son distintos</li>
		 * 		   </ul>
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Money other = (Money) obj;
			return Double.doubleToLongBits(cantidad) == Double.doubleToLongBits(other.cantidad)
					&& Objects.equals(moneda, other.moneda);
		}



	}

