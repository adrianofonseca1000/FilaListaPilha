public class Fila {
private No inicio;
private No fim;
public Fila(){
	inicio=null;
	fim=null;
}
public void Insere(Object d){
	No novo= new No();
	novo.setinfo(d);
	novo.setproximo(null);
	if(inicio==null){
		inicio=novo;
		fim=novo;
	}
	else{
		fim.setproximo(novo);
		fim=novo;
	}
}
public Object retira(){
	if(fim!=null){
		No aux=inicio;
	inicio=inicio.getproximo();
	return aux.getinfo();
}
else{
	return null;
}
}
public String Imprime(){
	String aux=" ";
	No n=inicio;
	while(n!=null){
		aux+=n.getinfo()+"\n";
		n=n.getproximo();
	}
	return aux;
	
}
}

