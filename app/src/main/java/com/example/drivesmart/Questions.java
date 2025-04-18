package com.example.drivesmart;

public class Questions {

    private String Questions1[] = {
            "Этот дорожный знак обозначает : ",
            "Этот дорожный знак обозначает : ",
            "Этот дорожный знак обозначает : ",
            "Этот дорожный знак обозначает : ",
            "Этот дорожный знак обозначает : ",
            "Этот дорожный знак обозначает : ",
            "Этот дорожный знак обозначает : ",
            "Этот дорожный знак обозначает : ",
            "Этот дорожный знак обозначает : ",
            "Этот дорожный знак обозначает : "
    };
    private String Questions2[] = {
            "Этот дорожный знак обозначает : ",
            "Этот дорожный знак: ",
            "Этот дорожный знак: ",
            "Можно ли водителю автобуса обгонять в зоне действия этого знака? ",
            "Этот дорожный знак обозначает : ",
            "Можно ли останавливаться на полосе, обозначенной данным знаком, для посадки пассажиров?",
            "Этот дорожный знак обозначает : ",
            "Этот дорожный знак предупреждает, что впереди: ",
            "Какие транспортные средства имеют разрешение на движение по дороге, где установлен данный знак?",
            "Этот дорожный знак обозначает : "
    };
    private String Questions3[] = {
            "Этот знак называется: ",
            "Этот дорожный знак обозначает : ",
            "Что указывает табличка под знаком? ",
            "О чем предупреждает знак и табличка под ним: ",
            "Эти знаки обозначают: ",
            "В каком направлении водителю разрешено движение? ",
            "Что показывают данные дорожные знаки? ",
            "Что показывают данные дорожные знаки? ",
            "В каком направлении разрешено движение легкового автомобиля? ",
            "Что означает табличка под знаком: "
    };
    private String Questions4[] = {
            "Что означают эти знаки? ",
            "Что показывают данные дорожные знаки? ",
            "Что показывают данные дорожные знаки? ",
            "Что показывают данные дорожные знаки? ",
            "На каком расстоянии до неровного участка дороги устанавливается этот знак вне населённого пункта? ",
            "Что показывают данные дорожные знаки? ",
            "Что показывают данные дорожные знаки? ",
            "Что показывают данные дорожные знаки? ",
            "Имеет ли водитель право совершить разворот на расстоянии 200м ?",
            "Эти знаки предупреждают Вас: "
    };
    private String Choice1[][] = {
            {"Поворот налево запрещен","Движение направо","Опасный поворот направо"},
            {"Ограничение максимальной скорости","Ограничение минимальной скорости","Ограничение минимальной дистанции"},
            {"Движение без остановки запрещено","Движение запрещено","Разворот запрещен"},
            {"Конец главной дороги","Уступите дорогу","Главная дорога"},
            {"Пешеходный переход","Приближение к пешеходному переходу","Пешеходная зона"},
            {"Светофор","Пересечение равнозначных дорог","Светофорное регулирование"},
            {"Конец зоны всех ограничений","Уступите дорогу","Въезд запрещен"},
            {"Разворот запрещен","Поворот налево запрещен","Поворот направо запрещен"},
            {"Место стоянки","Тупик","Место стоянки легковых такси"},
            {"Строительные Работы","Дорожные работы","Прочие опасности"}
    };
    private String Choice2[][] = {
            {"Движение запрещено","Остановка запрещена","Стоянка запрещена"},
            {"Запрещает движение всех механических тс., за исключением двухколесных мототциклов без коляски.","Запрещает движение всех механических тс., за исключением колесных тракторов.","Запрещается движение тракторов и самоходных машин."},
            {"Разрешает движение только с указанной или большей скоростью. ","Запрещает движение с большей скоростью,чем указано на знаке.","Указывает скорость, с которой рекомендуется движение на данном участке дороги."},
            {"Можно при условии, если обгоняемое транспортное средство движется со скоростью менее 30 км/ч.","Нельзя.","Можно во всех случаях с соблюдением правил обгона."},
            {"Дорога с односторонним движением, на которой разрешено движение только грузовых автомобилей.","Рекомендуемое направление движения для грузовых автомобилей.","Полосу, предназначенную для движения только грузовых автомобилей."},
            {"Разрешается, если полоса расположена у правого края проезжей части, и если она не отделена от остальной проезжей части сплошной линией разметки.","Запрещается.","Разрешается."},
            {"Конец дополнительной полосы на подъеме или полосы разгона.","Дорога, не имеющую сквозного проезда.","Направление движения к объекту в населенном пункте."},
            {"Место, где дорога выходит на набережную или берег.","Участок дороги с водной преградой, на котором имеется разводной мост.","Участок дороги с водной преградой, не имеющий моста или паромной переправы."},
            {"Механическим транспортным средствам.","Всем транспортным средствам.","Автомобилям и мотоциклам."},
            {"Пересечение равнозначных дорог","Пересечение с круговым движением","Светофорное регулирование"}
    };
    private String Choice3[][] = {
            {"Предварительный указатель объезда препятствий.","Предварительный указатель перестроения на другую проезжую часть.","Предварительный указатель выезда на полосу встречного движения."},
            {"Участок дороги, на котором имеется тротуар или пешеходная дорожка.","Участок дороги, на котором имеется пешеходный переход.","Участок дороги, не имеющий тротуара или пешеходной дорожки."},
            {"Расстояние до объезда узкого участка дороги.","Протяженность узкого участка дороги.","Расстояние от знака до места ограничения."},
            {"Съезд на обочину опасен в связи проведением на ней ремонтных работ.","Остановка на обочине запрещена в связи работами.","Стоянка на обочине запрещена в связи с ремонтными работами на дороге."},
            {"Место стоянки через 30 м для автомобилей с опознавательным знаком «Инвалид».","Место стоянки в зоне 30 м для транспортных средств, кроме мотоколясок","Место стоянки в зоне 30 м для мотоколясок и автомобилей с опознавательным знаком «Инвалид»."},
            {"Только прямо.","Прямо и в обратном направлении.","Только направо и налево."},
            {"Остановка запрещена по субботам.","Остановка запрещена по воскресеньям.","Остановка запрещена по субботам, воскресеньям и по праздничным дням."},
            {"Остановка запрещается по воскресеньям.","Остановка запрещается по рабочим дням.","Остановка запрещена по субботам, воскресеньям и по праздничным дням."},
            {"В любом направлении.","Налево и в обратном направлении.","Прямо, налево и в обратном направлении."},
            {"Протяженнось участка дороги с опасными поворотами.","Расстояние от знака до начала первого поворота.","Расстояние от первого поворота до начала второго поворота."}
    };

