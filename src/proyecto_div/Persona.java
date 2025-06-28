package proyecto_div;
import java.io.*;
import java.util.Random;
public class Persona {//ini
 private String nombre;
 private String apellido_paterno;
 private String apellido_materno;
 private int  edad;
 private String sexo;
 private int ci;
 public void  Registro_persona(
		 String nombre,
		 String paterno,
		 String materno,
		 int edad,
		 String sexo
		 
		 
		 ) 
 { // ini 
	 boolean verificando=Verificacion_de_nulavilidad(
			  nombre,
			  paterno,
			  materno,
			  edad,
			  sexo
			 );
	 if (verificando) {
		 this.nombre=nombre;
		 this.apellido_paterno=paterno;
		 this.apellido_materno=materno;
		 this.edad=edad;
		 this.sexo=sexo;
		 this.ci=GenerateCi();
	 }
 }// end
public int GenerateCi() 
{
	
	Random random=new Random();
	int ci =random.nextInt(1000000,1000000000);
	System.out.println("Se genero el siguiente numero para la persona :"
	+nombre+" "
	+apellido_paterno+" "
	+apellido_materno
			);
	return ci;
	
}
public boolean Verificacion_de_nulavilidad
(
		 String nombre,
		 String paterno,
		 String materno,
		 int edad,
		 String sexo
		)
		
{
	boolean valor=false;
	if (nombre!=null
		&&paterno!=null
		&&edad>1
		&&sexo!=null)
	{
		valor=true;
	}else {
		System.out.println("Aun no se ingreso los datos necesrios de la persona");
	}
	
	return valor;
}

public void Mostrar() {
	System.out.println("Ciudadano :");
	System.out.println(nombre);
	System.out.println(apellido_paterno);
	System.out.println(apellido_materno);
	System.out.println(edad);
	System.out.println(sexo);
	System.out.println(ci);
};

}// end


