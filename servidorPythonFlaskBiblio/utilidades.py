import re
def validar_email(email):
    # Expresión regular para validar un correo electrónico
    patron = r'^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$'
    # Verificar si la cadena cumple con el patrón de correo electrónico
    if re.match(patron, email):
        return True
    else:
        return False
    

def decirhola():
    print("Hola desde el módulo utilidades");