    private String Choice4[][] = {
            {"Движение мотоциклов направо запрещено.","Движение мотоциклов налево запрещено."},
            {"Главная дорога продолжается прямо через перекресток и налево.","Главная дорога продолжается от перекрестка налево."},
            {"В зоне действия таблички водители должны передвигаться с большей скоростью, чем указано на знаке.","В зоне действия таблички водителям рекомендуется передвигаться co скоростью указанной знаком."},
            {"Через 150-300 м после знака начинается сужение дороги с правой стороны протяженностью 100 м.","Через 100 м после знака начинается сужение дороги с правой стороны."},
            {"150-300 м","50-100 м"},
            {"Съезжать на обочину опасно в связи с ремонтными работами.","На дороге ведутся ремонтные работы."},
            {"Водители должны передвигаться со скоростью 40км/ч при гололедице.","Водители должны передвигаться со скоростью не более 40км/ч ри мокром покрытии дороги."},
            {"При мокром покрытии дороги рекомендуется движение со скоростью 40 КМ/Ч.","При мокром покрытии дороги разрешается движение со скоростью не более 40 KМ/Ч."},
            {"Имеет право.","Не имеет право."},
            {"О наличии через 150-300 м железнодорожного переезда без шлагбаума.","О наличии через 50-100 м железнодорожного переезда."}
    };


