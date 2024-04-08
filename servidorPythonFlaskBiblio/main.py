from flask import Flask, jsonify,request
from DB import BaseDeDatos
from utilidades import validar_email
from consultas import PDFCreator
import datetime

app = Flask(__name__)

DB = BaseDeDatos('localhost', 'root', 'root', 'biblioteca')


# ---->
# ----> cuando se regrese un dato se regresara un string en la que cada columna sera
# ----> separada por dos --
#  ----> ejemplo:  1--osman--osman@gmail--1234567890
# si son mas de 1 dato se separan con dos guiones cada columna y | cada registro
# ----> ejemplo:  1--osman--osman@gmail--1234567890|2--osman--osman@gmail--1234567890
@app.route('/')
def hello_world():
    return '¡Hola, Mundo!'

# OBTENER GENEROS
@app.route('/obtener_generos')
def get_generos():
    res = DB.hacer_consulta("SELECT * FROM GENEROS")
    generos = ""
    for genero in res:
        generos += str(genero[0]) + "--" + genero[1] + "|"
    
    return generos

# INSERTAR GENERO
# INSERT INTO GENEROS (nombre) VALUES ('Terror')

# ================================> INICIO AUTORES <================================
@app.route('/insertar_autor',methods=['POST'])
def insertar_autor():
    nombre = request.json['nombre']
    if len(nombre) == 0:
        return "Faltan llenar el campo nombre"
    DB.hacer_insert("INSERT INTO AUTORES (nombre_completo) VALUES ('{}')".format( nombre))
    return "Autor insertado"

@app.route('/modificar_autor',methods=['PUT'])
def modificar_autor():
    id_autor = request.json['id_autor']
    nombre = request.json['nombre']
    
    if len(nombre) == 0:
        return "Faltan llenar el campo nombre"
    
    if id_autor == "0":
        return "Faltan llenar el campo id_autor"
   
    DB.hacer_insert("UPDATE AUTORES SET nombre_completo = '{}' WHERE ID_AUTOR = '{}'".format(nombre, int(id_autor)))
    return "Autor modificado"

@app.route('/obtener_autores',methods=['GET'])
def obtener_autores():
    res = DB.hacer_consulta("SELECT * FROM autores")

    autores = ""
    for autor in res:
        autores += str(autor[0]) + "--" + autor[1] + "|"

    return autores

@app.route('/eliminar_autor/<id_autor>', methods=['DELETE'])
def eliminar_autor(id_autor):
    DB.hacer_consulta("DELETE FROM AUTORES WHERE ID_AUTOR = '{}'".format(int(id_autor)))
    return "Autor eliminado"

# ================================> FIN AUTORES <================================
# ================================> INICIO CLIENTES <================================
@app.route('/insertar_cliente',methods=['POST'])
def insertar_cliente():
    nombre = request.json['nombre']
    direccion = request.json['direccion']
    telefono = request.json['telefono']
    email = request.json['email']
    fecha_registro = datetime.datetime.now().strftime("%Y-%m-%d")
    
    if len(nombre) == 0:
        return "Faltan llenar el campo nombre"
    if len(direccion) == 0:
        return "Falta llenar el campo direccion"
    if len(telefono) != 10:
        return "El campo telefono debe tener 10 digitos"
    if validar_email(email) == False:
        return "El email no es valido"
     

    DB.hacer_insert("INSERT INTO CLIENTES (nombre_completo, direccion, fecha_registro, correo_electronico, telefono, estado_cliente) VALUES ('{}', '{}', '{}', '{}', '{}', '{}')"
    .format(nombre, direccion, fecha_registro, email, telefono, '1'))
    return "Cliente insertado"
        

# obtener los datos del cliente
@app.route('/obtener_cliente/<id_cliente>')
def obtener_cliente(id_cliente,methods=['GET']):
    res = DB.hacer_consulta("SELECT * FROM CLIENTES WHERE ID_CLIENTE = '{}'".format(int(id_cliente)))
    clientes = ""
    for cliente in res:
        clientes += str(cliente[0]) + "--" + str(cliente[1]) + "--" + str(cliente[2]) + "--" + str(cliente[3]) + "--" + str(cliente[4]) + "--" + str(cliente[5]) 
    return clientes




