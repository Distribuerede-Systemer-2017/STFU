## Kravspecifikation:

### Server:
- S1: Server skal kunne validere login på et hashet password.
- S2: Serveren skal udstille et API (Softwaregrænseflade), som gør det nemt at udarbejde klienter, der kan trække på serverens funktionalitet. API’et skal dække over følgende funktionaliteter:
   - En gæst skal kunne oprette oprette sig som bruger.
   - En bruger skal kunne logge ind/ud.
   - En bruger skal kunne oprette events.
   - En bruger skal kunne opdatere egne events, og deres beskrivelser. 
   - En bruger skal kunne slette egne events. 
   - En bruger skal kunne se en oversigt over alle events.
   - En bruger skal kunne se en deltagerliste på det valgte event.
- S4: Serveren skal udstille et interface, som lister alle events i systemet. 
- S5: Serveren skal udstille et interface, som gør det muligt at oprette et nyt event.
- S6: Serveren skal udstille et interface, som gør det muligt at ændre et nyt event.

### Klient:
- K1: Klienten skal kunne oprette en bruger.
- K2: Klienten skal udstille et login for brugeren, samt give brugeren mulighed for at logge ud igen. 
- K3: Klienten skal kunne oprette events for den bruger, som er logget ind. 
- K4: Klienten skal kunne opdatere events for den bruger, som er logget ind. 
- K5: Klienten skal kunne hente en oversigt over alle events.
- K6: Klienten skal ud fra brugertype kunne vise forskellige menuer for admin og bruger. 
