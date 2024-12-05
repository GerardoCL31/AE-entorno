public class taamagochi { // Declara una clase pública llamada "taamagochi". Representa una mascota virtual.

    private int hunger; // Variable privada que mide el nivel de hambre (a mayor valor, más hambre tiene).
    private int energy; // Variable privada que mide el nivel de energía (a menor valor, más cansado está).
    private int mood;   // Variable privada que mide el nivel de ánimo o humor (a mayor valor, más feliz está).

    public taamagochi() { // Constructor de la clase "taamagochi". Se ejecuta al crear una nueva instancia.
        this.hunger = 4; // Inicializa el nivel de hambre en 4.
        this.energy = 4; // Inicializa el nivel de energía en 4.
        this.mood = 4;   // Inicializa el nivel de humor en 4.
    }

    public String play() { // Método que simula que la mascota juega.
        hunger++;       // Aumenta el nivel de hambre al jugar.
        energy--;       // Disminuye el nivel de energía al jugar.
        mood++;         // Aumenta el nivel de humor al jugar.
        return getState(); // Devuelve el estado actual de la mascota después de jugar.
    }

    public String eat() { // Método que simula que la mascota come.
        hunger--;       // Disminuye el nivel de hambre.
        hunger--;       // Disminuye nuevamente el nivel de hambre (la comida satisface más).
        energy--;       // Disminuye el nivel de energía debido a la digestión.
        return getState(); // Devuelve el estado actual de la mascota después de comer.
    }

    public String sleep() { // Método que simula que la mascota duerme.
        energy++;       // Aumenta el nivel de energía al dormir.
        energy++;       // Aumenta nuevamente el nivel de energía (descanso profundo).
        return getState(); // Devuelve el estado actual de la mascota después de dormir.
    }

    public String getState() { // Método que determina el estado actual de la mascota basado en sus atributos.
        if (energy == 0) {          // Si la energía es 0, la mascota está durmiendo profundamente.
            return "(-_-) zZZ";     // Devuelve este estado para indicar sueño.
        } else if (mood > 8) {      // Si el nivel de humor es mayor a 8, la mascota está muy feliz.
            return ":-)";           // Devuelve este estado para mostrar felicidad.
        } else if (mood < 2) {      // Si el nivel de humor es menor a 2, la mascota está molesta o triste.
            return "ఠ_ఠ";          // Devuelve este estado para indicar disgusto o tristeza.
        } else if (energy < 2) {    // Si la energía es menor a 2, la mascota está cansada.
            return "(-_-)";         // Devuelve este estado para indicar cansancio.
        } else {                    // Si ninguna de las condiciones anteriores se cumple:
            return ":-|";           // Devuelve este estado para mostrar neutralidad.
        }
    }
}