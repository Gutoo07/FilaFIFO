package controller;
import model.FilaFifo;

public class FilaFifoController {
	public FilaFifoController() {
		super();
	}
	public void teste() {
		FilaFifo lista = new FilaFifo();
		
		lista.enqueue(5);
		System.out.println(lista.last().getValor());
		
		lista.enqueue(10);
		System.out.println(lista.toString());
		
		//lista.dequeue();
		//System.out.println(lista.toString());
		
		System.out.println(lista.dequeue().getValor());
		
		System.out.println(lista.toString());

	}
}
