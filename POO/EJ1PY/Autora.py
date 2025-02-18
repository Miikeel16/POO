class Autora:
    # Atributos
    nombre = ""
    apellido = ""
    #Método constructor
    def Autora(self,pnombre,papeliido):
        self.nombre = pnombre
        self.apellido = papeliido

    # Getters y setters

    def getNombre(self):
        return self.nombre

    def setNombre(self,pnombre):
        self.nombre = pnombre

    def getApellido(self):
        return self.apellido

    def setApellido(self,papellido):
        self.apellido = papellido