    private String CoorectAnswers1 [] = {
            "Движение направо",
            "Ограничение максимальной скорости",
            "Движение без остановки запрещено",
            "Главная дорога",
            "Пешеходный переход",
            "Светофорное регулирование",
            "Уступите дорогу",
            "Поворот налево запрещен",
            "Место стоянки",
            "Дорожные работы"
    };

    private String CoorectAnswers2[] = {
            "Остановка запрещена",
            "Запрещается движение тракторов и самоходных машин.",
            "Разрешает движение только с указанной или большей скоростью. ",
            "Можно во всех случаях с соблюдением правил обгона.",
            "Рекомендуемое направление движения для грузовых автомобилей.",
            "Разрешается, если полоса расположена у правого края проезжей части, и если она не отделена от остальной проезжей части сплошной линией разметки.",
            "Дорога, не имеющую сквозного проезда.",
            "Место, где дорога выходит на набережную или берег.",
            "Автомобилям и мотоциклам.",
            "Пересечение равнозначных дорог"
    };

    private String CoorectAnswers3[] = {
            "Предварительный указатель перестроения на другую проезжую часть.",
            "Участок дороги, на котором имеется пешеходный переход.",
            "Расстояние от знака до места ограничения.",
            "Съезд на обочину опасен в связи проведением на ней ремонтных работ.",
            "Место стоянки в зоне 30 м для мотоколясок и автомобилей с опознавательным знаком «Инвалид».",
            "Прямо и в обратном направлении.",
            "Остановка запрещена по субботам, воскресеньям и по праздничным дням.",
            "Остановка запрещается по рабочим дням.",
            "Прямо, налево и в обратном направлении.",
            "Протяженнось участка дороги с опасными поворотами."
    };

    private String CoorectAnswers4 [] = {
            "Движение мотоциклов направо запрещено.",
            "Главная дорога продолжается от перекрестка налево.",
            "В зоне действия таблички водителям рекомендуется передвигаться co скоростью указанной знаком.",
            "Через 150-300 м после знака начинается сужение дороги с правой стороны протяженностью 100 м.",
            "150-300 м",
            "Съезжать на обочину опасно в связи с ремонтными работами.",
            "Водители должны передвигаться со скоростью не более 40км/ч ри мокром покрытии дороги.",
            "При мокром покрытии дороги рекомендуется движение со скоростью 40 КМ/Ч.",
            "Имеет право.",
            "О наличии через 150-300 м железнодорожного переезда без шлагбаума."
    };




