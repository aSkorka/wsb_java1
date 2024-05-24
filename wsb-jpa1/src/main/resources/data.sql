insert into address (id, address_line1, address_line2, city, postal_code)
            values (5, 'Wroclawska', '100', 'Wroclaw', '10-100');
insert into patient (id, is_Adult, first_Name, last_Name, telephone_Number, email, patient_Number, date_Of_Birth)
            values (1, TRUE, 'Adam', 'Kowalski', '123456789', 'przyklad@gmail.com', '1', '2000-01-01'),
            (2, FALSE, 'Julia', 'Skorka', '122345678', 'przyklad2@gmail.com', '2', '2001-02-02');
insert into doctor (id, first_Name, last_Name, telephone_Number, email, doctor_Number, specialization)
            values (1, 'Jakub', 'Lekarski', '123456789', 'lekarz@gmail.com', '1', 'dupa'),
            (2, 'Pawel', 'Doktorski', '121456789', 'doktorski@gmail.com', '2', 'dupa');
insert into visit (id, description, time, doctor_id, patient_id)
             values (1, 'Pacjent z chorobą gardła', '2024-01-02', 1, 1 ),
            (2, 'Pacjent z chorobą ucha', '2023-02-02',2 ,2);
insert into address values (1,'jakakolwiek','psie pole', 'Wroclaw', '50-500',1,1);
insert into address values (2,'cokolwiek','trojkat', 'Wroclaw', '40-400',2,2);