
from modeloEC import Universidad, Carrera

u = Universidad("UTPL","A", 5) 
print(u)
u.establecer_nomUniversidad("U CUENCA")
print(u)

c = Carrera("ECONOMIA","SOCIAL", "ECONOMISTA", 4) 
print(c)