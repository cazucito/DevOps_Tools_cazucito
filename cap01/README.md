# Práctica 1. Introducción a DevOps / Estrategia de las actividades 

## Objetivos de la práctica:

Al termino de este capítulo, serás capaz de:

- Conocer la estrategia de desarrollo de los diversos tipos de actividades del curso.
- Conocer el entorno para la ejecución de los laboratorios.

## Duración aproximada:
- 25 minutos.

## Prerrequisitos
Para esta actividad se requiere:

- Acceso a Internet.

## Instrucciones

### Tipos de actividades
En el curso, existirán diferentes tipos de actividades prácticas:

1. Preguntas.
2. Instalación de software.
3. Análisis de código (Java).
4. Ejecución/Despliegue de aplicaciones.
5. Uso de herramientas de CI/CD.
6. Uso de máquinas virtuales & contenedores.

### Entorno de trabajo

Con la información provista por tu instructor, realiza las siguientes actividades.

#### Conexión al escritorio remoto

En esta actividad, se realizará la conexión al escritorio remoto de la
máquina virtual.

1. Abrir la aplicación **Escritorio Remoto**.
2. Ingresar la dirección IP de la máquina virtual.
3. Ingresar el usuario y contraseña proporcionados por tu instructor.
4. Hacer clic en **Conectar**.

![Remote Desktop Connection](mm/01-01_RDP.png)

#### Acceso a los equipos de trabajo

En una terminal de comandos, ingresar el siguiente comando:

``` shell
ssh -p 22 netec@10.1.0.1
```

Nota importante:

Recuerda que los datos de conexión serán diferentes para cada participante y cada equipo.

``` shell
Windows PowerShell
Copyright (C) Microsoft Corporation. Todos los derechos reservados.

Probar la nueva tecnología PowerShell multiplataforma https://aka.ms/pscore6

PS C:\Users\Netec> ssh -p 22 netec@10.1.0.1
netec@10.1.0.1's password:
Welcome to Ubuntu 24.04.1 LTS (GNU/Linux 6.8.0-49-generic x86_64)

 * Documentation:  https://help.ubuntu.com
 * Management:     https://landscape.canonical.com
 * Support:        https://ubuntu.com/pro

 System information as of Thu Nov 28 05:55:36 PM UTC 2024

  System load:  0.0                Processes:              177
  Usage of /:   41.7% of 10.70GB   Users logged in:        0
  Memory usage: 9%                 IPv4 address for ens33: 10.1.0.1
  Swap usage:   0%

Expanded Security Maintenance for Applications is not enabled.

58 updates can be applied immediately.
To see these additional updates run: apt list --upgradable

Enable ESM Apps to receive additional future security updates.
See https://ubuntu.com/esm or run: sudo pro status


Last login: Wed Nov 27 23:31:08 2024 from 10.1.0.1
netec@devopsX:~$
```

Cada que se requiera el acceso a los equipos de trabajo, se deberá realizar el paso anterior.

#### Nodos

Aunque la configuración puede variar, a continuación se indican los componentes y en que nodo se instalan.

| HERRAMIENTA        |   NODO 01   |   NODO 02   |   NODO 03   |
|--------------------|:-----------:|:-----------:|:-----------:|
| Git                |     [X]     |     [X]     |     [X]     |
| Java               |     [X]     |     [X]     |     [X]     |
| Maven              |     [X]     |     [X]     |     [X]     |
| Ansible            |     [X]     |     [ ]     |     [ ]     |
| Jenkins            |     [X]     |     [ ]     |     [ ]     |
| Docker             |     [X]     |     [ ]     |     [ ]     |
| Minikube           |     [X]     |     [ ]     |     [ ]     |
| PostgreSQL         |     [ ]     |     [X]     |     [ ]     |
| SonarQube          |     [ ]     |     [X]     |     [ ]     |
| JFrog Artifactory  |     [ ]     |     [ ]     |     [X]     |


### Resultado

En esta actividad se exploró el entorno para la ejecución de los laboratorios.

![Resultado esperado](mm/01-02_LabsMachines.png)
