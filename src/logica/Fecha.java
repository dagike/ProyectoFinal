package logica;
public class Fecha{
	private int dia,mes,anio;
	public Fecha(){dia=1;mes=1;anio=2000;}
	public boolean setFecha(String fecha){
		int dia=0,mes=0,anio=0,numeroDeDiagonales,i,k=0;
		char temp;
		//Validadacion de que solo haya numeros y tenga 2 diagonales
		for(i=0,numeroDeDiagonales=0,k=0;i<fecha.length();i++){
			temp=fecha.charAt(i);
			if(temp<=47||temp>57){
				if(temp=='-'){numeroDeDiagonales++;}
				else
					k=1;
			}
		}
		if(fecha.length()<8||numeroDeDiagonales!=2||k==1){
			this.dia=1;this.mes=1;this.anio=2000;
			return false;
		}
		else{
			//Obtencion de numeros con ayuda de las diagonales
			for(i=0,numeroDeDiagonales=0;numeroDeDiagonales<2;i++){
				if(fecha.charAt(i)=='-'){
					numeroDeDiagonales++;
					if(numeroDeDiagonales==1){
						anio=Integer.parseInt(fecha.substring(0,i));
						k=i;
					}
					else if(numeroDeDiagonales==2){
						mes=Integer.parseInt(fecha.substring(k+1,i));
						dia=Integer.parseInt(fecha.substring(i+1));
					}
				}
			}
			if(validarFecha(dia,mes,anio)){
				this.dia=dia;
				this.mes=mes;
				this.anio=anio;
				return true;
			}
			else{
				this.dia=1;this.mes=1;this.anio=2000;
				return false;
			}
		}
	}
	public int getDia(){return dia;}
	public int getMes(){return mes;}
	public int getAnio(){return anio;}
	public void setDia(int dia){
		if(validarFecha(dia,mes,anio))this.dia=dia;
		else System.out.println("ERROR: LA FECHA NO ES CORRECTA");
	}
	public void setMes(int mes){
		if(validarFecha(dia,mes,anio))this.mes=mes;
		else System.out.println("ERROR: LA FECHA NO ES CORRECTA");
	}
	public void setAnio(int anio){
		if(validarFecha(dia,mes,anio))this.anio=anio;
		else System.out.println("ERROR: LA FECHA NO ES CORRECTA");
	}
	public String toString(){return anio+"-"+mes+"-"+dia;}
	private boolean validarFecha(int dia,int mes,int anio){
		if(dia<1 || dia>31)
			return false;
		else if(mes<1 || mes>12)	
			return false;
		else if(anio<1900 || anio>2014)	
			return false;
		else if(dia>28&&mes==2)
			return false;
		else if(mes<=7 && (mes%2)==0 && dia==31)//meses con 31 dias=1,3,5,7,8,10,12
			return false;
		else if(mes>=8 && (mes%2)!=0 && dia==31)
			return false;
		else
			return true;
	}
}
