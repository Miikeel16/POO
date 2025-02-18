import datetime
class Cliente:
    # Atributos
    nombre = ""
    apellido = ""
    dni = ""
    email = ""
    libro = libro
    fecha = datetime()

    #Método constructor
    def init(self,pnombre,papellido,pdni,pemail,pfechanacimiento,plibro):
        self.nombre = pnombre
        self.apellido = papellido
        self.dni = pdni
        self.email = pemail
        self.fechanacimiento = pfechanacimiento
        self.libro = plibro

#Getters y setters
    def getNombre(self):
        return self.nombre

    def setNombre(self,pnombre):
        self.nombre = pnombre

    def getApellido(self):
        return self.apellido

    def setApellido(self,papellido):
        self.apellido = papellido

    def getDni(self):
        return self.dni

    def setDni(self,pdni):
        self.dni = pdni

    def getEmail(self):
        return self.email

    def setEmail(self,pemail):
        self.email = pemail

    def getfechanacimiento(self):
        return self.fechanacimiento

    def setfechanacimiento(self,pfechanacimiento):
        self.fechanacimiento = pfechanacimiento

    def getLibro(self):
        return self.libro

    def setLibro(self,plibro):
        self.libro = plibro