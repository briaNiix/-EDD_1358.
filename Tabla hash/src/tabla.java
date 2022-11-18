
public class tabla {
	public static void main(String[] args) {
        Tablahash prueba=new Tablahash(13);
        prueba.add(12, 756);
        prueba.add(26, 128);
        prueba.add(10, 948);
        System.out.println(prueba);
        //System.out.println("------------");
        prueba.remove(26);
        prueba.remove(10);
        prueba.remove(12);
        System.out.println(prueba);
       
    }
}
