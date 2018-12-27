package Days48_Inheritance02;

public class Bin {
private String contents;
private String type;

public void setType(String type) {
	this.type=type;
}






public Bin() {
//	contents="";
//	type="general";
	this("general");
	
	
}
public Bin( String type) {
	contents="";
	this.type=type;
}
public void add(String thing) {
	if(contents.length()==0) {
	 contents=thing+",";
	
}else {
	contents=contents+","+thing;
	}
}
public boolean remove(String thing) {
String temp=contents.toLowerCase();
thing=thing.toLowerCase().trim();
	if(temp.contains(thing)) {
		if(temp.startsWith(thing)) {
			temp=temp.replace(thing,"");
			temp=temp.isEmpty()?temp:temp.substring(1);
		}else {
			temp=temp.replace(","+thing,"");
		}
		contents=temp;
		return true;
	}else {
		return false;
	}
	
}
public void empty() {
	contents="";
}
public String toString() {
	
	
	 return "Bin ("+type+") contains ["+contents+"]";
}
}