# modificar los datos del cliente
@app.route('/modificar_cliente',methods=['PUT'])
def modificar_cliente():
    id_cliente = request.json['id_cliente']
    nombre = request.json['nombre']
    direccion = request.json['direccion']
    telefono = request.json['telefono']
    email = request.json['email']
    
    if len(nombre) == 0:
        return "Faltan llenar el campo nombre"
    if len(direccion) == 0:
        return "Falta llenar el campo direccion"
    if len(telefono) != 10:
        return "El campo telefono debe tener 10 digitos"
    if validar_email(email) == False:
        return "El email no es valido"
    if id_cliente == "0":
        return "Faltan llenar el campo id_cliente"
    
    DB.hacer_insert("UPDATE CLIENTES SET nombre_completo = '{}', direccion = '{}', correo_electronico = '{}', telefono = '{}' WHERE ID_CLIENTE = '{}'"
    .format(nombre, direccion, email, telefono, int(id_cliente)))
    return "Cliente modificado"

@app.route('/obtener_clientes',methods=['GET'])
def obtener_clientes():
    res = DB.hacer_consulta("SELECT * FROM clientes")

    clientes = ""
    for cliente in res:
        clientes += str(cliente[0]) + "--" + str(cliente[1]) + "--" + str(cliente[2]) + "--" + str(cliente[3]) + "--" + str(cliente[4]) + "--" + str(cliente[5]) + "|"

        # clientes.append({'ID_CLIENTE': cliente[0], 'nombre_completo': cliente[1], 'direccion': cliente[2], 'fecha_registro': cliente[3], 'correo_electronico': cliente[4], 'telefono': cliente[5]})

    return clientes

# eliminar cliente
@app.route('/eliminar_cliente/<id_cliente>', methods=['DELETE'])
def eliminar_cliente(id_cliente):
    DB.hacer_consulta("DELETE FROM CLIENTES WHERE ID_CLIENTE = '{}'".format(int(id_cliente)))
    return "Cliente eliminado"
# ================================> FIN CLIENTES <================================

# ================================> INICIO PROVEEDORES  <================================
@app.route('/insertar_proveedor',methods=['POST'])
def insertar_proveedor():
    razonsocial = request.json['nombre']
    direccion = request.json['direccion']
    telefono = request.json['telefono']
    email = request.json['email']
    fecha_registro = datetime.datetime.now().strftime("%Y-%m-%d")
    
    if len(razonsocial) == 0:
        return "Faltan llenar el campo nombre"
    if len(direccion) == 0:
        return "Falta llenar el campo direccion"
    if len(telefono) != 10:
        return "El campo telefono debe tener 10 digitos"
    if validar_email(email) == False:
        return "El email no es valido"
     

    DB.hacer_insert("INSERT INTO PROVEEDORES (razon_social, direccion, fecha_registro, correo_electronico, telefono, estado_proveedor) VALUES ('{}', '{}', '{}', '{}', '{}', '{}')"
    .format(razonsocial, direccion, fecha_registro, email, telefono, '1'))
    return "Proveedor insertado"

# obtener los datos del proveedor
@app.route('/obtener_proveedor/<id_proveedor>')
def obtener_proveedor(id_proveedor,methods=['GET']):
    res = DB.hacer_consulta("SELECT * FROM PROVEEDORES WHERE ID_PROVEEDOR = '{}'".format(int(id_proveedor)))

    proveedor = str(res[0][0]) + "--" + str(res[0][1]) + "--" + str(res[0][2]) + "--" + str(res[0][3]) + "--" + str(res[0][4]) + "--" + str(res[0][5])
    return proveedor

# modificar los datos del proveedor
@app.route('/modificar_proveedor',methods=['PUT'])
def modificar_proveedor():
    id_proveedor = request.json['id_proveedor']
    razonsocial = request.json['nombre']
    direccion = request.json['direccion']
    telefono = request.json['telefono']
    email = request.json['email']
    
    if len(razonsocial) == 0:
        return "Faltan llenar el campo nombre"
    if len(direccion) == 0:
        return "Falta llenar el campo direccion"
    if len(telefono) != 10:
        return "El campo telefono debe tener 10 digitos"
    if validar_email(email) == False:
        return "El email no es valido"
    if id_proveedor == "0":
        return "Faltan llenar el campo id_proveedor"
    
    DB.hacer_insert("UPDATE PROVEEDORES SET razon_social = '{}', direccion = '{}', correo_electronico = '{}', telefono = '{}' WHERE ID_PROVEEDOR = '{}'"
    .format(razonsocial, direccion, email, telefono, int(id_proveedor)))
    return "Proveedor modificado"