    private String Images1[] = {
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2Fturn_right.png?alt=media&token=a62cf880-38b3-4347-be04-335310dd4584",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2Fspeed_limit.png?alt=media&token=696f42c7-d441-4718-a36b-1bcf5444eb5f",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2Fstop_sign.png?alt=media&token=c777f627-3b76-436c-9273-3e868efd576e",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2Fmain_road.png?alt=media&token=64ea0c80-d8c1-4b14-8810-d612414956f5",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2Fcrosswalk.png?alt=media&token=462d2e51-5f38-4be0-8412-c121d41e0837",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2Fsvetafor.png?alt=media&token=a28e793e-2193-40e1-8707-b76d135b6599",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2F%D0%A3%D1%81%D1%82%D1%83%D0%BF%D0%B8%D1%82%D0%B5%20%D0%B4%D0%BE%D1%80%D0%BE%D0%B3%D1%83.png?alt=media&token=aa1607ef-c5a3-4f5b-978c-ec954845041d",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2F3.18.2-%D0%9F%D0%BE%D0%B2%D0%BE%D1%80%D0%BE%D1%82-%D0%BD%D0%B0%D0%BB%D0%B5%D0%B2%D0%BE-%D0%B7%D0%B0%D0%BF%D1%80%D0%B5%D1%89%D0%B5%D0%BD-removebg-preview.png?alt=media&token=b044c4d7-e0b6-4f3c-a61d-e28ccc75238a",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2Fparkovka.png?alt=media&token=269ccc8f-cb80-4d66-9340-219e96a57017",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2F3f13402a7f2a9f17d57df3a06cbd1dc4.webp?alt=media&token=75c8c6c6-3729-4be4-bf28-79db1afbb786"
    };
    private String Images2[] = {
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2Fno_parking.png?alt=media&token=46b4c6fb-6745-4290-8d65-b039148b0276",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%202%2Fdownload-removebg-preview.png?alt=media&token=7dcf984b-4d96-4fba-a582-2636ee5f8ece",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%202%2Fshop_items_catalog_image1711.png?alt=media&token=a3e528cb-3cc2-4859-87a0-95ed38de9dd4",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%202%2F9a2e8f008a5df9fd9a507b0e43b552e1.png?alt=media&token=d14b6620-4a7d-4491-88d4-aa78e95f800e",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%202%2Fshop_items_catalog_image2517.png?alt=media&token=804ef6d0-4d38-4dbd-b195-c612dadd8379",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%202%2Fmek.png?alt=media&token=e5596cf8-b5e4-4d54-8605-fad2d30f49c4",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%202%2Ferku.png?alt=media&token=8aa7b1d9-de47-416e-8620-14d44d408f56",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%202%2Ffour.png?alt=media&token=8ced95bd-a25c-446c-a072-898007fc2ffa",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%202%2Fthree.png?alt=media&token=09d83f65-4df4-45a1-8ed0-7dc1de1d7f94",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%202%2Fshop_items_catalog_image275.png?alt=media&token=77a01008-6393-4607-b4ed-0e51c3112434"
    };
    private String Images3[] = {
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel3%2F%D0%9F%D1%80%D0%B5%D0%B4%D0%B2%D0%B0%D1%80%D0%B8%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9%20%D1%83%D0%BA%D0%B0%D0%B7%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%20%D0%BF%D0%B5%D1%80%D0%B5%D1%81%D1%82%D1%80%D0%BE%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%BD%D0%B0%20%D0%B4%D1%80%D1%83%D0%B3%D1%83%D1%8E%20%D0%BF%D1%80%D0%BE%D0%B5%D0%B7%D0%B6%D1%83%D1%8E%20%D1%87%D0%B0%D1%81%D1%82%D1%8C..png?alt=media&token=5b5bbd19-00a4-43f1-8061-52ef9e22b7a1",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel3%2Fpedestrian-crossing-g2d4249a31_1280-850x750.png?alt=media&token=3dc39942-86db-4bdf-a2b2-bd408f61e5e1",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel3%2F%D0%A0%D0%B0%D1%81%D1%81%D1%82%D0%BE%D1%8F%D0%BD%D0%B8%D0%B5%20%D0%BE%D1%82%20%D0%B7%D0%BD%D0%B0%D0%BA%D0%B0%20%D0%B4%D0%BE%20%D0%BC%D0%B5%D1%81%D1%82%D0%B0%20%D0%BE%D0%B3%D1%80%D0%B0%D0%BD%D0%B8%D1%87%D0%B5%D0%BD%D0%B8%D1%8F..png?alt=media&token=07c8c8aa-262b-4457-80bd-dded815a409c",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel3%2Fphoto_5425073720038377676_x.jpg?alt=media&token=26eb8e77-ba8a-4d5a-a556-4546f3ee7c30",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel3%2Fphoto_5425073720038377767_x.jpg?alt=media&token=2bab2a5d-f9b1-4b7b-a5bf-1b2c488aa3a0",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel3%2Fphoto_5425073720038377764_x.jpg?alt=media&token=101b3646-435d-4ba8-ae80-c0217aaef996",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel3%2Fphoto_5425073720038377773_x.jpg?alt=media&token=250dc5f4-794e-4b17-a187-5be547bfcdfb",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel3%2Fphoto_5425073720038377776_x.jpg?alt=media&token=ce6ba682-e4fd-4db8-ba8c-a62a06b88677",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel3%2Fshop_items_catalog_image1921.png?alt=media&token=8fb742b0-124f-4c64-9002-988784bb8582",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel3%2Fphoto_5425073720038377783_x.jpg?alt=media&token=4e45be44-fe47-4a56-9683-3f1ed8875bcb"
    };

