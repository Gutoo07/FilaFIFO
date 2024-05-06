package model;
import java.lang.Exception;

public class FilaFifo<T> {
	private No<T> inicio = null;
	
	//enqueue : adiciona novo elemento no final
	//dequeue : remove um elemento do início
	//last :  retorna u último elemento, visto que adicionamos apenas no final
	
	public void enqueue (T valor) {
		No<T> novo = new No<>(valor);
		if (this.inicio == null) {
			this.inicio = novo;
		} else {
			this.last().setProximo(novo);
		}
	}
	public No<T> last() throws IllegalArgumentException {
		if (this.inicio == null) {
			throw new IllegalArgumentException("Lista vazia.");
		} else {
			No<T> buffer = this.inicio;
			while (buffer.getProximo() != null) {
				buffer = buffer.getProximo();
			}
			return buffer;
		}
	}
	public No<T> dequeue() throws IllegalArgumentException {
		if (this.inicio == null) {
			throw new IllegalArgumentException("Lista vazia.");
		} else {
			No<T> buffer_inicio = this.inicio;
			
			//No<T> buffer_proximo = this.inicio.getProximo();
			//this.inicio.setProximo(null);
			//this.inicio.setValor(null);
			//this.inicio = buffer_proximo;
			// zerar os valores de this.inicio
			// e retornar o buffer_inicio, por algum motivo, não funciona; retorna null
			
			this.inicio = this.inicio.getProximo();
			return buffer_inicio;
		}
	}
	@Override
	public String toString() throws IllegalArgumentException {
		if (this.inicio == null) {
			throw new IllegalArgumentException("Lista vazia.");
		} else {
			StringBuilder builder = new StringBuilder("[");
			No<T> buffer = this.inicio;
			builder.append(buffer.getValor());
			while (buffer.getProximo() != null) {
				builder.append(",");
				buffer = buffer.getProximo();
				builder.append(buffer.getValor());
			}
			builder.append("]");
			return builder.toString();
		}
	}
}