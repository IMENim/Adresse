#language:fr
@adresse
Fonctionnalité: Modifier de l'adresse dun abonne
@modification
Scenario Outline: Modification de l'adresse d'un abonne residant en France sans ou avec date d'effet
Etant donné que un abonné avec une adresse principale "EtatAdresse" en France
Lorsque le conseiller connecté à "canal" modifie l'adresse de l'abonné
Alors l'adresse de l'abonné modifiée est enregistrée sur l'ensemble des contrats de l'abonné
Et un mouvement de modification d'adresse est crée

Examples:
| EtatAdresse | canal |
| active | canal1 |
| inactive | canal2 |


