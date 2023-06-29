var objeto = [];
var numero = [0];
var objetoTabla = [];

function generarTabla() {
    objeto = [];
    numero = [0];
    objetoTabla = [];

    document.getElementById("tabla-principal").innerHTML = "";

    crear();

    var tabla = document.getElementById("tabla-principal");
    var crearTabla = document.createElement("table");
    var estructuraTabla = document.createElement("tbody");

    for (let i = 0; i < 6; i++) {
        aleatorios(objetoTabla, 10);
    }

    for (let i = 0; i < 6; i++) {
        var fila = document.createElement("tr");
        var columna = document.createElement("td");

        var stringObjeto = JSON.stringify(objeto[i]);

        var columnaTexto = document.createTextNode(stringObjeto);

        columna.appendChild(columnaTexto);
        fila.appendChild(columna);

        estructuraTabla.appendChild(fila);

        crearTabla.appendChild(estructuraTabla);

        tabla.appendChild(crearTabla);
        crearTabla.setAttribute("border", "2");
    }
}

function crear() {
    for (let i = 0; i < 10; i++) {
        objeto.push({
            Equipos: aleatorios(numero, 50),
            Ventas: aleatorios(numero, 50),
            IMEI: aleatorios(numero, 50)
        })

    }
}

function aleatorios(array, max) {
    while (array.length < 50) {
        var numRandom = Math.ceil(Math.random() * max);
        var bandera = false;
        for (let i = 0; i < array.length; i++) {
            if (array[i] == numRandom) {
                bandera = true;
                break;
            }
        }
        if (!bandera) {
            array[array.length] = numRandom;
            return numRandom;
        }
    }
}

window.addEventListener("load", generarTabla);