@app.route('/obtener_proveedores',methods=['GET'])
def obtener_proveedores():
    res = DB.hacer_consulta("SELECT * FROM proveedores")

    proveedores = ""
    for proveedor in res:
        proveedores += str(proveedor[0]) + "--" + str(proveedor[1]) + "--" + str(proveedor[2]) + "--" + str(proveedor[3]) + "--" + str(proveedor[4]) + "--" + str(proveedor[5]) + "|"

    return proveedores

# ================================> FIN PROVEEDORES <================================


# ================================> INICIO LIBROS <================================

@app.route('/insertar_libro',methods=['POST'])
def insertar_libro():
    titulo = request.json['titulo']
    fecha_publicacion = request.json['fecha_publicacion']
    isbn = request.json['isbn']
    editorial = request.json['editorial']
    idioma = request.json['idioma']
    descripcion = request.json['descripcion']
    num_paginas = request.json['num_paginas']
    num_ejemplares = request.json['num_ejemplares']
    id_estante = request.json['id_estante']
    id_autor = request.json['id_autor']
    id_genero = request.json['id_genero']
    precioxdia = request.json['precioxdia']

    DB.hacer_insert("INSERT INTO LIBROS (titulo, fecha_publicacion, isbn, editorial, idioma, descripcion, num_paginas, num_ejemplares, id_estante, id_autor, id_genero, precioxdia) VALUES ('{}', '{}', '{}', '{}', '{}', '{}', '{}', '{}', '{}', '{}', '{}', '{}')"
    .format(titulo, fecha_publicacion, isbn, editorial, idioma, descripcion, num_paginas, num_ejemplares, id_estante, id_autor, id_genero, precioxdia))
    return "Libro insertado"

    
@app.route('/obtener_libro/<id_libro>')
def obtener_libro(id_libro,methods=['GET']):
        res = DB.hacer_consulta("SELECT * FROM LIBROS WHERE ID_LIBRO = '{}'".format(int(id_libro)))
        
        libro = str(res[0][0]) + "--" + str(res[0][1]) + "--" + str(res[0][2]) + "--" + str(res[0][3]) + "--" + str(res[0][4]) + "--" + str(res[0][5]) + "--" + str(res[0][6]) + "--" + str(res[0][7]) + "--" + str(res[0][8]) + "--" + str(res[0][9]) + "--" + str(res[0][10]) + "--" + str(res[0][11]) + "--" + str(res[0][12])

        return libro


@app.route('/buscar_libro', methods=['GET'])
def buscar_libro():
    criterio = request.args.get('criterio')
    dato = request.args.get('dato')

    if criterio == "titulo":
        res = DB.hacer_consulta("SELECT * FROM LIBROS WHERE titulo LIKE '%{}%'".format(dato))
    elif criterio == "autor":
        res = DB.hacer_consulta("SELECT * FROM LIBROS WHERE id_autor IN (SELECT ID_AUTOR FROM AUTORES WHERE nombre_completo LIKE '%{}%')".format(dato))
    elif criterio == "id":
        res = DB.hacer_consulta("SELECT * FROM LIBROS WHERE ID_LIBRO = '{}'".format(int(dato)))
    else:
        return "Criterio de búsqueda no válido"

    libros = ""
    for libro in res:
        libros += str(libro[0]) + "--" + libro[1] + "--" + str(libro[2]) + "--" + libro[3] + "--" + libro[4] + "--" + libro[5] + "--" + libro[6] + "--" + str(libro[7]) + "--" + str(libro[8]) + "--" + str(libro[9]) + "--" + str(libro[10]) + "--" + str(libro[11]) + "--" + str(libro[12]) + "|"
    return libros


