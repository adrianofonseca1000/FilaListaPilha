
public class Pessoa {
private String name;
private int id;
Pessoa(String name, int id){
	this.id=id;
	this.name=name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String toString(){
	return " "+id+" "+name;
}

	

}
