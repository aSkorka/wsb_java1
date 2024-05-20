Laboratorium III - JPQL

Uwaga! Do wykonania zadan konieczne jest zaimplementowanie architektury warstwowej i testow z Laboratorium II !

Uzupelnij plik data.sql o dane niezbedne do realizacji nastepujacych zapytan:
1. Znajdz pacjentow po nazwisku
# SELECT *
# FROM PATIENT
# WHERE LAST_NAME='Kowalski';
2. Znajdz wszystkie wizyty pacjenta po jego ID
#SELECT * FROM VISIT WHERE patient_id = 2
3. znajdz pacjentow ktorzy mieli wiecej niz X wizyt (X jest parametrem wejsciowym)
   SELECT patient.ID,patient.FIRST_NAME,
   COUNT(visit.ID) AS VISITS_COUNTER
   FROM PATIENT
   LEFT JOIN
   VISIT on patient.id = visit.patient_ID
   GROUP BY
   patient.ID, patient.FIRST_NAME, patient.LAST_NAME, patient.PATIENT_NUMBER
   HAVING
   VISITS_COUNTER > 0;
4. Znajdz pacjentow po dodanym przez Ciebie polu - nie wyszukuj wprost po wartosci, uzyj zapytania typu wieksze/mniejsze/pozniej/wczesniej/zawiera, w zaleznosci od wybranego typu zmiennej.
   SELECT *
   FROM PATIENT
   WHERE IS_ADULT = TRUE
Napisz testy do zapytan w nastepujacej formie:
1. do zapytania nr 1  - test DAO
2. do zapytania nr 2 - test serwisu
3. do zapytania nr 3 - test DAO
4. do zapytania nr 4 - test DAO