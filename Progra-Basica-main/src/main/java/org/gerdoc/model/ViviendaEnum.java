package org.gerdoc.model;

public enum ViviendaEnum
{
    ESTADO(1),
    MUNICIPIO(2),
    COLONIA(3),
    SALIR(4),
    OPCION_ERRONEA( 5 );
    private Integer tipo;

    ViviendaEnum(Integer tipo)
    {
        this.tipo = tipo;
    }

    public Integer getTipo()
        {
            return tipo;
        }

        public static ViviendaEnum get( Integer id )
        {
            switch( id )
            {
                case 1:
                    return ESTADO;
                case 2:
                    return MUNICIPIO;
                case 3:
                    return COLONIA;
                case 4:
                    return SALIR;
                case 5:
                default:
                    return OPCION_ERRONEA;
            }
        }
}
