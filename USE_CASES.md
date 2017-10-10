
# Use Cases

## Use case diagram
|             | Use case:     | Bruger | Admin only | Gæst | 
|-------------|---------------|--------|------------|------|
| Use case 1: | Opret bruger: |   x    |     x      |   x  |
| Use case 2: | Login: |   x    |           |     |
| Use case 3: | Slet en specifik bruger: |       |     x      |     |
| Use case 4: | Oprette events: |   x    |           |     |
| Use case 5: | Opdatere egne events: |   x    |          |     |
| Use case 6: | Se liste med events: |   x    |           |     |
| Use case 7: | Se deltagerliste på valgte events: |   x    |           |     |
| Use case 8: | Se liste med alle brugere: |       |     x      |     |
| Use case 9: | Slette egne events: |   x    |           |     |
| Use case 10: | Slette valgfrit event: |       |     x      |     |
| Use case 11: | Log ud: |   x    |           |     |

## Use cases med beskrivelser

- **Use case 1 - Opret bruger:**
	- **Beskrivelse:** Gæsten kan oprette en ny bruger med følgende oplysninger: fornavn, efternavn, e-mail, kodeord, køn og alder. 
	- **Uddybende beskrivelse:**
		1. Applikationen starter op, og gæsten får vist en brugerflade, hvor der er mulighed for at logge ind, oprette en ny bruger eller se events.
		2. Gæsten vælger at oprette en ny bruger og bliver ført videre til en ny brugerflade.
		3. Gæsten indtaster de påkrævede informationer og bliver herefter oprettet i systemet.
		4. Gæsten bliver ført tilbage til startsiden, og har nu mulighed for at logge ind. (Skal brugeren verificeres?) 
	- **Supplerende oplysninger:**

- **Use case 2 - Login:**
	- **Beskrivelse:** Brugeren skal kunne logge ind efter at have oprettet sig i systemet.
	- **Forudsætninger:** For at kunne logge ind skal man være oprettet som bruger. Derudover skal indtastede username og password stemme overens.
	- **Uddybende beskrivelse:**
		1. Systemet viser startsiden, hvor bruger kan indtaste brugernavn og password
		2. Hvis brugernavn og password matcher en eksisterende konto, er det muligt at logge ind som administrator eller alm. bruger
		3. Hvis der er tale om en administrator, vil et administratorView forekomme. 
		4. Hvis der er tale om en almindelig bruger, vil systemet frembring et brugerView
	- **Supplerende oplysninger:** Unikt brugernavn og password

- **Use case 3 - Slet en specifik bruger:** 
	- **Beskrivelse:** Admin skal kunne slette en specifik bruger. (Gerne med “Er Du Sikker?” Window alert)
	- **Forudsætninger:** 
	- **Uddybende beskrivelse:** 
		- 1. Administrator logger ind 
		- 2. Administrator vælger “Se brugere”
		- 3. Administrator trykker “rediger” på den pågældende bruger, som admin ønsker slettet
		- 4. Administrator trykker på slet bruger  
		- 5. Administrator møder en window-alert, hvor han bekræfter handlingen
		- 6. Administrator føres tilbage til oversigten over brugere 
	- **Supplerende oplysninger:**

Use case 4: Oprette events:
Beskrivelse: Brugeren skal kunne oprette egne events.

Uddybende beskrivelse:
En bruger skal kunne oprette et event med navn, billede, pris og beskrivelse.

Supplerende oplysninger:
Når eventet er/er ikke oprettet skal ejeren få en be-/afkræftigelsesbesked på skærmen.
Andre brugere skal kunne tilmelde sig et arrangement.
Det skal være muligt at vælge at have et maksimum på antal tilmeldte.
Prisen skal kun være oplysende, og skal kunne betales via eksempelvis mobilepay. 

Use case 5: Opdatere egne events:
Beskrivelse: Brugeren skal kunne opdatere sine egne events 

Uddybende beskrivelse:
Etter at en bruker er logget inn skal den kunne endre informasjonen på events den inloggede bruker tidligere har oprettet

Supplerende oplysninger:
Det er kun mulig å oppdatere et event av gangen
Når oppdateringen er gjort skal brukeren få en beskjed om at informasjonen ble endret
Hvis oppdateringen ikke var vellykket skal bruker få informasjon om det
Gjesten blir ført tilbake til oversikten over events

Use case 6: Se liste med events:
Beskrivelse: Aktøren har mulighed for, at se en liste over de mulige events.

Forudsætning: Man skal være logget ind.

Uddybende beskrivelse:
Systemet viser et administrator- eller brugerView
Aktøren har her mulighed for at se en liste over alle events.

Supplerende oplysninger:
I tilfælde af, at der er tale om en administrator, vil der forekomme yderligere funktioner.
Et event vil kun forekomme på denne liste, såfremt det er oprettet. 

Use case 7: Se deltagerliste på valgt event:
Beskrivelse: Brugeren skal kunne få en liste vist over alle deltagende på et valgt event. 

Uddybende beskrivelse:
En bruger logger ind (med eller uden administratorrettigheder)
Brugeren får et view af alle events (som feed?)
Brugeren kan trykke på knappen “Hvis deltagere” for et af de events som feeden viser.
Brugeren får vist en liste, over alle deltagere på eventet.

Supplerende oplysninger:
Kræver et login som bruger / admin.


Use case 8: Se liste med alle brugere (admin):
Beskrivelse: En administrator skal kunne se en liste med alle brugere der er registreret i systemet.
Forudsætninger: For at kunne se en liste med alle brugere, kræver det at man er logget ind i system som en bruger med forhøjet rettigheder (også kendt som en administrator eller administratorrettigheder) 
Uddybende beskrivelse:
En bruger med administratorrettigheder logger ind 
Derefter vælges “se brugere” 
En liste med alle brugere vises. 

Supplerende oplysninger:



Use case 9: Slette egne events:

Forudsætninger: Aktøren skal være logget ind

Kort beskrivelse: En bruger skal have mulighed for at slette egne events. 

Uddybende beskrivelse:
Brugeren vælger “Mine events”.
Applikationen viser brugerens oprettede events. 
Brugeren trykker “rediger” på det pågældende event, som brugeren  ønsker at slette.
Brugeren trykker på slet event.   
Brugeren føres tilbage til oversigten over events. 

Supplerende oplysninger:
For at slette et event, skal det være oprettet forinden. 

Use case 10: Slette valgfrit event:
Beskrivelse: Administratoren har mulighed for at slette hvilket som helst event, såfremt eventet ikke efterlever kravene

Forudsætninger: Man skal være logget ind som administratoren

Uddybende beskrivelse:
Systemet viser administratorView
Administratoren vælger listen over alle events
Systemet viser listen over alle events
Administratoren vælger den ønskede event, der skal slettet
Systemet fremprovokerer en meddelelse om, at det ønskede event er slettet.

Supplerende oplysninger:
Det er kun muligt, at slette events, der findes på listen over alle events.

Use Case 11: Log ud
Beskrivelse: 

Forudsætninger: 

Uddybende beskrivelse:

Supplerende oplysninger:



