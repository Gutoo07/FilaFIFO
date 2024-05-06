package model;

public class No<T> {
	private No<T> proximo;
	private T valor;
	
	public No (T valor) {
		this.valor = valor;
		this.proximo = null;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	public T getValor() {
		return this.valor;
	}
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	public No<T> getProximo() {
		return this.proximo;
	}
	@Override
	public String toString() {
		return this.valor.toString();
	}
}