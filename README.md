# Carrera de Caballos
Implementación de una carrera de caballos al estilo +ías ;)
 
> *Inspirado descaradamente en las enseñanzas del **Sensei Luis***

![](https://www.plantuml.com/plantuml/png/ROyn3iCW34LtJe4oLWfI6Jj5oWKov08aPMX5GcNC_GlOSQis3DWyFSndIEW0ynPKN9v-HTsj3i23qpSzKjTfbpHJiLwFXDMPIYMZaQyfYmiXNkiOQfjqu5_FddjMFComnoBDfPBIY597N0F641DqwNjELNSwIu0_P5LPu-SgVKrDud4-TlZ5cL8CVh_dBRm1)
```
@startuml

    object "carrera : Carrera" as carrera
    object "pista : Pista" as pista
    object "caballo1 : Caballo" as caballo1
    object "caballo2 : Caballo" as caballo2
    object "turno : Turno" as turno

    carrera .r.. turno
    carrera *-- pista
    pista *-- caballo1
    pista *-- caballo2

    Carrera *-- Pista
    Pista *-- Caballo
    Carrera .r.. Turno

@enduml
```