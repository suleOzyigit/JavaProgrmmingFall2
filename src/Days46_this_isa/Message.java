package Days46_this_isa;

public class Message {
private String body;
private String sender;
private String receiver;



@Override
public String toString() {
	return "Message [body=" + body + ", sender=" + sender + ", receiver=" + receiver + "]";
}
public Message(String body, String sender, String receiver) {
	
	this.body = body;
	this.sender = sender;
	this.receiver = receiver;
	
	
	
}
// overload the constructer
public Message(String body) {
//	this.body=body;
//	this.sender="unknow";
//	this.receiver="unknow";
	
	this(body,"unknown","unknown");
}
//overload the constructer
public Message(String body,String receiver) {
//	this.body=body;
//	this.sender="unknow";
//	this.receiver="recevier";
	this(body,"unknown",receiver);
}
public Message() {
//	this.body="";
//	this.sender="unknow";
//	this.receiver="unknow";
	this("","unknown","unknown");
}








public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
public String getSender() {
	return sender;
}
public void setSender(String sender) {
	this.sender = sender;
}
public String getReceiver() {
	return receiver;
}
public void setReceiver(String receiver) {
	this.receiver = receiver;
}


}
