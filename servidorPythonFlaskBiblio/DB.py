import mysql.connector
class BaseDeDatos:
    def __init__(self, host, user, password, database):
        self.host = host
        self.user = user
        self.password = password
        self.database = database
        self.conexion = None
        self._conectar()

    def _conectar(self):
        self.conexion = mysql.connector.connect(
            host=self.host,
            user=self.user,
            password=self.password,
            database=self.database
        )

    def hacer_consulta(self, consulta):
        cursor = self.conexion.cursor()
        cursor.execute(consulta)
        resultado = cursor.fetchall()
        return resultado
    def hacer_insert(self, consulta):
        cursor = self.conexion.cursor()
        cursor.execute(consulta)
        self.conexion.commit()

 