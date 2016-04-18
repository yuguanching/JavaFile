package Clone ;

public class A implements Cloneable{
int num = 1;
B b = new B();
public Object clone(){
try{
return super.clone();
}catch(Exception e){
return null;
}
}
}

