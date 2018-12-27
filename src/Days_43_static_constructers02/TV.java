package Days_43_static_constructers02;

public class TV {
private int channel=1;
private int volumeLevel=1;
private boolean on=false;
private String brand="undefined";
/*Tv myTV=new TV();
 * Tv your Tv=new TV("LG");
 * 
 * 
 */
public TV() {
	System.out.println("Creting Tv objec with using no args- constucter");
//	channel=1;
//	volumeLevel=1;
	
}
public TV(String brand) {
	System.out.println("creating TV object using 1 arg -constructer");
	this.brand=brand;
}
public int getChannel() {
	return channel;
}
public void setChannel(int channel) {
	
	if(on&&channel>0&&channel<121) {
		this.channel = channel;
	}else {
		System.out.println("Error: tv is either off or invalid channel");
	}
	
}
public int getVolumeLevel() {
	return volumeLevel;
	
	
	
}
public void setVolumeLevel(int volumeLevel) {
if(on==true&&volumeLevel>0&&volumeLevel<8) {
		this.volumeLevel = volumeLevel;
	}else {
		System.out.println("Error: tv is either off or invalid level");
	}
		
	
}
public boolean isOn() {
	return on;
}
public void turnOn() {
	if(isOn()) {
		System.out.println("Tv is already On");
	}else {
		on=true;
		//this.on=true;
	}
	
}
public void turnOff() {
	if(isOn()) {
		on=false;
	}else {
		System.out.println("tv is already on");
	}
}
public void channelUp() {
	if(isOn()&&channel<120) {//if(on==true) methodu cagirdik
		//
		channel++;
	}
}
public void ChannelDown() {
	if(isOn()&&channel>1) {
		channel--;
	}
}
public void volumeUp(){
	if(isOn()&& volumeLevel<7) {
		volumeLevel++;
	}
}
public void volumeDown(){
	if(isOn()&& volumeLevel>1) {
		volumeLevel--;
	}
}



public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
}
