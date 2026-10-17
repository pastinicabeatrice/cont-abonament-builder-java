# Cont abonament - Builder și Prototype

Două exemple de design patterns creaționale.

## Builder - cont premium pe o platformă de e-learning

Contul are obligatoriu un tip de abonament (`Standard`, `Pro`, `Expert`) și o durată de valabilitate.
Beneficiile extra (mentorat 1:1, acces offline, testare certificată) sunt opționale, iar `ContBuilder`
validează regulile, de exemplu mentoratul 1:1 cere minimum 3 luni de abonament Pro sau Expert.
Enunțul complet este în `src/builder/demo`.

## Prototype - librărie

`BookShop` încarcă o listă de cărți și este clonat în loc să fie reîncărcat de fiecare dată.
Exemplul de utilizare este în `src/prototype/usage`.

## Rulare

Se deschide folderul în IntelliJ IDEA și se rulează `builder.Program` sau `prototype.Demo`.