@app.route('/modificar_libro',methods=['PUT'])
def modificar_libro():
    id_libro = request.json['id_libro']
    titulo = request.json['titulo']
    fecha_publicacion = request.json['fecha_publicacion']
    isbn = request.json['isbn']
    editorial = request.json['editorial']
    idioma = request.json['idioma']
    descripcion = request.json['descripcion']
    num_paginas = request.json['num_paginas']
    num_ejemplares = request.json['num_ejemplares']
    id_estante = request.json['id_estante']
    id_autor = request.json['id_autor']
    id_genero = request.json['id_genero']
    precioxdia = request.json['precioxdia']
    
    DB.hacer_insert("UPDATE LIBROS SET titulo = '{}', fecha_publicacion = '{}', isbn = '{}', editorial = '{}', idioma = '{}', descripcion = '{}', num_paginas = '{}', num_ejemplares = '{}', id_estante = '{}', id_autor = '{}', id_genero = '{}', precioxdia = '{}' WHERE ID_LIBRO = '{}'"
    .format(titulo, fecha_publicacion, isbn, editorial, idioma, descripcion, num_paginas, num_ejemplares, id_estante, id_autor, id_genero, precioxdia, int(id_libro)))
    return "Libro modificado"


@app.route('/obtener_libros',methods=['GET'])
def obtener_libros():
    res = DB.hacer_consulta("SELECT * FROM libros")

    libros = ""
    for libro in res:
        
        libros += str(libro[0]) + "--" + libro[1] + "--" + str(libro[2]) + "--" + libro[3] + "--" + libro[4] + "--" + libro[5] + "--" + libro[6] + "--" + str(libro[7]) + "--" + str(libro[8]) + "--" + str(libro[9]) + "--" + str(libro[10]) + "--" + str(libro[11]) + "--" + str(libro[12]) + "|"
    return libros
@app.route('/eliminar_libro/<id_libro>', methods=['DELETE'])
def eliminar_libro(id_libro):
    DB.hacer_insert("DELETE FROM LIBROS WHERE ID_LIBRO = '{}'".format(int(id_libro)))
    return "Libro eliminado"

# ================================> FIN libros <================================

# ================================> INICIO TARJETAS_CLIENTE <================================


@app.route('/insertar_tarjeta',methods=['POST'])
def insertar_tarjeta():
    id_cliente = request.json['id_cliente']
    fecha_registro = request.json['fecha_registro']
    fecha_vencimiento = request.json['fecha_vencimiento']
    codigo_barras = request.json['codigo_barras']

    DB.hacer_insert("INSERT INTO TARJETA_CLIENTE (id_cliente, fecha_registro, fecha_vencimiento, codigo_barras) VALUES ('{}', '{}', '{}', '{}')"
    .format(id_cliente, fecha_registro, fecha_vencimiento, codigo_barras))
    return "Tarjeta insertada"

@app.route('/obtener_tarjeta/<id_tarjeta>')
def obtener_tarjeta(id_tarjeta,methods=['GET']):
    res = DB.hacer_consulta("SELECT * FROM TARJETA_CLIENTE WHERE ID_TARJETA = '{}'".format(int(id_tarjeta)))
    
    tarjeta = str(res[0][0]) + "--" + str(res[0][1]) + "--" + str(res[0][2]) + "--" + str(res[0][3]) + "--" + str(res[0][4])

    return tarjeta


@app.route('/modificar_tarjeta',methods=['PUT'])
def modificar_tarjeta():
    id_tarjeta = request.json['id_tarjeta']
    id_cliente = request.json['id_cliente']
    fecha_registro = request.json['fecha_registro']
    fecha_vencimiento = request.json['fecha_vencimiento']
    codigo_barras = request.json['codigo_barras']
    
    DB.hacer_insert("UPDATE TARJETA_CLIENTE SET id_cliente = '{}', fecha_registro = '{}', fecha_vencimiento = '{}', codigo_barras = '{}' WHERE ID_TARJETA = '{}'"
    .format(id_cliente, fecha_registro, fecha_vencimiento, codigo_barras, int(id_tarjeta)))
    return "Tarjeta modificada"


@app.route('/obtener_tarjetas',methods=['GET'])
def obtener_tarjetas():
    res = DB.hacer_consulta("SELECT * FROM tarjeta_cliente")

    tarjetas = ""
    for tarjeta in res:
        tarjetas += str(tarjeta[0]) + "--" + str(tarjeta[1]) + "--" + str(tarjeta[2]) + "--" + str(tarjeta[3]) + "--" + str(tarjeta[4]) + "|"

    return tarjetas

# ================================> FIN TARJETAS_CLIENTE <================================


# ================================> INICIO MAESTRO_COMPRAS <================================

