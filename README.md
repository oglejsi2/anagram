# anagram

REST spletna storitev (web service), ki detektira ali sta dva niza anagram ali ne. Vhodni podatki naj bodo v JSON obliki kot je prikazano spodaj.
 
Input:
{
            "source": "VASE",
            "target": "SAVE"
}
 
Output:
{
            "source": "VASE",
            "target": "SAVE",
            "isAnagram": true|false
}
 
Uporabite Spring Boot (https://projects.spring.io/spring-boot/, http://start.spring.io/) + Maven. Oddate lahko samo jar datoteko in nakaj testnih requestov in responsov (priporočam uporabo orodja Postman - www.getpostman.com). “Projekt” oddajte tako, kot bi si ga vi želeli prevzeti v nadaljne vzdrževanje.

Poleg kode sem dodal še

* anagram-0.0.1-SNAPSHOT.jar je datoteka datoteka s programom

***

* anagram.zip datoeka kreirana z  http://start.spring.io/

***

* anagramtest.postman_collection.json testni primeri kreirani s postman-om

***
Testni primer 
java -jar anagram-0.0.1-SNAPSHOT.jar

Testna primera:
http://localhost:8080/anagram?source=jaz&target=zaj
{"source":"jaz","target":"zaj","isAnagram":true}

http://localhost:8080/anagram?source=jaz&target=za
{"source":"jaz","target":"za","isAnagram":false}

http://localhost:8080/anagram?source=jaz&target=zad
{"source":"jaz","target":"zad","isAnagram":false}

