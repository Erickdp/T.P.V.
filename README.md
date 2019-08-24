# T.P.V.
Terminal Punto de Venta - Proyecto final de semestre.

-------- Proyecto concluido Open Source -----------
- Se aplicó todo lo referente a HCI, el cuál fue capacitado durante el transcurso del semestre 2019 - 2019
- Una apuesta por un código limpio y legible siguiedo estándares y buenas prácticas.
- Algunos formularios (Ventanas, Frames) cuentan con shortcut como por ejemplo:
 - ESC  -> Salir
 - Enter -> Agregar/Siguiente
 - C -> Calcular valor a devolver en caja (Si es pago en efectivo)
  Además cuenta con la característica de que para poder usarlos se debe posicionar el mouse dentro de los correspondientes campos. 
- Los ficheros binarios se generan automáticamente (En tiempo de ejecución aún si estos se borran, carpeta - DataBase.ddr), 
   con los mismos valores por defecto para no iniciar su uso desde 0.
   
 - protected abstract void tDefault();
   
- Comprende el trabajo sobre operaciones CRUD para todos los objetos (A excepción del Store card pues su navegabilidad la posee
  el objeto de tipo Client y 1..1)
- Se apoyó de librerias adicionales para un buen desarrollo de UI.
- Por razones irrebatibles no existe una opción para el registro de adminstrados (Esto no sucede con los clientes), los cuales ejercen 
  las ya mencionadas operaciones CRUD, por tanto para agregar administradores/gerentes/responsables del sistema se lo realiza desde 
  su propio aparatado.
  - Admin por default: 1. email -> erickdp@hotmail.com
                           2. pass  -> admin
  - Tener en cuenta que tanto el email como el pass pueden ser editados y/o cambiados si el administrador lo desea.