@app.route('/insertar_maestro_compras',methods=['POST'])
def insertar_maestro_compras():
    fecha_compra = request.json['fecha_compra']
    id_proveedor = request.json['id_proveedor']
    total_compra = request.json['total_compra']

    DB.hacer_insert("INSERT INTO MAESTRO_COMPRAS (fecha_compra, id_proveedor, total_compra) VALUES ('{}', '{}', '{}')"
    .format(fecha_compra, id_proveedor, total_compra))
    return "compra exitosa "


@app.route('/obtener_maestro_compra/<id_compra>')
def obtener_maestro_compra(id_compra,methods=['GET']):
    res = DB.hacer_consulta("SELECT * FROM MAESTRO_COMPRAS WHERE ID_COMPRA = '{}'".format(int(id_compra)))
    
    maestro_compra = str(res[0][0]) + "--" + str(res[0][1]) + "--" + str(res[0][2]) + "--" + str(res[0][3])

    return maestro_compra

# es broma
@app.route('/modificar_maestro_compra',methods=['PUT'])
def modificar_maestro_compra():
    id_compra = request.json['id_compra']
    fecha_compra = request.json['fecha_compra']
    id_proveedor = request.json['id_proveedor']
    total_compra = request.json['total_compra']
    
    DB.hacer_insert("UPDATE MAESTRO_COMPRAS SET fecha_compra = '{}', id_proveedor = '{}', total_compra = '{}' WHERE ID_COMPRA = '{}'"
    .format(fecha_compra, id_proveedor, total_compra, int(id_compra)))
    return "Maestro de compra modificado"

@app.route('/obtener_maestro_compras',methods=['GET'])
def obtener_maestro_compras():
    res = DB.hacer_consulta("SELECT * FROM maestro_compras")

    maestro_compras = ""
    for maestro_compra in res:
        maestro_compras += str(maestro_compra[0]) + "--" + str(maestro_compra[1]) + "--" + str(maestro_compra[2]) + "--" + str(maestro_compra[3]) + "|"

    return maestro_compras


# ================================> FIN MAESTRO_COMPRAS <================================


# ================================> INICIO DETALLE_COMPRAS <================================

@app.route('/insertar_detalle_compra',methods=['POST'])
def insertar_detalle_compra():
    id_compra = request.json['id_compra']
    id_libro = request.json['id_libro']
    cantidad_comprada = request.json['cantidad_comprada']
    precio_unitario = request.json['precio_unitario']
    subtotal = request.json['subtotal']

    DB.hacer_insert("INSERT INTO DETALLE_COMPRAS (id_compra, id_libro, cantidad_comprada, precio_unitario, subtotal) VALUES ('{}', '{}', '{}', '{}', '{}')"
    .format(id_compra, id_libro, cantidad_comprada, precio_unitario, subtotal))
    return "Detalle de compra insertado"


@app.route('/obtener_detalle_compra/<id_detalle>')
def obtener_detalle_compra(id_detalle,methods=['GET']):
    res = DB.hacer_consulta("SELECT * FROM DETALLE_COMPRAS WHERE ID_DETALLE = '{}'".format(int(id_detalle)))

    detalle_compra = str(res[0][0]) + "--" + str(res[0][1]) + "--" + str(res[0][2]) + "--" + str(res[0][3]) + "--" + str(res[0][4]) + "--" + str(res[0][5])

    return detalle_compra


@app.route('/modificar_detalle_compra',methods=['PUT'])
def modificar_detalle_compra():
    id_detalle = request.json['id_detalle']
    id_compra = request.json['id_compra']
    id_libro = request.json['id_libro']
    cantidad_comprada = request.json['cantidad_comprada']
    precio_unitario = request.json['precio_unitario']
    subtotal = request.json['subtotal']
    
    DB.hacer_insert("UPDATE DETALLE_COMPRAS SET id_compra = '{}', id_libro = '{}', cantidad_comprada = '{}', precio_unitario = '{}', subtotal = '{}' WHERE ID_DETALLE = '{}'"
    .format(id_compra, id_libro, cantidad_comprada, precio_unitario, subtotal, int(id_detalle)))
    return "Detalle de compra modificado"


@app.route('/obtener_detalle_compras',methods=['GET'])
def obtener_detalle_compras():
    res = DB.hacer_consulta("SELECT * FROM detalle_compras")

    detalle_compras = ""
    for detalle_compra in res:
        detalle_compras += str(detalle_compra[0]) + "--" + str(detalle_compra[1]) + "--" + str(detalle_compra[2]) + "--" + str(detalle_compra[3]) + "--" + str(detalle_compra[4]) + "--" + str(detalle_compra[5]) + "|"

    return detalle_compras




