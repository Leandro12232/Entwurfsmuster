# Observer Pattern – Übersicht

## Grundprinzip

Das **Observer-Pattern** (Beobachter-Muster) ist ein Verhaltensmuster aus der Softwareentwicklung.  
Es beschreibt eine **1:n-Beziehung** zwischen Objekten:

- Ein Objekt ist das **Subjekt** (Observable).
- Mehrere Objekte sind **Beobachter** (Observer).

Wenn sich der Zustand des Subjekts ändert, werden **alle registrierten Beobachter automatisch benachrichtigt** und aktualisiert.

Das Subjekt kennt nur die Schnittstelle der Beobachter, nicht deren konkrete Implementierung. Dadurch entsteht eine **lose Kopplung** zwischen den Beteiligten.

Typischer Ablauf:
1. Observer registrieren sich beim Subjekt
2. Der Zustand des Subjekts ändert sich
3. Das Subjekt benachrichtigt alle Observer
4. Jeder Observer reagiert individuell auf die Änderung

---

## Vorteile

✅ **Lose Kopplung**  
Subjekt und Observer sind nur über Interfaces verbunden.

✅ **Hohe Erweiterbarkeit**  
Neue Observer können einfach hinzugefügt werden, ohne bestehende Klassen zu ändern.

✅ **Automatische Aktualisierung**  
Alle abhängigen Objekte bleiben immer synchron mit dem Subjekt.

✅ **Gute Wiederverwendbarkeit**  
Observer können in anderen Kontexten wiederverwendet werden.

---

## Nachteile

❌ **Unkontrollierte Benachrichtigungen**  
Viele Observer können zu unerwarteten Reihenfolgen oder Nebenwirkungen führen.

❌ **Leistungsprobleme**  
Bei vielen Observern können häufige Updates die Performance beeinträchtigen.

❌ **Schwerere Fehlersuche**  
Da viele Objekte automatisch reagieren, kann Debugging komplex werden.

❌ **Mögliche Speicherlecks**  
Wenn Observer nicht korrekt abgemeldet werden, bleiben sie unnötig im Speicher.

---

