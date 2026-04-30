# --- ETAPA 1: Compilación ---
# Usamos una imagen que ya tiene Maven y Java 17 instalados
FROM maven:3.8.5-openjdk-17 AS build

# Creamos una carpeta para trabajar
WORKDIR /app

# Copiamos todo tu proyecto dentro de esa carpeta
COPY . .

# Ejecutamos la compilación. 
# Si el proxy te bloquea aquí, Docker intentará usar la configuración de red del sistema.
RUN mvn clean package -DskipTests

# --- ETAPA 2: Ejecución ---
# Usamos una imagen mucho más ligera solo con Java para correr el programa
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Traemos el archivo .war que se fabricó en la Etapa 1
COPY --from=build /app/target/*.war app.war

EXPOSE 8080

# Arrancamos el microservicio
ENTRYPOINT ["java", "-jar", "app.war"]