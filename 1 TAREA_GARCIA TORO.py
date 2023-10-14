class Nodo:
    def __init__(self, dato):     #GARCIA TORO ALBERTO
        self.dato = dato          #GRUPO 1310
        self.siguiente = None

class lista_simple:     #LISTA SIMPLE
    def __init__(self):
        self.cabeza = None  # cabeza de lista vacia

    def agregar(self, dato):  #METODO AGREGAR
        nuevo_nodo = Nodo(dato)  #almacena el elemeto en un nuevo nodo
        if not self.cabeza:      # si la lista se encuentra vacia el nuevo nodo se convierte en la cabeza
            self.cabeza = nuevo_nodo
        else:
            actual = self.cabeza
            while actual.siguiente:
                actual = actual.siguiente
            actual.siguiente = nuevo_nodo

    def mostrar(self):    #METODO MOSTRAR
        actual = self.cabeza
        while actual:
            print(actual.dato, end=',')  # hace un print en el elemeto y se va con el siguiente
            actual = actual.siguiente

    def buscar(self, objetivo):#METODO BUSCAR EN LISTA
        actual = self.cabeza
        while actual:
            if actual.dato == objetivo:
                return True  # al encontrar dicho elemento da un true
            actual = actual.siguiente
        return False  # de lo contrario devuelve false


    def eliminar(self, objetivo):#METODO ELIMINAR
        if not self.cabeza:
            return
        if self.cabeza.dato == objetivo:
            self.cabeza = self.cabeza.siguiente  #si el elemto se encuentra en la cabeza se actualiza
            return
        actual = self.cabeza
        while actual.siguiente:
            if actual.siguiente.dato == objetivo:
                actual.siguiente = actual.siguiente.siguiente
                return
            actual = actual.siguiente

mi_lista = lista_simple()

mi_lista.agregar(10)
mi_lista.agregar(15)
mi_lista.agregar(20)
mi_lista.agregar(25)

print("lista SIMPLE después de agregar elementos:") #MOSTRAR LISTA
mi_lista.mostrar()

elemento_buscar = 15  #BUSCAR ELEMENTO
resultado = mi_lista.buscar(elemento_buscar)
print(f"¿\nSe encontró el elemento {elemento_buscar}?", resultado)

elemento_eliminar = 15  #ELIMINAR ELEMENTO
mi_lista.eliminar(elemento_eliminar)
print("lista despues de eliminar dicho elemento")
mi_lista.mostrar()


class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None
        self.anterior = None

class lista_doble:# LISTA DOBLE
    def __init__(self):
        self.cabeza = None

    def agregar(self, dato): #METODO AGREGAR
        nuevo_nodo = Nodo(dato)  # crea un nuevo nodo con el elemento proporiocnado
        if not self.cabeza:      # si las lista se encuentra vacia el nodo se combierte en cabeza
            self.cabeza = nuevo_nodo
        else:
            actual = self.cabeza
            while actual.siguiente:
                actual = actual.siguiente
            actual.siguiente = nuevo_nodo  # avanza hasta el ultimo nodo y establece el siguiente nodo
            nuevo_nodo.anterior = actual  # establece el nodo anterior del nuevo nodo

    def mostrar(self): #METODO MOSTRAR
        actual = self.cabeza
        while actual:
            print(actual.dato, end=',')  # hace un print en el nodo .
            actual = actual.siguiente


    def buscar(self, objetivo): #MEOTODO BUSCAR
        actual = self.cabeza
        while actual:
            if actual.dato == objetivo:
                return True  # al encontrar dicho elemento devuelve un true
            actual = actual.siguiente
        return False  # de lo contrario devuelve false

    def eliminar(self, objetivo): #METODO ELIMINAR
        if not self.cabeza:  #  no se puede si la cabeza se encuentra vacia
            return
        if self.cabeza.dato == objetivo:
            self.cabeza = self.cabeza.siguiente  # si esta en la cabeza se actulizara la misma
            if self.cabeza:
                self.cabeza.anterior = None
            return
        actual = self.cabeza
        while actual.siguiente:
            if actual.siguiente.dato == objetivo:
                actual.siguiente = actual.siguiente.siguiente  # elimina el nodo con dicho elemento
                if actual.siguiente:
                    actual.siguiente.anterior = actual  # actualiza el nodo anterior del siguiente nodo
                return
            actual = actual.siguiente

