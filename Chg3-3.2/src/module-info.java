package bai3_2;
import java.util.Scanner;
public class Diem {
protected	int x,y;

public nhapDiem() 
{return x=y=0;}
public nhapDiem(int x,int y)
{	this.x=x;
	this.y=y;
Scanner sc= new Scanner(System.in);
System.out.println("Nhap vao toa do cua diem");
x=sc.nextInt();
y=sc.nextInt();
}
}
public class TamGiac extends Diem{
	protected int a,b,c,d,e,f;
	Diem A= new Diem(a,b);
	Diem B= new Diem(c,d);
	Diem C= new Diem(e,f);
	public nhapToado3đinh(){
		return A,B,C;
	}
	public nhapToado3dinh(Diem A,Diem B,Diem C)
	{ 	this.A=A;this.B=B;this.C=C;
		Systen.out.println("Nhap toa do dinh thu 1");
		A.nhapDiem();
		
		Systen.out.println("Nhap toa do dinh thu 2");
		B.nhapDiem();
		
		Systen.out.println("Nhap toa do dinh thu 3");
		C.nhapDiem();
	}
	
	

