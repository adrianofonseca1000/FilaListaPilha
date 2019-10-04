
public class Pilha {
private No topo;
public Pilha(){
	topo=null;
}
public void Insere(Object d){
	No novo=new No();
	novo.setproximo(topo);
	novo.setinfo(d);
	topo=novo;
}
public Object retira(){
	if(topo!=null){
		No aux=topo;
		topo=topo.getproximo();
		return aux.getinfo();
	}
	else{
		return null;
	}
}
public String Imprime(){
	String aux=" ";
	No n=topo;
	while(n!=null){
		aux+=n.getinfo()+"\n";
		n=n.getproximo();
	}
	return aux;
	
}

}
