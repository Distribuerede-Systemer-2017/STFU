# STFU
Café Nexus - Gruppe STFU :+1: 

[Her](https://docs.google.com/document/d/1_j1ZEVx0nU_N87oObxM9vNFDwwM2IIOCrq8Y3ME7hMY/edit?usp=sharing) er vores google docs med mere information, bl.a. usecase mv

- [GitHub Syntax-guide](https://help.github.com/articles/basic-writing-and-formatting-syntax)

- Fremtidig to-do forefindes i vores [issues](https://github.com/Distribuerede-Systemer-2017/STFU/issues)/[projects](https://github.com/Distribuerede-Systemer-2017/STFU/projects)

## Kravspecifikation:

### Server:
- S1: Server skal kunne validere login på et hashet password.
- S2: Serveren skal udstille et API (Softwaregrænseflade), som gør det nemt at udarbejde klienter, der kan trække på serverens funktionalitet. API’et skal dække over følgende funktionaliteter:
   - En gæst skal kunne oprette oprette sig som bruger.
   - En bruger skal kunne logge ind/ud.
   - En bruger skal kunne oprette events.
   - En bruger skal kunne opdatere egne events, og deres beskrivelser. 
   - En bruger skal kunne slette egne events. 
   - En admin skal kunne opdatere events og deres beskrivelser.
   - En bruger skal kunne se en oversigt over alle events.
   - En bruger skal kunne se en deltagerliste på det valgte event.
   - En admin skal kunne se en oversigt over alle brugere. 
   - En admin skal kunne slette et valgfrit event.
   - En admin skal kunne slette en valgfri bruger. 
   - En admin skal kunne omdanne en valgfri bruger til admin. (OBS: En admin er bare en bruger med ekstra/forhøjet rettigheder)
- S4: Serveren skal udstille et interface, som lister alle events i systemet. 
- S5: Serveren skal udstille et interface, som gør det muligt at oprette et nyt event.
- S6: Serveren skal udstille et interface, som gør det muligt at ændre et nyt event.

### Klient:
- K1: Klienten skal kunne oprette en bruger.
- K2: Klienten skal udstille et login for brugeren, samt give brugeren mulighed for at logge ud igen. 
- K3: Klienten skal kunne oprette events for den bruger, som er logget ind. 
- K4: Klienten skal kunne opdatere events for den bruger, som er logget ind. 
- K5: Klienten skal kunne hente en oversigt over alle events.
- K6: Klienten skal kunne hente en oversigt over alle brugere til visning for admins.
- K7: Klienten skal give admins mulighed for at slette events.
- K8: Klienten skal give admins mulighed for at slette en bruger. 
- K9: Klienten skal give admins mulighed for at give brugere administrator rettigheder. 
- K9: Klienten skal ud fra brugertype kunne vise forskellige menuer for admin og bruger. 


##### Gammelt:
 To-do list:
- [x] Færdiggør Kravspec
- [x] Opret GitHub repo, samt team -- [Team](https://github.com/orgs/Distribuerede-Systemer-2017/teams/gruppe-stfu/members) 
- [x] Opret CONTRIBUTING file -- [Guide](https://github.com/blog/1184-contributing-guidelines) -- [Link](https://github.com/Distribuerede-Systemer-2017/STFU/edit/master/CONTRIBUTING.md)

