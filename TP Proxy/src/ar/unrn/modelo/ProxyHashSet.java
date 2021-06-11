package ar.unrn.modelo;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

import ar.unrn.persistencia.PersonaDao;

public class ProxyHashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, java.io.Serializable {
	/**
	* 
	*/
	private Server server = new PersonaDao();
	private static final long serialVersionUID = 1L;
	private transient HashMap<E, Object> map;
	private int id_persona;

	public ProxyHashSet(int id) {
		super();
		this.id_persona = id;
		this.map = new HashMap<>();
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Creates a <em><a href="Spliterator.html#binding">late-binding</a></em> and
	 * <em>fail-fast</em> {@link Spliterator} over the elements in this set.
	 *
	 * <p>
	 * The {@code Spliterator} reports {@link Spliterator#SIZED} and
	 * {@link Spliterator#DISTINCT}. Overriding implementations should document the
	 * reporting of additional characteristic values.
	 *
	 * @return a {@code Spliterator} over the elements in this set
	 * @since 1.8
	 */

	@Override
	public <T> T[] toArray(T[] a) {
		return this.server.obtenerTelefono(id_persona).toArray(a);
	}

}
