class Nodo:                                 #GARCIA TORO ALBERTO
    def __init__(self, dato):#NODO          GRUPO:1310
        self.valor = dato
        self.siguiente = None

class Estructura:
    def __init__(self):
        self.cambios = False  #CONSTRUCTOR , INICIALIZACION
        self.ultimo_agregar_pila = None
        self.ultimo_agregar_cola = None
        self.primer_agregado_cola = None

    # PILA METODOS
    def agregar_a_pila(self, elemento):#PUSH
        nuevo_nodo = Nodo(elemento)
        if self.ultimo_agregar_pila is None:
            self.ultimo_agregar_pila = nuevo_nodo
        else:
            nuevo_nodo.siguiente = self.ultimo_agregar_pila
            self.ultimo_agregar_pila = nuevo_nodo
        self.cambios = True
        self.print_modificacion()

    def sacar_de_pila(self):#POP
        if self.ultimo_agregar_pila is None:
            return None
        else:
            elemento = self.ultimo_agregar_pila.valor
            self.ultimo_agregar_pila = self.ultimo_agregar_pila.siguiente
            self.cambios = True
            self.print_modificacion()
            return elemento

    def obtener_cima_pila(self):#PEEK
        if self.ultimo_agregar_pila is None:
            return None
        else:
            return self.ultimo_agregar_pila.valor

    #COLA METODOS
    def agregar_a_cola(self, elemento):#ENQUEUE
        nuevo_nodo = Nodo(elemento)
        if self.primer_agregado_cola is None:
            self.ultimo_agregar_cola = nuevo_nodo
            self.primer_agregado_cola = nuevo_nodo
        else:
            self.primer_agregado_cola.siguiente = nuevo_nodo
            self.primer_agregado_cola = nuevo_nodo
        self.cambios = True
        self.print_modificacion_cola()

    def sacar_de_cola(self):#DEQUEUE
        if self.ultimo_agregar_cola is None:
            return None
        else:
            elemento = self.ultimo_agregar_cola.valor
            self.ultimo_agregar_cola = self.ultimo_agregar_cola.siguiente
            if self.ultimo_agregar_cola is None:
                self.primer_agregado_cola = None
            self.cambios = True
            self.print_modificacion_cola()
            return elemento

    def obtener_cabeza_cola(self):#PEEK
        if self.ultimo_agregar_cola is None:
            return None
        else:
            return self.ultimo_agregar_cola.valor

    def buscar_elemento(self, elemento):
        numero_elemento = 0
        actual = self.ultimo_agregar_pila
        while actual is not None:
            if actual.valor == elemento:
                print(f"elemento encontrado en pila  {numero_elemento}")
                return
            actual = actual.siguiente
            numero_elemento += 1

        print("elemento no encontrado en la pila.")

    def buscar_elemento_cola(self, elemento):
        numero_elemento = 0
        actual = self.ultimo_agregar_cola
        while actual is not None:
            if actual.valor == elemento:
                print(f"numero de elemento: {numero_elemento}")
                return
            actual = actual.siguiente
            numero_elemento += 1

        print("Elemento no encontrado en la cola.")

    def print_modificacion(self):
        if self.cambios:
            print("\nPila :")
            actual = self.ultimo_agregar_pila
            while actual is not None:
                print(actual.valor)
                actual = actual.siguiente
            print("--------")
            self.cambios = False

    def print_modificacion_cola(self):
        if self.cambios:
            print("\nCola:")
            actual = self.ultimo_agregar_cola
            while actual is not None:
                print(actual.valor)
                actual = actual.siguiente
            print("--------")
            self.cambios = False

if __name__ == "__main__":
    estructura = EstructuraUnica()

    print("Ingresa elementos utilizando comas")
    input_str = input()
    elementos = input_str.split(',')

    for elemento in elementos:
        elemento = elemento.strip()
        if elemento:
            estructura.agregar_a_pila(elemento)
            estructura.agregar_a_cola(elemento)

    print("\ne elige el metodo:")
    print("1 pila ")
    print("2 cola")
    opcion = int(input())

    if opcion == 1:
        print("\noperaciones en pila:")
        print("1 Agregar ")
    print("2 Sacar ")
    print("3 Ver primer elemento ")
    print("4 Buscar elemento ")
    opcion_pila = int(input())

    if opcion_pila == 1:
        agregar_elemento = input("Ingresa elemento ")
        estructura.agregar_a_pila(agregar_elemento)
    elif opcion_pila == 2:
        elemento_sacar = estructura.sacar_de_pila()
        if elemento_sacar is not None:
            print(f"expulsar elemento: {elemento_sacar}")
        else:
            print("La pila se encuentra vacia")
    elif opcion_pila == 3:
        elemento_cima = estructura.obtener_cima_pila()
        if elemento_cima is not None:
            print(f"Elemento en la cima: {elemento_cima}")
        else:
            print("La pila está vacía.")
    elif opcion_pila == 4:
        elemento_buscar = input("Ingresa el elemento que deseas buscar en la pila : ")
        estructura.buscar_elemento(elemento_buscar)
    else:
        print("Opción no válida.")
elif opcion == 2:
    print("\nmetodos en cola")
    print("1 agregar")
    print("2 sacar")
    print("3 ver ultimo elemento agregado")
    print("4 buscar elemento ")
    opcion_cola = int(input())

    if opcion_cola == 1:
        agregar_elemento = input("agrega elemento a la cola ")
        estructura.agregar_a_cola(agregar_elemento)
    elif opcion_cola == 2:
        elemento_sacar = estructura.extraer_de_cola()
        if elemento_sacar is not None:
            print(f"elemento eliminado cola: {elemento_sacar}")
        else:
            print("La cola está vacía.")
    elif opcion_cola == 3:
        elemento_cabeza = estructura.obtener_cabeza_cola()
        if elemento_cabeza is not None:
            print(f"elemento en cabeza cola: {elemento_cabeza}")
        else:
            print("La cola está vacía.")
    elif opcion_cola == 4:
        elemento_buscar = input("que elemento buscas en cola: ")
        estructura.buscar_elemento_cola(elemento_buscar)
    else:
        print("eror en dato ")
else:
    print("error vuelva a elegir")

