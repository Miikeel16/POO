import datetime
class Libro:
    # Atributos
    nombre = ""
    autor = ""
    genero = ""
    numPaginas = ""
    sinopsis = ""
    fecha_publ = datetime()

    #Método constructor
    def init(self,pnombre,pautor,pgenero,pnumPaginas,psinopsis,pfecha_publ):
        self.nombre = pnombre
        self.autor = pautor
        self.genero = pgenero
        self.numPaginas = pnumPaginas
        self.sinopsis = psinopsis
        self.fecha_publ = pfecha_publ

#Getters y setters
    def getNombre(self):
        return self.nombre

    def setNombre(self,pnombre):
        self.nombre = pnombre

    def getAutor(self):
        return self.autor

    def setAutor(self,pautor):
        self.autor = pautor

    def getGenero(self):
        return self.genero

    def setGenero(self,pgenero):
        self.genero = pgenero

    def getnumPaginas(self):
        return self.numPaginas

    def setNumPaginas(self,pnumPaginas):
        self.numPaginas = pnumPaginas

    def getsinopsis(self):
        return self.sinopsis

    def setSinopsis(self,psinopsis):
        self.sinopsis = psinopsis

    def getFecha_publ(self):
        return self.fecha_publ

    def setFecha_publ(self,pfecha_publ):
        self.fecha_publ = pfecha_publ