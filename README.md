<h1 align="center">💰 Challenge: Conversor de Monedas 💰</h1>

<h2><em>🎯 Objetivo del Challenge</em></h2>

<p><em>Este challenge fue creado como parte de un desafío propuesto para mejorar y fortalecer los conocimientos en Java, con un enfoque en la programación orientada a objetos (POO).</em></p>

<h2><em>Descripción</em></h2>

<p><em>
Este programa permite al usuario convertir divisas de manera sencilla y eficiente. Solo necesitas ingresar la moneda base, la moneda destino y la cantidad a convertir. Además, muestra la última actualización del tipo de cambio para garantizar precisión en las conversiones.

El sistema también almacena un historial de conversiones, incluyendo la marca de tiempo de cada operación. Al cerrar el programa, se genera automáticamente un archivo JSON con la información de las transacciones, permitiendo un fácil acceso y seguimiento de los cambios en las monedas.
</em></p>

![imagen 1](https://github.com/user-attachments/assets/88dd636c-3dd5-4e7e-a6e6-c096b772478e)

<h2><em>Funcionalidades</em></h2>

<h3><em>1️⃣ Conversión de moneda</em></h3> 
<p><em>El programa muestra un menú con seis opciones de monedas predeterminadas, permitiendo al usuario seleccionar la moneda base y la moneda de destino para realizar la conversión de manera rápida y sencilla.</em></p>

![imagen 2](https://github.com/user-attachments/assets/29a3b5a1-1de5-494e-9f8a-533b8d5df408)

<h3><em>💲 Resultado de la conversión</em></h3> 
<p><em>Una vez seleccionada la moneda base y la moneda de destino, el programa solicitará al usuario que ingrese la cantidad a convertir. Luego, mostrará el valor equivalente en la divisa seleccionada, junto con la fecha de la última actualización del tipo de cambio, garantizando precisión en la conversión.</em></p>

![imagen 3](https://github.com/user-attachments/assets/a8d1631e-693a-4f42-913f-e7817e08750d)

<h3><em>🌍 Soporte para más monedas</em></h3> 
<p><em>Además de las monedas predeterminadas en el menú, el programa ofrece una opción adicional que permite al usuario ingresar el código de cualquier otra moneda para su consulta. Esto aplica tanto para la moneda base como para la moneda de destino, asegurando flexibilidad en las conversiones. Una vez ingresados los códigos, el programa mostrará el resultado correspondiente con la información actualizada.</em></p>

![imagen 4](https://github.com/user-attachments/assets/8fc6ced2-f2a5-4cc8-9722-554e9c10c8fb)

<h3><em>📜 Historial de conversiones</em></h3> 
<p><em>En esta segunda opción del menú principal, el usuario podrá acceder al historial de conversiones realizadas. Cada entrada en el historial incluirá la marca de tiempo y los detalles de la conversión, permitiendo un seguimiento preciso de las transacciones efectuadas.</em></p>

![imagen 5](https://github.com/user-attachments/assets/2fb8bb95-d69c-4b19-ac8e-4d8db210db2f)

<h3><em>📝 Creación automática de archivo</em></h3> 
<p><em>Al cerrar el programa, se generará automáticamente un archivo JSON que almacenará la información de todas las divisas ingresadas. Este archivo servirá como un historial detallado, incluyendo la moneda base, la moneda de destino, la cantidad convertida, el resultado de la conversión y la marca de tiempo de cada operación.</em></p>

![imagen 6](https://github.com/user-attachments/assets/28728f3c-17e7-4c7c-a8a3-565f9745e6ef)

<h2><em>🛠 Tecnologías utilizadas</em></h2>

<p><em>Este proyecto fue desarrollado utilizando las siguientes tecnologías:</em></p>




- ☕ **Java** – Lenguaje de programación principal para la lógica del conversor.  
- 🌐 **Exchange Rate API** – API utilizada para obtener tasas de cambio actualizadas.  
- 📂 **Gson** – Librería de Java utilizada para procesar y manipular archivos JSON.  
- 💻 **Entorno de ejecución** – El programa se ejecuta por consola en **IntelliJ IDEA**, pero también puede correr en otras terminales o IDEs compatibles con Java, como **Eclipse**, **NetBeans** o directamente en la terminal de comandos.  


<h2><em>Estructura del Proyecto</em></h2>

### Explicación de la estructura:
- **📂 `historial/`** → Maneja el almacenamiento y recuperación de conversiones anteriores.
- **🔢 `logica/`** → Contiene la lógica de negocio, como búsqueda de moneda y cálculo de conversiones.
- **📄 `modelo/`** → Define los modelos de datos, como `Moneda.java`, que es un **record** en Java.
- **🚀 `Principal.java`** → Clase principal encargada de iniciar el programa.
- **📜 `data/historial.json`** → Almacena el historial de conversiones en formato JSON.

<h2><em>⚙ Instalación del Proyecto</em></h2>

<p><em>Sigue estos pasos para clonar y ejecutar el proyecto en tu entorno de desarrollo:</em></p>

### 1️⃣ Clonar el repositorio  
Ejecuta el siguiente comando en tu terminal:  

```bash
git clone https://github.com/JhonatanO24/challenge-conversor-de-monedas.git

