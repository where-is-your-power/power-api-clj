(ns power-api-clojure.smallfacts)

(def facts [
            "Per 1 april 2014 waren bijna 2,5 miljoen woningen voorzien van een energielabel. Circa 20% van de woningen heeft een groen label (A, A+en A++, B). De meerderheid van de woningen heeft energielabel C (30%) of D (25%)."

            "Na de invoering van het Europees energie-etiketteringssysteem in 1996 zijn de marktaandelen van producten die voorzien zijn van energielabel A sterk gestegen, ten koste van de relatief energie-onzuinige apparaten (klasse C en hoger). Bij de meeste apparatuur had enkele jaren later het A-segment een dominante positie op de markt bereikt. Sinds 2001 zijn de aanvullende categorieën A+, A++ en A+++ geïntroduceerd. De aandelen hiervan zijn anno 2013 aanzienlijk. Bij koel- en vriesapparatuur maken deze categorieën samen al 95% van de verkopen uit. Hierin is categorie A+ met 70% het belangrijkst. Bij wasmachines is het aandeel A+ 25%, A++ 25% en A+++ 44%. Bij vaatwassers is het aandeel A+ 39%, A++ 24% en A+++ 4%. Uitzondering op dit verloop zijn de wasdrogers. Bij de wasdrogers werd het A-segment gevormd door de relatief dure warmtepompdrogers. De afgelopen jaren zijn deze relatief goedkoper geworden, (en de stroom steeds duurder) waardoor het aandeel A label en beter nu 29% bedraagt. Het aandeel hierin van A+ is 20%, en van A++ 4%."

        "Voor lichtbronnen geldt sinds 1998 eveneens een etiketteringsplicht. Uit bovenstaande figuur blijkt dat bij de huishoudens het aandeel van de onzuinige gloeilampen en halogeenlampen (C- t/m G-labels) nog steeds hoog is. De energiezuinige LED-, TL- en spaarlampen (A- en B-labels) maken samen 41% uit. Wel is binnen de onzuinige typen een verschuiving richting halogeen opgetreden, en binnen de zuinige typen een verschuiving richting spaarlampen en LED verlichting. Was het aandeel LED in 2009 nog verwaarloosbaar, in 2011 had een gemiddeld huishouden al 5 LED lampen in huis, op een totaal van 44 lampen.",
        "Het huishoudelijk energieverbruik per inwoner is de laatste jaren stabiel. Het verbruik betreft vooral aardgas en elektriciteit. Het verbruik van aardgas per inwoner is sinds 1980 door energiebesparende maatregelen met bijna 30 procent gedaald."

        "Het huishoudelijk elektriciteitsverbruik per inwoner, omgerekend naar de hoeveelheid fossiele brandstoffen nodig voor de elektriciteitsopwekking, is in 2013 bijna vier keer zo hoog als in 1950. Vooral in de jaren zestig en zeventig van de vorige eeuw nam het verbruik flink toe. Het elektriciteitsverbruik in de jaren tachtig is stabiel, in de jaren negentig groeide het verbruik en sinds 2005 is het stabiel. In Nederland wordt vooral elektriciteit geproduceerd met behulp van de primaire brandstoffen aardgas en steenkool."

        "Het aardgasverbruik per inwoner (gecorrigeerd voor de gemiddelde jaartemperatuur) is tussen 1965 en 1975 zeer sterk gestegen. Vanaf begin jaren tachtig treedt een daling op door energiebesparende maatregelen, zoals isolatie en de installatie van HR-ketels. In 2013 is het aardgasverbruik per inwoner bijna 30 procent lager dan in 1980."

        "Het verbruik van hernieuwbare elektriciteit daalde in 2013 met 5 procent. Dit kwam doordat er minder biomassa werd meegestookt in elektriciteitscentrales. Het verbruik van windenergie nam juist toe door het bijplaatsen van nieuwe windmolens. Deze toename was echter niet genoeg om de daling van het meestoken te compenseren."

        "Het belang van hernieuwbare energie is in 2013 niet toegenomen. In 2013 maakte hernieuwbare energie 4,5 procent van het totale Nederlandse energieverbruik uit. Dat is evenveel als in 2012. Volgens Europese afspraken moet het Nederlandse aandeel hernieuwbare energie in 2020 naar 14 procent."
 ])

(defn random-fact
  []
  (rand-nth facts))
