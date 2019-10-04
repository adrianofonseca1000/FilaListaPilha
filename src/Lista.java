
public class Lista {
	private No p;
	private int tamanho;
	public Lista(){
		p=null;
		tamanho=0;
	}
	public void Insere(Object d,int pos){
		if(pos>=0 && pos<=tamanho){
			No novo=new No();
				novo.setinfo(d);
				if (pos==0){
			novo.setproximo(p);
			p=novo;
				}else{
					No aux =p;
					for(int i=0;i<pos-1;i++)
					{
						aux=aux.getproximo();
						
					}
					novo.setproximo(aux.getproximo());
					aux.setproximo(novo);
					
				}
			tamanho++;	
		}
		
	}
	
	public String listar(){
		String s=" ";
		No aux=p;
		for(int i=0;i<tamanho;i++){
			s+=aux.getinfo()+"\n";
			aux=aux.getproximo();
		}
		return s;
	}
	public void Remover(int pos){
		if(pos>=0 && pos<tamanho){
			if(pos==0){
				p=p.getproximo();
			}
			else{
				No aux=p;
				for(int i=0;i<pos-1;i++)
					aux=aux.getproximo();
				
				if(pos==tamanho-1){
					aux.setproximo(null);
				}else{
					aux.setproximo(aux.getproximo().getproximo());
				}
				tamanho--;
				
				
			}
		}
	}
}
