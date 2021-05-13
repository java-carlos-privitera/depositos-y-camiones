package app;

public class Sistema {
    public Sistema() {
        super();
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        Float cantidad = 14f; //new Float(34f);
        
        Float nGrupos = 4f;
        
        float grupos = cantidad / nGrupos; //3,5     0,5
        
        grupos = (float) Math.floor(grupos);

        Float sobran = cantidad % nGrupos;
        
        System.out.println("De la cantidad " + cantidad + " se puede armar " + grupos + 
                             " grupos de " + nGrupos + " y sobran " + sobran);
        
    }
}