# Crear una instancia de la lista enlazada doble.
mi_lista = lista_doble()

mi_lista.agregar(10) #METODO AGREGAR
mi_lista.agregar(15)
mi_lista.agregar(20)

print("------------------------------------------------------------------\nlista DOBLE después de agregar elementos:") #METODO MOSTRAR
mi_lista.mostrar()

elemento_buscar = 15#METODO BUSCAR
resultado_busqueda = mi_lista.buscar(elemento_buscar)
print(f"¿se encontró el elemento {elemento_buscar}?", resultado_busqueda)

elemento_eliminar = 10 #METODO ELIMINAR
mi_lista.eliminar(elemento_eliminar)

print("Lista después de eliminar un elemento:")#METODO MOSTRAR
mi_lista.mostrar()



class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None

class lista_circular:
    def __init__(self):
        self.cabeza = None

    def agregar(self, dato):#METODO AGREGAR
        nuevo_nodo = Nodo(dato)  # se crea un nodo con el nuevo elemento
        if not self.cabeza:      # si se encuentra vacia la lista el nodo se hace cabeza
            self.cabeza = nuevo_nodo
            nuevo_nodo.siguiente = self.cabeza
        else:
            actual = self.cabeza
            while actual.siguiente != self.cabeza:
                actual = actual.siguiente
            actual.siguiente = nuevo_nodo  # avanza hasta el ultimo nodo y establece el siguiente nodo
            nuevo_nodo.siguiente = self.cabeza  # se hace el siguiente nodo como la cabeza

    def mostrar(self): #METODO MOSTRAR
        actual = self.cabeza
        while True:
            print(actual.dato, end=',')
            actual = actual.siguiente
            if actual == self.cabeza:
                break
        print('Inicio')

    def buscar(self, objetivo):#METODO BUSCAR
        actual = self.cabeza
        while True:
            if actual.dato == objetivo:
                return True
            actual = actual.siguiente
            if actual == self.cabeza:
                break
        return False

    def eliminar(self, objetivo):#METODO ELIMINAR
        if not self.cabeza:
            return
        if self.cabeza.dato == objetivo:
            if self.cabeza.siguiente == self.cabeza:
                self.cabeza = None
            else:
                actual = self.cabeza
                while actual.siguiente != self.cabeza:
                    actual = actual.siguiente
                actual.siguiente = self.cabeza.siguiente
                self.cabeza = self.cabeza.siguiente
            return

        actual = self.cabeza
        while actual.siguiente != self.cabeza:
            if actual.siguiente.dato == objetivo:
                actual.siguiente = actual.siguiente.siguiente  # elimina el nodo que contiene el elemento
                return
            actual = actual.siguiente

mi_lista =lista_circular()

mi_lista.agregar(10)#METODO AGREGAR
mi_lista.agregar(15)
mi_lista.agregar(20)

print("-----------------------------------------------------\nLista CIRCULAR después de agregar elementos:")#METODO MOSTRAR
mi_lista.mostrar()

elemento_buscar = 15 #METODO BUSCAR
resultado_busqueda = mi_lista.buscar(elemento_buscar)
print(f"¿se encontró el elemento {elemento_buscar}?", resultado_busqueda)

elemento_eliminar = 10 #METODO ELIMINAR
mi_lista.eliminar(elemento_eliminar)

print("Lista después de eliminar un elemento:")#METODO MOSTRAR
mi_lista.mostrar()
