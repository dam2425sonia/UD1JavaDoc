# Generación de documentación con Javadoc en VS Code

Este proyecto muestra cómo generar documentación con **Javadoc** en **Java** usando **Visual Studio Code**.  
Incluye ejemplos, comandos y una configuración opcional para automatizar la generación.

Recuerda
Comentario Javadoc	/** comentario */	Documentación formal que puede ser procesada por Javadoc

---

## Ejemplo: `Calculadora.java`

```java
/**
 * La clase Calculadora proporciona métodos para realizar operaciones matemáticas básicas.
 * <p>
 * Ejemplo de uso:
 * <pre>
 *     Calculadora calc = new Calculadora();
 *     int resultado = calc.sumar(5, 3);
 * </pre>
 * </p>
 * 
 * @author Juan
 * @version 1.0
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     * @throws ArithmeticException si el divisor es cero.
     */
    public double dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir por cero");
        return (double) a / b;
    }
}
```

---

## Generar la documentación

1. Abre la **terminal** en VS Code (`Ctrl + \``).
2. Ejecuta el siguiente comando:

   ```bash
   javadoc -d docs -author -version Calculadora.java
   ```

### Parámetros

| Parámetro | Descripción |
|------------|--------------|
| `-d docs` | Genera la documentación dentro de la carpeta `docs/` |
| `-author` | Incluye el autor en los comentarios |
| `-version` | Incluye la versión especificada |
| `Calculadora.java` | Archivo fuente a documentar |

---

## Ver la documentación

Una vez generado, abre el archivo:

```
docs/index.html
```

en tu navegador.  

---

## Tip adicional

Si tu proyecto tiene varios archivos Java dentro de una carpeta `src/`, puedes documentarlos todos con:

```bash
javadoc -d docs -author -version src/*.java
```

Si solo tengo una clase y quieres probar, haz esto:

```bash
javadoc -d doc Calculadora.java
```

---

## ⚡ Automatizar en VS Code

Crea un archivo de tareas en:

```
.vscode/tasks.json
```

con este contenido:

```json
{
  "version": "2.0.0",
  "tasks": [
    {
      "label": "Generar Javadoc",
      "type": "shell",
      "command": "javadoc -d docs -author -version src/*.java",
      "group": {
        "kind": "build",
        "isDefault": true
      },
      "problemMatcher": []
    }
  ]
}
```

Ejecuta la tarea con **Ctrl+Shift+B** para generar la documentación automáticamente.


