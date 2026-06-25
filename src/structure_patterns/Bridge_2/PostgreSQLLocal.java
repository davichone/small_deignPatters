package structure_patterns.Bridge_2;

public class PostgreSQLLocal implements AlmacenamientoDB {

    @Override
    public void gauardarDATA(int tamaño) {
        System.out.println("Guardando LOCALMENTE EN POSTGRE_SQL :" + tamaño);
    }

}