    private String Images4[] = {
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%204%2F11.jpg?alt=media&token=56fc5e26-86b0-4020-8990-819445c83fe8",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%204%2F12.png?alt=media&token=e64decff-d950-413b-b3e5-3b058f9d6ea1",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%204%2F13.jpg?alt=media&token=d0b4c3cf-cd78-4bd4-94d3-57393796789a",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%204%2F14.jpg?alt=media&token=3ce985f2-ff3e-408a-ada2-58e935fdf8d3",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%204%2F15.png?alt=media&token=99be8ef9-6080-4810-9aa2-5806ac1b7ff2",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel3%2Fphoto_5425073720038377676_x.jpg?alt=media&token=26eb8e77-ba8a-4d5a-a556-4546f3ee7c30",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%204%2F16.jpg?alt=media&token=811675ee-199a-486d-b354-a27a69d9cdc1",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%204%2F17.jpg?alt=media&token=8fbb3c27-24a5-49a6-a636-b3f984b81abe",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%204%2F18.jpg?alt=media&token=de23f689-9971-4fa3-a59d-78f280670895",
            "https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/Signs%2FLevel%204%2F20.jpg?alt=media&token=e0e90b8a-8780-4b11-b0d4-da0743d4e315"
    };

    private String QuestionsType1[] = {
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton"
    };
    private String QuestionsType2[] = {
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton"
    };
    private String QuestionsType3[] = {
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton"
    };

    private String QuestionsType4[] = {
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton"
    };

    public String getQuestions1(int q) {
        String questions1 = Questions1[q];
        return questions1;
    }
    public String getQuestions2(int w){
        String questions2 = Questions2[w];
        return questions2;
    }

    public String getQuestions3(int a){
        String questions3 = Questions3[a];
        return questions3;
    }

    public String getQuestions4(int s){
        String questions4 = Questions4[s];
        return questions4;
    }

    public String[] getChoice1(int q) {
        String[] choice1 = Choice1[q];
        return choice1;
    }
    public String[] getChoice2(int w){
        String[] choice2 = Choice2[w];
        return choice2;
    }
    public String[] getChoice3(int a){
        String[] choice3 = Choice3[a];
        return choice3;
    }
    public String[] getChoice4(int s){
        String[] choice4 = Choice4[s];
        return choice4;
    }

    public String getImages1(int q) {
        String img1 = Images1[q];
        return img1;
    }

    public String getImages2(int w){
        String img2 = Images2[w];
        return img2;
    }

    public String getImages3(int a){
        String img3 = Images3[a];
        return img3;
    }

    public String getImages4(int s){
        String img4 = Images4[s];
        return img4;
    }

    public String getType1(int q) {
        String type1 = QuestionsType1[q];
        return type1;
    }

    public String getType2(int w){
        String type2 = QuestionsType2[w];
        return type2;
    }

    public String getType3(int a){
        String type3 = QuestionsType3[a];
        return type3;
    }

    public String getType4(int s){
        String type4 = QuestionsType4[s];
        return type4;
    }

    public int getLenght1(){
        return Questions1.length;
    }
    public int getLenght2(){
        return Questions2.length;
    }
    public int getLenght3(){
        return Questions3.length;
    }
    public int getLenght4(){
        return Questions4.length;
    }

    public String getCoorectAnswers1(int q) {

        String correct1 = CoorectAnswers1[q];

        return correct1;
    }
    public String getCoorectAnswers2(int w){

        String coorect2 = CoorectAnswers2[w];

        return coorect2;
    }
    public String getCoorectAnswers3(int a){

        String coorect3 = CoorectAnswers3[a];

        return coorect3;
    }
    public String getCoorectAnswers4(int s){

        String coorect4 = CoorectAnswers4[s];

        return coorect4;
    }
}
