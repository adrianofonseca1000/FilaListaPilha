
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------Pilha--------------");
		Pilha p=new Pilha();
		Pessoa p1=new Pessoa("Ivan",1);
		p.Insere(p1);
		System.out.println(p.Imprime());
		Pessoa p2=new Pessoa("Leandro",2);
		p.Insere(p2);
		System.out.println(p.Imprime());
		Pessoa p3=new Pessoa("Sergio",3);
		p.Insere(p3);
		System.out.println(p.Imprime());
		Pessoa p4=new Pessoa("Mateus",4);
		p.Insere(p4);
		System.out.println(p.Imprime());
		Pessoa p5=new Pessoa("João",5);
		p.Insere(p5);
		System.out.println(p.Imprime());
		Pessoa p6=new Pessoa("Mariano",6);
		p.Insere(p6);
		System.out.println("\n"+p.Imprime());
		p.retira();
		System.out.println("\n"+p.Imprime());
		p.retira();
		System.out.println("\n"+p.Imprime());
		p.retira();
		System.out.println("\n"+p.Imprime());
		p.retira();
		System.out.println("\n"+p.Imprime());
		p.retira();
		System.out.println("\n"+p.Imprime());
		//Fila//
		System.out.println("----------------Fila--------------");
		Fila f=new Fila();
		Pessoa f1=new Pessoa("Ivan",1);
		Pessoa f2=new Pessoa("Leandro",2);
		f.Insere(f1);
		f.Insere(f2);
		Pessoa f3=new Pessoa("Sergio",3);
		f.Insere(f3);
		Pessoa f4=new Pessoa("Mateus",4);
		f.Insere(f4);
		Pessoa f5=new Pessoa("João",5);
		f.Insere(f5);
		Pessoa f6=new Pessoa("Mariano",6);
		f.Insere(f6);
		System.out.println("\n \n"+f.Imprime());
		f.retira();
		System.out.println("\n \n"+f.Imprime());
		f.retira();
		System.out.println("\n \n"+f.Imprime());
		f.retira();
		System.out.println("\n \n"+f.Imprime());
		f.retira();
		System.out.println("\n \n"+f.Imprime());
		f.retira();
		System.out.println(f.Imprime());
		//Lista//
		System.out.println("----------------Lista--------------");
		Pessoa l1=new Pessoa("Ivan",1);
		Lista l=new Lista();
		l.Insere(l1,0);
		System.out.println(l.listar());
		Pessoa l2=new Pessoa("Rodrigo",2);
		l.Insere(l2,1);
		System.out.println(l.listar());
		Pessoa l3=new Pessoa("Andreza",3);
		l.Insere(l3,2);
		System.out.println(l.listar());
		Pessoa l4=new Pessoa("Leandro",4);
		l.Insere(l4,3);
		System.out.println(l.listar());
		Pessoa l5=new Pessoa("Rosana",5);
		l.Insere(l5,4);
		System.out.println(l.listar());
		Pessoa l6=new Pessoa("Mariano",6);
		l.Insere(l6,5);
		System.out.println(l.listar());
		Pessoa l7=new Pessoa("Ronaldo",7);
		l.Insere(l7,6);
		System.out.println(l.listar());
		Pessoa l8=new Pessoa("Rivaldo",7);
		l.Insere(l8,7);
		System.out.println("\n \n"+l.listar());
		l.Remover(1);
		System.out.println("\n \n"+l.listar());
		l.Remover(3);
		System.out.println("\n \n"+l.listar());
		l.Remover(7);
		System.out.println("\n \n"+l.listar());
		l.Remover(2);
		System.out.println("\n \n"+l.listar());
		l.Remover(4);
		System.out.println("\n \n"+l.listar());
	}

}
