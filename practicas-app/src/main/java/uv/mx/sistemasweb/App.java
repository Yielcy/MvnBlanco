package uv.mx.sistemasweb;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        staticFiles.location("/aprobado");
        get("/aprobado", (req, res) -> "Calificación: 9");
    }


}
