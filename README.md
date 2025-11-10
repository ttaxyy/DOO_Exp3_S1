PROTOTIPO DE SISTEMA ESTRUCTURAL DE SALMONTT

El proyecto busca crear la base de una posible estructura para registrar las personas relacionadas a la empresa y sus atributos, y la posibilidad de agregarlas como empleados.

Se incluyen dos paquetes:
    -app: Incluye la clase Main. Declara objetos y los muestra en la consola.
    -model: Incluye las clases Persona (clase base), Direccion (clase que representa el atributo dirección de Persona) y Empleado (clase que extiende la clase Persona).
        La clase Persona incluye los siguientes atributos:
            -ID
            -Nombre
            -Correo
            -Teléfono
            -Dirección
        
        La clase Direccion incluye los siguientes atributos:
            -Número
            -Calle
            -Comuna
            -Región

        La clase Emplado, aparte de incluir los atributos de Persona, incluye:
            -Rol

Para ejecutar en la terminal:
    Navegar a la ruta:
        .../out/production/DOO_Exp3_S1_Javiera_Puga
    Luego ejecutar:
        java app.Main