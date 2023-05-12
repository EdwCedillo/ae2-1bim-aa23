
#class Humano(): #Creamos la clase Humano
#    def __init__(self, edad, nombre): #Definimos el parámetro edad y nombre
#        self.edad = edad # Definimos que el atributo edad, sera la edad asignada
#        self.nombre = nombre # Definimos que el atributo nombre, sera el nombre asig
#Persona1 = Humano(31, "Pedro") #Instancia






class Universidad:


	def __init__(self, nomUniversidad, categoria, numCarreraOfertadas):
		self.nombre = nomUniversidad
		self.categoria = categoria
		self.cantOfertada = numCarreraOfertadas

	def establecer_nomUniversidad(self, n):
		self.nombre = n

	def establecer_categoria(self, n):
		self.categoria = n
	
	def establecer_numCarreraOfertadas(self, n):
		self.cantOfertada = n	


	def obtener_nomUniversidad(self):
		return self.nombre

	def obtener_categoria(self):
		return self.categoria

	def obtener_numCarreraOfertadas(self):
		return self.cantOfertada

	def __str__(self):
		return "Nombre de la Universidad: %s, Categoria: %s, Cantidad de Carreras Ofertadas: %d\n"\
		%(self.nombre, self.categoria, self.cantOfertada)

class Carrera:
	#referencia
	#private String nomCarrera;
    #private String descripcionCarrera;
    #private String tituloOtorga;
    #private int duracion;



	def __init__(self, nomCarrera , descripcionCarrera,tituloOtorga, duracion):
		self.nombre = nomCarrera
		self.descrCarrera = descripcionCarrera
		self.tipoTitulo = tituloOtorga
		self.tiempoCarrera = duracion

	def establecer_nomCarrera(self, n):
		self.nombre = n

	def establecer_descripcionCarrera(self, n):
		self.descrCarrera = n
	
	def establecer_tituloOtorga(self, n):
		self.tipoTitulo = n	

	def establecer_duracion(self, n):
		self.tiempoCarrera = n	
			
	def obtener_nomCarrera(self):
		return self.nombre

	def obtener_descripcionCarrera(self):
		return self.descrCarrera

	def obtener_tituloOtorga(self):
		return self.tipoTitulo

	def obtener_duracion(self):
		return self.tiempoCarrera

	def __str__(self):
		return "Nombre de la Carrera: %s, Descripcion: %s,Titulo Otorgado: %s, Duracion: %d\n"\
		%(self.nombre, self.descrCarrera, self.tipoTitulo, self.tiempoCarrera)