package hilos.test;
import hilos.clase.*;
import hilos.vista.ProcesoAuto;

public class test {
    public static void main(String[] args){
                new Thread(new ProcesoAuto()).start();

                //christian márquez
//        Persona p= new Persona();
//        p.setNombre("Juan");
//        p.setFechaNacimiento("12/05/1999");
//        p.setDireccion("Calle 123");
//
//        System.out.println("Nombre: "+p.getNombre()+"\nFecha de nacimiento: "+p.getFechaNacimiento()+"\nDireccion: "+p.getDireccion()+"\n");
//        ProcesoA a =new ProcesoA("Richard");
//        ProcesoB b =new ProcesoB(1000);
//        ProcesoC c =new ProcesoC(0);
//        Runnable x=new ProcesoD(50);
//        Thread d =new Thread(x);
//
//        Runnable z=new ProcesoE("hola como esta?");
//        Thread e =new Thread(z);
//
//        a.start();
//        b.start();
//        c.start();
//        d.start();
//        z.run();
    }
}