# ================================> FIN DETALLE_COMPRAS <================================


# ================================> INICIO REPORTE VENTAS <================================

## registrar venta con los datos de arriba
@app.route('/registrar_reservacion',methods=['POST'])
def registrar_venta():
    id_estatus_libro = "1"
    id_libro = request.json['id_libro']
    id_cliente = request.json['id_cliente']
    fecha_prestamo = request.json['fecha_prestamo']
    fecha_devolucion = request.json['fecha_devolucion']
    print("id libro: ",id_libro)
    print("id cliente: ",id_cliente)
    print("fecha prestamo: ",fecha_prestamo)
    print("fecha devolucion: ",fecha_devolucion)

    DB.hacer_insert("INSERT INTO estados_reservaciones (id_estatus_libro, id_libro, id_cliente, fecha_prestamo, fecha_devolucion) VALUES ('{}', '{}', '{}', '{}', '{}')"
    .format(id_estatus_libro, id_libro, id_cliente, fecha_prestamo, fecha_devolucion))
    return "Reservacion registrada"

def obtenerNombreLibroPorId(id):
    res = DB.hacer_consulta("SELECT titulo FROM LIBROS WHERE ID_LIBRO = '{}'".format(id))
    return res[0][0]
def obtenerNombreClientePorId(id):
    res = DB.hacer_consulta("SELECT nombre_completo FROM CLIENTES WHERE ID_CLIENTE = '{}'".format(id))
    return res[0][0]
def obtenerEstadoLibroPorId(id):
    res = DB.hacer_consulta("SELECT estatus FROM libro_estatus WHERE ID_ESTATUS_LIBRO = '{}'".format(id))
    return res[0][0]
def obtenerNombreProveedorPorId(id):
    res = DB.hacer_consulta("SELECT razon_social FROM proveedores WHERE ID_PROVEEDOR = '{}'".format(id))
    return res[0][0]
def obtenerNombreAutorPorId(id):
    res = DB.hacer_consulta("SELECT nombre_completo FROM autores WHERE ID_AUTOR = '{}'".format(id))
    return res[0][0]
## obtener todas las reservaciones con un rango de fechas
@app.route('/obtener_reservaciones/<fecha_inicio>/<fecha_fin>')
def obtener_reservaciones(fecha_inicio,fecha_fin,methods=['GET']):
    # date
    fecha_inicio = datetime.datetime.strptime(fecha_inicio, '%Y-%m-%d')
    fecha_fin = datetime.datetime.strptime(fecha_fin, '%Y-%m-%d')
    res = DB.hacer_consulta("SELECT * FROM estados_reservaciones WHERE FECHA_prestamo BETWEEN '{}' AND '{}'".format(fecha_inicio,fecha_fin))
    
    pdf_creator = PDFCreator("informe.pdf") 

    # Agregar los encabezados de las columnas
    encabezados = ["ID reservacion", "Estado libro", "Nombre libro","Nombre cliente","Fecha prestamo","Fecha devolucion"]
    pdf_creator.agregar_encabezados(encabezados)
    # Agregar los datos de la consulta
    for fila in res:
        nombreCliente = str(obtenerNombreClientePorId(fila[3]))
        nombreLibro = str(obtenerNombreLibroPorId(fila[2]))
        estadoLibro = str(obtenerEstadoLibroPorId(fila[1]))
        pdf_creator.agregar_fila([str(fila[0]), estadoLibro, nombreLibro,nombreCliente,str(fila[4]),str(fila[5])])

    # Generar el PDF
    
    # pdf_creator.titulo("REPORTE DE VENTAS", "Reporte de ventas entre {} y {}".format(fecha_inicio,fecha_fin))
    #Se ingresan los parametros de la funcion
    # dale formato a la fecha anio mes y dia
    pdf_creator.generar_pdf("REPORTE DE VENTAS","Reporte de ventas entre " + "".join(str(fecha_inicio).split(" ")[0])  + " y " + "".join(str(fecha_fin).split(" ")[0]))
    
  
    return pdf_creator.toBase64()


    

# ================================> FIN REPORTE VENTAS <================================














