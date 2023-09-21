'''
Pilas CARACTERISTICAS:

Estructura LIFO (Last In, First Out): En una pila, el último elemento que se agrega es el primero en ser eliminado. Es decir, el elemento en la parte superior de la pila es el primero en ser accedido o eliminado.

Operaciones Básicas: Las operaciones básicas en una pila son push (agregar un elemento), pop (eliminar el elemento superior) y peek (ver el elemento superior sin eliminarlo).

Método push: Permite agregar elementos en la parte superior de la pila.

Método pop: Permite eliminar y obtener el elemento superior de la pila.

Método peek: Permite ver el elemento superior de la pila sin eliminarlo.

Verificación de Vacío: Se puede verificar si la pila está vacía utilizando el método esta_vacia.

Uso Común: Las pilas se utilizan en situaciones donde se necesita mantener un historial de acciones o seguir el principio de "último en entrar, primero en salir", como la gestión de llamadas en una calculadora o la ejecución de operaciones en una máquina virtual.
'''
class Pila:
    def __init__(self):
        self.items = []

    def push(self, elemento):
        self.items.append(elemento)
        print(f"Push: {elemento}")
        self.mostrar_pila()

    def pop(self):
        if not self.esta_vacia():
            elemento = self.items.pop()
            print(f"Pop: {elemento}")
            self.mostrar_pila()
            return elemento
        else:
            print("La pila está vacía.")

    def peek(self):
        if not self.esta_vacia():
            elemento = self.items[-1]
            print(f"Peek: {elemento}")
            self.mostrar_pila()
            return elemento
        else:
            print("La pila está vacía.")

    def esta_vacia(self):
        return len(self.items) == 0

    def mostrar_pila(self):
        print("Pila actual:", self.items)

mi_pila = Pila()

mi_pila.push(5)
mi_pila.push(10)
mi_pila.push(15)
mi_pila.peek()
mi_pila.pop()
mi_pila.pop()
mi_pila.pop()
mi_pila.pop()
'''
Colas CARACTERISTICAS:

Estructura FIFO (First In, First Out): En una cola, el primer elemento que se agrega es el primero en ser eliminado. Es decir, el elemento en la parte frontal de la cola es el primero en ser accedido o eliminado.

Operaciones Básicas: Las operaciones básicas en una cola son enqueue (agregar un elemento al final), dequeue (eliminar el elemento frontal) y peek (ver el elemento frontal sin eliminarlo).

Método enqueue: Permite agregar elementos al final de la cola.

Método dequeue: Permite eliminar y obtener el elemento frontal de la cola.

Método peek: Permite ver el elemento frontal de la cola sin eliminarlo.

Verificación de Vacío: Se puede verificar si la cola está vacía utilizando el método esta_vacia.

Uso Común: Las colas se utilizan en situaciones donde se necesita mantener una secuencia de elementos y seguir el principio de "primero en entrar, primero en salir", como la gestión de tareas en un sistema operativo o la administración de solicitudes en un servidor web.
'''

class Cola:
    def __init__(self):
        self.items = []

    def peek(self):
        if not self.esta_vacia():
            valor = self.items[0]
            print(f"Peek: {valor}")
        else:
            print("La cola está vacía.")

    def enqueue(self, elemento):
        self.items.append(elemento)
        print(f"Enqueue: {elemento}")
        self.mostrar_cola()

    def dequeue(self):
        if not self.esta_vacia():
            elemento = self.items.pop(0)
            print(f"Dequeue: {elemento}")
            self.mostrar_cola()
            return elemento
        else:
            print("La cola está vacía.")

    def esta_vacia(self):
        return len(self.items) == 0

    def mostrar_cola(self):
        print("Cola actualizada:", self.items)

mi_cola = Cola()

mi_cola.enqueue(5)
mi_cola.enqueue(10)
mi_cola.peek()
mi_cola.dequeue()
mi_cola.dequeue()
mi_cola.peek()
mi_cola.dequeue()
