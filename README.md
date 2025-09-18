# 🎵 Java OOP Exercises  
## S01. 01. Herencia y Polimorfismo
## 📄 Description - Enunciado del ejercicio  

### Ejercicio 1 (ES)  
En un grupo de música existen diferentes tipos de instrumentos musicales. Hay instrumentos de viento, cuerda y percusión.  

Todos los instrumentos tienen como atributos su nombre y precio. Además, tienen un método llamado `tocar()`. Éste es abstracto en la clase `Instrumento` y, por tanto, debe implementarse en las clases hijas.  

- Si se está tocando un instrumento de viento → `"Está sonando un instrumento de viento"`  
- Si se está tocando un instrumento de cuerda → `"Está sonando un instrumento de cuerda"`  
- Si se está tocando un instrumento de percusión → `"Está sonando un instrumento de percusión"`  

El proceso de carga de una clase sólo tiene lugar una vez. Se debe demostrar que la carga puede ser provocada por la creación de la primera instancia de esta clase o por el acceso a un miembro estático de ésta.  

👉 Buscar información sobre los bloques de inicialización y bloques estáticos en Java.  

### Exercise 1 (EN)  
In a music group there are different types of musical instruments: wind, string, and percussion.  

All instruments have attributes: **name** and **price**. They also include a method called `play()`. This method is abstract in the `Instrument` class and must be implemented in the child classes.  

- Wind instrument → `"A wind instrument is playing"`  
- String instrument → `"A string instrument is playing"`  
- Percussion instrument → `"A percussion instrument is playing"`  

The loading process of a class only occurs once. Demonstrate that loading can be triggered by either creating the first instance of this class or by accessing a static member of it.  

👉 Research about **initialization blocks** and **static blocks** in Java.  

---

### Ejercicio 2 (ES)  
Crea una clase `Coche` con los atributos: **marca, modelo y potencia**.  

- `marca` → `static final`  
- `modelo` → `static`  
- `potencia` → `final`  

Demuestra la diferencia entre los tres. ¿Hay alguno que pueda inicializarse en el constructor de la clase?  

Añade dos métodos a la clase `Coche`:  
- `frenar()` (static) → `"El vehículo está frenando"`  
- `acelerar()` (no estático) → `"El vehículo está acelerando"`  

Demuestra cómo invocar el método estático y el no estático desde el `main()` de la clase principal.  

### Exercise 2 (EN)  
Create a class `Car` with the attributes: **brand, model, and horsepower**.  

- `brand` → `static final`  
- `model` → `static`  
- `horsepower` → `final`  

Demonstrate the difference between the three. Which one can be initialized in the class constructor?  

Add two methods to the class `Car`:  
- `brake()` (static) → `"The vehicle is braking"`  
- `accelerate()` (non-static) → `"The vehicle is accelerating"`  

Show how to invoke both the static and non-static methods from the `main()` method in the main class.  

---

## 💻 Technologies Used  
- **Language:** Java (2025 version)  
- **IDE / Framework:** IntelliJ IDEA (latest version)  
- **Version Control:** Git & GitHub  
- **Concepts Applied:** Object-Oriented Programming (Polymorphism & Inheritance)  
- **Database:** Not used in this project  
- **Deployment Environment:** Not specified  

---

## 📋 Requirements  
- **Java JDK 21+ (2025 version)**  
- **IntelliJ IDEA (Community or Ultimate, latest version)**  
- **Git (latest version)**  

---

## 🛠️ Installation  
1. Clone this repository:  
   ```bash
  git clone https://github.com/yvangabrieli/1.1_Herencia_Polimorfismo.git
