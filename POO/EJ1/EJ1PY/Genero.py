class Genero:
    # Atributos
    nombre = ""
    edad = 0

    #Método constructor
    def init(self,pnombre,pedad):
        self.nombre = pnombre
        self.edad = pedad

#Getters y setters
    def getNombre(self):
        return self.nombre

    def setNombre(self,pnombre):
        self.nombre = pnombre

    def getEdad(self):
        return self.edad

    def setEdad(self,pedad):
        self.edad = pedad