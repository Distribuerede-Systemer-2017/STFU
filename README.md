# STFU
Café Nexus - Gruppe STFU :+1: 

[Her](https://docs.google.com/document/d/1_j1ZEVx0nU_N87oObxM9vNFDwwM2IIOCrq8Y3ME7hMY/edit?usp=sharing) er vores google docs med mere information.

 To-do list:
- [x] Færdiggør Kravspec
- [ ] Lav Datamodeller -- [Link](INDSÆT LINK HER) 
- [ ] Lav sekvens diagrammer -- [Link](INDSÆT LINK HER) 
- [ ] Lav klasse diagram -- [Link](INDSÆT LINK HER) 
- [x] Opret GitHub repo, samt team -- [Team](https://github.com/orgs/Distribuerede-Systemer-2017/teams/gruppe-stfu/members) 
- [ ] Opret CONTRIBUTING file -- [Guide](https://github.com/blog/1184-contributing-guidelines) + [Eksempel1](https://github.com/WoWAnalyzer/WoWAnalyzer/blob/master/CONTRIBUTING.md)

- [Syntax-guide](https://help.github.com/articles/basic-writing-and-formatting-syntax)


## Kravspecifikation:

### Server:
- S1: Server skal kunne validere login på et hashet password.
- S2: Serveren skal kunne oprette, slette og opdatere en bruger.
- S3: Serveren skal udstille et API (Softwaregrænseflade), som gør det nemt at udarbejde klienter, der kan trække på serverens funktionalitet. API’et skal dække over følgende funktionaliteter:
   - En gæst skal kunne oprette oprette sig som bruger.
   - En bruger skal kunne logge ind/ud.
   - En bruger skal kunne slette sin egen konto.
   - En bruger skal kunne opdatere egne brugeroplysninger.
   - En bruger skal kunne oprette events.
   - En bruger skal kunne opdatere egne events, og deres beskrivelser. 
   - En bruger skal kunne slette egne events. 
   - En admin skal kunne opdatere events og deres beskrivelser.
   - En bruger skal kunne se en oversigt over alle events.
   - En bruger skal kunne se en deltagerliste på det valgte event.
   - En admin skal kunne se en oversigt over alle brugere. 
   - En admin skal kunne slette et valgfrit event.
   - En admin skal kunne slette en valgfri bruger. 
   - En admin skal kunne omdanne en valgfri bruger til admin.
- S4: Serveren skal udstille et interface, som lister alle events i systemet. 
- S5: Serveren skal udstille et interface, som gør det muligt at oprette et nyt event.
- S6: Serveren skal udstille et interface, som gør det muligt at ændre et nyt event.

### Klient:
- K1: Klienten skal udstille et login-vindue for brugeren, samt give brugeren mulighed for at logge ud igen. 
- K2: Klienten skal kunne oprette/slette en bruger
- K3: Klienten skal kunne opdatere brugeroplysninger for den bruger, som er logget ind. 
- K4: Klienten skal kunne hente aktuelle eller nært-foreliggende arrangementer
- K5: Klienten skal ud fra brugertype kunne vise forskellige menuer for admin og bruger. 