# ================================> INICIO REPORTE COMPRAS <================================


# @app.route('/obtener_maestro_compras',methods=['GET'])
# def obtener_maestro_compras():
#     res = DB.hacer_consulta("SELECT * FROM maestro_compras")

#     maestro_compras = ""
#     for maestro_compra in res:
#         maestro_compras += str(maestro_compra[0]) + "--" + str(maestro_compra[1]) + "--" + str(maestro_compra[2]) + "--" + str(maestro_compra[3]) + "|"

#     return maestro_compras

#hazla como esa pero pide 2 fechas y que te regrese las compras entre esas fechas
@app.route('/obtener_compras/<fecha_inicio>/<fecha_fin>')
def obtener_compras(fecha_inicio,fecha_fin,methods=['GET']):
    # date
    fecha_inicio = datetime.datetime.strptime(fecha_inicio, '%Y-%m-%d')
    fecha_fin = datetime.datetime.strptime(fecha_fin, '%Y-%m-%d')

    res = DB.hacer_consulta("SELECT * FROM maestro_compras WHERE Fecha_Compra BETWEEN '{}' AND '{}'".format(fecha_inicio,fecha_fin))
    
    pdf_creator = PDFCreator("informe.pdf")

    # # Agregar los encabezados de las columnas
    encabezados = ["ID compra", "Fecha compra ", "Nombre proveedor","Total compra"]
    pdf_creator.agregar_encabezados(encabezados)

    # # Agregar los datos de la consulta
    for fila in res:
        nombreProveedor = str(obtenerNombreProveedorPorId(fila[2]))
        pdf_creator.agregar_fila([str(fila[0]), str(fila[1]), nombreProveedor,str(fila[3])])

    # # Generar el PDF
    pdf_creator.generar_pdf("REPORTE DE COMPRAS","Reporte de compras entre " + "".join(str(fecha_inicio).split(" ")[0])  + " y " + "".join(str(fecha_fin).split(" ")[0]))
  
    return pdf_creator.toBase64()

        





# ================================> FIN REPORTE COMPRAS <================================











@app.route('/localizarLibros')
def localizarLibros(methods=['GET']):
    res = DB.hacer_consulta("SELECT titulo,id_estante FROM libros")

    pdf_creator = PDFCreator("informe.pdf")
    encabezados = ["Titulo", "Estante"]
    pdf_creator.agregar_encabezados(encabezados)

    for fila in res:
        pdf_creator.agregar_fila([str(fila[0]), str(fila[1])])
    
    pdf_creator.generar_pdf("LOCALIZACION DE LIBROS","Libro por estante")
    return pdf_creator.toBase64()

@app.route('/reporteAutores')
def reporteAutores(methods=['GET']):
    res = DB.hacer_consulta("SELECT titulo,id_autor FROM libros")

    pdf_creator = PDFCreator("informe.pdf")
    encabezados = ["Titulo", "Nombre autor"]
    pdf_creator.agregar_encabezados(encabezados)

    for fila in res:
        nombre_autor = str(obtenerNombreAutorPorId(fila[1]))
        pdf_creator.agregar_fila([str(fila[0]), nombre_autor])
    
    pdf_creator.generar_pdf("REPORTE DE AUTORES","Libro por autor")
    return pdf_creator.toBase64()


@app.route('/reporteProveedores')
def reporteProveedores(methods=['GET']):
    res = DB.hacer_consulta("SELECT razon_social,direccion,telefono FROM proveedores")

    pdf_creator = PDFCreator("informe.pdf")
    encabezados = ["razon_social", "direccion","telefono"]
    pdf_creator.agregar_encabezados(encabezados)

    for fila in res:
        pdf_creator.agregar_fila([str(fila[0]), str(fila[1]),str(fila[2])])
    
    pdf_creator.generar_pdf("REPORTE DE PROVEEDORES","contenido proveedores")
    return pdf_creator.toBase64()

    

# ================================> INICIO LOGIN <================================

@app.route('/verificarCredenciales/<usuario>/<password>')
def verificarCredenciales(usuario,password,methods=['GET']):
    res = DB.hacer_consulta("SELECT * FROM empleados WHERE USUARIO = '{}' AND PASSWORD = '{}'".format(usuario,password))

    if len(res) == 0:
        return "0"
    else:
        return "1"
    





# ================================> FIN LOGIN <================================









if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000,debug=True)

